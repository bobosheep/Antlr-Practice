// $ANTLR 3.5.2 mytest.g 2018-05-11 03:41:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mytest extends Lexer {
	public static final int EOF=-1;
	public static final int ARRAY=4;
	public static final int BREAK_=5;
	public static final int CHAR=6;
	public static final int CHAR_TYPE=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT1=10;
	public static final int COMMENT2=11;
	public static final int CONTINUE=12;
	public static final int DEC_NUM=13;
	public static final int DEFINE=14;
	public static final int DIGIT=15;
	public static final int DOUBLE_TYPE=16;
	public static final int ELSE_=17;
	public static final int FLOAT_NUM=18;
	public static final int FLOAT_NUM1=19;
	public static final int FLOAT_NUM2=20;
	public static final int FLOAT_NUM3=21;
	public static final int FLOAT_TYPE=22;
	public static final int FOR_=23;
	public static final int FUNCTION_CALL=24;
	public static final int ID=25;
	public static final int IF_=26;
	public static final int INCLUDE=27;
	public static final int INT_TYPE=28;
	public static final int LBRACE=29;
	public static final int LBRACK=30;
	public static final int LETTER=31;
	public static final int LONGLONG_TYPE=32;
	public static final int LONG_TYPE=33;
	public static final int LPAREN=34;
	public static final int OP_ADD=35;
	public static final int OP_ADDADD=36;
	public static final int OP_ADDAS=37;
	public static final int OP_AND=38;
	public static final int OP_ASS=39;
	public static final int OP_DIV=40;
	public static final int OP_DIVAS=41;
	public static final int OP_EQ=42;
	public static final int OP_GE=43;
	public static final int OP_GT=44;
	public static final int OP_LAND=45;
	public static final int OP_LE=46;
	public static final int OP_LOR=47;
	public static final int OP_LS=48;
	public static final int OP_LSAS=49;
	public static final int OP_LT=50;
	public static final int OP_MODAS=51;
	public static final int OP_MUL=52;
	public static final int OP_MULAS=53;
	public static final int OP_NE=54;
	public static final int OP_NOT=55;
	public static final int OP_OR=56;
	public static final int OP_RS=57;
	public static final int OP_RSAS=58;
	public static final int OP_SUB=59;
	public static final int OP_SUBAS=60;
	public static final int OP_SUBSUB=61;
	public static final int OP_XOR=62;
	public static final int OP_XORAS=63;
	public static final int PERIOD=64;
	public static final int RBRACE=65;
	public static final int RBRACK=66;
	public static final int RETURN_=67;
	public static final int RPAREN=68;
	public static final int SEMICOL=69;
	public static final int SHORT_TYPE=70;
	public static final int STRING=71;
	public static final int VOID_TYPE=72;
	public static final int WHILE_=73;
	public static final int WS=74;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mytest() {} 
	public mytest(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mytest(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mytest.g"; }

	// $ANTLR start "SHORT_TYPE"
	public final void mSHORT_TYPE() throws RecognitionException {
		try {
			int _type = SHORT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:10:17: ( 'short' )
			// mytest.g:10:21: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT_TYPE"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:11:17: ( 'int' )
			// mytest.g:11:21: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:12:17: ( 'long' )
			// mytest.g:12:21: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:13:17: ( 'float' )
			// mytest.g:13:21: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "DOUBLE_TYPE"
	public final void mDOUBLE_TYPE() throws RecognitionException {
		try {
			int _type = DOUBLE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:14:17: ( 'double' )
			// mytest.g:14:21: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_TYPE"

	// $ANTLR start "LONGLONG_TYPE"
	public final void mLONGLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONGLONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:15:17: ( 'long long' )
			// mytest.g:15:21: 'long long'
			{
			match("long long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONGLONG_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:16:17: ( 'char' )
			// mytest.g:16:21: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:17:17: ( 'void' )
			// mytest.g:17:21: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:19:13: ( 'while(' )
			// mytest.g:19:17: 'while('
			{
			match("while("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "FOR_"
	public final void mFOR_() throws RecognitionException {
		try {
			int _type = FOR_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:20:13: ( 'for(' )
			// mytest.g:20:17: 'for('
			{
			match("for("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_"

	// $ANTLR start "IF_"
	public final void mIF_() throws RecognitionException {
		try {
			int _type = IF_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:21:13: ( 'if(' )
			// mytest.g:21:17: 'if('
			{
			match("if("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_"

	// $ANTLR start "ELSE_"
	public final void mELSE_() throws RecognitionException {
		try {
			int _type = ELSE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:22:13: ( 'else' )
			// mytest.g:22:17: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_"

	// $ANTLR start "RETURN_"
	public final void mRETURN_() throws RecognitionException {
		try {
			int _type = RETURN_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:23:13: ( 'return' )
			// mytest.g:23:17: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_"

	// $ANTLR start "BREAK_"
	public final void mBREAK_() throws RecognitionException {
		try {
			int _type = BREAK_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:24:13: ( 'break' )
			// mytest.g:24:17: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:25:13: ( 'continue' )
			// mytest.g:25:17: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:26:13: ( '#include' )
			// mytest.g:26:17: '#include'
			{
			match("#include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "DEFINE"
	public final void mDEFINE() throws RecognitionException {
		try {
			int _type = DEFINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:27:13: ( '#define' )
			// mytest.g:27:17: '#define'
			{
			match("#define"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFINE"

	// $ANTLR start "OP_EQ"
	public final void mOP_EQ() throws RecognitionException {
		try {
			int _type = OP_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:33:9: ( '==' )
			// mytest.g:33:13: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_EQ"

	// $ANTLR start "OP_LE"
	public final void mOP_LE() throws RecognitionException {
		try {
			int _type = OP_LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:34:9: ( '<=' )
			// mytest.g:34:13: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LE"

	// $ANTLR start "OP_GE"
	public final void mOP_GE() throws RecognitionException {
		try {
			int _type = OP_GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:35:9: ( '>=' )
			// mytest.g:35:13: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_GE"

	// $ANTLR start "OP_NE"
	public final void mOP_NE() throws RecognitionException {
		try {
			int _type = OP_NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:36:9: ( '!=' )
			// mytest.g:36:13: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_NE"

	// $ANTLR start "OP_GT"
	public final void mOP_GT() throws RecognitionException {
		try {
			int _type = OP_GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:37:9: ( '>' )
			// mytest.g:37:13: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_GT"

	// $ANTLR start "OP_LT"
	public final void mOP_LT() throws RecognitionException {
		try {
			int _type = OP_LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:38:9: ( '<' )
			// mytest.g:38:13: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LT"

	// $ANTLR start "OP_ADDAS"
	public final void mOP_ADDAS() throws RecognitionException {
		try {
			int _type = OP_ADDAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:44:13: ( '+=' )
			// mytest.g:44:17: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_ADDAS"

	// $ANTLR start "OP_SUBAS"
	public final void mOP_SUBAS() throws RecognitionException {
		try {
			int _type = OP_SUBAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:45:13: ( '-=' )
			// mytest.g:45:17: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_SUBAS"

	// $ANTLR start "OP_MULAS"
	public final void mOP_MULAS() throws RecognitionException {
		try {
			int _type = OP_MULAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:46:13: ( '*=' )
			// mytest.g:46:17: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_MULAS"

	// $ANTLR start "OP_DIVAS"
	public final void mOP_DIVAS() throws RecognitionException {
		try {
			int _type = OP_DIVAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:47:13: ( '/=' )
			// mytest.g:47:17: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_DIVAS"

	// $ANTLR start "OP_XORAS"
	public final void mOP_XORAS() throws RecognitionException {
		try {
			int _type = OP_XORAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:48:13: ( '^=' )
			// mytest.g:48:17: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_XORAS"

	// $ANTLR start "OP_MODAS"
	public final void mOP_MODAS() throws RecognitionException {
		try {
			int _type = OP_MODAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:49:13: ( '%=' )
			// mytest.g:49:17: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_MODAS"

	// $ANTLR start "OP_LSAS"
	public final void mOP_LSAS() throws RecognitionException {
		try {
			int _type = OP_LSAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:50:13: ( '<<=' )
			// mytest.g:50:17: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LSAS"

	// $ANTLR start "OP_RSAS"
	public final void mOP_RSAS() throws RecognitionException {
		try {
			int _type = OP_RSAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:51:13: ( '>>=' )
			// mytest.g:51:17: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_RSAS"

	// $ANTLR start "OP_ADDADD"
	public final void mOP_ADDADD() throws RecognitionException {
		try {
			int _type = OP_ADDADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:52:13: ( '++' )
			// mytest.g:52:17: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_ADDADD"

	// $ANTLR start "OP_SUBSUB"
	public final void mOP_SUBSUB() throws RecognitionException {
		try {
			int _type = OP_SUBSUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:53:13: ( '--' )
			// mytest.g:53:17: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_SUBSUB"

	// $ANTLR start "OP_NOT"
	public final void mOP_NOT() throws RecognitionException {
		try {
			int _type = OP_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:59:9: ( '!' )
			// mytest.g:59:13: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_NOT"

	// $ANTLR start "OP_LAND"
	public final void mOP_LAND() throws RecognitionException {
		try {
			int _type = OP_LAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:60:9: ( '&&' )
			// mytest.g:60:13: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LAND"

	// $ANTLR start "OP_LOR"
	public final void mOP_LOR() throws RecognitionException {
		try {
			int _type = OP_LOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:61:9: ( '||' )
			// mytest.g:61:13: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LOR"

	// $ANTLR start "OP_AND"
	public final void mOP_AND() throws RecognitionException {
		try {
			int _type = OP_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:67:9: ( '&' )
			// mytest.g:67:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_AND"

	// $ANTLR start "OP_OR"
	public final void mOP_OR() throws RecognitionException {
		try {
			int _type = OP_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:68:9: ( '|' )
			// mytest.g:68:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_OR"

	// $ANTLR start "OP_XOR"
	public final void mOP_XOR() throws RecognitionException {
		try {
			int _type = OP_XOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:69:9: ( '^' )
			// mytest.g:69:13: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_XOR"

	// $ANTLR start "OP_LS"
	public final void mOP_LS() throws RecognitionException {
		try {
			int _type = OP_LS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:70:9: ( '<<' )
			// mytest.g:70:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_LS"

	// $ANTLR start "OP_RS"
	public final void mOP_RS() throws RecognitionException {
		try {
			int _type = OP_RS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:71:9: ( '>>' )
			// mytest.g:71:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_RS"

	// $ANTLR start "OP_ADD"
	public final void mOP_ADD() throws RecognitionException {
		try {
			int _type = OP_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:77:10: ( '+' )
			// mytest.g:77:14: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_ADD"

	// $ANTLR start "OP_SUB"
	public final void mOP_SUB() throws RecognitionException {
		try {
			int _type = OP_SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:78:10: ( '-' )
			// mytest.g:78:14: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_SUB"

	// $ANTLR start "OP_MUL"
	public final void mOP_MUL() throws RecognitionException {
		try {
			int _type = OP_MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:79:10: ( '*' )
			// mytest.g:79:14: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_MUL"

	// $ANTLR start "OP_DIV"
	public final void mOP_DIV() throws RecognitionException {
		try {
			int _type = OP_DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:80:10: ( '/' )
			// mytest.g:80:14: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_DIV"

	// $ANTLR start "OP_ASS"
	public final void mOP_ASS() throws RecognitionException {
		try {
			int _type = OP_ASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:81:10: ( '=' )
			// mytest.g:81:14: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OP_ASS"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:87:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mytest.g:87:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mytest.g:87:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='0') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// mytest.g:87:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mytest.g:87:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mytest.g:87:28: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// mytest.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:89:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mytest.g:89:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mytest.g:89:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mytest.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:91:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// mytest.g:91:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mytest.g:91:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mytest.g:91:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mytest.g:92:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mytest.g:92:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mytest.g:92:22: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mytest.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('.'); 
			// mytest.g:92:33: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// mytest.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mytest.g:93:20: ( '.' ( DIGIT )+ )
			// mytest.g:93:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mytest.g:93:25: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// mytest.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mytest.g:94:20: ( ( DIGIT )+ )
			// mytest.g:94:22: ( DIGIT )+
			{
			// mytest.g:94:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mytest.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mytest.g:95:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mytest.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mytest.g:96:16: ( '0' .. '9' )
			// mytest.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:102:8: ( '(' )
			// mytest.g:102:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:103:8: ( ')' )
			// mytest.g:103:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:104:8: ( '[' )
			// mytest.g:104:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:105:8: ( ']' )
			// mytest.g:105:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:106:8: ( '{' )
			// mytest.g:106:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:107:8: ( '}' )
			// mytest.g:107:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "PERIOD"
	public final void mPERIOD() throws RecognitionException {
		try {
			int _type = PERIOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:108:8: ( '.' )
			// mytest.g:108:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERIOD"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:109:7: ( ',' )
			// mytest.g:109:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOL"
	public final void mSEMICOL() throws RecognitionException {
		try {
			int _type = SEMICOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:110:9: ( ';' )
			// mytest.g:110:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOL"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:111:7: ( ':' )
			// mytest.g:111:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "FUNCTION_CALL"
	public final void mFUNCTION_CALL() throws RecognitionException {
		try {
			int _type = FUNCTION_CALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:117:15: ( ( ID ) ( LPAREN ) )
			// mytest.g:117:17: ( ID ) ( LPAREN )
			{
			// mytest.g:117:17: ( ID )
			// mytest.g:117:18: ID
			{
			mID(); 

			}

			if ( input.LA(1)=='(' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION_CALL"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:122:7: ( ( ID ) ( LBRACK ) )
			// mytest.g:122:9: ( ID ) ( LBRACK )
			{
			// mytest.g:122:9: ( ID )
			// mytest.g:122:10: ID
			{
			mID(); 

			}

			if ( input.LA(1)=='[' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:128:9: ( '\\'' ( LETTER ) '\\'' )
			// mytest.g:128:11: '\\'' ( LETTER ) '\\''
			{
			match('\''); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:129:9: ( '\"' ( '\"\"' |~ '\"' )* '\"' )
			// mytest.g:129:11: '\"' ( '\"\"' |~ '\"' )* '\"'
			{
			match('\"'); 
			// mytest.g:129:15: ( '\"\"' |~ '\"' )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\"') ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1=='\"') ) {
						alt9=1;
					}

				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '\uFFFF')) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// mytest.g:129:16: '\"\"'
					{
					match("\"\""); 

					}
					break;
				case 2 :
					// mytest.g:129:23: ~ '\"'
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop9;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:135:10: ( '//' ( . )* '\\n' )
			// mytest.g:135:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mytest.g:135:16: ( . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\n') ) {
					alt10=2;
				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mytest.g:135:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:136:10: ( '/*' ( . )* '*/' )
			// mytest.g:136:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// mytest.g:136:16: ( . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='*') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='/') ) {
						alt11=2;
					}
					else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mytest.g:136:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			match("*/"); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mytest.g:139:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
			// mytest.g:139:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			{
			// mytest.g:139:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mytest.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// mytest.g:1:8: ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE | WHILE_ | FOR_ | IF_ | ELSE_ | RETURN_ | BREAK_ | CONTINUE | INCLUDE | DEFINE | OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB | OP_NOT | OP_LAND | OP_LOR | OP_AND | OP_OR | OP_XOR | OP_LS | OP_RS | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_ASS | DEC_NUM | ID | FLOAT_NUM | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | PERIOD | COMMA | SEMICOL | COLON | FUNCTION_CALL | ARRAY | CHAR | STRING | COMMENT1 | COMMENT2 | WS )
		int alt13=66;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// mytest.g:1:10: SHORT_TYPE
				{
				mSHORT_TYPE(); 

				}
				break;
			case 2 :
				// mytest.g:1:21: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 3 :
				// mytest.g:1:30: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 4 :
				// mytest.g:1:40: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// mytest.g:1:51: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 6 :
				// mytest.g:1:63: LONGLONG_TYPE
				{
				mLONGLONG_TYPE(); 

				}
				break;
			case 7 :
				// mytest.g:1:77: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 8 :
				// mytest.g:1:87: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 9 :
				// mytest.g:1:97: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 10 :
				// mytest.g:1:104: FOR_
				{
				mFOR_(); 

				}
				break;
			case 11 :
				// mytest.g:1:109: IF_
				{
				mIF_(); 

				}
				break;
			case 12 :
				// mytest.g:1:113: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 13 :
				// mytest.g:1:119: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 14 :
				// mytest.g:1:127: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 15 :
				// mytest.g:1:134: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 16 :
				// mytest.g:1:143: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 17 :
				// mytest.g:1:151: DEFINE
				{
				mDEFINE(); 

				}
				break;
			case 18 :
				// mytest.g:1:158: OP_EQ
				{
				mOP_EQ(); 

				}
				break;
			case 19 :
				// mytest.g:1:164: OP_LE
				{
				mOP_LE(); 

				}
				break;
			case 20 :
				// mytest.g:1:170: OP_GE
				{
				mOP_GE(); 

				}
				break;
			case 21 :
				// mytest.g:1:176: OP_NE
				{
				mOP_NE(); 

				}
				break;
			case 22 :
				// mytest.g:1:182: OP_GT
				{
				mOP_GT(); 

				}
				break;
			case 23 :
				// mytest.g:1:188: OP_LT
				{
				mOP_LT(); 

				}
				break;
			case 24 :
				// mytest.g:1:194: OP_ADDAS
				{
				mOP_ADDAS(); 

				}
				break;
			case 25 :
				// mytest.g:1:203: OP_SUBAS
				{
				mOP_SUBAS(); 

				}
				break;
			case 26 :
				// mytest.g:1:212: OP_MULAS
				{
				mOP_MULAS(); 

				}
				break;
			case 27 :
				// mytest.g:1:221: OP_DIVAS
				{
				mOP_DIVAS(); 

				}
				break;
			case 28 :
				// mytest.g:1:230: OP_XORAS
				{
				mOP_XORAS(); 

				}
				break;
			case 29 :
				// mytest.g:1:239: OP_MODAS
				{
				mOP_MODAS(); 

				}
				break;
			case 30 :
				// mytest.g:1:248: OP_LSAS
				{
				mOP_LSAS(); 

				}
				break;
			case 31 :
				// mytest.g:1:256: OP_RSAS
				{
				mOP_RSAS(); 

				}
				break;
			case 32 :
				// mytest.g:1:264: OP_ADDADD
				{
				mOP_ADDADD(); 

				}
				break;
			case 33 :
				// mytest.g:1:274: OP_SUBSUB
				{
				mOP_SUBSUB(); 

				}
				break;
			case 34 :
				// mytest.g:1:284: OP_NOT
				{
				mOP_NOT(); 

				}
				break;
			case 35 :
				// mytest.g:1:291: OP_LAND
				{
				mOP_LAND(); 

				}
				break;
			case 36 :
				// mytest.g:1:299: OP_LOR
				{
				mOP_LOR(); 

				}
				break;
			case 37 :
				// mytest.g:1:306: OP_AND
				{
				mOP_AND(); 

				}
				break;
			case 38 :
				// mytest.g:1:313: OP_OR
				{
				mOP_OR(); 

				}
				break;
			case 39 :
				// mytest.g:1:319: OP_XOR
				{
				mOP_XOR(); 

				}
				break;
			case 40 :
				// mytest.g:1:326: OP_LS
				{
				mOP_LS(); 

				}
				break;
			case 41 :
				// mytest.g:1:332: OP_RS
				{
				mOP_RS(); 

				}
				break;
			case 42 :
				// mytest.g:1:338: OP_ADD
				{
				mOP_ADD(); 

				}
				break;
			case 43 :
				// mytest.g:1:345: OP_SUB
				{
				mOP_SUB(); 

				}
				break;
			case 44 :
				// mytest.g:1:352: OP_MUL
				{
				mOP_MUL(); 

				}
				break;
			case 45 :
				// mytest.g:1:359: OP_DIV
				{
				mOP_DIV(); 

				}
				break;
			case 46 :
				// mytest.g:1:366: OP_ASS
				{
				mOP_ASS(); 

				}
				break;
			case 47 :
				// mytest.g:1:373: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 48 :
				// mytest.g:1:381: ID
				{
				mID(); 

				}
				break;
			case 49 :
				// mytest.g:1:384: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 50 :
				// mytest.g:1:394: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 51 :
				// mytest.g:1:401: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 52 :
				// mytest.g:1:408: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 53 :
				// mytest.g:1:415: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 54 :
				// mytest.g:1:422: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 55 :
				// mytest.g:1:429: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 56 :
				// mytest.g:1:436: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 57 :
				// mytest.g:1:443: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 58 :
				// mytest.g:1:449: SEMICOL
				{
				mSEMICOL(); 

				}
				break;
			case 59 :
				// mytest.g:1:457: COLON
				{
				mCOLON(); 

				}
				break;
			case 60 :
				// mytest.g:1:463: FUNCTION_CALL
				{
				mFUNCTION_CALL(); 

				}
				break;
			case 61 :
				// mytest.g:1:477: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 62 :
				// mytest.g:1:483: CHAR
				{
				mCHAR(); 

				}
				break;
			case 63 :
				// mytest.g:1:488: STRING
				{
				mSTRING(); 

				}
				break;
			case 64 :
				// mytest.g:1:495: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 65 :
				// mytest.g:1:504: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 66 :
				// mytest.g:1:513: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA4_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\2\56\3\uffff";
	static final String DFA4_maxS =
		"\2\71\3\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA4_specialS =
		"\5\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "91:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\13\53\1\uffff\1\76\1\101\1\104\1\106\1\111\1\114\1\116\1\122"+
		"\1\124\1\uffff\1\126\1\130\2\131\1\53\1\134\14\uffff\2\53\3\uffff\15\53"+
		"\5\uffff\1\154\2\uffff\1\156\27\uffff\1\131\1\uffff\1\53\1\160\1\uffff"+
		"\13\53\4\uffff\1\53\2\uffff\1\177\1\53\1\uffff\1\53\1\u0083\1\53\1\u0085"+
		"\1\53\1\u0087\2\53\1\u008a\2\uffff\1\u008b\1\uffff\1\53\1\uffff\1\53\1"+
		"\uffff\1\53\1\uffff\1\53\1\u0090\2\uffff\1\u0091\1\53\1\uffff\1\u0094"+
		"\2\uffff\1\53\2\uffff\1\u0096\1\uffff";
	static final String DFA13_eofS =
		"\u0097\uffff";
	static final String DFA13_minS =
		"\1\11\13\50\1\144\1\75\1\74\2\75\1\53\1\55\1\75\1\52\1\75\1\uffff\1\46"+
		"\1\174\2\56\1\50\1\60\14\uffff\2\50\3\uffff\15\50\5\uffff\1\75\2\uffff"+
		"\1\75\27\uffff\1\56\1\uffff\2\50\1\uffff\13\50\4\uffff\1\50\2\uffff\1"+
		"\40\1\50\1\uffff\11\50\2\uffff\1\50\1\uffff\1\50\1\uffff\1\50\1\uffff"+
		"\1\50\1\uffff\2\50\2\uffff\2\50\1\uffff\1\50\2\uffff\1\50\2\uffff\1\50"+
		"\1\uffff";
	static final String DFA13_maxS =
		"\1\175\13\172\1\151\2\75\1\76\6\75\1\uffff\1\46\1\174\2\71\1\172\1\71"+
		"\14\uffff\2\172\3\uffff\15\172\5\uffff\1\75\2\uffff\1\75\27\uffff\1\71"+
		"\1\uffff\2\172\1\uffff\13\172\4\uffff\1\172\2\uffff\2\172\1\uffff\11\172"+
		"\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172"+
		"\2\uffff\2\172\1\uffff\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff";
	static final String DFA13_acceptS =
		"\26\uffff\1\35\6\uffff\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73\1"+
		"\76\1\77\1\102\2\uffff\1\60\1\74\1\75\15\uffff\1\20\1\21\1\22\1\56\1\23"+
		"\1\uffff\1\27\1\24\1\uffff\1\26\1\25\1\42\1\30\1\40\1\52\1\31\1\41\1\53"+
		"\1\32\1\54\1\33\1\100\1\101\1\55\1\34\1\47\1\43\1\45\1\44\1\46\1\57\1"+
		"\61\1\uffff\1\70\2\uffff\1\13\13\uffff\1\36\1\50\1\37\1\51\1\uffff\1\2"+
		"\1\13\2\uffff\1\12\11\uffff\1\6\1\3\1\uffff\1\12\1\uffff\1\7\1\uffff\1"+
		"\10\1\uffff\1\14\2\uffff\1\1\1\4\2\uffff\1\11\1\uffff\1\16\1\5\1\uffff"+
		"\1\11\1\15\1\uffff\1\17";
	static final String DFA13_specialS =
		"\u0097\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\50\2\uffff\1\50\22\uffff\1\50\1\20\1\47\1\14\1\uffff\1\26\1\27\1\46"+
			"\1\35\1\36\1\23\1\21\1\43\1\22\1\34\1\24\1\31\11\32\1\45\1\44\1\16\1"+
			"\15\1\17\2\uffff\32\33\1\37\1\uffff\1\40\1\25\1\33\1\uffff\1\33\1\13"+
			"\1\6\1\5\1\11\1\4\2\33\1\2\2\33\1\3\5\33\1\12\1\1\2\33\1\7\1\10\3\33"+
			"\1\41\1\30\1\42",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\7\52\1\51"+
			"\22\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\5\52\1\57"+
			"\7\52\1\56\14\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\16\52\1"+
			"\60\13\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\13\52\1"+
			"\61\2\52\1\62\13\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\16\52\1"+
			"\63\13\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\7\52\1\64"+
			"\6\52\1\65\13\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\16\52\1"+
			"\66\13\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\7\52\1\67"+
			"\22\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\13\52\1"+
			"\70\16\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\4\52\1\71"+
			"\25\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\21\52\1"+
			"\72\10\52",
			"\1\74\4\uffff\1\73",
			"\1\75",
			"\1\100\1\77",
			"\1\102\1\103",
			"\1\105",
			"\1\110\21\uffff\1\107",
			"\1\113\17\uffff\1\112",
			"\1\115",
			"\1\121\4\uffff\1\120\15\uffff\1\117",
			"\1\123",
			"",
			"\1\125",
			"\1\127",
			"\1\132\1\uffff\12\132",
			"\1\132\1\uffff\12\133",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"\12\132",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\16\52\1"+
			"\135\13\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\23\52\1"+
			"\136\6\52",
			"\1\137\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\15\52\1"+
			"\140\14\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\16\52\1"+
			"\141\13\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\21\52\1"+
			"\142\10\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\24\52\1"+
			"\143\5\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\1\144\31"+
			"\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\15\52\1"+
			"\145\14\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\10\52\1"+
			"\146\21\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\10\52\1"+
			"\147\21\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\22\52\1"+
			"\150\7\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\23\52\1"+
			"\151\6\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\4\52\1\152"+
			"\25\52",
			"",
			"",
			"",
			"",
			"",
			"\1\153",
			"",
			"",
			"\1\155",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\132\1\uffff\12\133",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\21\52\1"+
			"\157\10\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\6\52\1\162"+
			"\23\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\1\163\31"+
			"\52",
			"\1\164\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\1\52\1\165"+
			"\30\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\21\52\1"+
			"\166\10\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\23\52\1"+
			"\167\6\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\3\52\1\170"+
			"\26\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\13\52\1"+
			"\171\16\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\4\52\1\172"+
			"\25\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\24\52\1"+
			"\173\5\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\1\174\31"+
			"\52",
			"",
			"",
			"",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\23\52\1"+
			"\175\6\52",
			"",
			"",
			"\1\176\7\uffff\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1"+
			"\uffff\32\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\23\52\1"+
			"\u0080\6\52",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\13\52\1"+
			"\u0082\16\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\10\52\1"+
			"\u0084\21\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\4\52\1\u0086"+
			"\25\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\21\52\1"+
			"\u0088\10\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\12\52\1"+
			"\u0089\17\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\4\52\1\u008c"+
			"\25\52",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\15\52\1"+
			"\u008d\14\52",
			"",
			"\1\u008e\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\15\52\1"+
			"\u008f\14\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\24\52\1"+
			"\u0092\5\52",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			"",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\4\52\1\u0095"+
			"\25\52",
			"",
			"",
			"\1\54\7\uffff\12\52\7\uffff\32\52\1\55\3\uffff\1\52\1\uffff\32\52",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE | WHILE_ | FOR_ | IF_ | ELSE_ | RETURN_ | BREAK_ | CONTINUE | INCLUDE | DEFINE | OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB | OP_NOT | OP_LAND | OP_LOR | OP_AND | OP_OR | OP_XOR | OP_LS | OP_RS | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_ASS | DEC_NUM | ID | FLOAT_NUM | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | PERIOD | COMMA | SEMICOL | COLON | FUNCTION_CALL | ARRAY | CHAR | STRING | COMMENT1 | COMMENT2 | WS );";
		}
	}

}
