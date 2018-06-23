grammar myCompiler;

options {
    language = Java;
}

@header {
    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;
}

@members {
    boolean TRACEON = false;
    HashMap<String,Integer> symbolTable = new HashMap<String,Integer>();
    HashMap<Integer,String> reg_map = new HashMap<Integer,String>();

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

    int labelCount = 0;

    List<String> DataCode = new ArrayList<String>();
    List<String> TextCode = new ArrayList<String>();
 
    public static register reg = new register(0, 9);
    
    /*
     * Output prologue.
     */
    void prologue(String id)
    {
       TextCode.add("\n\n/* Text section */");
       TextCode.add("\t.section .text");
       TextCode.add("\t.global " + id);
       TextCode.add("\t.type " + id + ",@function");
       TextCode.add(id + ":");
       
       /* Follow x86 calling convention */
       TextCode.add("\t pushq \%rbp");
       TextCode.add("\t movq \%rsp,\%rbp");
       TextCode.add("\t pushq \%rbx"); //callee saved registers.
       TextCode.add("\t pushq \%r12"); //callee saved registers.
       TextCode.add("\t pushq \%r13"); //callee saved registers.
       TextCode.add("\t pushq \%r14"); //callee saved registers.
       TextCode.add("\t pushq \%r15"); //callee saved registers.
       TextCode.add("\t subq $8,\%rsp\n"); // aligned 16-byte boundary.
    }
    
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       
       /* Follow x86 calling convention */
       TextCode.add("\n\t addq $8,\%rsp");
       TextCode.add("\t popq \%r15");
       TextCode.add("\t popq \%r14");
       TextCode.add("\t popq \%r13");
       TextCode.add("\t popq \%r12");
       TextCode.add("\t popq \%rbx");
       TextCode.add("\t popq \%rbp");
       TextCode.add("\t ret");
    }
    
    
    /* Generate a new label */
    String newLabel()
    {
       labelCount ++;
       return (new String("L")) + Integer.toString(labelCount);
    } 
    
    
    public List<String> getDataCode()
    {
       return DataCode;
    }
    
    public List<String> getTextCode()
    {
       return TextCode;
    }
}


startstat
    : 
    {
        reg_map.put(0,"r14d");
        reg_map.put(1,"ebx");
        reg_map.put(2,"ecx");
        reg_map.put(3,"r15d");
        reg_map.put(4,"r8d");
        reg_map.put(5,"r9d");
        reg_map.put(6,"r10d");
        reg_map.put(7,"r11d");
        reg_map.put(8,"r12d");
        reg_map.put(9,"r13d");
    }
     declarations functions
    ;


functions
    : function functions
    |
    ;
				  
function
    :   type ID '(' RPAREN
        LBRACE
            {
                /* output function prologue */
                prologue($ID.text);
            }
            l_declarations statements 
        RBRACE

            {
                /* output function epilogue */	  
                epilogue();
            }
	;


/* global declaraction */
declarations
    : type ID SEMICOL declarations
      { 
		/* code generation */
		
        switch($type.attr_type) 
        {
		    case 1: 
                /* Type: short, size=> 2 bytes, alignment=> 2 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",2,2");
				break;
            case 2: 
                /* Type: ineteger, size=> 4 bytes, alignment=> 4 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",4,4");
				break;
            case 3: 
                /* Type: long long, size=> 8 bytes, alignment=> 8 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",8,8");
				break;

            case 4: 
                /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
		        DataCode.add("\t .common " + $ID.text + ",4,4");
				break;
		    default:
		}
	  }
    | 
    ;


l_declarations
    :
    type ID ';' l_declarations
    {
        /* Not implement local variable*/ 
    }
    | 
    ;


type returns [int attr_type]
    :   SHORT_TYPE      {   if (TRACEON) System.out.println("type: SHORT") ; $attr_type = 1 ;      }    
    |   INT_TYPE        {   if (TRACEON) System.out.println("type: INT") ; $attr_type = 2 ;        }      
    |   LONG_TYPE       {   if (TRACEON) System.out.println("type: LONG") ; $attr_type = 3 ;       }     
    |   FLOAT_TYPE      {   if (TRACEON) System.out.println("type: FLOAT") ; $attr_type = 4 ;      }    
    |   DOUBLE_TYPE     {   if (TRACEON) System.out.println("type: DOUBLE") ; $attr_type = 5 ;     }   
    |   LONGLONG_TYPE   {   if (TRACEON) System.out.println("type: LONGLONG") ; $attr_type = 6 ;   } 
    |   CHAR_TYPE       {   if (TRACEON) System.out.println("type: CHAR") ; $attr_type = 7 ;       }      
    |   VOID_TYPE       {   if (TRACEON) System.out.println("type: VOID") ;                        }
;

statements: statement statements
    |
    ;
		
statement returns [int attr_type]
    :   ID OP_ASS a = expr SEMICOL
        {
            TextCode.add("\t movl " + "\%" + reg_map.get($a.reg_num) + "," + $ID.text + "(\%rip)");
        }
    |   IF_ LPAREN b = expr RPAREN
        {
            String label = newLabel();
            TextCode.add("\t cmpl " + "$0, " + "\%" + reg_map.get($b.reg_num));
            TextCode.add("\t je " + label);
        } 
        ifthenstat 
        {
            TextCode.add(label + ":");
        }
    |   printstat
    ;

expr returns [int attr_type, int reg_num, String str]
	:   a = multiply
        {
            $attr_type = $a.attr_type;
            $reg_num = $a.reg_num;
            $str = $a.str;
        }
        (   
            '+' b = multiply
            {   TextCode.add("\t addl " + "\%" + reg_map.get($b.reg_num) + ", \%" + reg_map.get($reg_num));     }
    |       '-' c = multiply
            {   TextCode.add("\t subl " + "\%" + reg_map.get($c.reg_num) + ", \%" + reg_map.get($reg_num));     }
	    )*
	;

	
multiply returns [int attr_type, int reg_num, String str]
    :   a = signed 
        { 
            $attr_type = $a.attr_type;
            $reg_num = $a.reg_num;
            $str = $a.str;
        }
        ( 
            '*' b = signed
            { 
                TextCode.add("\t imul " + "\%" + reg_map.get($b.reg_num) + ", \%" + reg_map.get($a.reg_num));
            }
    |       '/' c = signed
            { 
                TextCode.add("\t movl " + "\%" + reg_map.get($a.reg_num) + ", \%eax");
                TextCode.add("\t movl " + "$0" + ", \%edx");
                TextCode.add("\t idivl " + "\%" + reg_map.get($c.reg_num));
                TextCode.add("\t movl "  + "\%eax" + ", \%" + reg_map.get($a.reg_num));
            }
	    )*
	;


signed returns [int attr_type, int reg_num, String str]
	:   atom
        { 
            $attr_type = $atom.attr_type;
            $reg_num = $atom.reg_num;
            $str = $atom.str;
        }
	|   '-' atom
	    {
            TextCode.add("\t negl " + "\%" + reg_map.get($atom.reg_num));
            $attr_type = $atom.attr_type;
            $reg_num = $atom.reg_num;
            $str = $atom.str;
	    }
	;


atom returns [int attr_type, int reg_num, String str]
    :
        DEC_NUM
        { 
            $attr_type = 2;
            $str = null;
            $reg_num = reg.get();  /* get an register */
            TextCode.add("\t movl " + "\$" + $DEC_NUM.text + ", \%" + reg_map.get($reg_num)); 
        }
    |   FLOAT_NUM 
        { 
            $attr_type = 4 ; 
            $str = null;
            $reg_num = reg.get();
            TextCode.add("\t movl " + "\$" + $FLOAT_NUM.text + ", \%" + reg_map.get($reg_num));
        }   
    |   STRING { $attr_type = 9; $str = $STRING.text; }
    |   ID
        {
            if(symbolTable.containsKey($ID.text))
            {
                $attr_type = symbolTable.get($ID.text);
            }
            else
            {
                //System.out.println("Type Error on Line : " + $ID.getLine() + " : Unknown Idenifier " + $ID.text + ".");
                $attr_type = -1;
            }
            $str = null;
            $reg_num = reg.get(); /* get an register */
            TextCode.add("\t movl " + $ID.text + "(\%rip), \%" + reg_map.get($reg_num));
        }
	  | '(' expr ')' { $attr_type = $expr.attr_type; }
    ;

	
ifthenstat
	:   statement
	|   '{' statements '}'
	;

printstat
    :   'printf' '(' a=STRING ',' ID  ')' ';'
    {
        String label = newLabel();
        DataCode.add(label + ":");
        DataCode.add("\t .string " + $a.text);
        TextCode.add("\t movl " + $ID.text + "(\%rip), " + "\%esi");
        TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
        TextCode.add("\t call printf");
    }
    ;





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

WHILE_      :   'while'    ;   
FOR_        :   'for'      ;
IF_         :   'if'       ;
ELSE_       :   'else'      ;
RETURN_     :   'return'    ;
BREAK_      :   'break'     ;
CONTINUE_   :   'continue'  ;
INCLUDE     :   '#include'  ;
DEFINE      :   '#define'   ;



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
STRING
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

/*-------------------*/
/*      Comments     */
/*-------------------*/
COMMENT1 : '//'(.)*'\n' {$channel=HIDDEN;};
COMMENT2 : '/*'(.)*'*/' {$channel=HIDDEN;};


WS  : (' ' | '\r' | '\t' | '\n')+ {$channel=HIDDEN;}
    ;

PREPROCESSOR : '#'(.)*'\n'{$channel=HIDDEN;};