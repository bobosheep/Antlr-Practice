// Generated from /home/bobosheep/Compiler/AntlrPractice/Parser/myParser.g by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SHORT_TYPE=4, INT_TYPE=5, LONG_TYPE=6, FLOAT_TYPE=7, 
		DOUBLE_TYPE=8, LONGLONG_TYPE=9, CHAR_TYPE=10, VOID_TYPE=11, WHILE_=12, 
		FOR_=13, IF_=14, ELSE_=15, RETURN_=16, BREAK_=17, CONTINUE=18, INCLUDE=19, 
		DEFINE=20, OP_EQ=21, OP_LE=22, OP_GE=23, OP_NE=24, OP_GT=25, OP_LT=26, 
		OP_ADDAS=27, OP_SUBAS=28, OP_MULAS=29, OP_DIVAS=30, OP_XORAS=31, OP_MODAS=32, 
		OP_LSAS=33, OP_RSAS=34, OP_ADDADD=35, OP_SUBSUB=36, OP_NOT=37, OP_LAND=38, 
		OP_LOR=39, OP_AND=40, OP_OR=41, OP_XOR=42, OP_LS=43, OP_RS=44, OP_ADD=45, 
		OP_SUB=46, OP_MUL=47, OP_DIV=48, OP_ASS=49, DEC_NUM=50, ID=51, FLOAT_NUM=52, 
		LPAREN=53, RPAREN=54, LBRACK=55, RBRACK=56, LBRACE=57, RBRACE=58, PERIOD=59, 
		COMMA=60, SEMICOL=61, COLON=62, FUNCTION_CALL=63, ARRAY=64, CHAR=65, STRING=66, 
		COMMENT1=67, COMMENT2=68, WS=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "SHORT_TYPE", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", 
		"DOUBLE_TYPE", "LONGLONG_TYPE", "CHAR_TYPE", "VOID_TYPE", "WHILE_", "FOR_", 
		"IF_", "ELSE_", "RETURN_", "BREAK_", "CONTINUE", "INCLUDE", "DEFINE", 
		"OP_EQ", "OP_LE", "OP_GE", "OP_NE", "OP_GT", "OP_LT", "OP_ADDAS", "OP_SUBAS", 
		"OP_MULAS", "OP_DIVAS", "OP_XORAS", "OP_MODAS", "OP_LSAS", "OP_RSAS", 
		"OP_ADDADD", "OP_SUBSUB", "OP_NOT", "OP_LAND", "OP_LOR", "OP_AND", "OP_OR", 
		"OP_XOR", "OP_LS", "OP_RS", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_ASS", 
		"DEC_NUM", "ID", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", 
		"LETTER", "DIGIT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"PERIOD", "COMMA", "SEMICOL", "COLON", "FUNCTION_CALL", "ARRAY", "CHAR", 
		"STRING", "COMMENT1", "COMMENT2", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.h'", "'main('", "'else if'", "'short'", "'int'", "'long'", "'float'", 
		"'double'", "'long long'", "'char'", "'void'", "'while('", "'for('", "'if('", 
		"'else'", "'return'", "'break'", "'continue'", "'#include'", "'#define'", 
		"'=='", "'<='", "'>='", "'!='", "'>'", "'<'", "'+='", "'-='", "'*='", 
		"'/='", "'^='", "'%='", "'<<='", "'>>='", "'++'", "'--'", "'!'", "'&&'", 
		"'||'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", 
		"'='", null, null, null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", 
		"','", "';'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SHORT_TYPE", "INT_TYPE", "LONG_TYPE", "FLOAT_TYPE", 
		"DOUBLE_TYPE", "LONGLONG_TYPE", "CHAR_TYPE", "VOID_TYPE", "WHILE_", "FOR_", 
		"IF_", "ELSE_", "RETURN_", "BREAK_", "CONTINUE", "INCLUDE", "DEFINE", 
		"OP_EQ", "OP_LE", "OP_GE", "OP_NE", "OP_GT", "OP_LT", "OP_ADDAS", "OP_SUBAS", 
		"OP_MULAS", "OP_DIVAS", "OP_XORAS", "OP_MODAS", "OP_LSAS", "OP_RSAS", 
		"OP_ADDADD", "OP_SUBSUB", "OP_NOT", "OP_LAND", "OP_LOR", "OP_AND", "OP_OR", 
		"OP_XOR", "OP_LS", "OP_RS", "OP_ADD", "OP_SUB", "OP_MUL", "OP_DIV", "OP_ASS", 
		"DEC_NUM", "ID", "FLOAT_NUM", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"LBRACE", "RBRACE", "PERIOD", "COMMA", "SEMICOL", "COLON", "FUNCTION_CALL", 
		"ARRAY", "CHAR", "STRING", "COMMENT1", "COMMENT2", "WS"
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


	public myParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "myParser.g"; }

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
		case 71:
			COMMENT1_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			COMMENT2_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u01de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\7\63\u0166"+
		"\n\63\f\63\16\63\u0169\13\63\5\63\u016b\n\63\3\64\3\64\3\64\7\64\u0170"+
		"\n\64\f\64\16\64\u0173\13\64\3\65\3\65\3\65\5\65\u0178\n\65\3\66\6\66"+
		"\u017b\n\66\r\66\16\66\u017c\3\66\3\66\7\66\u0181\n\66\f\66\16\66\u0184"+
		"\13\66\3\67\3\67\6\67\u0188\n\67\r\67\16\67\u0189\38\68\u018d\n8\r8\16"+
		"8\u018e\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3"+
		"C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\7H\u01b7\nH\fH\16"+
		"H\u01ba\13H\3H\3H\3I\3I\3I\3I\7I\u01c2\nI\fI\16I\u01c5\13I\3I\3I\3I\3"+
		"J\3J\3J\3J\7J\u01ce\nJ\fJ\16J\u01d1\13J\3J\3J\3J\3J\3J\3K\6K\u01d9\nK"+
		"\rK\16K\u01da\3K\3K\2\2L\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\2m\2o\2q\2s\2u\67w8y9{:};\177<\u0081=\u0083>\u0085?"+
		"\u0087@\u0089A\u008bB\u008dC\u008fD\u0091E\u0093F\u0095G\3\2\5\5\2C\\"+
		"aac|\3\2$$\5\2\13\f\17\17\"\"\2\u01e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u009a"+
		"\3\2\2\2\7\u00a0\3\2\2\2\t\u00a8\3\2\2\2\13\u00ae\3\2\2\2\r\u00b2\3\2"+
		"\2\2\17\u00b7\3\2\2\2\21\u00bd\3\2\2\2\23\u00c4\3\2\2\2\25\u00ce\3\2\2"+
		"\2\27\u00d3\3\2\2\2\31\u00d8\3\2\2\2\33\u00df\3\2\2\2\35\u00e4\3\2\2\2"+
		"\37\u00e8\3\2\2\2!\u00ed\3\2\2\2#\u00f4\3\2\2\2%\u00fa\3\2\2\2\'\u0103"+
		"\3\2\2\2)\u010c\3\2\2\2+\u0114\3\2\2\2-\u0117\3\2\2\2/\u011a\3\2\2\2\61"+
		"\u011d\3\2\2\2\63\u0120\3\2\2\2\65\u0122\3\2\2\2\67\u0124\3\2\2\29\u0127"+
		"\3\2\2\2;\u012a\3\2\2\2=\u012d\3\2\2\2?\u0130\3\2\2\2A\u0133\3\2\2\2C"+
		"\u0136\3\2\2\2E\u013a\3\2\2\2G\u013e\3\2\2\2I\u0141\3\2\2\2K\u0144\3\2"+
		"\2\2M\u0146\3\2\2\2O\u0149\3\2\2\2Q\u014c\3\2\2\2S\u014e\3\2\2\2U\u0150"+
		"\3\2\2\2W\u0152\3\2\2\2Y\u0155\3\2\2\2[\u0158\3\2\2\2]\u015a\3\2\2\2_"+
		"\u015c\3\2\2\2a\u015e\3\2\2\2c\u0160\3\2\2\2e\u016a\3\2\2\2g\u016c\3\2"+
		"\2\2i\u0177\3\2\2\2k\u017a\3\2\2\2m\u0185\3\2\2\2o\u018c\3\2\2\2q\u0190"+
		"\3\2\2\2s\u0192\3\2\2\2u\u0194\3\2\2\2w\u0196\3\2\2\2y\u0198\3\2\2\2{"+
		"\u019a\3\2\2\2}\u019c\3\2\2\2\177\u019e\3\2\2\2\u0081\u01a0\3\2\2\2\u0083"+
		"\u01a2\3\2\2\2\u0085\u01a4\3\2\2\2\u0087\u01a6\3\2\2\2\u0089\u01a8\3\2"+
		"\2\2\u008b\u01ab\3\2\2\2\u008d\u01ae\3\2\2\2\u008f\u01b2\3\2\2\2\u0091"+
		"\u01bd\3\2\2\2\u0093\u01c9\3\2\2\2\u0095\u01d8\3\2\2\2\u0097\u0098\7\60"+
		"\2\2\u0098\u0099\7j\2\2\u0099\4\3\2\2\2\u009a\u009b\7o\2\2\u009b\u009c"+
		"\7c\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7*\2\2\u009f"+
		"\6\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2"+
		"\2\u00a7\b\3\2\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7"+
		"q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7v\2\2\u00ad\n\3\2\2\2\u00ae\u00af"+
		"\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\f\3\2\2\2\u00b2\u00b3"+
		"\7n\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7i\2\2\u00b6"+
		"\16\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7c\2\2\u00bb\u00bc\7v\2\2\u00bc\20\3\2\2\2\u00bd\u00be\7f\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7n\2\2"+
		"\u00c2\u00c3\7g\2\2\u00c3\22\3\2\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7"+
		"q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7i\2\2\u00c8\u00c9\7\"\2\2\u00c9"+
		"\u00ca\7n\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7i\2\2"+
		"\u00cd\24\3\2\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7j\2\2\u00d0\u00d1\7"+
		"c\2\2\u00d1\u00d2\7t\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7x\2\2\u00d4\u00d5"+
		"\7q\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7f\2\2\u00d7\30\3\2\2\2\u00d8\u00d9"+
		"\7y\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7n\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7*\2\2\u00de\32\3\2\2\2\u00df\u00e0\7h\2\2\u00e0"+
		"\u00e1\7q\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7*\2\2\u00e3\34\3\2\2\2\u00e4"+
		"\u00e5\7k\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7*\2\2\u00e7\36\3\2\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2"+
		"\u00ec \3\2\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7v\2"+
		"\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7p\2\2\u00f3\"\3"+
		"\2\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2\2\u00f7"+
		"\u00f8\7c\2\2\u00f8\u00f9\7m\2\2\u00f9$\3\2\2\2\u00fa\u00fb\7e\2\2\u00fb"+
		"\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7k\2\2"+
		"\u00ff\u0100\7p\2\2\u0100\u0101\7w\2\2\u0101\u0102\7g\2\2\u0102&\3\2\2"+
		"\2\u0103\u0104\7%\2\2\u0104\u0105\7k\2\2\u0105\u0106\7p\2\2\u0106\u0107"+
		"\7e\2\2\u0107\u0108\7n\2\2\u0108\u0109\7w\2\2\u0109\u010a\7f\2\2\u010a"+
		"\u010b\7g\2\2\u010b(\3\2\2\2\u010c\u010d\7%\2\2\u010d\u010e\7f\2\2\u010e"+
		"\u010f\7g\2\2\u010f\u0110\7h\2\2\u0110\u0111\7k\2\2\u0111\u0112\7p\2\2"+
		"\u0112\u0113\7g\2\2\u0113*\3\2\2\2\u0114\u0115\7?\2\2\u0115\u0116\7?\2"+
		"\2\u0116,\3\2\2\2\u0117\u0118\7>\2\2\u0118\u0119\7?\2\2\u0119.\3\2\2\2"+
		"\u011a\u011b\7@\2\2\u011b\u011c\7?\2\2\u011c\60\3\2\2\2\u011d\u011e\7"+
		"#\2\2\u011e\u011f\7?\2\2\u011f\62\3\2\2\2\u0120\u0121\7@\2\2\u0121\64"+
		"\3\2\2\2\u0122\u0123\7>\2\2\u0123\66\3\2\2\2\u0124\u0125\7-\2\2\u0125"+
		"\u0126\7?\2\2\u01268\3\2\2\2\u0127\u0128\7/\2\2\u0128\u0129\7?\2\2\u0129"+
		":\3\2\2\2\u012a\u012b\7,\2\2\u012b\u012c\7?\2\2\u012c<\3\2\2\2\u012d\u012e"+
		"\7\61\2\2\u012e\u012f\7?\2\2\u012f>\3\2\2\2\u0130\u0131\7`\2\2\u0131\u0132"+
		"\7?\2\2\u0132@\3\2\2\2\u0133\u0134\7\'\2\2\u0134\u0135\7?\2\2\u0135B\3"+
		"\2\2\2\u0136\u0137\7>\2\2\u0137\u0138\7>\2\2\u0138\u0139\7?\2\2\u0139"+
		"D\3\2\2\2\u013a\u013b\7@\2\2\u013b\u013c\7@\2\2\u013c\u013d\7?\2\2\u013d"+
		"F\3\2\2\2\u013e\u013f\7-\2\2\u013f\u0140\7-\2\2\u0140H\3\2\2\2\u0141\u0142"+
		"\7/\2\2\u0142\u0143\7/\2\2\u0143J\3\2\2\2\u0144\u0145\7#\2\2\u0145L\3"+
		"\2\2\2\u0146\u0147\7(\2\2\u0147\u0148\7(\2\2\u0148N\3\2\2\2\u0149\u014a"+
		"\7~\2\2\u014a\u014b\7~\2\2\u014bP\3\2\2\2\u014c\u014d\7(\2\2\u014dR\3"+
		"\2\2\2\u014e\u014f\7~\2\2\u014fT\3\2\2\2\u0150\u0151\7`\2\2\u0151V\3\2"+
		"\2\2\u0152\u0153\7>\2\2\u0153\u0154\7>\2\2\u0154X\3\2\2\2\u0155\u0156"+
		"\7@\2\2\u0156\u0157\7@\2\2\u0157Z\3\2\2\2\u0158\u0159\7-\2\2\u0159\\\3"+
		"\2\2\2\u015a\u015b\7/\2\2\u015b^\3\2\2\2\u015c\u015d\7,\2\2\u015d`\3\2"+
		"\2\2\u015e\u015f\7\61\2\2\u015fb\3\2\2\2\u0160\u0161\7?\2\2\u0161d\3\2"+
		"\2\2\u0162\u016b\7\62\2\2\u0163\u0167\4\63;\2\u0164\u0166\5s:\2\u0165"+
		"\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0162\3\2\2\2\u016a"+
		"\u0163\3\2\2\2\u016bf\3\2\2\2\u016c\u0171\5q9\2\u016d\u0170\5q9\2\u016e"+
		"\u0170\5s:\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2"+
		"\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172h\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0178\5k\66\2\u0175\u0178\5m\67\2\u0176\u0178\5o8\2\u0177"+
		"\u0174\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0176\3\2\2\2\u0178j\3\2\2\2"+
		"\u0179\u017b\5s:\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182\7\60\2\2"+
		"\u017f\u0181\5s:\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183l\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0187\7\60\2\2\u0186\u0188\5s:\2\u0187\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018an\3\2\2\2\u018b\u018d"+
		"\5s:\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018fp\3\2\2\2\u0190\u0191\t\2\2\2\u0191r\3\2\2\2\u0192"+
		"\u0193\4\62;\2\u0193t\3\2\2\2\u0194\u0195\7*\2\2\u0195v\3\2\2\2\u0196"+
		"\u0197\7+\2\2\u0197x\3\2\2\2\u0198\u0199\7]\2\2\u0199z\3\2\2\2\u019a\u019b"+
		"\7_\2\2\u019b|\3\2\2\2\u019c\u019d\7}\2\2\u019d~\3\2\2\2\u019e\u019f\7"+
		"\177\2\2\u019f\u0080\3\2\2\2\u01a0\u01a1\7\60\2\2\u01a1\u0082\3\2\2\2"+
		"\u01a2\u01a3\7.\2\2\u01a3\u0084\3\2\2\2\u01a4\u01a5\7=\2\2\u01a5\u0086"+
		"\3\2\2\2\u01a6\u01a7\7<\2\2\u01a7\u0088\3\2\2\2\u01a8\u01a9\5g\64\2\u01a9"+
		"\u01aa\5u;\2\u01aa\u008a\3\2\2\2\u01ab\u01ac\5g\64\2\u01ac\u01ad\5y=\2"+
		"\u01ad\u008c\3\2\2\2\u01ae\u01af\7)\2\2\u01af\u01b0\5q9\2\u01b0\u01b1"+
		"\7)\2\2\u01b1\u008e\3\2\2\2\u01b2\u01b8\7$\2\2\u01b3\u01b4\7$\2\2\u01b4"+
		"\u01b7\7$\2\2\u01b5\u01b7\n\3\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b5\3\2"+
		"\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7$\2\2\u01bc\u0090\3\2"+
		"\2\2\u01bd\u01be\7\61\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c3\3\2\2\2\u01c0"+
		"\u01c2\13\2\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3"+
		"\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\7\f\2\2\u01c7\u01c8\bI\2\2\u01c8\u0092\3\2\2\2\u01c9\u01ca\7\61"+
		"\2\2\u01ca\u01cb\7,\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01ce\13\2\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2"+
		"\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7,\2\2\u01d3"+
		"\u01d4\7\61\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\bJ\3\2\u01d6\u0094\3\2"+
		"\2\2\u01d7\u01d9\t\4\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\bK"+
		"\4\2\u01dd\u0096\3\2\2\2\21\2\u0167\u016a\u016f\u0171\u0177\u017c\u0182"+
		"\u0189\u018e\u01b6\u01b8\u01c3\u01cf\u01da\5\3I\2\3J\3\3K\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}