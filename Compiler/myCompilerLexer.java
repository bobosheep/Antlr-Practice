// $ANTLR 3.5.2 myCompiler.g 2018-07-01 21:42:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int EscapeSequence=18;
	public static final int FLOAT_NUM=19;
	public static final int FLOAT_NUM1=20;
	public static final int FLOAT_NUM2=21;
	public static final int FLOAT_NUM3=22;
	public static final int FLOAT_TYPE=23;
	public static final int FOR_=24;
	public static final int FUNCTION_CALL=25;
	public static final int ID=26;
	public static final int IF_=27;
	public static final int INCLUDE=28;
	public static final int INT_TYPE=29;
	public static final int LBRACE=30;
	public static final int LBRACK=31;
	public static final int LETTER=32;
	public static final int LONGLONG_TYPE=33;
	public static final int LONG_TYPE=34;
	public static final int LPAREN=35;
	public static final int OP_ADD=36;
	public static final int OP_ADDADD=37;
	public static final int OP_ADDAS=38;
	public static final int OP_AND=39;
	public static final int OP_ASS=40;
	public static final int OP_DIV=41;
	public static final int OP_DIVAS=42;
	public static final int OP_EQ=43;
	public static final int OP_GE=44;
	public static final int OP_GT=45;
	public static final int OP_LAND=46;
	public static final int OP_LE=47;
	public static final int OP_LOR=48;
	public static final int OP_LS=49;
	public static final int OP_LSAS=50;
	public static final int OP_LT=51;
	public static final int OP_MODAS=52;
	public static final int OP_MUL=53;
	public static final int OP_MULAS=54;
	public static final int OP_NE=55;
	public static final int OP_NOT=56;
	public static final int OP_OR=57;
	public static final int OP_RS=58;
	public static final int OP_RSAS=59;
	public static final int OP_SUB=60;
	public static final int OP_SUBAS=61;
	public static final int OP_SUBSUB=62;
	public static final int OP_XOR=63;
	public static final int OP_XORAS=64;
	public static final int PERIOD=65;
	public static final int PREPROCESSOR=66;
	public static final int RBRACE=67;
	public static final int RBRACK=68;
	public static final int RETURN_=69;
	public static final int RPAREN=70;
	public static final int SEMICOL=71;
	public static final int SHORT_TYPE=72;
	public static final int STRING=73;
	public static final int VOID_TYPE=74;
	public static final int WHILE_=75;
	public static final int WS=76;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:7:7: ( 'printf' )
			// myCompiler.g:7:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:387:8: ( '(' )
			// myCompiler.g:387:10: '('
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
			// myCompiler.g:388:8: ( ')' )
			// myCompiler.g:388:10: ')'
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
			// myCompiler.g:389:8: ( '[' )
			// myCompiler.g:389:10: '['
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
			// myCompiler.g:390:8: ( ']' )
			// myCompiler.g:390:10: ']'
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
			// myCompiler.g:391:8: ( '{' )
			// myCompiler.g:391:10: '{'
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
			// myCompiler.g:392:8: ( '}' )
			// myCompiler.g:392:10: '}'
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
			// myCompiler.g:393:8: ( '.' )
			// myCompiler.g:393:10: '.'
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
			// myCompiler.g:394:7: ( ',' )
			// myCompiler.g:394:9: ','
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
			// myCompiler.g:395:9: ( ';' )
			// myCompiler.g:395:11: ';'
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
			// myCompiler.g:396:7: ( ':' )
			// myCompiler.g:396:9: ':'
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

	// $ANTLR start "OP_EQ"
	public final void mOP_EQ() throws RecognitionException {
		try {
			int _type = OP_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:403:9: ( '==' )
			// myCompiler.g:403:13: '=='
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
			// myCompiler.g:404:9: ( '<=' )
			// myCompiler.g:404:13: '<='
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
			// myCompiler.g:405:9: ( '>=' )
			// myCompiler.g:405:13: '>='
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
			// myCompiler.g:406:9: ( '!=' )
			// myCompiler.g:406:13: '!='
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
			// myCompiler.g:407:9: ( '>' )
			// myCompiler.g:407:13: '>'
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
			// myCompiler.g:408:9: ( '<' )
			// myCompiler.g:408:13: '<'
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
			// myCompiler.g:414:13: ( '+=' )
			// myCompiler.g:414:17: '+='
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
			// myCompiler.g:415:13: ( '-=' )
			// myCompiler.g:415:17: '-='
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
			// myCompiler.g:416:13: ( '*=' )
			// myCompiler.g:416:17: '*='
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
			// myCompiler.g:417:13: ( '/=' )
			// myCompiler.g:417:17: '/='
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
			// myCompiler.g:418:13: ( '^=' )
			// myCompiler.g:418:17: '^='
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
			// myCompiler.g:419:13: ( '%=' )
			// myCompiler.g:419:17: '%='
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
			// myCompiler.g:420:13: ( '<<=' )
			// myCompiler.g:420:17: '<<='
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
			// myCompiler.g:421:13: ( '>>=' )
			// myCompiler.g:421:17: '>>='
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
			// myCompiler.g:422:13: ( '++' )
			// myCompiler.g:422:17: '++'
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
			// myCompiler.g:423:13: ( '--' )
			// myCompiler.g:423:17: '--'
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
			// myCompiler.g:429:9: ( '!' )
			// myCompiler.g:429:13: '!'
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
			// myCompiler.g:430:9: ( '&&' )
			// myCompiler.g:430:13: '&&'
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
			// myCompiler.g:431:9: ( '||' )
			// myCompiler.g:431:13: '||'
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
			// myCompiler.g:437:9: ( '&' )
			// myCompiler.g:437:13: '&'
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
			// myCompiler.g:438:9: ( '|' )
			// myCompiler.g:438:13: '|'
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
			// myCompiler.g:439:9: ( '^' )
			// myCompiler.g:439:13: '^'
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
			// myCompiler.g:440:9: ( '<<' )
			// myCompiler.g:440:13: '<<'
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
			// myCompiler.g:441:9: ( '>>' )
			// myCompiler.g:441:13: '>>'
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
			// myCompiler.g:447:10: ( '+' )
			// myCompiler.g:447:14: '+'
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
			// myCompiler.g:448:10: ( '-' )
			// myCompiler.g:448:14: '-'
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
			// myCompiler.g:449:10: ( '*' )
			// myCompiler.g:449:14: '*'
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
			// myCompiler.g:450:10: ( '/' )
			// myCompiler.g:450:14: '/'
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
			// myCompiler.g:451:10: ( '=' )
			// myCompiler.g:451:14: '='
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

	// $ANTLR start "SHORT_TYPE"
	public final void mSHORT_TYPE() throws RecognitionException {
		try {
			int _type = SHORT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:459:17: ( 'short' )
			// myCompiler.g:459:21: 'short'
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
			// myCompiler.g:460:17: ( 'int' )
			// myCompiler.g:460:21: 'int'
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
			// myCompiler.g:461:17: ( 'long' )
			// myCompiler.g:461:21: 'long'
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
			// myCompiler.g:462:17: ( 'float' )
			// myCompiler.g:462:21: 'float'
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
			// myCompiler.g:463:17: ( 'double' )
			// myCompiler.g:463:21: 'double'
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
			// myCompiler.g:464:17: ( 'long long' )
			// myCompiler.g:464:21: 'long long'
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
			// myCompiler.g:465:17: ( 'char' )
			// myCompiler.g:465:21: 'char'
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
			// myCompiler.g:466:17: ( 'void' )
			// myCompiler.g:466:21: 'void'
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
			// myCompiler.g:468:13: ( 'while' )
			// myCompiler.g:468:17: 'while'
			{
			match("while"); 

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
			// myCompiler.g:469:13: ( 'for' )
			// myCompiler.g:469:17: 'for'
			{
			match("for"); 

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
			// myCompiler.g:470:13: ( 'if' )
			// myCompiler.g:470:17: 'if'
			{
			match("if"); 

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
			// myCompiler.g:471:13: ( 'else' )
			// myCompiler.g:471:17: 'else'
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
			// myCompiler.g:472:13: ( 'return' )
			// myCompiler.g:472:17: 'return'
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
			// myCompiler.g:473:13: ( 'break' )
			// myCompiler.g:473:17: 'break'
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
			// myCompiler.g:474:13: ( 'continue' )
			// myCompiler.g:474:17: 'continue'
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
			// myCompiler.g:475:13: ( '#include' )
			// myCompiler.g:475:17: '#include'
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
			// myCompiler.g:476:13: ( '#define' )
			// myCompiler.g:476:17: '#define'
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

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// myCompiler.g:483:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myCompiler.g:483:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myCompiler.g:483:22: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match('.'); 
			// myCompiler.g:483:33: ( DIGIT )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myCompiler.g:
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
					break loop2;
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
			// myCompiler.g:484:20: ( '.' ( DIGIT )+ )
			// myCompiler.g:484:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myCompiler.g:484:25: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
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
			// myCompiler.g:485:20: ( ( DIGIT )+ )
			// myCompiler.g:485:22: ( DIGIT )+
			{
			// myCompiler.g:485:22: ( DIGIT )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
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
			// myCompiler.g:486:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myCompiler.g:
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
			// myCompiler.g:487:16: ( '0' .. '9' )
			// myCompiler.g:
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

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:489:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myCompiler.g:489:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myCompiler.g:489:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myCompiler.g:489:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myCompiler.g:489:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myCompiler.g:489:28: ( DIGIT )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// myCompiler.g:
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
							break loop5;
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
			// myCompiler.g:491:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myCompiler.g:491:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:491:14: ( LETTER | DIGIT )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:
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
					break loop7;
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
			// myCompiler.g:493:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt8=3;
			alt8 = dfa8.predict(input);
			switch (alt8) {
				case 1 :
					// myCompiler.g:493:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myCompiler.g:493:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myCompiler.g:493:38: FLOAT_NUM3
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

	// $ANTLR start "FUNCTION_CALL"
	public final void mFUNCTION_CALL() throws RecognitionException {
		try {
			int _type = FUNCTION_CALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:499:15: ( ( ID ) ( LPAREN ) )
			// myCompiler.g:499:17: ( ID ) ( LPAREN )
			{
			// myCompiler.g:499:17: ( ID )
			// myCompiler.g:499:18: ID
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
			// myCompiler.g:504:7: ( ( ID ) ( LBRACK ) )
			// myCompiler.g:504:9: ( ID ) ( LBRACK )
			{
			// myCompiler.g:504:9: ( ID )
			// myCompiler.g:504:10: ID
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
			// myCompiler.g:510:9: ( '\\'' ( LETTER ) '\\'' )
			// myCompiler.g:510:11: '\\'' ( LETTER ) '\\''
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
			// myCompiler.g:512:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myCompiler.g:512:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myCompiler.g:512:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\\') ) {
					alt9=1;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '!')||(LA9_0 >= '#' && LA9_0 <= '[')||(LA9_0 >= ']' && LA9_0 <= '\uFFFF')) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// myCompiler.g:512:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:512:31: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myCompiler.g:518:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// myCompiler.g:518:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:523:10: ( '//' ( . )* '\\n' )
			// myCompiler.g:523:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myCompiler.g:523:16: ( . )*
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
					// myCompiler.g:523:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match('\n'); 
			_channel=HIDDEN;
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
			// myCompiler.g:524:10: ( '/*' ( . )* '*/' )
			// myCompiler.g:524:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:524:16: ( . )*
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
					// myCompiler.g:524:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
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
			// myCompiler.g:527:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
			// myCompiler.g:527:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			{
			// myCompiler.g:527:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
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
					// myCompiler.g:
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

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "PREPROCESSOR"
	public final void mPREPROCESSOR() throws RecognitionException {
		try {
			int _type = PREPROCESSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:530:14: ( '#' ( . )* '\\n' )
			// myCompiler.g:530:16: '#' ( . )* '\\n'
			{
			match('#'); 
			// myCompiler.g:530:19: ( . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\n') ) {
					alt13=2;
				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// myCompiler.g:530:20: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREPROCESSOR"

	@Override
	public void mTokens() throws RecognitionException {
		// myCompiler.g:1:8: ( T__77 | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | PERIOD | COMMA | SEMICOL | COLON | OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB | OP_NOT | OP_LAND | OP_LOR | OP_AND | OP_OR | OP_XOR | OP_LS | OP_RS | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_ASS | SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE | WHILE_ | FOR_ | IF_ | ELSE_ | RETURN_ | BREAK_ | CONTINUE_ | INCLUDE | DEFINE | DEC_NUM | ID | FLOAT_NUM | FUNCTION_CALL | ARRAY | CHAR | STRING | COMMENT1 | COMMENT2 | WS | PREPROCESSOR )
		int alt14=68;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// myCompiler.g:1:10: T__77
				{
				mT__77(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:16: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:23: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:30: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:37: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:44: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:51: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:58: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:65: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:71: SEMICOL
				{
				mSEMICOL(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:79: COLON
				{
				mCOLON(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:85: OP_EQ
				{
				mOP_EQ(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:91: OP_LE
				{
				mOP_LE(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:97: OP_GE
				{
				mOP_GE(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:103: OP_NE
				{
				mOP_NE(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:109: OP_GT
				{
				mOP_GT(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:115: OP_LT
				{
				mOP_LT(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:121: OP_ADDAS
				{
				mOP_ADDAS(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:130: OP_SUBAS
				{
				mOP_SUBAS(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:139: OP_MULAS
				{
				mOP_MULAS(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:148: OP_DIVAS
				{
				mOP_DIVAS(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:157: OP_XORAS
				{
				mOP_XORAS(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:166: OP_MODAS
				{
				mOP_MODAS(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:175: OP_LSAS
				{
				mOP_LSAS(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:183: OP_RSAS
				{
				mOP_RSAS(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:191: OP_ADDADD
				{
				mOP_ADDADD(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:201: OP_SUBSUB
				{
				mOP_SUBSUB(); 

				}
				break;
			case 28 :
				// myCompiler.g:1:211: OP_NOT
				{
				mOP_NOT(); 

				}
				break;
			case 29 :
				// myCompiler.g:1:218: OP_LAND
				{
				mOP_LAND(); 

				}
				break;
			case 30 :
				// myCompiler.g:1:226: OP_LOR
				{
				mOP_LOR(); 

				}
				break;
			case 31 :
				// myCompiler.g:1:233: OP_AND
				{
				mOP_AND(); 

				}
				break;
			case 32 :
				// myCompiler.g:1:240: OP_OR
				{
				mOP_OR(); 

				}
				break;
			case 33 :
				// myCompiler.g:1:246: OP_XOR
				{
				mOP_XOR(); 

				}
				break;
			case 34 :
				// myCompiler.g:1:253: OP_LS
				{
				mOP_LS(); 

				}
				break;
			case 35 :
				// myCompiler.g:1:259: OP_RS
				{
				mOP_RS(); 

				}
				break;
			case 36 :
				// myCompiler.g:1:265: OP_ADD
				{
				mOP_ADD(); 

				}
				break;
			case 37 :
				// myCompiler.g:1:272: OP_SUB
				{
				mOP_SUB(); 

				}
				break;
			case 38 :
				// myCompiler.g:1:279: OP_MUL
				{
				mOP_MUL(); 

				}
				break;
			case 39 :
				// myCompiler.g:1:286: OP_DIV
				{
				mOP_DIV(); 

				}
				break;
			case 40 :
				// myCompiler.g:1:293: OP_ASS
				{
				mOP_ASS(); 

				}
				break;
			case 41 :
				// myCompiler.g:1:300: SHORT_TYPE
				{
				mSHORT_TYPE(); 

				}
				break;
			case 42 :
				// myCompiler.g:1:311: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 43 :
				// myCompiler.g:1:320: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 44 :
				// myCompiler.g:1:330: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 45 :
				// myCompiler.g:1:341: DOUBLE_TYPE
				{
				mDOUBLE_TYPE(); 

				}
				break;
			case 46 :
				// myCompiler.g:1:353: LONGLONG_TYPE
				{
				mLONGLONG_TYPE(); 

				}
				break;
			case 47 :
				// myCompiler.g:1:367: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 48 :
				// myCompiler.g:1:377: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 49 :
				// myCompiler.g:1:387: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 50 :
				// myCompiler.g:1:394: FOR_
				{
				mFOR_(); 

				}
				break;
			case 51 :
				// myCompiler.g:1:399: IF_
				{
				mIF_(); 

				}
				break;
			case 52 :
				// myCompiler.g:1:403: ELSE_
				{
				mELSE_(); 

				}
				break;
			case 53 :
				// myCompiler.g:1:409: RETURN_
				{
				mRETURN_(); 

				}
				break;
			case 54 :
				// myCompiler.g:1:417: BREAK_
				{
				mBREAK_(); 

				}
				break;
			case 55 :
				// myCompiler.g:1:424: CONTINUE_
				{
				mCONTINUE_(); 

				}
				break;
			case 56 :
				// myCompiler.g:1:434: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 57 :
				// myCompiler.g:1:442: DEFINE
				{
				mDEFINE(); 

				}
				break;
			case 58 :
				// myCompiler.g:1:449: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 59 :
				// myCompiler.g:1:457: ID
				{
				mID(); 

				}
				break;
			case 60 :
				// myCompiler.g:1:460: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 61 :
				// myCompiler.g:1:470: FUNCTION_CALL
				{
				mFUNCTION_CALL(); 

				}
				break;
			case 62 :
				// myCompiler.g:1:484: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 63 :
				// myCompiler.g:1:490: CHAR
				{
				mCHAR(); 

				}
				break;
			case 64 :
				// myCompiler.g:1:495: STRING
				{
				mSTRING(); 

				}
				break;
			case 65 :
				// myCompiler.g:1:502: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 66 :
				// myCompiler.g:1:511: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 67 :
				// myCompiler.g:1:520: WS
				{
				mWS(); 

				}
				break;
			case 68 :
				// myCompiler.g:1:523: PREPROCESSOR
				{
				mPREPROCESSOR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA8_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA8_eofS =
		"\5\uffff";
	static final String DFA8_minS =
		"\2\56\3\uffff";
	static final String DFA8_maxS =
		"\2\71\3\uffff";
	static final String DFA8_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA8_specialS =
		"\5\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "493:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA14_eotS =
		"\1\uffff\1\54\6\uffff\1\57\3\uffff\1\62\1\65\1\70\1\72\1\75\1\100\1\102"+
		"\1\106\1\110\1\uffff\1\112\1\114\13\54\1\uffff\2\136\1\54\3\uffff\2\54"+
		"\10\uffff\1\142\2\uffff\1\144\25\uffff\2\54\1\147\13\54\4\uffff\1\136"+
		"\1\54\4\uffff\1\54\1\167\1\uffff\2\54\1\172\10\54\2\uffff\2\54\1\uffff"+
		"\1\u0088\1\54\1\uffff\1\54\1\u008b\1\54\1\u008d\1\54\1\u008f\2\54\2\uffff"+
		"\1\54\1\u0095\2\uffff\1\u0096\1\54\1\uffff\1\54\1\uffff\1\u0099\1\uffff"+
		"\1\54\1\u009b\2\uffff\1\u009e\2\uffff\1\u009f\1\54\1\uffff\1\u00a1\5\uffff"+
		"\1\54\2\uffff\1\u00a6\1\u00a7\1\u00a8\3\uffff";
	static final String DFA14_eofS =
		"\u00a9\uffff";
	static final String DFA14_minS =
		"\1\11\1\50\6\uffff\1\60\3\uffff\1\75\1\74\2\75\1\53\1\55\1\75\1\52\1\75"+
		"\1\uffff\1\46\1\174\13\50\1\0\2\56\1\50\3\uffff\2\50\10\uffff\1\75\2\uffff"+
		"\1\75\25\uffff\16\50\2\0\2\uffff\1\56\1\50\4\uffff\2\50\1\uffff\13\50"+
		"\2\0\2\50\1\uffff\1\40\1\50\1\uffff\10\50\2\0\2\50\2\uffff\2\50\1\uffff"+
		"\1\50\1\uffff\1\50\1\uffff\2\50\2\0\1\50\2\uffff\2\50\1\uffff\1\50\1\uffff"+
		"\2\0\2\uffff\1\50\1\uffff\2\0\1\50\1\0\3\uffff";
	static final String DFA14_maxS =
		"\1\175\1\172\6\uffff\1\71\3\uffff\2\75\1\76\6\75\1\uffff\1\46\1\174\13"+
		"\172\1\uffff\2\71\1\172\3\uffff\2\172\10\uffff\1\75\2\uffff\1\75\25\uffff"+
		"\16\172\2\uffff\2\uffff\1\71\1\172\4\uffff\2\172\1\uffff\13\172\2\uffff"+
		"\2\172\1\uffff\2\172\1\uffff\10\172\2\uffff\2\172\2\uffff\2\172\1\uffff"+
		"\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff\1\172\2\uffff\2\172\1\uffff"+
		"\1\172\1\uffff\2\uffff\2\uffff\1\172\1\uffff\2\uffff\1\172\1\uffff\3\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\12\1\13\11\uffff\1\27"+
		"\21\uffff\1\77\1\100\1\103\2\uffff\1\73\1\75\1\76\1\10\1\74\1\14\1\50"+
		"\1\15\1\uffff\1\21\1\16\1\uffff\1\20\1\17\1\34\1\22\1\32\1\44\1\23\1\33"+
		"\1\45\1\24\1\46\1\25\1\101\1\102\1\47\1\26\1\41\1\35\1\37\1\36\1\40\20"+
		"\uffff\1\104\1\72\2\uffff\1\30\1\42\1\31\1\43\2\uffff\1\63\17\uffff\1"+
		"\52\2\uffff\1\62\14\uffff\1\56\1\53\2\uffff\1\57\1\uffff\1\60\1\uffff"+
		"\1\64\5\uffff\1\51\1\54\2\uffff\1\61\1\uffff\1\66\2\uffff\1\1\1\55\1\uffff"+
		"\1\65\4\uffff\1\71\1\67\1\70";
	static final String DFA14_specialS =
		"\43\uffff\1\2\67\uffff\1\3\1\11\26\uffff\1\4\1\12\16\uffff\1\5\1\13\15"+
		"\uffff\1\6\1\14\10\uffff\1\7\1\15\4\uffff\1\10\1\1\1\uffff\1\0\3\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\51\2\uffff\1\51\22\uffff\1\51\1\17\1\50\1\43\1\uffff\1\25\1\26\1\47"+
			"\1\2\1\3\1\22\1\20\1\11\1\21\1\10\1\23\1\44\11\45\1\13\1\12\1\15\1\14"+
			"\1\16\2\uffff\32\46\1\4\1\uffff\1\5\1\24\1\46\1\uffff\1\46\1\42\1\35"+
			"\1\34\1\40\1\33\2\46\1\31\2\46\1\32\3\46\1\1\1\46\1\41\1\30\2\46\1\36"+
			"\1\37\3\46\1\6\1\27\1\7",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\21\53\1"+
			"\52\10\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\60",
			"",
			"",
			"",
			"\1\61",
			"\1\64\1\63",
			"\1\66\1\67",
			"\1\71",
			"\1\74\21\uffff\1\73",
			"\1\77\17\uffff\1\76",
			"\1\101",
			"\1\105\4\uffff\1\104\15\uffff\1\103",
			"\1\107",
			"",
			"\1\111",
			"\1\113",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\7\53\1\115"+
			"\22\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\5\53\1\117"+
			"\7\53\1\116\14\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\16\53\1"+
			"\120\13\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\13\53\1"+
			"\121\2\53\1\122\13\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\16\53\1"+
			"\123\13\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\7\53\1\124"+
			"\6\53\1\125\13\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\16\53\1"+
			"\126\13\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\7\53\1\127"+
			"\22\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\13\53\1"+
			"\130\16\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\4\53\1\131"+
			"\25\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\21\53\1"+
			"\132\10\53",
			"\144\135\1\134\4\135\1\133\uff96\135",
			"\1\60\1\uffff\12\60",
			"\1\60\1\uffff\12\137",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"",
			"",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\10\53\1"+
			"\140\21\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\141",
			"",
			"",
			"\1\143",
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
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\16\53\1"+
			"\145\13\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\23\53\1"+
			"\146\6\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\15\53\1"+
			"\150\14\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\16\53\1"+
			"\151\13\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\21\53\1"+
			"\152\10\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\24\53\1"+
			"\153\5\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\1\154\31"+
			"\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\15\53\1"+
			"\155\14\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\10\53\1"+
			"\156\21\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\10\53\1"+
			"\157\21\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\22\53\1"+
			"\160\7\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\23\53\1"+
			"\161\6\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\4\53\1\162"+
			"\25\53",
			"\156\135\1\163\uff91\135",
			"\145\135\1\164\uff9a\135",
			"",
			"",
			"\1\60\1\uffff\12\137",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\15\53\1"+
			"\165\14\53",
			"",
			"",
			"",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\21\53\1"+
			"\166\10\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\6\53\1\170"+
			"\23\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\1\171\31"+
			"\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\1\53\1\173"+
			"\30\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\21\53\1"+
			"\174\10\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\23\53\1"+
			"\175\6\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\3\53\1\176"+
			"\26\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\13\53\1"+
			"\177\16\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\4\53\1\u0080"+
			"\25\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\24\53\1"+
			"\u0081\5\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\1\u0082"+
			"\31\53",
			"\143\135\1\u0083\uff9c\135",
			"\146\135\1\u0084\uff99\135",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\23\53\1"+
			"\u0085\6\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\23\53\1"+
			"\u0086\6\53",
			"",
			"\1\u0087\7\uffff\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53"+
			"\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\23\53\1"+
			"\u0089\6\53",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\13\53\1"+
			"\u008a\16\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\10\53\1"+
			"\u008c\21\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\4\53\1\u008e"+
			"\25\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\21\53\1"+
			"\u0090\10\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\12\53\1"+
			"\u0091\17\53",
			"\154\135\1\u0092\uff93\135",
			"\151\135\1\u0093\uff96\135",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\5\53\1\u0094"+
			"\24\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\4\53\1\u0097"+
			"\25\53",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\15\53\1"+
			"\u0098\14\53",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\15\53\1"+
			"\u009a\14\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\165\135\1\u009c\uff8a\135",
			"\156\135\1\u009d\uff91\135",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\24\53\1"+
			"\u00a0\5\53",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"",
			"\144\135\1\u00a2\uff9b\135",
			"\145\135\1\u00a3\uff9a\135",
			"",
			"",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\4\53\1\u00a4"+
			"\25\53",
			"",
			"\145\135\1\u00a5\uff9a\135",
			"\0\135",
			"\1\55\7\uffff\12\53\7\uffff\32\53\1\56\3\uffff\1\53\1\uffff\32\53",
			"\0\135",
			"",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__77 | LPAREN | RPAREN | LBRACK | RBRACK | LBRACE | RBRACE | PERIOD | COMMA | SEMICOL | COLON | OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB | OP_NOT | OP_LAND | OP_LOR | OP_AND | OP_OR | OP_XOR | OP_LS | OP_RS | OP_ADD | OP_SUB | OP_MUL | OP_DIV | OP_ASS | SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE | WHILE_ | FOR_ | IF_ | ELSE_ | RETURN_ | BREAK_ | CONTINUE_ | INCLUDE | DEFINE | DEC_NUM | ID | FLOAT_NUM | FUNCTION_CALL | ARRAY | CHAR | STRING | COMMENT1 | COMMENT2 | WS | PREPROCESSOR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_165 = input.LA(1);
						s = -1;
						if ( ((LA14_165 >= '\u0000' && LA14_165 <= '\uFFFF')) ) {s = 93;}
						else s = 168;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA14_163 = input.LA(1);
						s = -1;
						if ( ((LA14_163 >= '\u0000' && LA14_163 <= '\uFFFF')) ) {s = 93;}
						else s = 166;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA14_35 = input.LA(1);
						s = -1;
						if ( (LA14_35=='i') ) {s = 91;}
						else if ( (LA14_35=='d') ) {s = 92;}
						else if ( ((LA14_35 >= '\u0000' && LA14_35 <= 'c')||(LA14_35 >= 'e' && LA14_35 <= 'h')||(LA14_35 >= 'j' && LA14_35 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA14_91 = input.LA(1);
						s = -1;
						if ( (LA14_91=='n') ) {s = 115;}
						else if ( ((LA14_91 >= '\u0000' && LA14_91 <= 'm')||(LA14_91 >= 'o' && LA14_91 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA14_115 = input.LA(1);
						s = -1;
						if ( (LA14_115=='c') ) {s = 131;}
						else if ( ((LA14_115 >= '\u0000' && LA14_115 <= 'b')||(LA14_115 >= 'd' && LA14_115 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA14_131 = input.LA(1);
						s = -1;
						if ( (LA14_131=='l') ) {s = 146;}
						else if ( ((LA14_131 >= '\u0000' && LA14_131 <= 'k')||(LA14_131 >= 'm' && LA14_131 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA14_146 = input.LA(1);
						s = -1;
						if ( (LA14_146=='u') ) {s = 156;}
						else if ( ((LA14_146 >= '\u0000' && LA14_146 <= 't')||(LA14_146 >= 'v' && LA14_146 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA14_156 = input.LA(1);
						s = -1;
						if ( (LA14_156=='d') ) {s = 162;}
						else if ( ((LA14_156 >= '\u0000' && LA14_156 <= 'c')||(LA14_156 >= 'e' && LA14_156 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA14_162 = input.LA(1);
						s = -1;
						if ( (LA14_162=='e') ) {s = 165;}
						else if ( ((LA14_162 >= '\u0000' && LA14_162 <= 'd')||(LA14_162 >= 'f' && LA14_162 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA14_92 = input.LA(1);
						s = -1;
						if ( (LA14_92=='e') ) {s = 116;}
						else if ( ((LA14_92 >= '\u0000' && LA14_92 <= 'd')||(LA14_92 >= 'f' && LA14_92 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA14_116 = input.LA(1);
						s = -1;
						if ( (LA14_116=='f') ) {s = 132;}
						else if ( ((LA14_116 >= '\u0000' && LA14_116 <= 'e')||(LA14_116 >= 'g' && LA14_116 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA14_132 = input.LA(1);
						s = -1;
						if ( (LA14_132=='i') ) {s = 147;}
						else if ( ((LA14_132 >= '\u0000' && LA14_132 <= 'h')||(LA14_132 >= 'j' && LA14_132 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA14_147 = input.LA(1);
						s = -1;
						if ( (LA14_147=='n') ) {s = 157;}
						else if ( ((LA14_147 >= '\u0000' && LA14_147 <= 'm')||(LA14_147 >= 'o' && LA14_147 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA14_157 = input.LA(1);
						s = -1;
						if ( (LA14_157=='e') ) {s = 163;}
						else if ( ((LA14_157 >= '\u0000' && LA14_157 <= 'd')||(LA14_157 >= 'f' && LA14_157 <= '\uFFFF')) ) {s = 93;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
