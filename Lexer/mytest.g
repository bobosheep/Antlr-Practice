lexer grammar mytest;
options {
    language = Java;
}

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

WHILE_      :   'while('     ;   
FOR_        :   'for('       ;
IF_         :   'if('        ;
ELSE_       :   'else'      ;
RETURN_     :   'return'    ;
BREAK_      :   'break'     ;
CONTINUE    :   'continue'  ;
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