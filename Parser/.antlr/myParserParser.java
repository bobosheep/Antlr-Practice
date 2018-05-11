// Generated from /home/bobosheep/Compiler/AntlrPractice/Parser/myParser.g by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myParserParser extends Parser {
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
		RULE_assignmentStat = 4, RULE_whileStat = 5, RULE_ifelseStat = 6, RULE_forStat = 7, 
		RULE_function = 8, RULE_declareStat = 9, RULE_procedStat = 10, RULE_exprList = 11, 
		RULE_breakStat = 12, RULE_continueStat = 13, RULE_arguments = 14, RULE_params = 15, 
		RULE_param = 16, RULE_expr = 17, RULE_operationStat = 18, RULE_add = 19, 
		RULE_multiply = 20, RULE_atom = 21;
	public static final String[] ruleNames = {
		"startStat", "mainfunction", "type", "stats", "assignmentStat", "whileStat", 
		"ifelseStat", "forStat", "function", "declareStat", "procedStat", "exprList", 
		"breakStat", "continueStat", "arguments", "params", "param", "expr", "operationStat", 
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
	public String getGrammarFileName() { return "myParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public myParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartStatContext extends ParserRuleContext {
		public MainfunctionContext mainfunction() {
			return getRuleContext(MainfunctionContext.class,0);
		}
		public List<TerminalNode> INCLUDE() { return getTokens(myParserParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(myParserParser.INCLUDE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myParserParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myParserParser.ID, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				match(INCLUDE);
				setState(45);
				match(OP_LT);
				setState(46);
				match(ID);
				setState(47);
				match(T__0);
				setState(48);
				match(OP_GT);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(49);
					match(WS);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					function();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(65);
			mainfunction();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(66);
				function();
				}
				}
				setState(71);
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
		public TerminalNode RPAREN() { return getToken(myParserParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myParserParser.LBRACE, 0); }
		public TerminalNode RETURN_() { return getToken(myParserParser.RETURN_, 0); }
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public TerminalNode RBRACE() { return getToken(myParserParser.RBRACE, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
		}
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public TerminalNode DEC_NUM() { return getToken(myParserParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myParserParser.FLOAT_NUM, 0); }
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
			setState(72);
			type();
			setState(73);
			match(T__1);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(74);
				params();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(RPAREN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(81);
				match(WS);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(LBRACE);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(WS);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
				{
				{
				setState(94);
				stats();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(100);
				match(WS);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(RETURN_);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEC_NUM || _la==FLOAT_NUM) {
				{
				setState(107);
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

			setState(110);
			match(SEMICOL);
			setState(111);
			match(RBRACE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(112);
				match(WS);
				}
				}
				setState(117);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode SHORT_TYPE() { return getToken(myParserParser.SHORT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(myParserParser.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(myParserParser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(myParserParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(myParserParser.DOUBLE_TYPE, 0); }
		public TerminalNode LONGLONG_TYPE() { return getToken(myParserParser.LONGLONG_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(myParserParser.CHAR_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(myParserParser.VOID_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StatsContext extends ParserRuleContext {
		public AssignmentStatContext assignmentStat() {
			return getRuleContext(AssignmentStatContext.class,0);
		}
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				assignmentStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				whileStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				ifelseStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				forStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				declareStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				procedStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				exprList();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				breakStat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(128);
				continueStat();
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

	public static class AssignmentStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(myParserParser.ID, 0); }
		public TerminalNode OP_ASS() { return getToken(myParserParser.OP_ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
		}
		public TerminalNode DEC_NUM() { return getToken(myParserParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myParserParser.FLOAT_NUM, 0); }
		public AssignmentStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStat; }
	}

	public final AssignmentStatContext assignmentStat() throws RecognitionException {
		AssignmentStatContext _localctx = new AssignmentStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignmentStat);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ID);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(132);
					match(WS);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(OP_ASS);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(139);
					match(WS);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				expr();
				setState(146);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ID);
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
				match(OP_ASS);
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
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==DEC_NUM || _la==FLOAT_NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
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

	public static class WhileStatContext extends ParserRuleContext {
		public TerminalNode WHILE_() { return getToken(myParserParser.WHILE_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myParserParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myParserParser.RBRACE, 0); }
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
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
		enterRule(_localctx, 10, RULE_whileStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WHILE_);
			setState(167);
			expr();
			setState(168);
			match(RPAREN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(169);
				match(WS);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			match(LBRACE);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(176);
				match(WS);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				stats();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0) );
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(187);
				match(WS);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(RBRACE);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					match(WS);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public TerminalNode IF_() { return getToken(myParserParser.IF_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(myParserParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(myParserParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(myParserParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(myParserParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(myParserParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(myParserParser.RBRACE, i);
		}
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
		}
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public TerminalNode ELSE_() { return getToken(myParserParser.ELSE_, 0); }
		public IfelseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseStat; }
	}

	public final IfelseStatContext ifelseStat() throws RecognitionException {
		IfelseStatContext _localctx = new IfelseStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifelseStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IF_);
			setState(201);
			expr();
			setState(202);
			match(RPAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(203);
				match(WS);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(LBRACE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(210);
				match(WS);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				stats();
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0) );
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(221);
				match(WS);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(RBRACE);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(WS);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(234);
				match(T__2);
				setState(235);
				expr();
				setState(236);
				match(RPAREN);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(237);
					match(WS);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(LBRACE);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(244);
					match(WS);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					stats();
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0) );
				setState(255);
				match(RBRACE);
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(256);
						match(WS);
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(267);
				match(ELSE_);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(268);
					match(WS);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(LBRACE);
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(275);
					stats();
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0) );
				setState(280);
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
		public TerminalNode FOR_() { return getToken(myParserParser.FOR_, 0); }
		public List<TerminalNode> SEMICOL() { return getTokens(myParserParser.SEMICOL); }
		public TerminalNode SEMICOL(int i) {
			return getToken(myParserParser.SEMICOL, i);
		}
		public TerminalNode RPAREN() { return getToken(myParserParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myParserParser.RBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
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
		enterRule(_localctx, 14, RULE_forStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(FOR_);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(285);
				expr();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(SEMICOL);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(292);
				expr();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(SEMICOL);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(299);
				expr();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(RPAREN);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(306);
				match(WS);
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(LBRACE);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(313);
				match(WS);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(319);
				stats();
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0) );
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(324);
				match(WS);
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
			match(RBRACE);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					match(WS);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public TerminalNode FUNCTION_CALL() { return getToken(myParserParser.FUNCTION_CALL, 0); }
		public TerminalNode RPAREN() { return getToken(myParserParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myParserParser.LBRACE, 0); }
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public TerminalNode RBRACE() { return getToken(myParserParser.RBRACE, 0); }
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
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
		}
		public TerminalNode DEC_NUM() { return getToken(myParserParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myParserParser.FLOAT_NUM, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				type();
				setState(338);
				match(FUNCTION_CALL);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(339);
					params();
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				match(RPAREN);
				setState(346);
				match(LBRACE);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
					{
					{
					setState(347);
					stats();
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(353);
					match(WS);
					}
					}
					setState(358);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(359);
				match(RETURN_);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEC_NUM || _la==FLOAT_NUM) {
					{
					setState(360);
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

				setState(363);
				match(SEMICOL);
				setState(364);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				type();
				setState(367);
				match(FUNCTION_CALL);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(368);
					params();
					}
					}
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(374);
				match(RPAREN);
				setState(375);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myParserParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public AssignmentStatContext assignmentStat() {
			return getRuleContext(AssignmentStatContext.class,0);
		}
		public DeclareStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStat; }
	}

	public final DeclareStatContext declareStat() throws RecognitionException {
		DeclareStatContext _localctx = new DeclareStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declareStat);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				type();
				setState(380);
				match(ID);
				setState(381);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				type();
				setState(384);
				exprList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				type();
				setState(387);
				assignmentStat();
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

	public static class ProcedStatContext extends ParserRuleContext {
		public TerminalNode FUNCTION_CALL() { return getToken(myParserParser.FUNCTION_CALL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myParserParser.RPAREN, 0); }
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public ProcedStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedStat; }
	}

	public final ProcedStatContext procedStat() throws RecognitionException {
		ProcedStatContext _localctx = new ProcedStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_procedStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(FUNCTION_CALL);
			setState(392);
			arguments();
			setState(393);
			match(RPAREN);
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

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParserParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			expr();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(397);
				match(COMMA);
				setState(398);
				expr();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
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
		public TerminalNode BREAK_() { return getToken(myParserParser.BREAK_, 0); }
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public BreakStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStat; }
	}

	public final BreakStatContext breakStat() throws RecognitionException {
		BreakStatContext _localctx = new BreakStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_breakStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(BREAK_);
			setState(407);
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
		public TerminalNode CONTINUE_() { return getToken(myParserParser.CONTINUE_, 0); }
		public TerminalNode SEMICOL() { return getToken(myParserParser.SEMICOL, 0); }
		public ContinueStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStat; }
	}

	public final ContinueStatContext continueStat() throws RecognitionException {
		ContinueStatContext _localctx = new ContinueStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continueStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(CONTINUE_);
			setState(410);
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
		public List<TerminalNode> COMMA() { return getTokens(myParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParserParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			expr();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(413);
				match(COMMA);
				setState(414);
				expr();
				}
				}
				setState(419);
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
		public List<TerminalNode> COMMA() { return getTokens(myParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myParserParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			param();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(421);
				match(COMMA);
				setState(422);
				param();
				}
				}
				setState(427);
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
		public TerminalNode ID() { return getToken(myParserParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_param);
		try {
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				type();
				setState(429);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
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
		public List<OperationStatContext> operationStat() {
			return getRuleContexts(OperationStatContext.class);
		}
		public OperationStatContext operationStat(int i) {
			return getRuleContext(OperationStatContext.class,i);
		}
		public List<TerminalNode> OP_LAND() { return getTokens(myParserParser.OP_LAND); }
		public TerminalNode OP_LAND(int i) {
			return getToken(myParserParser.OP_LAND, i);
		}
		public List<TerminalNode> OP_LOR() { return getTokens(myParserParser.OP_LOR); }
		public TerminalNode OP_LOR(int i) {
			return getToken(myParserParser.OP_LOR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			operationStat();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LAND || _la==OP_LOR) {
				{
				{
				setState(435);
				_la = _input.LA(1);
				if ( !(_la==OP_LAND || _la==OP_LOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(436);
				operationStat();
				}
				}
				setState(441);
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

	public static class OperationStatContext extends ParserRuleContext {
		public List<AddContext> add() {
			return getRuleContexts(AddContext.class);
		}
		public AddContext add(int i) {
			return getRuleContext(AddContext.class,i);
		}
		public List<TerminalNode> OP_EQ() { return getTokens(myParserParser.OP_EQ); }
		public TerminalNode OP_EQ(int i) {
			return getToken(myParserParser.OP_EQ, i);
		}
		public List<TerminalNode> OP_LE() { return getTokens(myParserParser.OP_LE); }
		public TerminalNode OP_LE(int i) {
			return getToken(myParserParser.OP_LE, i);
		}
		public List<TerminalNode> OP_GE() { return getTokens(myParserParser.OP_GE); }
		public TerminalNode OP_GE(int i) {
			return getToken(myParserParser.OP_GE, i);
		}
		public List<TerminalNode> OP_NE() { return getTokens(myParserParser.OP_NE); }
		public TerminalNode OP_NE(int i) {
			return getToken(myParserParser.OP_NE, i);
		}
		public List<TerminalNode> OP_GT() { return getTokens(myParserParser.OP_GT); }
		public TerminalNode OP_GT(int i) {
			return getToken(myParserParser.OP_GT, i);
		}
		public List<TerminalNode> OP_LT() { return getTokens(myParserParser.OP_LT); }
		public TerminalNode OP_LT(int i) {
			return getToken(myParserParser.OP_LT, i);
		}
		public List<TerminalNode> OP_ASS() { return getTokens(myParserParser.OP_ASS); }
		public TerminalNode OP_ASS(int i) {
			return getToken(myParserParser.OP_ASS, i);
		}
		public List<TerminalNode> OP_ADDAS() { return getTokens(myParserParser.OP_ADDAS); }
		public TerminalNode OP_ADDAS(int i) {
			return getToken(myParserParser.OP_ADDAS, i);
		}
		public List<TerminalNode> OP_SUBAS() { return getTokens(myParserParser.OP_SUBAS); }
		public TerminalNode OP_SUBAS(int i) {
			return getToken(myParserParser.OP_SUBAS, i);
		}
		public List<TerminalNode> OP_MULAS() { return getTokens(myParserParser.OP_MULAS); }
		public TerminalNode OP_MULAS(int i) {
			return getToken(myParserParser.OP_MULAS, i);
		}
		public List<TerminalNode> OP_DIVAS() { return getTokens(myParserParser.OP_DIVAS); }
		public TerminalNode OP_DIVAS(int i) {
			return getToken(myParserParser.OP_DIVAS, i);
		}
		public List<TerminalNode> OP_XORAS() { return getTokens(myParserParser.OP_XORAS); }
		public TerminalNode OP_XORAS(int i) {
			return getToken(myParserParser.OP_XORAS, i);
		}
		public List<TerminalNode> OP_MODAS() { return getTokens(myParserParser.OP_MODAS); }
		public TerminalNode OP_MODAS(int i) {
			return getToken(myParserParser.OP_MODAS, i);
		}
		public List<TerminalNode> OP_LSAS() { return getTokens(myParserParser.OP_LSAS); }
		public TerminalNode OP_LSAS(int i) {
			return getToken(myParserParser.OP_LSAS, i);
		}
		public List<TerminalNode> OP_RSAS() { return getTokens(myParserParser.OP_RSAS); }
		public TerminalNode OP_RSAS(int i) {
			return getToken(myParserParser.OP_RSAS, i);
		}
		public OperationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationStat; }
	}

	public final OperationStatContext operationStat() throws RecognitionException {
		OperationStatContext _localctx = new OperationStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operationStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			add();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ASS))) != 0)) {
				{
				{
				setState(443);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ASS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(444);
				add();
				}
				}
				setState(449);
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

	public static class AddContext extends ParserRuleContext {
		public List<MultiplyContext> multiply() {
			return getRuleContexts(MultiplyContext.class);
		}
		public MultiplyContext multiply(int i) {
			return getRuleContext(MultiplyContext.class,i);
		}
		public List<TerminalNode> OP_ADD() { return getTokens(myParserParser.OP_ADD); }
		public TerminalNode OP_ADD(int i) {
			return getToken(myParserParser.OP_ADD, i);
		}
		public List<TerminalNode> OP_SUB() { return getTokens(myParserParser.OP_SUB); }
		public TerminalNode OP_SUB(int i) {
			return getToken(myParserParser.OP_SUB, i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			multiply();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD || _la==OP_SUB) {
				{
				{
				setState(451);
				_la = _input.LA(1);
				if ( !(_la==OP_ADD || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(452);
				multiply();
				}
				}
				setState(457);
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

	public static class MultiplyContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> OP_MUL() { return getTokens(myParserParser.OP_MUL); }
		public TerminalNode OP_MUL(int i) {
			return getToken(myParserParser.OP_MUL, i);
		}
		public List<TerminalNode> OP_DIV() { return getTokens(myParserParser.OP_DIV); }
		public TerminalNode OP_DIV(int i) {
			return getToken(myParserParser.OP_DIV, i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			atom();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(459);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(460);
				atom();
				}
				}
				setState(465);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode DEC_NUM() { return getToken(myParserParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myParserParser.FLOAT_NUM, 0); }
		public TerminalNode ID() { return getToken(myParserParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(myParserParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myParserParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		try {
			setState(473);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(DEC_NUM);
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				match(FLOAT_NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(LPAREN);
				setState(470);
				expr();
				setState(471);
				match(RPAREN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u01de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\65\n\2\f\2\16\28\13\2\6\2:\n\2\r\2\16\2;\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\7\3N\n\3\f\3\16\3"+
		"Q\13\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13"+
		"\3\3\3\7\3b\n\3\f\3\16\3e\13\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\5\3"+
		"o\n\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\7\6\u0088\n\6\f\6\16\6\u008b\13"+
		"\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099"+
		"\n\6\f\6\16\6\u009c\13\6\3\6\3\6\7\6\u00a0\n\6\f\6\16\6\u00a3\13\6\3\6"+
		"\3\6\5\6\u00a7\n\6\3\7\3\7\3\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3"+
		"\7\3\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\7\6\7\u00ba\n\7\r\7\16\7\u00bb"+
		"\3\7\7\7\u00bf\n\7\f\7\16\7\u00c2\13\7\3\7\3\7\7\7\u00c6\n\7\f\7\16\7"+
		"\u00c9\13\7\3\b\3\b\3\b\3\b\7\b\u00cf\n\b\f\b\16\b\u00d2\13\b\3\b\3\b"+
		"\7\b\u00d6\n\b\f\b\16\b\u00d9\13\b\3\b\6\b\u00dc\n\b\r\b\16\b\u00dd\3"+
		"\b\7\b\u00e1\n\b\f\b\16\b\u00e4\13\b\3\b\3\b\7\b\u00e8\n\b\f\b\16\b\u00eb"+
		"\13\b\3\b\3\b\3\b\3\b\7\b\u00f1\n\b\f\b\16\b\u00f4\13\b\3\b\3\b\7\b\u00f8"+
		"\n\b\f\b\16\b\u00fb\13\b\3\b\6\b\u00fe\n\b\r\b\16\b\u00ff\3\b\3\b\7\b"+
		"\u0104\n\b\f\b\16\b\u0107\13\b\7\b\u0109\n\b\f\b\16\b\u010c\13\b\3\b\3"+
		"\b\7\b\u0110\n\b\f\b\16\b\u0113\13\b\3\b\3\b\6\b\u0117\n\b\r\b\16\b\u0118"+
		"\3\b\3\b\5\b\u011d\n\b\3\t\3\t\7\t\u0121\n\t\f\t\16\t\u0124\13\t\3\t\3"+
		"\t\7\t\u0128\n\t\f\t\16\t\u012b\13\t\3\t\3\t\7\t\u012f\n\t\f\t\16\t\u0132"+
		"\13\t\3\t\3\t\7\t\u0136\n\t\f\t\16\t\u0139\13\t\3\t\3\t\7\t\u013d\n\t"+
		"\f\t\16\t\u0140\13\t\3\t\6\t\u0143\n\t\r\t\16\t\u0144\3\t\7\t\u0148\n"+
		"\t\f\t\16\t\u014b\13\t\3\t\3\t\7\t\u014f\n\t\f\t\16\t\u0152\13\t\3\n\3"+
		"\n\3\n\7\n\u0157\n\n\f\n\16\n\u015a\13\n\3\n\3\n\3\n\7\n\u015f\n\n\f\n"+
		"\16\n\u0162\13\n\3\n\7\n\u0165\n\n\f\n\16\n\u0168\13\n\3\n\3\n\5\n\u016c"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0174\n\n\f\n\16\n\u0177\13\n\3\n\3\n"+
		"\3\n\5\n\u017c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0188\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u0192\n\r\f\r\16\r"+
		"\u0195\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\7\20"+
		"\u01a2\n\20\f\20\16\20\u01a5\13\20\3\21\3\21\3\21\7\21\u01aa\n\21\f\21"+
		"\16\21\u01ad\13\21\3\22\3\22\3\22\3\22\5\22\u01b3\n\22\3\23\3\23\3\23"+
		"\7\23\u01b8\n\23\f\23\16\23\u01bb\13\23\3\24\3\24\3\24\7\24\u01c0\n\24"+
		"\f\24\16\24\u01c3\13\24\3\25\3\25\3\25\7\25\u01c8\n\25\f\25\16\25\u01cb"+
		"\13\25\3\26\3\26\3\26\7\26\u01d0\n\26\f\26\16\26\u01d3\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01dc\n\27\3\27\2\2\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\b\4\2\64\64\66\66\3\2\6\r\3\2()\4\2\27"+
		"$\63\63\3\2/\60\3\2\61\62\2\u020c\29\3\2\2\2\4J\3\2\2\2\6x\3\2\2\2\b\u0083"+
		"\3\2\2\2\n\u00a6\3\2\2\2\f\u00a8\3\2\2\2\16\u00ca\3\2\2\2\20\u011e\3\2"+
		"\2\2\22\u017b\3\2\2\2\24\u0187\3\2\2\2\26\u0189\3\2\2\2\30\u018e\3\2\2"+
		"\2\32\u0198\3\2\2\2\34\u019b\3\2\2\2\36\u019e\3\2\2\2 \u01a6\3\2\2\2\""+
		"\u01b2\3\2\2\2$\u01b4\3\2\2\2&\u01bc\3\2\2\2(\u01c4\3\2\2\2*\u01cc\3\2"+
		"\2\2,\u01db\3\2\2\2./\7\25\2\2/\60\7\34\2\2\60\61\7\65\2\2\61\62\7\3\2"+
		"\2\62\66\7\33\2\2\63\65\7G\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\67:\3\2\2\28\66\3\2\2\29.\3\2\2\2:;\3\2\2\2;9\3\2\2\2;"+
		"<\3\2\2\2<@\3\2\2\2=?\5\22\n\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"AC\3\2\2\2B@\3\2\2\2CG\5\4\3\2DF\5\22\n\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JK\5\6\4\2KO\7\4\2\2LN\5 \21\2ML\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RV\78\2\2SU\7G\2"+
		"\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2Y]\7;\2"+
		"\2Z\\\7G\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^c\3\2\2\2_]\3\2"+
		"\2\2`b\5\b\5\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2di\3\2\2\2ec\3\2"+
		"\2\2fh\7G\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2"+
		"\2\2ln\7\22\2\2mo\t\2\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7?\2\2qu\7<"+
		"\2\2rt\7G\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\5\3\2\2\2wu\3\2"+
		"\2\2xy\t\3\2\2y\7\3\2\2\2z\u0084\5\n\6\2{\u0084\5\f\7\2|\u0084\5\16\b"+
		"\2}\u0084\5\20\t\2~\u0084\5\24\13\2\177\u0084\5\26\f\2\u0080\u0084\5\30"+
		"\r\2\u0081\u0084\5\32\16\2\u0082\u0084\5\34\17\2\u0083z\3\2\2\2\u0083"+
		"{\3\2\2\2\u0083|\3\2\2\2\u0083}\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2"+
		"\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\t"+
		"\3\2\2\2\u0085\u0089\7\65\2\2\u0086\u0088\7G\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u0090\7\63\2\2\u008d\u008f\7G\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\5$\23\2\u0094"+
		"\u0095\7?\2\2\u0095\u00a7\3\2\2\2\u0096\u009a\7\65\2\2\u0097\u0099\7G"+
		"\2\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\7\63"+
		"\2\2\u009e\u00a0\7G\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\t\2\2\2\u00a5\u00a7\7?\2\2\u00a6\u0085\3\2\2\2\u00a6"+
		"\u0096\3\2\2\2\u00a7\13\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\5$\23"+
		"\2\u00aa\u00ae\78\2\2\u00ab\u00ad\7G\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b5\7;\2\2\u00b2\u00b4\7G\2\2\u00b3\u00b2\3\2\2"+
		"\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\3\2"+
		"\2\2\u00bd\u00bf\7G\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c3\u00c7\7<\2\2\u00c4\u00c6\7G\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\r\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\5$\23\2\u00cc\u00d0\7"+
		"8\2\2\u00cd\u00cf\7G\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d3\u00d7\7;\2\2\u00d4\u00d6\7G\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00dc\5\b\5\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2\3\2\2\2\u00df"+
		"\u00e1\7G\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e9\7<\2\2\u00e6\u00e8\7G\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u010a\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\5$\23\2\u00ee\u00f2\78\2\2\u00ef"+
		"\u00f1\7G\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00f9\7;\2\2\u00f6\u00f8\7G\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2"+
		"\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fe\5\b\5\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0105\7<"+
		"\2\2\u0102\u0104\7G\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u00ec\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u011c\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0111\7\21"+
		"\2\2\u010e\u0110\7G\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0116\7;\2\2\u0115\u0117\5\b\5\2\u0116\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011b\7<\2\2\u011b\u011d\3\2\2\2\u011c\u010d\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\17\3\2\2\2\u011e\u0122\7\17\2\2\u011f\u0121\5$\23"+
		"\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0129\7?\2\2\u0126"+
		"\u0128\5$\23\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u0130\7?\2\2\u012d\u012f\5$\23\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0137\78\2\2\u0134\u0136\7G\2\2\u0135\u0134\3\2\2"+
		"\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013e\7;\2\2\u013b\u013d\7G\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0143\5\b\5\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2"+
		"\2\2\u0145\u0149\3\2\2\2\u0146\u0148\7G\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014c\u0150\7<\2\2\u014d\u014f\7G\2\2\u014e\u014d"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\21\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\5\6\4\2\u0154\u0158\7A\2\2"+
		"\u0155\u0157\5 \21\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\78\2\2\u015c\u0160\7;\2\2\u015d\u015f\5\b\5\2\u015e\u015d\3\2\2"+
		"\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0166"+
		"\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0165\7G\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0169\u016b\7\22\2\2\u016a\u016c\t\2\2\2\u016b"+
		"\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7?"+
		"\2\2\u016e\u016f\7<\2\2\u016f\u017c\3\2\2\2\u0170\u0171\5\6\4\2\u0171"+
		"\u0175\7A\2\2\u0172\u0174\5 \21\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u0179\78\2\2\u0179\u017a\7?\2\2\u017a\u017c\3\2\2"+
		"\2\u017b\u0153\3\2\2\2\u017b\u0170\3\2\2\2\u017c\23\3\2\2\2\u017d\u017e"+
		"\5\6\4\2\u017e\u017f\7\65\2\2\u017f\u0180\7?\2\2\u0180\u0188\3\2\2\2\u0181"+
		"\u0182\5\6\4\2\u0182\u0183\5\30\r\2\u0183\u0188\3\2\2\2\u0184\u0185\5"+
		"\6\4\2\u0185\u0186\5\n\6\2\u0186\u0188\3\2\2\2\u0187\u017d\3\2\2\2\u0187"+
		"\u0181\3\2\2\2\u0187\u0184\3\2\2\2\u0188\25\3\2\2\2\u0189\u018a\7A\2\2"+
		"\u018a\u018b\5\36\20\2\u018b\u018c\78\2\2\u018c\u018d\7?\2\2\u018d\27"+
		"\3\2\2\2\u018e\u0193\5$\23\2\u018f\u0190\7>\2\2\u0190\u0192\5$\23\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7?\2\2\u0197"+
		"\31\3\2\2\2\u0198\u0199\7\23\2\2\u0199\u019a\7?\2\2\u019a\33\3\2\2\2\u019b"+
		"\u019c\7\24\2\2\u019c\u019d\7?\2\2\u019d\35\3\2\2\2\u019e\u01a3\5$\23"+
		"\2\u019f\u01a0\7>\2\2\u01a0\u01a2\5$\23\2\u01a1\u019f\3\2\2\2\u01a2\u01a5"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\37\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a6\u01ab\5\"\22\2\u01a7\u01a8\7>\2\2\u01a8\u01aa\5\""+
		"\22\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac!\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\5\6\4\2"+
		"\u01af\u01b0\7\65\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01b3\5\6\4\2\u01b2\u01ae"+
		"\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3#\3\2\2\2\u01b4\u01b9\5&\24\2\u01b5"+
		"\u01b6\t\4\2\2\u01b6\u01b8\5&\24\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba%\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01c1\5(\25\2\u01bd\u01be\t\5\2\2\u01be\u01c0\5(\25\2\u01bf"+
		"\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\'\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c9\5*\26\2\u01c5\u01c6"+
		"\t\6\2\2\u01c6\u01c8\5*\26\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca)\3\2\2\2\u01cb\u01c9\3\2\2\2"+
		"\u01cc\u01d1\5,\27\2\u01cd\u01ce\t\7\2\2\u01ce\u01d0\5,\27\2\u01cf\u01cd"+
		"\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"+\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01dc\7\64\2\2\u01d5\u01dc\7\66\2"+
		"\2\u01d6\u01dc\7\65\2\2\u01d7\u01d8\7\67\2\2\u01d8\u01d9\5$\23\2\u01d9"+
		"\u01da\78\2\2\u01da\u01dc\3\2\2\2\u01db\u01d4\3\2\2\2\u01db\u01d5\3\2"+
		"\2\2\u01db\u01d6\3\2\2\2\u01db\u01d7\3\2\2\2\u01dc-\3\2\2\2=\66;@GOV]"+
		"cinu\u0083\u0089\u0090\u009a\u00a1\u00a6\u00ae\u00b5\u00bb\u00c0\u00c7"+
		"\u00d0\u00d7\u00dd\u00e2\u00e9\u00f2\u00f9\u00ff\u0105\u010a\u0111\u0118"+
		"\u011c\u0122\u0129\u0130\u0137\u013e\u0144\u0149\u0150\u0158\u0160\u0166"+
		"\u016b\u0175\u017b\u0187\u0193\u01a3\u01ab\u01b2\u01b9\u01c1\u01c9\u01d1"+
		"\u01db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}