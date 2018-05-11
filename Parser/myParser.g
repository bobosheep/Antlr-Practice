grammar myParser;
options{
    backtrack=true;
    memoize = true;
    k=6;
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
;


type:
    SHORT_TYPE      | 
    INT_TYPE        | 
    LONG_TYPE       |
    FLOAT_TYPE      | 
    DOUBLE_TYPE     |
    LONGLONG_TYPE   |
    CHAR_TYPE       | 
    VOID_TYPE
;

stats:
    assignmentStat  |
    whileStat       |
    ifelseStat      |
    forStat         |
    declareStat     |
    procedStat      |
    exprList        |
    breakStat       |
    continueStat    
;

assignmentStat:
    ID WS* OP_ASS WS* expr SEMICOL                      |
    ID WS* OP_ASS WS* (DEC_NUM | FLOAT_NUM)  SEMICOL    
;

whileStat:
    WHILE_ expr  RPAREN WS* 
    LBRACE WS*
        stats+ WS* 
    RBRACE WS*
;

ifelseStat:
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

forStat:
    FOR_ expr*  SEMICOL  expr* SEMICOL expr* RPAREN WS*
    LBRACE WS*
        stats+  WS*
    RBRACE WS*
;

function:
    type FUNCTION_CALL params* RPAREN 
    LBRACE 
        stats* WS*
        'return' (DEC_NUM | FLOAT_NUM)? SEMICOL 
    RBRACE                                 |
    type FUNCTION_CALL params* RPAREN  SEMICOL

;


declareStat:
    type ID SEMICOL     |
    type exprList       |
    type assignmentStat 
;

procedStat:
    FUNCTION_CALL arguments RPAREN SEMICOL
;

exprList:
    expr (COMMA expr)* SEMICOL
;

breakStat:
    BREAK_ SEMICOL
;

continueStat:
    CONTINUE_ SEMICOL
;

arguments:
    expr (COMMA expr)*
;

params:
    param (COMMA param)*
;

param:
    type ID     |
    type
;

expr :
    operationStat ((OP_LAND | OP_LOR) operationStat)*
;

operationStat:
    add ((  OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS |
            OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS |
            OP_MODAS | OP_LSAS | OP_RSAS )  add)*
;

add:
    multiply ((OP_ADD | OP_SUB) multiply)*
;

multiply:
    atom ((OP_MUL | OP_DIV ) atom)*
;

atom:
    DEC_NUM             |
    FLOAT_NUM           |
    ID                  |
    LPAREN expr RPAREN  
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