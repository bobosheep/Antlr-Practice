// $ANTLR 3.5.2 myChecker.g 2018-05-29 00:20:01

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int ARRAY=4;
	public static final int BREAK_=5;
	public static final int CHAR=6;
	public static final int CHAR_TYPE=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT1=10;
	public static final int COMMENT2=11;
	public static final int CONTINUE_=12;
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

	public myCheckerLexer() {} 
	public myCheckerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myChecker.g"; }

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:7:7: ( '.h' )
			// myChecker.g:7:9: '.h'
			{
			match(".h"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:8:7: ( 'else if(' )
			// myChecker.g:8:9: 'else if('
			{
			match("else if("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:9:7: ( 'main(' )
			// myChecker.g:9:9: 'main('
			{
			match("main("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "SHORT_TYPE"
	public final void mSHORT_TYPE() throws RecognitionException {
		try {
			int _type = SHORT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:309:17: ( 'short' )
			// myChecker.g:309:21: 'short'
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
			// myChecker.g:310:17: ( 'int' )
			// myChecker.g:310:21: 'int'
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
			// myChecker.g:311:17: ( 'long' )
			// myChecker.g:311:21: 'long'
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
			// myChecker.g:312:17: ( 'float' )
			// myChecker.g:312:21: 'float'
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
			// myChecker.g:313:17: ( 'double' )
			// myChecker.g:313:21: 'double'
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
			// myChecker.g:314:17: ( 'long long' )
			// myChecker.g:314:21: 'long long'
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
			// myChecker.g:315:17: ( 'char' )
			// myChecker.g:315:21: 'char'
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
			// myChecker.g:316:17: ( 'void' )
			// myChecker.g:316:21: 'void'
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
			// myChecker.g:318:13: ( 'while(' )
			// myChecker.g:318:17: 'while('
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
			// myChecker.g:319:13: ( 'for(' )
			// myChecker.g:319:17: 'for('
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
			// myChecker.g:320:13: ( 'if(' )
			// myChecker.g:320:17: 'if('
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
			// myChecker.g:321:13: ( 'else' )
			// myChecker.g:321:17: 'else'
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
			// myChecker.g:322:13: ( 'return' )
			// myChecker.g:322:17: 'return'
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
			// myChecker.g:323:13: ( 'break' )
			// myChecker.g:323:17: 'break'
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

	// $ANTLR start "CONTINUE_"
	public final void mCONTINUE_() throws RecognitionException {
		try {
			int _type = CONTINUE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:324:13: ( 'continue' )
			// myChecker.g:324:17: 'continue'
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
	// $ANTLR end "CONTINUE_"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:325:13: ( '#include' )
			// myChecker.g:325:17: '#include'
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
			// myChecker.g:326:13: ( '#define' )
			// myChecker.g:326:17: '#define'
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
			// myChecker.g:332:9: ( '==' )
			// myChecker.g:332:13: '=='
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
			// myChecker.g:333:9: ( '<=' )
			// myChecker.g:333:13: '<='
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
			// myChecker.g:334:9: ( '>=' )
			// myChecker.g:334:13: '>='
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
			// myChecker.g:335:9: ( '!=' )
			// myChecker.g:335:13: '!='
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
			// myChecker.g:336:9: ( '>' )
			// myChecker.g:336:13: '>'
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
			// myChecker.g:337:9: ( '<' )
			// myChecker.g:337:13: '<'
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
			// myChecker.g:343:13: ( '+=' )
			// myChecker.g:343:17: '+='
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
			// myChecker.g:344:13: ( '-=' )
			// myChecker.g:344:17: '-='
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
			// myChecker.g:345:13: ( '*=' )
			// myChecker.g:345:17: '*='
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
			// myChecker.g:346:13: ( '/=' )
			// myChecker.g:346:17: '/='
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
			// myChecker.g:347:13: ( '^=' )
			// myChecker.g:347:17: '^='
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
			// myChecker.g:348:13: ( '%=' )
			// myChecker.g:348:17: '%='
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
			// myChecker.g:349:13: ( '<<=' )
			// myChecker.g:349:17: '<<='
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
			// myChecker.g:350:13: ( '>>=' )
			// myChecker.g:350:17: '>>='
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
			// myChecker.g:351:13: ( '++' )
			// myChecker.g:351:17: '++'
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
			// myChecker.g:352:13: ( '--' )
			// myChecker.g:352:17: '--'
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
			// myChecker.g:358:9: ( '!' )
			// myChecker.g:358:13: '!'
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
			// myChecker.g:359:9: ( '&&' )
			// myChecker.g:359:13: '&&'
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
			// myChecker.g:360:9: ( '||' )
			// myChecker.g:360:13: '||'
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
			// myChecker.g:366:9: ( '&' )
			// myChecker.g:366:13: '&'
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
			// myChecker.g:367:9: ( '|' )
			// myChecker.g:367:13: '|'
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
			// myChecker.g:368:9: ( '^' )
			// myChecker.g:368:13: '^'
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
			// myChecker.g:369:9: ( '<<' )
			// myChecker.g:369:13: '<<'
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
			// myChecker.g:370:9: ( '>>' )
			// myChecker.g:370:13: '>>'
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
			// myChecker.g:376:10: ( '+' )
			// myChecker.g:376:14: '+'
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
			// myChecker.g:377:10: ( '-' )
			// myChecker.g:377:14: '-'
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
			// myChecker.g:378:10: ( '*' )
			// myChecker.g:378:14: '*'
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
			// myChecker.g:379:10: ( '/' )
			// myChecker.g:379:14: '/'
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
			// myChecker.g:380:10: ( '=' )
			// myChecker.g:380:14: '='
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
			// myChecker.g:386:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myChecker.g:386:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myChecker.g:386:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
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
					// myChecker.g:386:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myChecker.g:386:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myChecker.g:386:28: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// myChecker.g:
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
			// myChecker.g:388:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myChecker.g:388:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myChecker.g:388:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myChecker.g:
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
			// myChecker.g:390:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// myChecker.g:390:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myChecker.g:390:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myChecker.g:390:38: FLOAT_NUM3
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
			// myChecker.g:391:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myChecker.g:391:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myChecker.g:391:22: ( DIGIT )+
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
					// myChecker.g:
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
			// myChecker.g:391:33: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myChecker.g:
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
			// myChecker.g:392:20: ( '.' ( DIGIT )+ )
			// myChecker.g:392:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myChecker.g:392:25: ( DIGIT )+
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
					// myChecker.g:
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
			// myChecker.g:393:20: ( ( DIGIT )+ )
			// myChecker.g:393:22: ( DIGIT )+
			{
			// myChecker.g:393:22: ( DIGIT )+
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
					// myChecker.g:
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
			// myChecker.g:394:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myChecker.g:
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
			// myChecker.g:395:16: ( '0' .. '9' )
			// myChecker.g:
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
			// myChecker.g:401:8: ( '(' )
			// myChecker.g:401:10: '('
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
			// myChecker.g:402:8: ( ')' )
			// myChecker.g:402:10: ')'
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
			// myChecker.g:403:8: ( '[' )
			// myChecker.g:403:10: '['
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
			// myChecker.g:404:8: ( ']' )
			// myChecker.g:404:10: ']'
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
			// myChecker.g:405:8: ( '{' )
			// myChecker.g:405:10: '{'
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
			// myChecker.g:406:8: ( '}' )
			// myChecker.g:406:10: '}'
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
			// myChecker.g:407:8: ( '.' )
			// myChecker.g:407:10: '.'
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
			// myChecker.g:408:7: ( ',' )
			// myChecker.g:408:9: ','
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
			// myChecker.g:409:9: ( ';' )
			// myChecker.g:409:11: ';'
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
			// myChecker.g:410:7: ( ':' )
			// myChecker.g:410:9: ':'
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
			// myChecker.g:416:15: ( ( ID ) ( LPAREN ) )
			// myChecker.g:416:17: ( ID ) ( LPAREN )
			{
			// myChecker.g:416:17: ( ID )
			// myChecker.g:416:18: ID
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
			// myChecker.g:421:7: ( ( ID ) ( LBRACK ) )
			// myChecker.g:421:9: ( ID ) ( LBRACK )
			{
			// myChecker.g:421:9: ( ID )
			// myChecker.g:421:10: ID
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
			// myChecker.g:427:9: ( '\\'' ( LETTER ) '\\'' )
			// myChecker.g:427:11: '\\'' ( LETTER ) '\\''
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
			// myChecker.g:428:9: ( '\"' ( '\"\"' |~ '\"' )* '\"' )
			// myChecker.g:428:11: '\"' ( '\"\"' |~ '\"' )* '\"'
			{
			match('\"'); 
			// myChecker.g:428:15: ( '\"\"' |~ '\"' )*
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
					// myChecker.g:428:16: '\"\"'
					{
					match("\"\""); 

					}
					break;
				case 2 :
					// myChecker.g:428:23: ~ '\"'
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
			// myChecker.g:434:10: ( '//' ( . )* '\\n' )
			// myChecker.g:434:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myChecker.g:434:16: ( . )*
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
					// myChecker.g:434:17: .
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
			// myChecker.g:435:10: ( '/*' ( . )* '*/' )
			// myChecker.g:435:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myChecker.g:435:16: ( . )*
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
					// myChecker.g:435:17: .
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
			// myChecker.g:438:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
			// myChecker.g:438:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			{
			// myChecker.g:438:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
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
					// myChecker.g:
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
		// myChecker.g:1:8: ( T__75 | T__76 | T__77 | SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE | WHILE_ | FOR_ | IF_ | ELSE_ | RETURN_ | BREAK_ | CONTINUE_ | INCLUDE | DEFINE | OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB | OP_NOT | OP_LAND | OP_LOR | OP_AND | OP_OR | OP_XOR | OP_LS | OP_RS | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_ASS | DEC_NUM | ID | FLOAT_NUM | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | PERIOD | COMMA | SEMICOL | COLON | FUNCTION_CALL | ARRAY | CHAR | STRING | COMMENT1 | COMMENT2 | WS )
		int alt13=69;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// myChecker.g:1:10: T__75
				{
				mT__75(); 

				}
				break;
			case 2 :
				// myChecker.g:1:16: T__76
				{
				mT__76(); 

				}
				break;
			case 3 :
				// myChecker.g:1:22: T__77
				{
				mT__77(); 

				}
				break;
			case 4 :
				// myChecker.g:1:28: SHORT_TYPE
				{
				mSHORT_TYPE(); 

				}
				break;
			case 5 :
				// myChecker.g:1:39: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 6 :
				// myChecker.g:1:48: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 7 :
				// myChecker.g:1:58: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 8 :
				// myChecker.g:1:69: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 9 :
				// myChecker.g:1:81: LONGLONG_TYPE
				{
				mLONGLONG_TYPE(); 

				}
				break;
			case 10 :
				// myChecker.g:1:95: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 11 :
				// myChecker.g:1:105: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 12 :
				// myChecker.g:1:115: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 13 :
				// myChecker.g:1:122: FOR_
				{
				mFOR_(); 

				}
				break;
			case 14 :
				// myChecker.g:1:127: IF_
				{
				mIF_(); 

				}
				break;
			case 15 :
				// myChecker.g:1:131: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 16 :
				// myChecker.g:1:137: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 17 :
				// myChecker.g:1:145: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 18 :
				// myChecker.g:1:152: CONTINUE_
				{
				mCONTINUE_(); 

				}
				break;
			case 19 :
				// myChecker.g:1:162: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 20 :
				// myChecker.g:1:170: DEFINE
				{
				mDEFINE(); 

				}
				break;
			case 21 :
				// myChecker.g:1:177: OP_EQ
				{
				mOP_EQ(); 

				}
				break;
			case 22 :
				// myChecker.g:1:183: OP_LE
				{
				mOP_LE(); 

				}
				break;
			case 23 :
				// myChecker.g:1:189: OP_GE
				{
				mOP_GE(); 

				}
				break;
			case 24 :
				// myChecker.g:1:195: OP_NE
				{
				mOP_NE(); 

				}
				break;
			case 25 :
				// myChecker.g:1:201: OP_GT
				{
				mOP_GT(); 

				}
				break;
			case 26 :
				// myChecker.g:1:207: OP_LT
				{
				mOP_LT(); 

				}
				break;
			case 27 :
				// myChecker.g:1:213: OP_ADDAS
				{
				mOP_ADDAS(); 

				}
				break;
			case 28 :
				// myChecker.g:1:222: OP_SUBAS
				{
				mOP_SUBAS(); 

				}
				break;
			case 29 :
				// myChecker.g:1:231: OP_MULAS
				{
				mOP_MULAS(); 

				}
				break;
			case 30 :
				// myChecker.g:1:240: OP_DIVAS
				{
				mOP_DIVAS(); 

				}
				break;
			case 31 :
				// myChecker.g:1:249: OP_XORAS
				{
				mOP_XORAS(); 

				}
				break;
			case 32 :
				// myChecker.g:1:258: OP_MODAS
				{
				mOP_MODAS(); 

				}
				break;
			case 33 :
				// myChecker.g:1:267: OP_LSAS
				{
				mOP_LSAS(); 

				}
				break;
			case 34 :
				// myChecker.g:1:275: OP_RSAS
				{
				mOP_RSAS(); 

				}
				break;
			case 35 :
				// myChecker.g:1:283: OP_ADDADD
				{
				mOP_ADDADD(); 

				}
				break;
			case 36 :
				// myChecker.g:1:293: OP_SUBSUB
				{
				mOP_SUBSUB(); 

				}
				break;
			case 37 :
				// myChecker.g:1:303: OP_NOT
				{
				mOP_NOT(); 

				}
				break;
			case 38 :
				// myChecker.g:1:310: OP_LAND
				{
				mOP_LAND(); 

				}
				break;
			case 39 :
				// myChecker.g:1:318: OP_LOR
				{
				mOP_LOR(); 

				}
				break;
			case 40 :
				// myChecker.g:1:325: OP_AND
				{
				mOP_AND(); 

				}
				break;
			case 41 :
				// myChecker.g:1:332: OP_OR
				{
				mOP_OR(); 

				}
				break;
			case 42 :
				// myChecker.g:1:338: OP_XOR
				{
				mOP_XOR(); 

				}
				break;
			case 43 :
				// myChecker.g:1:345: OP_LS
				{
				mOP_LS(); 

				}
				break;
			case 44 :
				// myChecker.g:1:351: OP_RS
				{
				mOP_RS(); 

				}
				break;
			case 45 :
				// myChecker.g:1:357: OP_ADD
				{
				mOP_ADD(); 

				}
				break;
			case 46 :
				// myChecker.g:1:364: OP_SUB
				{
				mOP_SUB(); 

				}
				break;
			case 47 :
				// myChecker.g:1:371: OP_MUL
				{
				mOP_MUL(); 

				}
				break;
			case 48 :
				// myChecker.g:1:378: OP_DIV
				{
				mOP_DIV(); 

				}
				break;
			case 49 :
				// myChecker.g:1:385: OP_ASS
				{
				mOP_ASS(); 

				}
				break;
			case 50 :
				// myChecker.g:1:392: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 51 :
				// myChecker.g:1:400: ID
				{
				mID(); 

				}
				break;
			case 52 :
				// myChecker.g:1:403: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 53 :
				// myChecker.g:1:413: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 54 :
				// myChecker.g:1:420: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 55 :
				// myChecker.g:1:427: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 56 :
				// myChecker.g:1:434: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 57 :
				// myChecker.g:1:441: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 58 :
				// myChecker.g:1:448: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 59 :
				// myChecker.g:1:455: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 60 :
				// myChecker.g:1:462: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 61 :
				// myChecker.g:1:468: SEMICOL
				{
				mSEMICOL(); 

				}
				break;
			case 62 :
				// myChecker.g:1:476: COLON
				{
				mCOLON(); 

				}
				break;
			case 63 :
				// myChecker.g:1:482: FUNCTION_CALL
				{
				mFUNCTION_CALL(); 

				}
				break;
			case 64 :
				// myChecker.g:1:496: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 65 :
				// myChecker.g:1:502: CHAR
				{
				mCHAR(); 

				}
				break;
			case 66 :
				// myChecker.g:1:507: STRING
				{
				mSTRING(); 

				}
				break;
			case 67 :
				// myChecker.g:1:514: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 68 :
				// myChecker.g:1:523: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 69 :
				// myChecker.g:1:532: WS
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
			return "390:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\1\54\14\57\1\uffff\1\103\1\106\1\111\1\113\1\116\1\121\1\123"+
		"\1\127\1\131\1\uffff\1\133\1\135\2\136\1\57\17\uffff\2\57\3\uffff\16\57"+
		"\5\uffff\1\160\2\uffff\1\162\26\uffff\1\136\3\57\1\166\1\uffff\12\57\4"+
		"\uffff\1\u0083\2\57\2\uffff\1\u0087\1\57\1\uffff\1\57\1\u008b\1\57\1\u008d"+
		"\3\57\3\uffff\1\u0092\2\uffff\1\u0093\1\uffff\1\57\1\uffff\1\57\1\uffff"+
		"\2\57\1\u0098\3\uffff\1\u0099\1\57\1\uffff\1\u009c\2\uffff\1\57\2\uffff"+
		"\1\u009e\1\uffff";
	static final String DFA13_eofS =
		"\u009f\uffff";
	static final String DFA13_minS =
		"\1\11\1\60\14\50\1\144\1\75\1\74\2\75\1\53\1\55\1\75\1\52\1\75\1\uffff"+
		"\1\46\1\174\2\56\1\50\17\uffff\2\50\3\uffff\16\50\5\uffff\1\75\2\uffff"+
		"\1\75\26\uffff\1\56\4\50\1\uffff\12\50\4\uffff\1\40\2\50\2\uffff\1\40"+
		"\1\50\1\uffff\7\50\3\uffff\1\50\2\uffff\1\50\1\uffff\1\50\1\uffff\1\50"+
		"\1\uffff\3\50\3\uffff\2\50\1\uffff\1\50\2\uffff\1\50\2\uffff\1\50\1\uffff";
	static final String DFA13_maxS =
		"\1\175\1\150\14\172\1\151\2\75\1\76\6\75\1\uffff\1\46\1\174\2\71\1\172"+
		"\17\uffff\2\172\3\uffff\16\172\5\uffff\1\75\2\uffff\1\75\26\uffff\1\71"+
		"\4\172\1\uffff\12\172\4\uffff\3\172\2\uffff\2\172\1\uffff\7\172\3\uffff"+
		"\1\172\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\3\172\3\uffff"+
		"\2\172\1\uffff\1\172\2\uffff\1\172\2\uffff\1\172\1\uffff";
	static final String DFA13_acceptS =
		"\30\uffff\1\40\5\uffff\1\65\1\66\1\67\1\70\1\71\1\72\1\74\1\75\1\76\1"+
		"\101\1\102\1\105\1\1\1\64\1\73\2\uffff\1\63\1\77\1\100\16\uffff\1\23\1"+
		"\24\1\25\1\61\1\26\1\uffff\1\32\1\27\1\uffff\1\31\1\30\1\45\1\33\1\43"+
		"\1\55\1\34\1\44\1\56\1\35\1\57\1\36\1\103\1\104\1\60\1\37\1\52\1\46\1"+
		"\50\1\47\1\51\1\62\5\uffff\1\16\12\uffff\1\41\1\53\1\42\1\54\3\uffff\1"+
		"\5\1\16\2\uffff\1\15\7\uffff\1\2\1\17\1\3\1\uffff\1\11\1\6\1\uffff\1\15"+
		"\1\uffff\1\12\1\uffff\1\13\3\uffff\1\3\1\4\1\7\2\uffff\1\14\1\uffff\1"+
		"\21\1\10\1\uffff\1\14\1\20\1\uffff\1\22";
	static final String DFA13_specialS =
		"\u009f\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\51\2\uffff\1\51\22\uffff\1\51\1\22\1\50\1\16\1\uffff\1\30\1\31\1\47"+
			"\1\36\1\37\1\25\1\23\1\44\1\24\1\1\1\26\1\33\11\34\1\46\1\45\1\20\1\17"+
			"\1\21\2\uffff\32\35\1\40\1\uffff\1\41\1\27\1\35\1\uffff\1\35\1\15\1\11"+
			"\1\10\1\2\1\7\2\35\1\5\2\35\1\6\1\3\4\35\1\14\1\4\2\35\1\12\1\13\3\35"+
			"\1\42\1\32\1\43",
			"\12\53\56\uffff\1\52",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\13\56\1"+
			"\55\16\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\1\62\31"+
			"\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\7\56\1\63"+
			"\22\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\5\56\1\65"+
			"\7\56\1\64\14\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\16\56\1"+
			"\66\13\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\13\56\1"+
			"\67\2\56\1\70\13\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\16\56\1"+
			"\71\13\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\7\56\1\72"+
			"\6\56\1\73\13\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\16\56\1"+
			"\74\13\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\7\56\1\75"+
			"\22\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\4\56\1\76"+
			"\25\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\21\56\1"+
			"\77\10\56",
			"\1\101\4\uffff\1\100",
			"\1\102",
			"\1\105\1\104",
			"\1\107\1\110",
			"\1\112",
			"\1\115\21\uffff\1\114",
			"\1\120\17\uffff\1\117",
			"\1\122",
			"\1\126\4\uffff\1\125\15\uffff\1\124",
			"\1\130",
			"",
			"\1\132",
			"\1\134",
			"\1\53\1\uffff\12\53",
			"\1\53\1\uffff\12\137",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
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
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\22\56\1"+
			"\140\7\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\10\56\1"+
			"\141\21\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\16\56\1"+
			"\142\13\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\23\56\1"+
			"\143\6\56",
			"\1\144\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\15\56\1"+
			"\145\14\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\16\56\1"+
			"\146\13\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\21\56\1"+
			"\147\10\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\24\56\1"+
			"\150\5\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\1\151\31"+
			"\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\15\56\1"+
			"\152\14\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\10\56\1"+
			"\153\21\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\10\56\1"+
			"\154\21\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\23\56\1"+
			"\155\6\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\4\56\1\156"+
			"\25\56",
			"",
			"",
			"",
			"",
			"",
			"\1\157",
			"",
			"",
			"\1\161",
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
			"\1\53\1\uffff\12\137",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\4\56\1\163"+
			"\25\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\15\56\1"+
			"\164\14\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\21\56\1"+
			"\165\10\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\6\56\1\170"+
			"\23\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\1\171\31"+
			"\56",
			"\1\172\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\1\56\1\173"+
			"\30\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\21\56\1"+
			"\174\10\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\23\56\1"+
			"\175\6\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\3\56\1\176"+
			"\26\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\13\56\1"+
			"\177\16\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\24\56\1"+
			"\u0080\5\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\1\u0081"+
			"\31\56",
			"",
			"",
			"",
			"",
			"\1\u0082\7\uffff\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56"+
			"\1\uffff\32\56",
			"\1\u0084\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\23\56\1"+
			"\u0085\6\56",
			"",
			"",
			"\1\u0086\7\uffff\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56"+
			"\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\23\56\1"+
			"\u0088\6\56",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\13\56\1"+
			"\u008a\16\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\10\56\1"+
			"\u008c\21\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\4\56\1\u008e"+
			"\25\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\21\56\1"+
			"\u008f\10\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\12\56\1"+
			"\u0090\17\56",
			"",
			"",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\4\56\1\u0094"+
			"\25\56",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\15\56\1"+
			"\u0095\14\56",
			"",
			"\1\u0096\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\15\56\1"+
			"\u0097\14\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\24\56\1"+
			"\u009a\5\56",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\4\56\1\u009d"+
			"\25\56",
			"",
			"",
			"\1\60\7\uffff\12\56\7\uffff\32\56\1\61\3\uffff\1\56\1\uffff\32\56",
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
			return "1:1: Tokens : ( T__75 | T__76 | T__77 | SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE | WHILE_ | FOR_ | IF_ | ELSE_ | RETURN_ | BREAK_ | CONTINUE_ | INCLUDE | DEFINE | OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB | OP_NOT | OP_LAND | OP_LOR | OP_AND | OP_OR | OP_XOR | OP_LS | OP_RS | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_ASS | DEC_NUM | ID | FLOAT_NUM | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | PERIOD | COMMA | SEMICOL | COLON | FUNCTION_CALL | ARRAY | CHAR | STRING | COMMENT1 | COMMENT2 | WS );";
		}
	}

}
