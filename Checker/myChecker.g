grammar myChecker;
options{
    language = Java;
    backtrack=true;
    memoize = true;
    k=6;
}

@header{
    import java.util.HashMap;
}

@member{
    boolean TRACEON;
    HashMap<String, Integer> symbolTable = new HashMap<String, Integer>;

    /*
    public enum typeInfo{
        Short,
        Integer, 
        Long,
        Float,
        Double, 
        Long Long, 
        Char, 
        Void, 
        Unknown,
        No_exist,
        Error
    }
    */

    int attr_type;

    /*
    attr_type:
        1   =>  short
        2   =>  integer, 
        3   =>  long, 
        4   =>  float,
        5   =>  double
        6   =>  long long
        7   =>  char,
        8   =>  void,
        -1  =>  do not exist,
        -2  =>  error
     */

}

startStat:
    (INCLUDE  '<' ID '.h' '>' WS* )+

    function* 
    mainfunction
    function*
;

mainfunction:
    type 'main(' params* RPAREN WS*
    LBRACE WS*
        stats*  WS*
        RETURN_ (DEC_NUM | FLOAT_NUM)? SEMICOL 
    RBRACE WS*      
    { if (TRACEON) System.out.println("MAIN (){ stats } ")}
;


type returns [int attr_type] 
    :   SHORT_TYPE      {if (TRACEON) System.out.println("type: SHORT") ; $attr_type = 1 ; }    
    |   INT_TYPE        {if (TRACEON) System.out.println("type: INT") ; $attr_type = 2 ; }      
    |   LONG_TYPE       {if (TRACEON) System.out.println("type: LONG") ; $attr_type = 3 ; }     
    |   FLOAT_TYPE      {if (TRACEON) System.out.println("type: FLOAT") ; $attr_type = 4 ; }    
    |   DOUBLE_TYPE     {if (TRACEON) System.out.println("type: DOUBLE") ; $attr_type = 5 ; }   
    |   LONGLONG_TYPE   {if (TRACEON) System.out.println("type: LONGLONG") ; $attr_type = 6 ; } 
    |   CHAR_TYPE       {if (TRACEON) System.out.println("type: CHAR") ; $attr_type = 7 ; }     
    |   VOID_TYPE       {if (TRACEON) System.out.println("type: VOID") ; $attr_type = 8 ; }
;

stats
    :   //assignmentStat  
        whileStat       
    |   ifelseStat      
    |   forStat         
    |   declareStat     
    |   procedStat      
    |   exprList        
    |   breakStat       
    |   continueStat    
;
/*
assignmentStat returns [int attr_type]
    :   a = ID WS* OP_ASS WS* expr SEMICOL
    {
       if(symbolTable.containsKey($ID.text))
       {
           if($a.attr_type != $expr.attr_type)
           {
                System.out.println("Type Error " + $ID.getLine() + ": Type mismatch for the two side of assignmentStat");
                $attr_type = -2;
           }
           else
           {
                $attr_type = $a.attr_type
           }
       } 
       else
       {
            System.out.println("Type Error " + $ID.getLine() + ":Unknown Idenifier " + $ID.text);
            $attr_type = -1;
       }
    }                      
    |   ID WS* OP_ASS WS* (DEC_NUM | FLOAT_NUM)  SEMICOL    
;
 */
whileStat
    :
    
    WHILE_ expr  RPAREN WS* 
    LBRACE WS*
        stats+ WS* 
    RBRACE WS*
;

ifelseStat
    :   
    
    IF_ expr  RPAREN WS* 
    LBRACE WS*
            stats+ WS* 
    RBRACE WS*
    ('else if(' expr  RPAREN WS*
        LBRACE WS*
            stats+ 
        RBRACE WS*
    )* 
    (ELSE_ WS*
        LBRACE
            stats+ 
        RBRACE 
    )? 

;

forStat
    :
    
    FOR_ expr*  SEMICOL  expr* SEMICOL expr* RPAREN WS*
    LBRACE WS*
        stats+  WS*
    RBRACE WS*
;

function
    :
    
    type FUNCTION_CALL params* RPAREN 
    LBRACE 
        stats* WS*
        'return' (DEC_NUM | FLOAT_NUM)? SEMICOL 
    RBRACE                                 |
    type FUNCTION_CALL params* RPAREN  SEMICOL

;


declareStat returns [int attr_type]
    :   type a = ID (OP_ASS b = expr)? (COMMA c = ID (OP_ASS d = expr))* SEMICOL
        {
            if (symbolTable.containsKey($a.text))
            {
                System.out.println("Type Error " + $a.getLine() + " : Redeclared identifier " + $a.text + ".");
                $attr_type = -2;
            }
            else if( ($type.attr_type != $b.attr_type ) && ( $b.text != null) )
            {
                System.out.println("Type Error " + $b.start.getLine() + " : Type mismatch for 2 side operands in an assignmentStat. ");
                $attr_type = -2
            }
            else
            {
                symbolTable.put($a.text, $type.attr_type);
            }

            if($c.text != null)
            {
                if (symbolTable.containsKey($c.text))
                {
                    System.out.println("Type Error " + $c.getLine() + " : Redeclared identifier " + $c.text + ".");
                    $attr_type = -2;
                }
                else if( ($type.attr_type != $d.attr_type ) && ( $d.text != null) )
                {
                    System.out.println("Type Error " + $d.start.getLine() + " : Type mismatch for 2 side operands in an assignmentStat. ");
                    $attr_type = -2;
                }
                else
                {
                    symbolTable.put($c.text, $type.attr_type);
                }
            }
        } 
;

procedStat
    :   FUNCTION_CALL arguments RPAREN SEMICOL
;

exprList returns [int attr_type]
    :   expr { $attr_type = $expr.attr_type } (COMMA expr)* SEMICOL
;

breakStat
    :   BREAK_ SEMICOL
;

continueStat
    :   CONTINUE_ SEMICOL
;

arguments
    :   expr (COMMA expr)*
;

params
    :   param (COMMA param)*
;

param
    :   type ID     
    |   type
;

expr returns [int attr_type]
    :   a = operationStat { $attr_type = $a.attr_type }
    ((OP_LAND | OP_LOR) b = operationStat)*
    {
        if($b.attr_type != $a.attr_type)
        {
            System.out.println("Type Error " + $a.start.getLine() + " : Type mismatch in the expression");
            $attr_type = -2;
        }
    }
;

operationStat returns [int attr_type]
    :   a = add { $attr_type = $a.attr_type } 
        ((  OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS |
            OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS |
            OP_MODAS | OP_LSAS | OP_RSAS )  b = add)*
        {
            if ($a.attr_type != $b.attr_type)
            {
                System.out.println("Type Error " + $a.start.getLine() + " : Type mismatch for operationStat in the expression");
                $attr_type = -2;
            }
        }
;

add returns [int attr_type]
    :   
    a = multiply { $attr_type = $a.attr_type }
    ((OP_ADD | OP_SUB) b = multiply)*
    {
        if ($a.attr_type != $b.attr_type)
        {
            System.out.println("Type Error " + $a.start.getLine() + " : Type mismatch for add or sub in the expression");
            $attr_type = -2;
        }
    }
;

multiply returns [int attr_type]
    :
    a = atom { $attr_type = $a.attr_type } 
    ((OP_MUL | OP_DIV ) b = atom)*
    {
        if ($a.attr_type != $b.attr_type)
        {
            System.out.println("Type Error " + $a.start.getLine() + " : Type mismatch for mul or div in the expression");
            $attr_type = -2;
        }
    }

;

atom returns [int attr_type]
    :   DEC_NUM             { /* default it is integer */  $attr_type = 2 ; }   
    |   FLOAT_NUM           { $attr_type = 4 ; }   
    |   CHAR                { $attr_type = 7 ; }
    |   ID                  
        {
            if(symbolTable.containsKey($ID.text))
            {
                $attr_type = symbolTable.get($ID.text);
            }
            else
            {
                System.out.println("Type Error " + $ID.getLine() + ":Unknown Idenifier " + $ID.text);
                $attr_type = -1;
            }
        }
    |   LPAREN expr RPAREN { $attr_type = $expr.attr_type }
;

/*---------------------*/
/*  Reserved keywords  */
/*---------------------*/

SHORT_TYPE      :   'short'     ;
INT_TYPE        :   'int'       ;
LONG_TYPE       :   'long'      ;
FLOAT_TYPE      :   'float'     ;
DOUBLE_TYPE     :   'double'    ;
LONGLONG_TYPE   :   'long long' ;
CHAR_TYPE       :   'char'      ;
VOID_TYPE       :   'void'      ;

WHILE_      :   'while('    ;   
FOR_        :   'for('      ;
IF_         :   'if('       ;
ELSE_       :   'else'      ;
RETURN_     :   'return'    ;
BREAK_      :   'break'     ;
CONTINUE_   :   'continue'  ;
INCLUDE     :   '#include'  ;
DEFINE      :   '#define'   ;

/*--------------------------*/
/*  Comparison Operators    */
/*--------------------------*/

OP_EQ   :   '=='    ;
OP_LE   :   '<='    ;
OP_GE   :   '>='    ;
OP_NE   :   '!='    ;
OP_GT   :   '>'     ;
OP_LT   :   '<'     ;

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

OP_ADDAS    :   '+='    ;
OP_SUBAS    :   '-='    ;
OP_MULAS    :   '*='    ;
OP_DIVAS    :   '/='    ;
OP_XORAS    :   '^='    ;
OP_MODAS    :   '%='    ;
OP_LSAS     :   '<<='   ;
OP_RSAS     :   '>>='   ;
OP_ADDADD   :   '++'    ;
OP_SUBSUB   :   '--'    ;

/*----------------------*/
/*  Logical Operators   */
/*----------------------*/

OP_NOT  :   '!'     ;
OP_LAND :   '&&'    ;
OP_LOR  :   '||'    ;

/*-----------------------*/
/*  Bitwise Operators    */
/*-----------------------*/

OP_AND  :   '&'    ;
OP_OR   :   '|'    ;
OP_XOR  :   '^'    ;
OP_LS   :   '<<'     ;
OP_RS   :   '>>'     ;

/*--------------------------*/
/*  Arithmetic Operators    */
/*--------------------------*/

OP_ADD   :   '+'    ;
OP_SUB   :   '-'    ;
OP_MUL   :   '*'    ;
OP_DIV   :   '/'    ;
OP_ASS   :   '='    ;

/*-----------------*/
/*      Others     */
/*-----------------*/

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

/*----------------------------------------------*/
/*       special characters / punctuations      */
/*----------------------------------------------*/

LPAREN : '(';
RPAREN : ')';
LBRACK : '[';
RBRACK : ']';
LBRACE : '{';
RBRACE : '}';
PERIOD : '.';
COMMA : ',';
SEMICOL : ';';
COLON : ':';


/*-------------------*/
/*      Function     */
/*-------------------*/
FUNCTION_CALL : (ID)(LPAREN);

/*------------------*/
/*      Array       */
/*------------------*/
ARRAY : (ID)(LBRACK);


/*-----------------------------*/
/*      Characters & String    */
/*-----------------------------*/
CHAR    : '\''(LETTER)'\'';
STRING  : '"' ('""' | ~'"')* '"';


/*-------------------*/
/*      Comments     */
/*-------------------*/
COMMENT1 : '//'(.)*'\n' {skip();};
COMMENT2 : '/*'(.)*'*/' {skip();};


WS  : (' ' | '\r' | '\t' | '\n')+ {skip();}
    ;