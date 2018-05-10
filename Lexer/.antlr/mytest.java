// Generated from /home/bobosheep/Compiler/AntlrPractice/Lexer/mytest.g by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mytest extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SHORT_TYPE=1, INT_TYPE=2, LONG_TYPE=3, FLOAT_TYPE=4, DOUBLE_TYPE=5, LONGLONG_TYPE=6, 
		CHAR_TYPE=7, VOID_TYPE=8, WHILE_=9, FOR_=10, IF_=11, ELSE_=12, RETURN_=13, 
		BREAK_=14, CONTINUE=15, INCLUDE=16, DEFINE=17, OP_EQ=18, OP_LE=19, OP_GE=20, 
		OP_NE=21, OP_GT=22, OP_LT=23, OP_ADDAS=24, OP_SUBAS=25, OP_MULAS=26, OP_DIVAS=27, 
		OP_XORAS=28, OP_MODAS=29, OP_LSAS=30, OP_RSAS=31, OP_ADDADD=32, OP_SUBSUB=33, 
		OP_NOT=34, OP_LAND=35, OP_LOR=36, OP_AND=37, OP_OR=38, OP_XOR=39, OP_LS=40, 
		OP_RS=41, OP_ADD=42, OP_SUB=43, OP_MUL=44, OP_DIV=45, OP_ASS=46, DEC_NUM=47, 
		ID=48, FLOAT_NUM=49, LPAREN=50, RPAREN=51, LBRACK=52, RBRACK=53, LBRACE=54, 
		RBRACE=55, PERIOD=56, COMMA=57, SEMICOL=58, COLON=59, FUNCTION_CALL=60, 
		ARRAY=61, CHAR=62, STRING=63, COMMENT1=64, COMMENT2=65, WS=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SHORT_TYPE", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", "LONGLONG_TYPE", 
		"CHAR_TYPE", "VOID_TYPE", "WHILE_", "FOR_", "IF_", "ELSE_", "RETURN_", 
		"BREAK_", "CONTINUE", "INCLUDE", "DEFINE", "OP_EQ", "OP_LE", "OP_GE", 
		"OP_NE", "OP_GT", "OP_LT", "OP_ADDAS", "OP_SUBAS", "OP_MULAS", "OP_DIVAS", 
		"OP_XORAS", "OP_MODAS", "OP_LSAS", "OP_RSAS", "OP_ADDADD", "OP_SUBSUB", 
		"OP_NOT", "OP_LAND", "OP_LOR", "OP_AND", "OP_OR", "OP_XOR", "OP_LS", "OP_RS", 
		"OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_ASS", "DEC_NUM", "ID", "FLOAT_NUM", 
		"FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "LETTER", "DIGIT", "LPAREN", 
		"RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "PERIOD", "COMMA", "SEMICOL", 
		"COLON", "FUNCTION_CALL", "ARRAY", "CHAR", "STRING", "COMMENT1", "COMMENT2", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'short'", "'int'", "'long'", "'float'", "'double'", "'long long'", 
		"'char'", "'void'", "'while('", "'for('", "'if('", "'else'", "'return'", 
		"'break'", "'continue'", "'#include'", "'#define'", "'=='", "'<='", "'>='", 
		"'!='", "'>'", "'<'", "'+='", "'-='", "'*='", "'/='", "'^='", "'%='", 
		"'<<='", "'>>='", "'++'", "'--'", "'!'", "'&&'", "'||'", "'&'", "'|'", 
		"'^'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'='", null, null, 
		null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "';'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SHORT_TYPE", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", "DOUBLE_TYPE", 
		"LONGLONG_TYPE", "CHAR_TYPE", "VOID_TYPE", "WHILE_", "FOR_", "IF_", "ELSE_", 
		"RETURN_", "BREAK_", "CONTINUE", "INCLUDE", "DEFINE", "OP_EQ", "OP_LE", 
		"OP_GE", "OP_NE", "OP_GT", "OP_LT", "OP_ADDAS", "OP_SUBAS", "OP_MULAS", 
		"OP_DIVAS", "OP_XORAS", "OP_MODAS", "OP_LSAS", "OP_RSAS", "OP_ADDADD", 
		"OP_SUBSUB", "OP_NOT", "OP_LAND", "OP_LOR", "OP_AND", "OP_OR", "OP_XOR", 
		"OP_LS", "OP_RS", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_ASS", "DEC_NUM", 
		"ID", "FLOAT_NUM", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"PERIOD", "COMMA", "SEMICOL", "COLON", "FUNCTION_CALL", "ARRAY", "CHAR", 
		"STRING", "COMMENT1", "COMMENT2", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public mytest(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mytest.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 68:
			COMMENT1_action((RuleContext)_localctx, actionIndex);
			break;
		case 69:
			COMMENT2_action((RuleContext)_localctx, actionIndex);
			break;
		case 70:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMMENT2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01c7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\7\60\u014f\n\60\f\60\16\60\u0152\13"+
		"\60\5\60\u0154\n\60\3\61\3\61\3\61\7\61\u0159\n\61\f\61\16\61\u015c\13"+
		"\61\3\62\3\62\3\62\5\62\u0161\n\62\3\63\6\63\u0164\n\63\r\63\16\63\u0165"+
		"\3\63\3\63\7\63\u016a\n\63\f\63\16\63\u016d\13\63\3\64\3\64\6\64\u0171"+
		"\n\64\r\64\16\64\u0172\3\65\6\65\u0176\n\65\r\65\16\65\u0177\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\7E\u01a0\nE\fE\16E\u01a3\13"+
		"E\3E\3E\3F\3F\3F\3F\7F\u01ab\nF\fF\16F\u01ae\13F\3F\3F\3F\3G\3G\3G\3G"+
		"\7G\u01b7\nG\fG\16G\u01ba\13G\3G\3G\3G\3G\3G\3H\6H\u01c2\nH\rH\16H\u01c3"+
		"\3H\3H\2\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2g\2i\2"+
		"k\2m\2o\64q\65s\66u\67w8y9{:};\177<\u0081=\u0083>\u0085?\u0087@\u0089"+
		"A\u008bB\u008dC\u008fD\3\2\5\5\2C\\aac|\3\2$$\5\2\13\f\17\17\"\"\2\u01d0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\3\u0091\3\2\2\2\5\u0097\3\2\2\2\7\u009b"+
		"\3\2\2\2\t\u00a0\3\2\2\2\13\u00a6\3\2\2\2\r\u00ad\3\2\2\2\17\u00b7\3\2"+
		"\2\2\21\u00bc\3\2\2\2\23\u00c1\3\2\2\2\25\u00c8\3\2\2\2\27\u00cd\3\2\2"+
		"\2\31\u00d1\3\2\2\2\33\u00d6\3\2\2\2\35\u00dd\3\2\2\2\37\u00e3\3\2\2\2"+
		"!\u00ec\3\2\2\2#\u00f5\3\2\2\2%\u00fd\3\2\2\2\'\u0100\3\2\2\2)\u0103\3"+
		"\2\2\2+\u0106\3\2\2\2-\u0109\3\2\2\2/\u010b\3\2\2\2\61\u010d\3\2\2\2\63"+
		"\u0110\3\2\2\2\65\u0113\3\2\2\2\67\u0116\3\2\2\29\u0119\3\2\2\2;\u011c"+
		"\3\2\2\2=\u011f\3\2\2\2?\u0123\3\2\2\2A\u0127\3\2\2\2C\u012a\3\2\2\2E"+
		"\u012d\3\2\2\2G\u012f\3\2\2\2I\u0132\3\2\2\2K\u0135\3\2\2\2M\u0137\3\2"+
		"\2\2O\u0139\3\2\2\2Q\u013b\3\2\2\2S\u013e\3\2\2\2U\u0141\3\2\2\2W\u0143"+
		"\3\2\2\2Y\u0145\3\2\2\2[\u0147\3\2\2\2]\u0149\3\2\2\2_\u0153\3\2\2\2a"+
		"\u0155\3\2\2\2c\u0160\3\2\2\2e\u0163\3\2\2\2g\u016e\3\2\2\2i\u0175\3\2"+
		"\2\2k\u0179\3\2\2\2m\u017b\3\2\2\2o\u017d\3\2\2\2q\u017f\3\2\2\2s\u0181"+
		"\3\2\2\2u\u0183\3\2\2\2w\u0185\3\2\2\2y\u0187\3\2\2\2{\u0189\3\2\2\2}"+
		"\u018b\3\2\2\2\177\u018d\3\2\2\2\u0081\u018f\3\2\2\2\u0083\u0191\3\2\2"+
		"\2\u0085\u0194\3\2\2\2\u0087\u0197\3\2\2\2\u0089\u019b\3\2\2\2\u008b\u01a6"+
		"\3\2\2\2\u008d\u01b2\3\2\2\2\u008f\u01c1\3\2\2\2\u0091\u0092\7u\2\2\u0092"+
		"\u0093\7j\2\2\u0093\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\u0096\7v\2\2"+
		"\u0096\4\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v"+
		"\2\2\u009a\6\3\2\2\2\u009b\u009c\7n\2\2\u009c\u009d\7q\2\2\u009d\u009e"+
		"\7p\2\2\u009e\u009f\7i\2\2\u009f\b\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2"+
		"\7n\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\n\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9\7w\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\f\3\2\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7i\2\2"+
		"\u00b1\u00b2\7\"\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5"+
		"\7p\2\2\u00b5\u00b6\7i\2\2\u00b6\16\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9"+
		"\7j\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb\20\3\2\2\2\u00bc\u00bd"+
		"\7x\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7f\2\2\u00c0"+
		"\22\3\2\2\2\u00c1\u00c2\7y\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7k\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7*\2\2\u00c7\24\3\2\2\2\u00c8"+
		"\u00c9\7h\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7*\2\2"+
		"\u00cc\26\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7"+
		"*\2\2\u00d0\30\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4"+
		"\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\32\3\2\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7t\2\2\u00db"+
		"\u00dc\7p\2\2\u00dc\34\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7m\2\2\u00e2\36\3\2\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7v\2\2"+
		"\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb"+
		"\7g\2\2\u00eb \3\2\2\2\u00ec\u00ed\7%\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef"+
		"\7p\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2\7w\2\2\u00f2"+
		"\u00f3\7f\2\2\u00f3\u00f4\7g\2\2\u00f4\"\3\2\2\2\u00f5\u00f6\7%\2\2\u00f6"+
		"\u00f7\7f\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7p\2\2\u00fb\u00fc\7g\2\2\u00fc$\3\2\2\2\u00fd\u00fe\7?\2"+
		"\2\u00fe\u00ff\7?\2\2\u00ff&\3\2\2\2\u0100\u0101\7>\2\2\u0101\u0102\7"+
		"?\2\2\u0102(\3\2\2\2\u0103\u0104\7@\2\2\u0104\u0105\7?\2\2\u0105*\3\2"+
		"\2\2\u0106\u0107\7#\2\2\u0107\u0108\7?\2\2\u0108,\3\2\2\2\u0109\u010a"+
		"\7@\2\2\u010a.\3\2\2\2\u010b\u010c\7>\2\2\u010c\60\3\2\2\2\u010d\u010e"+
		"\7-\2\2\u010e\u010f\7?\2\2\u010f\62\3\2\2\2\u0110\u0111\7/\2\2\u0111\u0112"+
		"\7?\2\2\u0112\64\3\2\2\2\u0113\u0114\7,\2\2\u0114\u0115\7?\2\2\u0115\66"+
		"\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118\7?\2\2\u01188\3\2\2\2\u0119"+
		"\u011a\7`\2\2\u011a\u011b\7?\2\2\u011b:\3\2\2\2\u011c\u011d\7\'\2\2\u011d"+
		"\u011e\7?\2\2\u011e<\3\2\2\2\u011f\u0120\7>\2\2\u0120\u0121\7>\2\2\u0121"+
		"\u0122\7?\2\2\u0122>\3\2\2\2\u0123\u0124\7@\2\2\u0124\u0125\7@\2\2\u0125"+
		"\u0126\7?\2\2\u0126@\3\2\2\2\u0127\u0128\7-\2\2\u0128\u0129\7-\2\2\u0129"+
		"B\3\2\2\2\u012a\u012b\7/\2\2\u012b\u012c\7/\2\2\u012cD\3\2\2\2\u012d\u012e"+
		"\7#\2\2\u012eF\3\2\2\2\u012f\u0130\7(\2\2\u0130\u0131\7(\2\2\u0131H\3"+
		"\2\2\2\u0132\u0133\7~\2\2\u0133\u0134\7~\2\2\u0134J\3\2\2\2\u0135\u0136"+
		"\7(\2\2\u0136L\3\2\2\2\u0137\u0138\7~\2\2\u0138N\3\2\2\2\u0139\u013a\7"+
		"`\2\2\u013aP\3\2\2\2\u013b\u013c\7>\2\2\u013c\u013d\7>\2\2\u013dR\3\2"+
		"\2\2\u013e\u013f\7@\2\2\u013f\u0140\7@\2\2\u0140T\3\2\2\2\u0141\u0142"+
		"\7-\2\2\u0142V\3\2\2\2\u0143\u0144\7/\2\2\u0144X\3\2\2\2\u0145\u0146\7"+
		",\2\2\u0146Z\3\2\2\2\u0147\u0148\7\61\2\2\u0148\\\3\2\2\2\u0149\u014a"+
		"\7?\2\2\u014a^\3\2\2\2\u014b\u0154\7\62\2\2\u014c\u0150\4\63;\2\u014d"+
		"\u014f\5m\67\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u014b\3\2\2\2\u0153\u014c\3\2\2\2\u0154`\3\2\2\2\u0155\u015a\5k\66\2"+
		"\u0156\u0159\5k\66\2\u0157\u0159\5m\67\2\u0158\u0156\3\2\2\2\u0158\u0157"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"b\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\5e\63\2\u015e\u0161\5g\64\2"+
		"\u015f\u0161\5i\65\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u015f"+
		"\3\2\2\2\u0161d\3\2\2\2\u0162\u0164\5m\67\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u016b\7\60\2\2\u0168\u016a\5m\67\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016cf\3\2\2\2"+
		"\u016d\u016b\3\2\2\2\u016e\u0170\7\60\2\2\u016f\u0171\5m\67\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"h\3\2\2\2\u0174\u0176\5m\67\2\u0175\u0174\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178j\3\2\2\2\u0179\u017a\t"+
		"\2\2\2\u017al\3\2\2\2\u017b\u017c\4\62;\2\u017cn\3\2\2\2\u017d\u017e\7"+
		"*\2\2\u017ep\3\2\2\2\u017f\u0180\7+\2\2\u0180r\3\2\2\2\u0181\u0182\7]"+
		"\2\2\u0182t\3\2\2\2\u0183\u0184\7_\2\2\u0184v\3\2\2\2\u0185\u0186\7}\2"+
		"\2\u0186x\3\2\2\2\u0187\u0188\7\177\2\2\u0188z\3\2\2\2\u0189\u018a\7\60"+
		"\2\2\u018a|\3\2\2\2\u018b\u018c\7.\2\2\u018c~\3\2\2\2\u018d\u018e\7=\2"+
		"\2\u018e\u0080\3\2\2\2\u018f\u0190\7<\2\2\u0190\u0082\3\2\2\2\u0191\u0192"+
		"\5a\61\2\u0192\u0193\5o8\2\u0193\u0084\3\2\2\2\u0194\u0195\5a\61\2\u0195"+
		"\u0196\5s:\2\u0196\u0086\3\2\2\2\u0197\u0198\7)\2\2\u0198\u0199\5k\66"+
		"\2\u0199\u019a\7)\2\2\u019a\u0088\3\2\2\2\u019b\u01a1\7$\2\2\u019c\u019d"+
		"\7$\2\2\u019d\u01a0\7$\2\2\u019e\u01a0\n\3\2\2\u019f\u019c\3\2\2\2\u019f"+
		"\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7$\2\2\u01a5"+
		"\u008a\3\2\2\2\u01a6\u01a7\7\61\2\2\u01a7\u01a8\7\61\2\2\u01a8\u01ac\3"+
		"\2\2\2\u01a9\u01ab\13\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01ac\3\2"+
		"\2\2\u01af\u01b0\7\f\2\2\u01b0\u01b1\bF\2\2\u01b1\u008c\3\2\2\2\u01b2"+
		"\u01b3\7\61\2\2\u01b3\u01b4\7,\2\2\u01b4\u01b8\3\2\2\2\u01b5\u01b7\13"+
		"\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7,"+
		"\2\2\u01bc\u01bd\7\61\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\bG\3\2\u01bf"+
		"\u008e\3\2\2\2\u01c0\u01c2\t\4\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c6\bH\4\2\u01c6\u0090\3\2\2\2\21\2\u0150\u0153\u0158\u015a\u0160\u0165"+
		"\u016b\u0172\u0177\u019f\u01a1\u01ac\u01b8\u01c3\5\3F\2\3G\3\3H\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}