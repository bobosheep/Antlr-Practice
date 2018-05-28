// Generated from /home/bobosheep/Compiler/AntlrPractice/Checker/myChecker.g by ANTLR 4.7.1

    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCheckerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SHORT_TYPE=4, INT_TYPE=5, LONG_TYPE=6, FLOAT_TYPE=7, 
		DOUBLE_TYPE=8, LONGLONG_TYPE=9, CHAR_TYPE=10, VOID_TYPE=11, WHILE_=12, 
		FOR_=13, IF_=14, ELSE_=15, RETURN_=16, BREAK_=17, CONTINUE_=18, INCLUDE=19, 
		DEFINE=20, OP_EQ=21, OP_LE=22, OP_GE=23, OP_NE=24, OP_GT=25, OP_LT=26, 
		OP_ADDAS=27, OP_SUBAS=28, OP_MULAS=29, OP_DIVAS=30, OP_XORAS=31, OP_MODAS=32, 
		OP_LSAS=33, OP_RSAS=34, OP_ADDADD=35, OP_SUBSUB=36, OP_NOT=37, OP_LAND=38, 
		OP_LOR=39, OP_AND=40, OP_OR=41, OP_XOR=42, OP_LS=43, OP_RS=44, OP_ADD=45, 
		OP_SUB=46, OP_MUL=47, OP_DIV=48, OP_ASS=49, DEC_NUM=50, ID=51, FLOAT_NUM=52, 
		LPAREN=53, RPAREN=54, LBRACK=55, RBRACK=56, LBRACE=57, RBRACE=58, PERIOD=59, 
		COMMA=60, SEMICOL=61, COLON=62, FUNCTION_CALL=63, ARRAY=64, CHAR=65, STRING=66, 
		COMMENT1=67, COMMENT2=68, WS=69;
	public static final int
		RULE_startStat = 0, RULE_mainfunction = 1, RULE_type = 2, RULE_stats = 3, 
		RULE_whileStat = 4, RULE_ifelseStat = 5, RULE_forStat = 6, RULE_function = 7, 
		RULE_declareStat = 8, RULE_procedStat = 9, RULE_exprList = 10, RULE_breakStat = 11, 
		RULE_continueStat = 12, RULE_arguments = 13, RULE_params = 14, RULE_param = 15, 
		RULE_expr = 16, RULE_operationStat = 17, RULE_add = 18, RULE_multiply = 19, 
		RULE_atom = 20;
	public static final String[] ruleNames = {
		"startStat", "mainfunction", "type", "stats", "whileStat", "ifelseStat", 
		"forStat", "function", "declareStat", "procedStat", "exprList", "breakStat", 
		"continueStat", "arguments", "params", "param", "expr", "operationStat", 
		"add", "multiply", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.h'", "'main('", "'else if('", "'short'", "'int'", "'long'", "'float'", 
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
		"IF_", "ELSE_", "RETURN_", "BREAK_", "CONTINUE_", "INCLUDE", "DEFINE", 
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

	@Override
	public String getGrammarFileName() { return "myChecker.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myCheckerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartStatContext extends ParserRuleContext {
		public MainfunctionContext mainfunction() {
			return getRuleContext(MainfunctionContext.class,0);
		}
		public List<TerminalNode> INCLUDE() { return getTokens(myCheckerParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(myCheckerParser.INCLUDE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myCheckerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myCheckerParser.ID, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myCheckerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myCheckerParser.WS, i);
		}
		public StartStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startStat; }
	}

	public final StartStatContext startStat() throws RecognitionException {
		StartStatContext _localctx = new StartStatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(INCLUDE);
				setState(43);
				match(OP_LT);
				setState(44);
				match(ID);
				setState(45);
				match(T__0);
				setState(46);
				match(OP_GT);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(47);
					match(WS);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					function();
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(63);
			mainfunction();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(64);
				function();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainfunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public TerminalNode RETURN_() { return getToken(myCheckerParser.RETURN_, 0); }
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myCheckerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myCheckerParser.WS, i);
		}
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public TerminalNode DEC_NUM() { return getToken(myCheckerParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myCheckerParser.FLOAT_NUM, 0); }
		public MainfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainfunction; }
	}

	public final MainfunctionContext mainfunction() throws RecognitionException {
		MainfunctionContext _localctx = new MainfunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainfunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type();
			setState(71);
			match(T__1);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(72);
				params();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(RPAREN);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(79);
				match(WS);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(LBRACE);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					match(WS);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (SHORT_TYPE - 4)) | (1L << (INT_TYPE - 4)) | (1L << (LONG_TYPE - 4)) | (1L << (FLOAT_TYPE - 4)) | (1L << (DOUBLE_TYPE - 4)) | (1L << (LONGLONG_TYPE - 4)) | (1L << (CHAR_TYPE - 4)) | (1L << (VOID_TYPE - 4)) | (1L << (WHILE_ - 4)) | (1L << (FOR_ - 4)) | (1L << (IF_ - 4)) | (1L << (BREAK_ - 4)) | (1L << (CONTINUE_ - 4)) | (1L << (DEC_NUM - 4)) | (1L << (ID - 4)) | (1L << (FLOAT_NUM - 4)) | (1L << (LPAREN - 4)) | (1L << (FUNCTION_CALL - 4)) | (1L << (CHAR - 4)))) != 0)) {
				{
				{
				setState(92);
				stats();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(98);
				match(WS);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(RETURN_);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEC_NUM || _la==FLOAT_NUM) {
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==DEC_NUM || _la==FLOAT_NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(108);
			match(SEMICOL);
			setState(109);
			match(RBRACE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(110);
				match(WS);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (TRACEON) System.out.println("MAIN (){ stats } ")
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public int attr_type;
		public TerminalNode SHORT_TYPE() { return getToken(myCheckerParser.SHORT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(myCheckerParser.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(myCheckerParser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(myCheckerParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(myCheckerParser.DOUBLE_TYPE, 0); }
		public TerminalNode LONGLONG_TYPE() { return getToken(myCheckerParser.LONGLONG_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(myCheckerParser.CHAR_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(myCheckerParser.VOID_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(SHORT_TYPE);
				if (TRACEON) System.out.println("type: SHORT") ; ((TypeContext)_localctx).attr_type =  1 ; 
				}
				break;
			case INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(INT_TYPE);
				if (TRACEON) System.out.println("type: INT") ; ((TypeContext)_localctx).attr_type =  2 ; 
				}
				break;
			case LONG_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(LONG_TYPE);
				if (TRACEON) System.out.println("type: LONG") ; ((TypeContext)_localctx).attr_type =  3 ; 
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(FLOAT_TYPE);
				if (TRACEON) System.out.println("type: FLOAT") ; ((TypeContext)_localctx).attr_type =  4 ; 
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(DOUBLE_TYPE);
				if (TRACEON) System.out.println("type: DOUBLE") ; ((TypeContext)_localctx).attr_type =  5 ; 
				}
				break;
			case LONGLONG_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(LONGLONG_TYPE);
				if (TRACEON) System.out.println("type: LONGLONG") ; ((TypeContext)_localctx).attr_type =  6 ; 
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				match(CHAR_TYPE);
				if (TRACEON) System.out.println("type: CHAR") ; ((TypeContext)_localctx).attr_type =  7 ; 
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(132);
				match(VOID_TYPE);
				if (TRACEON) System.out.println("type: VOID") ; ((TypeContext)_localctx).attr_type =  8 ; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatsContext extends ParserRuleContext {
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public IfelseStatContext ifelseStat() {
			return getRuleContext(IfelseStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public DeclareStatContext declareStat() {
			return getRuleContext(DeclareStatContext.class,0);
		}
		public ProcedStatContext procedStat() {
			return getRuleContext(ProcedStatContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public BreakStatContext breakStat() {
			return getRuleContext(BreakStatContext.class,0);
		}
		public ContinueStatContext continueStat() {
			return getRuleContext(ContinueStatContext.class,0);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stats);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE_:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				whileStat();
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				ifelseStat();
				}
				break;
			case FOR_:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				forStat();
				}
				break;
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case LONGLONG_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				declareStat();
				}
				break;
			case FUNCTION_CALL:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				procedStat();
				}
				break;
			case DEC_NUM:
			case ID:
			case FLOAT_NUM:
			case LPAREN:
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				exprList();
				}
				break;
			case BREAK_:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				breakStat();
				}
				break;
			case CONTINUE_:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				continueStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(myCheckerParser.WHILE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
		public List<TerminalNode> WS() { return getTokens(myCheckerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myCheckerParser.WS, i);
		}
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(WHILE_);
			setState(147);
			expr();
			setState(148);
			match(RPAREN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(149);
				match(WS);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(LBRACE);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(156);
				match(WS);
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				stats();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (SHORT_TYPE - 4)) | (1L << (INT_TYPE - 4)) | (1L << (LONG_TYPE - 4)) | (1L << (FLOAT_TYPE - 4)) | (1L << (DOUBLE_TYPE - 4)) | (1L << (LONGLONG_TYPE - 4)) | (1L << (CHAR_TYPE - 4)) | (1L << (VOID_TYPE - 4)) | (1L << (WHILE_ - 4)) | (1L << (FOR_ - 4)) | (1L << (IF_ - 4)) | (1L << (BREAK_ - 4)) | (1L << (CONTINUE_ - 4)) | (1L << (DEC_NUM - 4)) | (1L << (ID - 4)) | (1L << (FLOAT_NUM - 4)) | (1L << (LPAREN - 4)) | (1L << (FUNCTION_CALL - 4)) | (1L << (CHAR - 4)))) != 0) );
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(167);
				match(WS);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(RBRACE);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					match(WS);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfelseStatContext extends ParserRuleContext {
		public TerminalNode IF_() { return getToken(myCheckerParser.IF_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(myCheckerParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(myCheckerParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(myCheckerParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(myCheckerParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(myCheckerParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(myCheckerParser.RBRACE, i);
		}
		public List<TerminalNode> WS() { return getTokens(myCheckerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myCheckerParser.WS, i);
		}
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public TerminalNode ELSE_() { return getToken(myCheckerParser.ELSE_, 0); }
		public IfelseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseStat; }
	}

	public final IfelseStatContext ifelseStat() throws RecognitionException {
		IfelseStatContext _localctx = new IfelseStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifelseStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF_);
			setState(181);
			expr();
			setState(182);
			match(RPAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(183);
				match(WS);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(LBRACE);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(190);
				match(WS);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				stats();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (SHORT_TYPE - 4)) | (1L << (INT_TYPE - 4)) | (1L << (LONG_TYPE - 4)) | (1L << (FLOAT_TYPE - 4)) | (1L << (DOUBLE_TYPE - 4)) | (1L << (LONGLONG_TYPE - 4)) | (1L << (CHAR_TYPE - 4)) | (1L << (VOID_TYPE - 4)) | (1L << (WHILE_ - 4)) | (1L << (FOR_ - 4)) | (1L << (IF_ - 4)) | (1L << (BREAK_ - 4)) | (1L << (CONTINUE_ - 4)) | (1L << (DEC_NUM - 4)) | (1L << (ID - 4)) | (1L << (FLOAT_NUM - 4)) | (1L << (LPAREN - 4)) | (1L << (FUNCTION_CALL - 4)) | (1L << (CHAR - 4)))) != 0) );
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(201);
				match(WS);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(RBRACE);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(WS);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(214);
				match(T__2);
				setState(215);
				expr();
				setState(216);
				match(RPAREN);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(217);
					match(WS);
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(LBRACE);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(224);
					match(WS);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					stats();
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (SHORT_TYPE - 4)) | (1L << (INT_TYPE - 4)) | (1L << (LONG_TYPE - 4)) | (1L << (FLOAT_TYPE - 4)) | (1L << (DOUBLE_TYPE - 4)) | (1L << (LONGLONG_TYPE - 4)) | (1L << (CHAR_TYPE - 4)) | (1L << (VOID_TYPE - 4)) | (1L << (WHILE_ - 4)) | (1L << (FOR_ - 4)) | (1L << (IF_ - 4)) | (1L << (BREAK_ - 4)) | (1L << (CONTINUE_ - 4)) | (1L << (DEC_NUM - 4)) | (1L << (ID - 4)) | (1L << (FLOAT_NUM - 4)) | (1L << (LPAREN - 4)) | (1L << (FUNCTION_CALL - 4)) | (1L << (CHAR - 4)))) != 0) );
				setState(235);
				match(RBRACE);
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(236);
						match(WS);
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(247);
				match(ELSE_);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(248);
					match(WS);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(LBRACE);
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(255);
					stats();
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (SHORT_TYPE - 4)) | (1L << (INT_TYPE - 4)) | (1L << (LONG_TYPE - 4)) | (1L << (FLOAT_TYPE - 4)) | (1L << (DOUBLE_TYPE - 4)) | (1L << (LONGLONG_TYPE - 4)) | (1L << (CHAR_TYPE - 4)) | (1L << (VOID_TYPE - 4)) | (1L << (WHILE_ - 4)) | (1L << (FOR_ - 4)) | (1L << (IF_ - 4)) | (1L << (BREAK_ - 4)) | (1L << (CONTINUE_ - 4)) | (1L << (DEC_NUM - 4)) | (1L << (ID - 4)) | (1L << (FLOAT_NUM - 4)) | (1L << (LPAREN - 4)) | (1L << (FUNCTION_CALL - 4)) | (1L << (CHAR - 4)))) != 0) );
				setState(260);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode FOR_() { return getToken(myCheckerParser.FOR_, 0); }
		public List<TerminalNode> SEMICOL() { return getTokens(myCheckerParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(myCheckerParser.SEMICOL, i);
		}
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myCheckerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myCheckerParser.WS, i);
		}
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(FOR_);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (DEC_NUM - 50)) | (1L << (ID - 50)) | (1L << (FLOAT_NUM - 50)) | (1L << (LPAREN - 50)) | (1L << (CHAR - 50)))) != 0)) {
				{
				{
				setState(265);
				expr();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(SEMICOL);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (DEC_NUM - 50)) | (1L << (ID - 50)) | (1L << (FLOAT_NUM - 50)) | (1L << (LPAREN - 50)) | (1L << (CHAR - 50)))) != 0)) {
				{
				{
				setState(272);
				expr();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(SEMICOL);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (DEC_NUM - 50)) | (1L << (ID - 50)) | (1L << (FLOAT_NUM - 50)) | (1L << (LPAREN - 50)) | (1L << (CHAR - 50)))) != 0)) {
				{
				{
				setState(279);
				expr();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(RPAREN);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(286);
				match(WS);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(LBRACE);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(293);
				match(WS);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(300); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				stats();
				}
				}
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (SHORT_TYPE - 4)) | (1L << (INT_TYPE - 4)) | (1L << (LONG_TYPE - 4)) | (1L << (FLOAT_TYPE - 4)) | (1L << (DOUBLE_TYPE - 4)) | (1L << (LONGLONG_TYPE - 4)) | (1L << (CHAR_TYPE - 4)) | (1L << (VOID_TYPE - 4)) | (1L << (WHILE_ - 4)) | (1L << (FOR_ - 4)) | (1L << (IF_ - 4)) | (1L << (BREAK_ - 4)) | (1L << (CONTINUE_ - 4)) | (1L << (DEC_NUM - 4)) | (1L << (ID - 4)) | (1L << (FLOAT_NUM - 4)) | (1L << (LPAREN - 4)) | (1L << (FUNCTION_CALL - 4)) | (1L << (CHAR - 4)))) != 0) );
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(304);
				match(WS);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(RBRACE);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(311);
					match(WS);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FUNCTION_CALL() { return getToken(myCheckerParser.FUNCTION_CALL, 0); }
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myCheckerParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myCheckerParser.WS, i);
		}
		public TerminalNode DEC_NUM() { return getToken(myCheckerParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myCheckerParser.FLOAT_NUM, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				type();
				setState(318);
				match(FUNCTION_CALL);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(319);
					params();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(325);
				match(RPAREN);
				setState(326);
				match(LBRACE);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (SHORT_TYPE - 4)) | (1L << (INT_TYPE - 4)) | (1L << (LONG_TYPE - 4)) | (1L << (FLOAT_TYPE - 4)) | (1L << (DOUBLE_TYPE - 4)) | (1L << (LONGLONG_TYPE - 4)) | (1L << (CHAR_TYPE - 4)) | (1L << (VOID_TYPE - 4)) | (1L << (WHILE_ - 4)) | (1L << (FOR_ - 4)) | (1L << (IF_ - 4)) | (1L << (BREAK_ - 4)) | (1L << (CONTINUE_ - 4)) | (1L << (DEC_NUM - 4)) | (1L << (ID - 4)) | (1L << (FLOAT_NUM - 4)) | (1L << (LPAREN - 4)) | (1L << (FUNCTION_CALL - 4)) | (1L << (CHAR - 4)))) != 0)) {
					{
					{
					setState(327);
					stats();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(333);
					match(WS);
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				match(RETURN_);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEC_NUM || _la==FLOAT_NUM) {
					{
					setState(340);
					_la = _input.LA(1);
					if ( !(_la==DEC_NUM || _la==FLOAT_NUM) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(343);
				match(SEMICOL);
				setState(344);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				type();
				setState(347);
				match(FUNCTION_CALL);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(348);
					params();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(RPAREN);
				setState(355);
				match(SEMICOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareStatContext extends ParserRuleContext {
		public int attr_type;
		public TypeContext type;
		public Token a;
		public ExprContext b;
		public Token c;
		public ExprContext d;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public List<TerminalNode> ID() { return getTokens(myCheckerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myCheckerParser.ID, i);
		}
		public List<TerminalNode> OP_ASS() { return getTokens(myCheckerParser.OP_ASS); }
		public TerminalNode OP_ASS(int i) {
			return getToken(myCheckerParser.OP_ASS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myCheckerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCheckerParser.COMMA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DeclareStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStat; }
	}

	public final DeclareStatContext declareStat() throws RecognitionException {
		DeclareStatContext _localctx = new DeclareStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declareStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((DeclareStatContext)_localctx).type = type();
			setState(360);
			((DeclareStatContext)_localctx).a = match(ID);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASS) {
				{
				setState(361);
				match(OP_ASS);
				setState(362);
				((DeclareStatContext)_localctx).b = expr();
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				((DeclareStatContext)_localctx).c = match(ID);
				{
				setState(367);
				match(OP_ASS);
				setState(368);
				((DeclareStatContext)_localctx).d = expr();
				}
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(SEMICOL);

			            if (symbolTable.containsKey((((DeclareStatContext)_localctx).a!=null?((DeclareStatContext)_localctx).a.getText():null)))
			            {
			                System.out.println("Type Error " + ((DeclareStatContext)_localctx).a.getLine() + " : Redeclared identifier " + (((DeclareStatContext)_localctx).a!=null?((DeclareStatContext)_localctx).a.getText():null) + ".");
			                ((DeclareStatContext)_localctx).attr_type =  -2;
			            }
			            else if( (((DeclareStatContext)_localctx).type.attr_type != ((DeclareStatContext)_localctx).b.attr_type ) && ( (((DeclareStatContext)_localctx).b!=null?_input.getText(((DeclareStatContext)_localctx).b.start,((DeclareStatContext)_localctx).b.stop):null) != null) )
			            {
			                System.out.println("Type Error " + (((DeclareStatContext)_localctx).b!=null?(((DeclareStatContext)_localctx).b.start):null).getLine() + " : Type mismatch for 2 side operands in an assignmentStat. ");
			                ((DeclareStatContext)_localctx).attr_type =  -2
			            }
			            else
			            {
			                symbolTable.put((((DeclareStatContext)_localctx).a!=null?((DeclareStatContext)_localctx).a.getText():null), ((DeclareStatContext)_localctx).type.attr_type);
			            }

			            if((((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null) != null)
			            {
			                if (symbolTable.containsKey((((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null)))
			                {
			                    System.out.println("Type Error " + ((DeclareStatContext)_localctx).c.getLine() + " : Redeclared identifier " + (((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null) + ".");
			                    ((DeclareStatContext)_localctx).attr_type =  -2;
			                }
			                else if( (((DeclareStatContext)_localctx).type.attr_type != ((DeclareStatContext)_localctx).d.attr_type ) && ( (((DeclareStatContext)_localctx).d!=null?_input.getText(((DeclareStatContext)_localctx).d.start,((DeclareStatContext)_localctx).d.stop):null) != null) )
			                {
			                    System.out.println("Type Error " + (((DeclareStatContext)_localctx).d!=null?(((DeclareStatContext)_localctx).d.start):null).getLine() + " : Type mismatch for 2 side operands in an assignmentStat. ");
			                    ((DeclareStatContext)_localctx).attr_type =  -2;
			                }
			                else
			                {
			                    symbolTable.put((((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null), ((DeclareStatContext)_localctx).type.attr_type);
			                }
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedStatContext extends ParserRuleContext {
		public TerminalNode FUNCTION_CALL() { return getToken(myCheckerParser.FUNCTION_CALL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public ProcedStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedStat; }
	}

	public final ProcedStatContext procedStat() throws RecognitionException {
		ProcedStatContext _localctx = new ProcedStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procedStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(FUNCTION_CALL);
			setState(378);
			arguments();
			setState(379);
			match(RPAREN);
			setState(380);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public int attr_type;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myCheckerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCheckerParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((ExprListContext)_localctx).expr = expr();
			 _localctx.attr_type = ((ExprListContext)_localctx).expr.attr_type 
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(384);
				match(COMMA);
				setState(385);
				((ExprListContext)_localctx).expr = expr();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatContext extends ParserRuleContext {
		public TerminalNode BREAK_() { return getToken(myCheckerParser.BREAK_, 0); }
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public BreakStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStat; }
	}

	public final BreakStatContext breakStat() throws RecognitionException {
		BreakStatContext _localctx = new BreakStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_breakStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(BREAK_);
			setState(394);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatContext extends ParserRuleContext {
		public TerminalNode CONTINUE_() { return getToken(myCheckerParser.CONTINUE_, 0); }
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public ContinueStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStat; }
	}

	public final ContinueStatContext continueStat() throws RecognitionException {
		ContinueStatContext _localctx = new ContinueStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_continueStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(CONTINUE_);
			setState(397);
			match(SEMICOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myCheckerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCheckerParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			expr();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(400);
				match(COMMA);
				setState(401);
				expr();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myCheckerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCheckerParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			param();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(408);
				match(COMMA);
				setState(409);
				param();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myCheckerParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		try {
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				type();
				setState(416);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int attr_type;
		public OperationStatContext a;
		public OperationStatContext b;
		public List<OperationStatContext> operationStat() {
			return getRuleContexts(OperationStatContext.class);
		}
		public OperationStatContext operationStat(int i) {
			return getRuleContext(OperationStatContext.class,i);
		}
		public List<TerminalNode> OP_LAND() { return getTokens(myCheckerParser.OP_LAND); }
		public TerminalNode OP_LAND(int i) {
			return getToken(myCheckerParser.OP_LAND, i);
		}
		public List<TerminalNode> OP_LOR() { return getTokens(myCheckerParser.OP_LOR); }
		public TerminalNode OP_LOR(int i) {
			return getToken(myCheckerParser.OP_LOR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			((ExprContext)_localctx).a = operationStat();
			 _localctx.attr_type = ((ExprContext)_localctx).a.attr_type 
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LAND || _la==OP_LOR) {
				{
				{
				setState(423);
				_la = _input.LA(1);
				if ( !(_la==OP_LAND || _la==OP_LOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(424);
				((ExprContext)_localctx).b = operationStat();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if(((ExprContext)_localctx).b.attr_type != ((ExprContext)_localctx).a.attr_type)
			        {
			            System.out.println("Type Error " + (((ExprContext)_localctx).a!=null?(((ExprContext)_localctx).a.start):null).getLine() + " : Type mismatch in the expression");
			            ((ExprContext)_localctx).attr_type =  -2;
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationStatContext extends ParserRuleContext {
		public int attr_type;
		public AddContext a;
		public AddContext b;
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(myCheckerParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(myCheckerParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(myCheckerParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(myCheckerParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(myCheckerParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(myCheckerParser.OP_GE, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(myCheckerParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(myCheckerParser.OP_NE, i);
		}
		public List<TerminalNode> OP_GT() { return getTokens(myCheckerParser.OP_GT); }
		public TerminalNode OP_GT(int i) {
			return getToken(myCheckerParser.OP_GT, i);
		}
		public List<TerminalNode> OP_LT() { return getTokens(myCheckerParser.OP_LT); }
		public TerminalNode OP_LT(int i) {
			return getToken(myCheckerParser.OP_LT, i);
		}
		public List<TerminalNode> OP_ASS() { return getTokens(myCheckerParser.OP_ASS); }
		public TerminalNode OP_ASS(int i) {
			return getToken(myCheckerParser.OP_ASS, i);
		}
		public List<TerminalNode> OP_ADDAS() { return getTokens(myCheckerParser.OP_ADDAS); }
		public TerminalNode OP_ADDAS(int i) {
			return getToken(myCheckerParser.OP_ADDAS, i);
		}
		public List<TerminalNode> OP_SUBAS() { return getTokens(myCheckerParser.OP_SUBAS); }
		public TerminalNode OP_SUBAS(int i) {
			return getToken(myCheckerParser.OP_SUBAS, i);
		}
		public List<TerminalNode> OP_MULAS() { return getTokens(myCheckerParser.OP_MULAS); }
		public TerminalNode OP_MULAS(int i) {
			return getToken(myCheckerParser.OP_MULAS, i);
		}
		public List<TerminalNode> OP_DIVAS() { return getTokens(myCheckerParser.OP_DIVAS); }
		public TerminalNode OP_DIVAS(int i) {
			return getToken(myCheckerParser.OP_DIVAS, i);
		}
		public List<TerminalNode> OP_XORAS() { return getTokens(myCheckerParser.OP_XORAS); }
		public TerminalNode OP_XORAS(int i) {
			return getToken(myCheckerParser.OP_XORAS, i);
		}
		public List<TerminalNode> OP_MODAS() { return getTokens(myCheckerParser.OP_MODAS); }
		public TerminalNode OP_MODAS(int i) {
			return getToken(myCheckerParser.OP_MODAS, i);
		}
		public List<TerminalNode> OP_LSAS() { return getTokens(myCheckerParser.OP_LSAS); }
		public TerminalNode OP_LSAS(int i) {
			return getToken(myCheckerParser.OP_LSAS, i);
		}
		public List<TerminalNode> OP_RSAS() { return getTokens(myCheckerParser.OP_RSAS); }
		public TerminalNode OP_RSAS(int i) {
			return getToken(myCheckerParser.OP_RSAS, i);
		}
		public OperationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationStat; }
	}

	public final OperationStatContext operationStat() throws RecognitionException {
		OperationStatContext _localctx = new OperationStatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_operationStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			((OperationStatContext)_localctx).a = add();
			 _localctx.attr_type = ((OperationStatContext)_localctx).a.attr_type 
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ASS))) != 0)) {
				{
				{
				setState(434);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ASS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(435);
				((OperationStatContext)_localctx).b = add();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            if (((OperationStatContext)_localctx).a.attr_type != ((OperationStatContext)_localctx).b.attr_type)
			            {
			                System.out.println("Type Error " + (((OperationStatContext)_localctx).a!=null?(((OperationStatContext)_localctx).a.start):null).getLine() + " : Type mismatch for operationStat in the expression");
			                ((OperationStatContext)_localctx).attr_type =  -2;
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public int attr_type;
		public MultiplyContext a;
		public MultiplyContext b;
		public List<MultiplyContext> multiply() {
			return getRuleContexts(MultiplyContext.class);
		}
		public MultiplyContext multiply(int i) {
			return getRuleContext(MultiplyContext.class,i);
		}
		public List<TerminalNode> OP_ADD() { return getTokens(myCheckerParser.OP_ADD); }
		public TerminalNode OP_ADD(int i) {
			return getToken(myCheckerParser.OP_ADD, i);
		}
		public List<TerminalNode> OP_SUB() { return getTokens(myCheckerParser.OP_SUB); }
		public TerminalNode OP_SUB(int i) {
			return getToken(myCheckerParser.OP_SUB, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			((AddContext)_localctx).a = multiply();
			 _localctx.attr_type = ((AddContext)_localctx).a.attr_type 
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD || _la==OP_SUB) {
				{
				{
				setState(445);
				_la = _input.LA(1);
				if ( !(_la==OP_ADD || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(446);
				((AddContext)_localctx).b = multiply();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if (((AddContext)_localctx).a.attr_type != ((AddContext)_localctx).b.attr_type)
			        {
			            System.out.println("Type Error " + (((AddContext)_localctx).a!=null?(((AddContext)_localctx).a.start):null).getLine() + " : Type mismatch for add or sub in the expression");
			            ((AddContext)_localctx).attr_type =  -2;
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyContext extends ParserRuleContext {
		public int attr_type;
		public AtomContext a;
		public AtomContext b;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> OP_MUL() { return getTokens(myCheckerParser.OP_MUL); }
		public TerminalNode OP_MUL(int i) {
			return getToken(myCheckerParser.OP_MUL, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(myCheckerParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(myCheckerParser.OP_DIV, i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			((MultiplyContext)_localctx).a = atom();
			 _localctx.attr_type = ((MultiplyContext)_localctx).a.attr_type 
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(456);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
				((MultiplyContext)_localctx).b = atom();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        if (((MultiplyContext)_localctx).a.attr_type != ((MultiplyContext)_localctx).b.attr_type)
			        {
			            System.out.println("Type Error " + (((MultiplyContext)_localctx).a!=null?(((MultiplyContext)_localctx).a.start):null).getLine() + " : Type mismatch for mul or div in the expression");
			            ((MultiplyContext)_localctx).attr_type =  -2;
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public int attr_type;
		public Token ID;
		public ExprContext expr;
		public TerminalNode DEC_NUM() { return getToken(myCheckerParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myCheckerParser.FLOAT_NUM, 0); }
		public TerminalNode CHAR() { return getToken(myCheckerParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(myCheckerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(myCheckerParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(DEC_NUM);
				 /* default it is integer */  ((AtomContext)_localctx).attr_type =  2 ; 
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(FLOAT_NUM);
				 ((AtomContext)_localctx).attr_type =  4 ; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				match(CHAR);
				 ((AtomContext)_localctx).attr_type =  7 ; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				((AtomContext)_localctx).ID = match(ID);

				            if(symbolTable.containsKey((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null)))
				            {
				                ((AtomContext)_localctx).attr_type =  symbolTable.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				            }
				            else
				            {
				                System.out.println("Type Error " + ((AtomContext)_localctx).ID.getLine() + ":Unknown Idenifier " + (((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				                ((AtomContext)_localctx).attr_type =  -1;
				            }
				        
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(473);
				match(LPAREN);
				setState(474);
				((AtomContext)_localctx).expr = expr();
				setState(475);
				match(RPAREN);
				 _localctx.attr_type = ((AtomContext)_localctx).expr.attr_type 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u01e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\6\28\n\2\r\2\16\29\3\2\7\2=\n\2\f\2\16\2@\13\2\3"+
		"\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3"+
		"\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\7\3`"+
		"\n\3\f\3\16\3c\13\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\3\3\5\3m\n\3\3\3\3"+
		"\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0089\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0093\n\5\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13"+
		"\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6\6\6\u00a6\n\6\r\6\16"+
		"\6\u00a7\3\6\7\6\u00ab\n\6\f\6\16\6\u00ae\13\6\3\6\3\6\7\6\u00b2\n\6\f"+
		"\6\16\6\u00b5\13\6\3\7\3\7\3\7\3\7\7\7\u00bb\n\7\f\7\16\7\u00be\13\7\3"+
		"\7\3\7\7\7\u00c2\n\7\f\7\16\7\u00c5\13\7\3\7\6\7\u00c8\n\7\r\7\16\7\u00c9"+
		"\3\7\7\7\u00cd\n\7\f\7\16\7\u00d0\13\7\3\7\3\7\7\7\u00d4\n\7\f\7\16\7"+
		"\u00d7\13\7\3\7\3\7\3\7\3\7\7\7\u00dd\n\7\f\7\16\7\u00e0\13\7\3\7\3\7"+
		"\7\7\u00e4\n\7\f\7\16\7\u00e7\13\7\3\7\6\7\u00ea\n\7\r\7\16\7\u00eb\3"+
		"\7\3\7\7\7\u00f0\n\7\f\7\16\7\u00f3\13\7\7\7\u00f5\n\7\f\7\16\7\u00f8"+
		"\13\7\3\7\3\7\7\7\u00fc\n\7\f\7\16\7\u00ff\13\7\3\7\3\7\6\7\u0103\n\7"+
		"\r\7\16\7\u0104\3\7\3\7\5\7\u0109\n\7\3\b\3\b\7\b\u010d\n\b\f\b\16\b\u0110"+
		"\13\b\3\b\3\b\7\b\u0114\n\b\f\b\16\b\u0117\13\b\3\b\3\b\7\b\u011b\n\b"+
		"\f\b\16\b\u011e\13\b\3\b\3\b\7\b\u0122\n\b\f\b\16\b\u0125\13\b\3\b\3\b"+
		"\7\b\u0129\n\b\f\b\16\b\u012c\13\b\3\b\6\b\u012f\n\b\r\b\16\b\u0130\3"+
		"\b\7\b\u0134\n\b\f\b\16\b\u0137\13\b\3\b\3\b\7\b\u013b\n\b\f\b\16\b\u013e"+
		"\13\b\3\t\3\t\3\t\7\t\u0143\n\t\f\t\16\t\u0146\13\t\3\t\3\t\3\t\7\t\u014b"+
		"\n\t\f\t\16\t\u014e\13\t\3\t\7\t\u0151\n\t\f\t\16\t\u0154\13\t\3\t\3\t"+
		"\5\t\u0158\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0160\n\t\f\t\16\t\u0163\13"+
		"\t\3\t\3\t\3\t\5\t\u0168\n\t\3\n\3\n\3\n\3\n\5\n\u016e\n\n\3\n\3\n\3\n"+
		"\3\n\7\n\u0174\n\n\f\n\16\n\u0177\13\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\7\f\u0185\n\f\f\f\16\f\u0188\13\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u0195\n\17\f\17\16\17\u0198"+
		"\13\17\3\20\3\20\3\20\7\20\u019d\n\20\f\20\16\20\u01a0\13\20\3\21\3\21"+
		"\3\21\3\21\5\21\u01a6\n\21\3\22\3\22\3\22\3\22\7\22\u01ac\n\22\f\22\16"+
		"\22\u01af\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u01b7\n\23\f\23\16"+
		"\23\u01ba\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u01c2\n\24\f\24\16"+
		"\24\u01c5\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u01cd\n\25\f\25\16"+
		"\25\u01d0\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u01e1\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\7\4\2\64\64\66\66\3\2()\4\2\27$\63\63\3\2"+
		"/\60\3\2\61\62\2\u0214\2\67\3\2\2\2\4H\3\2\2\2\6\u0088\3\2\2\2\b\u0092"+
		"\3\2\2\2\n\u0094\3\2\2\2\f\u00b6\3\2\2\2\16\u010a\3\2\2\2\20\u0167\3\2"+
		"\2\2\22\u0169\3\2\2\2\24\u017b\3\2\2\2\26\u0180\3\2\2\2\30\u018b\3\2\2"+
		"\2\32\u018e\3\2\2\2\34\u0191\3\2\2\2\36\u0199\3\2\2\2 \u01a5\3\2\2\2\""+
		"\u01a7\3\2\2\2$\u01b2\3\2\2\2&\u01bd\3\2\2\2(\u01c8\3\2\2\2*\u01e0\3\2"+
		"\2\2,-\7\25\2\2-.\7\34\2\2./\7\65\2\2/\60\7\3\2\2\60\64\7\33\2\2\61\63"+
		"\7G\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3"+
		"\2\2\2\66\64\3\2\2\2\67,\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3\2"+
		"\2\2;=\5\20\t\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3"+
		"\2\2\2AE\5\4\3\2BD\5\20\t\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3"+
		"\3\2\2\2GE\3\2\2\2HI\5\6\4\2IM\7\4\2\2JL\5\36\20\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PT\78\2\2QS\7G\2\2RQ\3\2\2\2S"+
		"V\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2W[\7;\2\2XZ\7G\2\2YX"+
		"\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2][\3\2\2\2^`\5\b\5\2"+
		"_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\7G\2\2"+
		"ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7\22\2"+
		"\2km\t\2\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7?\2\2os\7<\2\2pr\7G\2\2"+
		"qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\b\3\1\2"+
		"w\5\3\2\2\2xy\7\6\2\2y\u0089\b\4\1\2z{\7\7\2\2{\u0089\b\4\1\2|}\7\b\2"+
		"\2}\u0089\b\4\1\2~\177\7\t\2\2\177\u0089\b\4\1\2\u0080\u0081\7\n\2\2\u0081"+
		"\u0089\b\4\1\2\u0082\u0083\7\13\2\2\u0083\u0089\b\4\1\2\u0084\u0085\7"+
		"\f\2\2\u0085\u0089\b\4\1\2\u0086\u0087\7\r\2\2\u0087\u0089\b\4\1\2\u0088"+
		"x\3\2\2\2\u0088z\3\2\2\2\u0088|\3\2\2\2\u0088~\3\2\2\2\u0088\u0080\3\2"+
		"\2\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\7\3\2\2\2\u008a\u0093\5\n\6\2\u008b\u0093\5\f\7\2\u008c\u0093\5\16\b"+
		"\2\u008d\u0093\5\22\n\2\u008e\u0093\5\24\13\2\u008f\u0093\5\26\f\2\u0090"+
		"\u0093\5\30\r\2\u0091\u0093\5\32\16\2\u0092\u008a\3\2\2\2\u0092\u008b"+
		"\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\t\3\2\2\2"+
		"\u0094\u0095\7\16\2\2\u0095\u0096\5\"\22\2\u0096\u009a\78\2\2\u0097\u0099"+
		"\7G\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\7;"+
		"\2\2\u009e\u00a0\7G\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a6\5\b\5\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00ab\7G"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b3\7<"+
		"\2\2\u00b0\u00b2\7G\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\13\3\2\2\2\u00b5\u00b3\3\2\2"+
		"\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\5\"\22\2\u00b8\u00bc\78\2\2\u00b9"+
		"\u00bb\7G\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c3\7;\2\2\u00c0\u00c2\7G\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c8\5\b\5\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\7G"+
		"\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\7<"+
		"\2\2\u00d2\u00d4\7G\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00f6\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\5\"\22\2\u00da\u00de\78\2\2\u00db"+
		"\u00dd\7G\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e5\7;\2\2\u00e2\u00e4\7G\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2"+
		"\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00ea\5\b\5\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\7<"+
		"\2\2\u00ee\u00f0\7G\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00d8\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u0108\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fd\7\21"+
		"\2\2\u00fa\u00fc\7G\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2"+
		"\2\2\u0100\u0102\7;\2\2\u0101\u0103\5\b\5\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\7<\2\2\u0107\u0109\3\2\2\2\u0108\u00f9\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\r\3\2\2\2\u010a\u010e\7\17\2\2\u010b\u010d\5\"\22"+
		"\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0115\7?\2\2\u0112"+
		"\u0114\5\"\22\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3"+
		"\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011c\7?\2\2\u0119\u011b\5\"\22\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0123\78\2\2\u0120\u0122\7G\2\2\u0121\u0120\3\2\2"+
		"\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012a\7;\2\2\u0127\u0129\7G\2\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\5\b\5\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0135\3\2\2\2\u0132\u0134\7G\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7<\2\2\u0139\u013b\7G\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\17\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\5\6\4\2\u0140\u0144\7A\2\2"+
		"\u0141\u0143\5\36\20\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0148\78\2\2\u0148\u014c\7;\2\2\u0149\u014b\5\b\5\2\u014a\u0149\3\2\2"+
		"\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0152"+
		"\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\7G\2\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0157\7\22\2\2\u0156\u0158\t\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7?"+
		"\2\2\u015a\u015b\7<\2\2\u015b\u0168\3\2\2\2\u015c\u015d\5\6\4\2\u015d"+
		"\u0161\7A\2\2\u015e\u0160\5\36\20\2\u015f\u015e\3\2\2\2\u0160\u0163\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0165\78\2\2\u0165\u0166\7?\2\2\u0166\u0168\3\2\2"+
		"\2\u0167\u013f\3\2\2\2\u0167\u015c\3\2\2\2\u0168\21\3\2\2\2\u0169\u016a"+
		"\5\6\4\2\u016a\u016d\7\65\2\2\u016b\u016c\7\63\2\2\u016c\u016e\5\"\22"+
		"\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0175\3\2\2\2\u016f\u0170"+
		"\7>\2\2\u0170\u0171\7\65\2\2\u0171\u0172\7\63\2\2\u0172\u0174\5\"\22\2"+
		"\u0173\u016f\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7?\2\2\u0179"+
		"\u017a\b\n\1\2\u017a\23\3\2\2\2\u017b\u017c\7A\2\2\u017c\u017d\5\34\17"+
		"\2\u017d\u017e\78\2\2\u017e\u017f\7?\2\2\u017f\25\3\2\2\2\u0180\u0181"+
		"\5\"\22\2\u0181\u0186\b\f\1\2\u0182\u0183\7>\2\2\u0183\u0185\5\"\22\2"+
		"\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7?\2\2\u018a"+
		"\27\3\2\2\2\u018b\u018c\7\23\2\2\u018c\u018d\7?\2\2\u018d\31\3\2\2\2\u018e"+
		"\u018f\7\24\2\2\u018f\u0190\7?\2\2\u0190\33\3\2\2\2\u0191\u0196\5\"\22"+
		"\2\u0192\u0193\7>\2\2\u0193\u0195\5\"\22\2\u0194\u0192\3\2\2\2\u0195\u0198"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\35\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019e\5 \21\2\u019a\u019b\7>\2\2\u019b\u019d\5 \21"+
		"\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\37\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\5\6\4\2\u01a2"+
		"\u01a3\7\65\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a6\5\6\4\2\u01a5\u01a1\3"+
		"\2\2\2\u01a5\u01a4\3\2\2\2\u01a6!\3\2\2\2\u01a7\u01a8\5$\23\2\u01a8\u01ad"+
		"\b\22\1\2\u01a9\u01aa\t\3\2\2\u01aa\u01ac\5$\23\2\u01ab\u01a9\3\2\2\2"+
		"\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\b\22\1\2\u01b1#\3\2\2\2\u01b2"+
		"\u01b3\5&\24\2\u01b3\u01b8\b\23\1\2\u01b4\u01b5\t\4\2\2\u01b5\u01b7\5"+
		"&\24\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\b\23"+
		"\1\2\u01bc%\3\2\2\2\u01bd\u01be\5(\25\2\u01be\u01c3\b\24\1\2\u01bf\u01c0"+
		"\t\5\2\2\u01c0\u01c2\5(\25\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3"+
		"\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2"+
		"\2\2\u01c6\u01c7\b\24\1\2\u01c7\'\3\2\2\2\u01c8\u01c9\5*\26\2\u01c9\u01ce"+
		"\b\25\1\2\u01ca\u01cb\t\6\2\2\u01cb\u01cd\5*\26\2\u01cc\u01ca\3\2\2\2"+
		"\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\b\25\1\2\u01d2)\3\2\2\2\u01d3"+
		"\u01d4\7\64\2\2\u01d4\u01e1\b\26\1\2\u01d5\u01d6\7\66\2\2\u01d6\u01e1"+
		"\b\26\1\2\u01d7\u01d8\7C\2\2\u01d8\u01e1\b\26\1\2\u01d9\u01da\7\65\2\2"+
		"\u01da\u01e1\b\26\1\2\u01db\u01dc\7\67\2\2\u01dc\u01dd\5\"\22\2\u01dd"+
		"\u01de\78\2\2\u01de\u01df\b\26\1\2\u01df\u01e1\3\2\2\2\u01e0\u01d3\3\2"+
		"\2\2\u01e0\u01d5\3\2\2\2\u01e0\u01d7\3\2\2\2\u01e0\u01d9\3\2\2\2\u01e0"+
		"\u01db\3\2\2\2\u01e1+\3\2\2\2:\649>EMT[agls\u0088\u0092\u009a\u00a1\u00a7"+
		"\u00ac\u00b3\u00bc\u00c3\u00c9\u00ce\u00d5\u00de\u00e5\u00eb\u00f1\u00f6"+
		"\u00fd\u0104\u0108\u010e\u0115\u011c\u0123\u012a\u0130\u0135\u013c\u0144"+
		"\u014c\u0152\u0157\u0161\u0167\u016d\u0175\u0186\u0196\u019e\u01a5\u01ad"+
		"\u01b8\u01c3\u01ce\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}