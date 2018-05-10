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
		FOR_=13, IF_=14, ELSE_=15, RETURN_=16, BREAK_=17, CONTINUE=18, INCLUDE=19, 
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
		RULE_arguments = 12, RULE_params = 13, RULE_param = 14, RULE_expr = 15, 
		RULE_operationStat = 16, RULE_add = 17, RULE_multiply = 18, RULE_atom = 19;
	public static final String[] ruleNames = {
		"startStat", "mainfunction", "type", "stats", "assignmentStat", "whileStat", 
		"ifelseStat", "forStat", "function", "declareStat", "procedStat", "exprList", 
		"arguments", "params", "param", "expr", "operationStat", "add", "multiply", 
		"atom"
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
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(INCLUDE);
				setState(41);
				match(OP_LT);
				setState(42);
				match(ID);
				setState(43);
				match(T__0);
				setState(44);
				match(OP_GT);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(45);
					match(WS);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INCLUDE );
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					function();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(61);
			mainfunction();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(62);
				function();
				}
				}
				setState(67);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type();
			setState(69);
			match(T__1);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(70);
				params();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(RPAREN);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(77);
				match(WS);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(LBRACE);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(84);
				match(WS);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
				{
				{
				setState(90);
				stats();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(RETURN_);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEC_NUM || _la==FLOAT_NUM) {
				{
				setState(97);
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

			setState(100);
			match(SEMICOL);
			setState(101);
			match(RBRACE);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(102);
				match(WS);
				}
				}
				setState(107);
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
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
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
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stats);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				assignmentStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				whileStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				ifelseStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				forStat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				declareStat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				procedStat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				exprList();
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(ID);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(120);
					match(WS);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(OP_ASS);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(127);
					match(WS);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				expr();
				setState(134);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(ID);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(137);
					match(WS);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(OP_ASS);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(144);
					match(WS);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==DEC_NUM || _la==FLOAT_NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(151);
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
			setState(154);
			match(WHILE_);
			setState(155);
			expr();
			setState(156);
			match(RPAREN);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(157);
				match(WS);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			match(LBRACE);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					match(WS);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
				{
				{
				setState(170);
				stats();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(182);
			match(RBRACE);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					match(WS);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public List<TerminalNode> LPAREN() { return getTokens(myParserParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(myParserParser.LPAREN, i);
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
			setState(189);
			match(IF_);
			setState(190);
			expr();
			setState(191);
			match(RPAREN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(192);
				match(WS);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(LBRACE);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(WS);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
				{
				{
				setState(205);
				stats();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(211);
				match(WS);
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217);
			match(RBRACE);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					match(WS);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(224);
				match(T__2);
				setState(225);
				match(LPAREN);
				setState(226);
				expr();
				setState(227);
				match(RPAREN);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(228);
					match(WS);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(LBRACE);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(235);
					match(WS);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
					{
					{
					setState(241);
					stats();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(RBRACE);
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(248);
						match(WS);
						}
						} 
					}
					setState(253);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_) {
				{
				setState(259);
				match(ELSE_);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(260);
					match(WS);
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				match(LBRACE);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(267);
					match(WS);
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
					{
					{
					setState(273);
					stats();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(279);
				match(RBRACE);
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(280);
						match(WS);
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
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
		public List<TerminalNode> WS() { return getTokens(myParserParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(myParserParser.WS, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(288);
			match(FOR_);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					match(WS);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(295);
				expr();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(301);
				match(WS);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(SEMICOL);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					match(WS);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(314);
				expr();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(320);
				match(WS);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			match(SEMICOL);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					match(WS);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(333);
				expr();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(339);
				match(WS);
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(RPAREN);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(346);
				match(WS);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(LBRACE);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					match(WS);
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
				{
				{
				setState(359);
				stats();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(365);
				match(WS);
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
			match(RBRACE);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					match(WS);
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				type();
				setState(379);
				match(FUNCTION_CALL);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(380);
					params();
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				match(RPAREN);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(387);
					match(WS);
					}
					}
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(393);
				match(LBRACE);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(394);
					match(WS);
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << DEC_NUM) | (1L << ID) | (1L << FLOAT_NUM) | (1L << LPAREN) | (1L << FUNCTION_CALL))) != 0)) {
					{
					{
					setState(400);
					stats();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(RETURN_);
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEC_NUM || _la==FLOAT_NUM) {
					{
					setState(407);
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

				setState(410);
				match(SEMICOL);
				setState(411);
				match(RBRACE);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(412);
					match(WS);
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				type();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(419);
					match(WS);
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(FUNCTION_CALL);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(426);
					params();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				match(RPAREN);
				setState(433);
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
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				type();
				setState(438);
				match(ID);
				setState(439);
				match(SEMICOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				type();
				setState(442);
				exprList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				type();
				setState(445);
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
			setState(449);
			match(FUNCTION_CALL);
			setState(450);
			arguments();
			setState(451);
			match(RPAREN);
			setState(452);
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
			setState(454);
			expr();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(455);
				match(COMMA);
				setState(456);
				expr();
				}
				}
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(462);
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
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			expr();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(465);
				match(COMMA);
				setState(466);
				expr();
				}
				}
				setState(471);
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
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			param();
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(473);
				match(COMMA);
				setState(474);
				param();
				}
				}
				setState(479);
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
		enterRule(_localctx, 28, RULE_param);
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				type();
				setState(481);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
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
		enterRule(_localctx, 30, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			operationStat();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LAND || _la==OP_LOR) {
				{
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==OP_LAND || _la==OP_LOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(488);
				operationStat();
				}
				}
				setState(493);
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
		public List<TerminalNode> OP_ADDADD() { return getTokens(myParserParser.OP_ADDADD); }
		public TerminalNode OP_ADDADD(int i) {
			return getToken(myParserParser.OP_ADDADD, i);
		}
		public List<TerminalNode> OP_SUBSUB() { return getTokens(myParserParser.OP_SUBSUB); }
		public TerminalNode OP_SUBSUB(int i) {
			return getToken(myParserParser.OP_SUBSUB, i);
		}
		public OperationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationStat; }
	}

	public final OperationStatContext operationStat() throws RecognitionException {
		OperationStatContext _localctx = new OperationStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operationStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			add();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ADDADD) | (1L << OP_SUBSUB) | (1L << OP_ASS))) != 0)) {
				{
				{
				setState(495);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ADDADD) | (1L << OP_SUBSUB) | (1L << OP_ASS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(496);
				add();
				}
				}
				setState(501);
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
		enterRule(_localctx, 34, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			multiply();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD || _la==OP_SUB) {
				{
				{
				setState(503);
				_la = _input.LA(1);
				if ( !(_la==OP_ADD || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(504);
				multiply();
				}
				}
				setState(509);
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
		enterRule(_localctx, 36, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			atom();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(511);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(512);
				atom();
				}
				}
				setState(517);
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
		enterRule(_localctx, 38, RULE_atom);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				match(DEC_NUM);
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(FLOAT_NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				match(LPAREN);
				setState(522);
				expr();
				setState(523);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u0212\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\6\2\66\n\2\r\2\16\2\67\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\3\3"+
		"\7\3Q\n\3\f\3\16\3T\13\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\7\3^\n\3"+
		"\f\3\16\3a\13\3\3\3\3\3\5\3e\n\3\3\3\3\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5x\n\5\3\6\3\6\7\6|\n\6\f\6\16\6"+
		"\177\13\6\3\6\3\6\7\6\u0083\n\6\f\6\16\6\u0086\13\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097"+
		"\13\6\3\6\3\6\5\6\u009b\n\6\3\7\3\7\3\7\3\7\7\7\u00a1\n\7\f\7\16\7\u00a4"+
		"\13\7\3\7\3\7\7\7\u00a8\n\7\f\7\16\7\u00ab\13\7\3\7\7\7\u00ae\n\7\f\7"+
		"\16\7\u00b1\13\7\3\7\7\7\u00b4\n\7\f\7\16\7\u00b7\13\7\3\7\3\7\7\7\u00bb"+
		"\n\7\f\7\16\7\u00be\13\7\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f\b\16\b\u00c7"+
		"\13\b\3\b\3\b\7\b\u00cb\n\b\f\b\16\b\u00ce\13\b\3\b\7\b\u00d1\n\b\f\b"+
		"\16\b\u00d4\13\b\3\b\7\b\u00d7\n\b\f\b\16\b\u00da\13\b\3\b\3\b\7\b\u00de"+
		"\n\b\f\b\16\b\u00e1\13\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e8\n\b\f\b\16\b\u00eb"+
		"\13\b\3\b\3\b\7\b\u00ef\n\b\f\b\16\b\u00f2\13\b\3\b\7\b\u00f5\n\b\f\b"+
		"\16\b\u00f8\13\b\3\b\3\b\7\b\u00fc\n\b\f\b\16\b\u00ff\13\b\7\b\u0101\n"+
		"\b\f\b\16\b\u0104\13\b\3\b\3\b\7\b\u0108\n\b\f\b\16\b\u010b\13\b\3\b\3"+
		"\b\7\b\u010f\n\b\f\b\16\b\u0112\13\b\3\b\7\b\u0115\n\b\f\b\16\b\u0118"+
		"\13\b\3\b\3\b\7\b\u011c\n\b\f\b\16\b\u011f\13\b\5\b\u0121\n\b\3\t\3\t"+
		"\7\t\u0125\n\t\f\t\16\t\u0128\13\t\3\t\7\t\u012b\n\t\f\t\16\t\u012e\13"+
		"\t\3\t\7\t\u0131\n\t\f\t\16\t\u0134\13\t\3\t\3\t\7\t\u0138\n\t\f\t\16"+
		"\t\u013b\13\t\3\t\7\t\u013e\n\t\f\t\16\t\u0141\13\t\3\t\7\t\u0144\n\t"+
		"\f\t\16\t\u0147\13\t\3\t\3\t\7\t\u014b\n\t\f\t\16\t\u014e\13\t\3\t\7\t"+
		"\u0151\n\t\f\t\16\t\u0154\13\t\3\t\7\t\u0157\n\t\f\t\16\t\u015a\13\t\3"+
		"\t\3\t\7\t\u015e\n\t\f\t\16\t\u0161\13\t\3\t\3\t\7\t\u0165\n\t\f\t\16"+
		"\t\u0168\13\t\3\t\7\t\u016b\n\t\f\t\16\t\u016e\13\t\3\t\7\t\u0171\n\t"+
		"\f\t\16\t\u0174\13\t\3\t\3\t\7\t\u0178\n\t\f\t\16\t\u017b\13\t\3\n\3\n"+
		"\3\n\7\n\u0180\n\n\f\n\16\n\u0183\13\n\3\n\3\n\7\n\u0187\n\n\f\n\16\n"+
		"\u018a\13\n\3\n\3\n\7\n\u018e\n\n\f\n\16\n\u0191\13\n\3\n\7\n\u0194\n"+
		"\n\f\n\16\n\u0197\13\n\3\n\3\n\5\n\u019b\n\n\3\n\3\n\3\n\7\n\u01a0\n\n"+
		"\f\n\16\n\u01a3\13\n\3\n\3\n\7\n\u01a7\n\n\f\n\16\n\u01aa\13\n\3\n\3\n"+
		"\7\n\u01ae\n\n\f\n\16\n\u01b1\13\n\3\n\3\n\3\n\5\n\u01b6\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01c2\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\7\r\u01cc\n\r\f\r\16\r\u01cf\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\7\16\u01d6\n\16\f\16\16\16\u01d9\13\16\3\17\3\17\3\17\7\17\u01de"+
		"\n\17\f\17\16\17\u01e1\13\17\3\20\3\20\3\20\3\20\5\20\u01e7\n\20\3\21"+
		"\3\21\3\21\7\21\u01ec\n\21\f\21\16\21\u01ef\13\21\3\22\3\22\3\22\7\22"+
		"\u01f4\n\22\f\22\16\22\u01f7\13\22\3\23\3\23\3\23\7\23\u01fc\n\23\f\23"+
		"\16\23\u01ff\13\23\3\24\3\24\3\24\7\24\u0204\n\24\f\24\16\24\u0207\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0210\n\25\3\25\2\2\26\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\b\4\2\64\64\66\66\4\2\6\t"+
		"\13\r\3\2()\4\2\27&\63\63\3\2/\60\3\2\61\62\2\u024a\2\65\3\2\2\2\4F\3"+
		"\2\2\2\6n\3\2\2\2\bw\3\2\2\2\n\u009a\3\2\2\2\f\u009c\3\2\2\2\16\u00bf"+
		"\3\2\2\2\20\u0122\3\2\2\2\22\u01b5\3\2\2\2\24\u01c1\3\2\2\2\26\u01c3\3"+
		"\2\2\2\30\u01c8\3\2\2\2\32\u01d2\3\2\2\2\34\u01da\3\2\2\2\36\u01e6\3\2"+
		"\2\2 \u01e8\3\2\2\2\"\u01f0\3\2\2\2$\u01f8\3\2\2\2&\u0200\3\2\2\2(\u020f"+
		"\3\2\2\2*+\7\25\2\2+,\7\34\2\2,-\7\65\2\2-.\7\3\2\2.\62\7\33\2\2/\61\7"+
		"G\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\65*\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8<\3\2\2\29;\5\22\n\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2"+
		"\2><\3\2\2\2?C\5\4\3\2@B\5\22\n\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2D\3\3\2\2\2EC\3\2\2\2FG\5\6\4\2GK\7\4\2\2HJ\5\34\17\2IH\3\2\2\2JM"+
		"\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NR\78\2\2OQ\7G\2\2PO\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UY\7;\2\2VX\7"+
		"G\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2\2\2\\^\5"+
		"\b\5\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bd"+
		"\7\22\2\2ce\t\2\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7?\2\2gk\7<\2\2hj"+
		"\7G\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\5\3\2\2\2mk\3\2\2\2n"+
		"o\t\3\2\2o\7\3\2\2\2px\5\n\6\2qx\5\f\7\2rx\5\16\b\2sx\5\20\t\2tx\5\24"+
		"\13\2ux\5\26\f\2vx\5\30\r\2wp\3\2\2\2wq\3\2\2\2wr\3\2\2\2ws\3\2\2\2wt"+
		"\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\t\3\2\2\2y}\7\65\2\2z|\7G\2\2{z\3\2\2\2"+
		"|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0084"+
		"\7\63\2\2\u0081\u0083\7G\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\5 \21\2\u0088\u0089\7?\2\2\u0089\u009b\3\2\2\2\u008a"+
		"\u008e\7\65\2\2\u008b\u008d\7G\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0095\7\63\2\2\u0092\u0094\7G\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\t\2\2\2\u0099\u009b\7?"+
		"\2\2\u009ay\3\2\2\2\u009a\u008a\3\2\2\2\u009b\13\3\2\2\2\u009c\u009d\7"+
		"\16\2\2\u009d\u009e\5 \21\2\u009e\u00a2\78\2\2\u009f\u00a1\7G\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\7;\2\2\u00a6"+
		"\u00a8\7G\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ae\5\b\5\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b5\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\u00b4\7G\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00bc\7<\2\2\u00b9\u00bb\7G\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\r\3\2\2\2\u00be\u00bc"+
		"\3\2\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\5 \21\2\u00c1\u00c5\78\2\2\u00c2"+
		"\u00c4\7G\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cc\7;\2\2\u00c9\u00cb\7G\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d1\5\b\5\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d8\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d7\7G\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00df\7<\2\2\u00dc\u00de\7G\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u0102\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00e4\7\67\2\2\u00e4\u00e5\5"+
		" \21\2\u00e5\u00e9\78\2\2\u00e6\u00e8\7G\2\2\u00e7\u00e6\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\7;\2\2\u00ed\u00ef\7G\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f6\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f5\5\b\5\2\u00f4\u00f3\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fd\7<\2\2\u00fa\u00fc\7G\2"+
		"\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00e2\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0120\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u0109\7\21\2\2\u0106\u0108\7G\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\7;\2\2\u010d"+
		"\u010f\7G\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0116\3\2\2\2\u0112\u0110\3\2\2\2\u0113"+
		"\u0115\5\b\5\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011d\7<\2\2\u011a\u011c\7G\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u0120\u0105\3\2\2\2\u0120\u0121\3\2\2\2\u0121\17\3\2\2\2\u0122"+
		"\u0126\7\17\2\2\u0123\u0125\7G\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012c\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012b\5 \21\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0132\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0131\7G\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0139\7?\2\2\u0136\u0138\7G\2\2\u0137\u0136\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013f"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013e\5 \21\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0145\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142\u0144\7G\2\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0148\u014c\7?\2\2\u0149\u014b\7G\2\2\u014a\u0149"+
		"\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u0152\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0151\5 \21\2\u0150\u014f\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0158\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0157\7G\2\2\u0156\u0155\3\2"+
		"\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015f\78\2\2\u015c\u015e\7G\2"+
		"\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0166\7;\2\2\u0163"+
		"\u0165\7G\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0167\3\2\2\2\u0167\u016c\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016b\5\b\5\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u0172\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0171\7G\2\2\u0170\u016f\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0179\7<\2\2\u0176\u0178\7G\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2"+
		"\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\21\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017c\u017d\5\6\4\2\u017d\u0181\7A\2\2\u017e\u0180\5\34\17\2"+
		"\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0188\78\2\2\u0185"+
		"\u0187\7G\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b"+
		"\u018f\7;\2\2\u018c\u018e\7G\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2"+
		"\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0195\3\2\2\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0194\5\b\5\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0198\u019a\7\22\2\2\u0199\u019b\t\2\2\2\u019a\u0199\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7?\2\2\u019d\u01a1\7<\2"+
		"\2\u019e\u01a0\7G\2\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01b6\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a8\5\6\4\2\u01a5\u01a7\7G\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01af\7A\2\2\u01ac\u01ae\5\34\17\2\u01ad\u01ac\3"+
		"\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\78\2\2\u01b3\u01b4\7?\2"+
		"\2\u01b4\u01b6\3\2\2\2\u01b5\u017c\3\2\2\2\u01b5\u01a4\3\2\2\2\u01b6\23"+
		"\3\2\2\2\u01b7\u01b8\5\6\4\2\u01b8\u01b9\7\65\2\2\u01b9\u01ba\7?\2\2\u01ba"+
		"\u01c2\3\2\2\2\u01bb\u01bc\5\6\4\2\u01bc\u01bd\5\30\r\2\u01bd\u01c2\3"+
		"\2\2\2\u01be\u01bf\5\6\4\2\u01bf\u01c0\5\n\6\2\u01c0\u01c2\3\2\2\2\u01c1"+
		"\u01b7\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1\u01be\3\2\2\2\u01c2\25\3\2\2"+
		"\2\u01c3\u01c4\7A\2\2\u01c4\u01c5\5\32\16\2\u01c5\u01c6\78\2\2\u01c6\u01c7"+
		"\7?\2\2\u01c7\27\3\2\2\2\u01c8\u01cd\5 \21\2\u01c9\u01ca\7>\2\2\u01ca"+
		"\u01cc\5 \21\2\u01cb\u01c9\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0"+
		"\u01d1\7?\2\2\u01d1\31\3\2\2\2\u01d2\u01d7\5 \21\2\u01d3\u01d4\7>\2\2"+
		"\u01d4\u01d6\5 \21\2\u01d5\u01d3\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\33\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01df\5\36\20\2\u01db\u01dc\7>\2\2\u01dc\u01de\5\36\20\2\u01dd\u01db"+
		"\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"\35\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\5\6\4\2\u01e3\u01e4\7\65\2"+
		"\2\u01e4\u01e7\3\2\2\2\u01e5\u01e7\5\6\4\2\u01e6\u01e2\3\2\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e7\37\3\2\2\2\u01e8\u01ed\5\"\22\2\u01e9\u01ea\t\4\2\2\u01ea"+
		"\u01ec\5\"\22\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3"+
		"\2\2\2\u01ed\u01ee\3\2\2\2\u01ee!\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f5"+
		"\5$\23\2\u01f1\u01f2\t\5\2\2\u01f2\u01f4\5$\23\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6#\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f8\u01fd\5&\24\2\u01f9\u01fa\t\6\2\2\u01fa\u01fc"+
		"\5&\24\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe%\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0205\5(\25\2"+
		"\u0201\u0202\t\7\2\2\u0202\u0204\5(\25\2\u0203\u0201\3\2\2\2\u0204\u0207"+
		"\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\'\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u0210\7\64\2\2\u0209\u0210\7\66\2\2\u020a\u0210\7"+
		"\65\2\2\u020b\u020c\7\67\2\2\u020c\u020d\5 \21\2\u020d\u020e\78\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u0208\3\2\2\2\u020f\u0209\3\2\2\2\u020f\u020a\3\2"+
		"\2\2\u020f\u020b\3\2\2\2\u0210)\3\2\2\2G\62\67<CKRY_dkw}\u0084\u008e\u0095"+
		"\u009a\u00a2\u00a9\u00af\u00b5\u00bc\u00c5\u00cc\u00d2\u00d8\u00df\u00e9"+
		"\u00f0\u00f6\u00fd\u0102\u0109\u0110\u0116\u011d\u0120\u0126\u012c\u0132"+
		"\u0139\u013f\u0145\u014c\u0152\u0158\u015f\u0166\u016c\u0172\u0179\u0181"+
		"\u0188\u018f\u0195\u019a\u01a1\u01a8\u01af\u01b5\u01c1\u01cd\u01d7\u01df"+
		"\u01e6\u01ed\u01f5\u01fd\u0205\u020f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}