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
		RULE_assignmentStat = 4, RULE_whileStat = 5, RULE_ifelseStat = 6, RULE_forStat = 7, 
		RULE_function = 8, RULE_declareStat = 9, RULE_procedStat = 10, RULE_breakStat = 11, 
		RULE_continueStat = 12, RULE_arguments = 13, RULE_params = 14, RULE_param = 15, 
		RULE_expr = 16, RULE_operationStat = 17, RULE_add = 18, RULE_multiply = 19, 
		RULE_atom = 20;
	public static final String[] ruleNames = {
		"startStat", "mainfunction", "type", "stats", "assignmentStat", "whileStat", 
		"ifelseStat", "forStat", "function", "declareStat", "procedStat", "breakStat", 
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


	    boolean TRACEON = false;
	    HashMap<String, Integer> symbolTable = new HashMap<String, Integer>() ;

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << ID) | (1L << FUNCTION_CALL))) != 0)) {
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
			 if (TRACEON) System.out.println("MAIN (){ stats } ") ; 
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
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				assignmentStat();
				}
				break;
			case WHILE_:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				whileStat();
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				ifelseStat();
				}
				break;
			case FOR_:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
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
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				declareStat();
				}
				break;
			case FUNCTION_CALL:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				procedStat();
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

	public static class AssignmentStatContext extends ParserRuleContext {
		public int attr_type;
		public Token a;
		public ExprContext expr;
		public TerminalNode OP_ASS() { return getToken(myCheckerParser.OP_ASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(myCheckerParser.SEMICOL, 0); }
		public TerminalNode ID() { return getToken(myCheckerParser.ID, 0); }
		public TerminalNode DEC_NUM() { return getToken(myCheckerParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myCheckerParser.FLOAT_NUM, 0); }
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((AssignmentStatContext)_localctx).a = match(ID);
				setState(147);
				match(OP_ASS);
				setState(148);
				((AssignmentStatContext)_localctx).expr = expr();
				setState(149);
				match(SEMICOL);

				       if(symbolTable.containsKey((((AssignmentStatContext)_localctx).a!=null?((AssignmentStatContext)_localctx).a.getText():null)))
				       {
				           if(symbolTable.get((((AssignmentStatContext)_localctx).a!=null?((AssignmentStatContext)_localctx).a.getText():null)) != ((AssignmentStatContext)_localctx).expr.attr_type)
				           {
				                System.out.println("Type Error on Line " + ((AssignmentStatContext)_localctx).a.getLine() + " : Type mismatch for the two side of assignmentStat");
				                ((AssignmentStatContext)_localctx).attr_type =  -2;
				           }
				           else
				           {
				                ((AssignmentStatContext)_localctx).attr_type =  symbolTable.get((((AssignmentStatContext)_localctx).a!=null?((AssignmentStatContext)_localctx).a.getText():null));
				           }
				       } 
				       else
				       {
				            System.out.println("Type Error on Line " + ((AssignmentStatContext)_localctx).a.getLine() + " : Unknown Idenifier " + (((AssignmentStatContext)_localctx).a!=null?((AssignmentStatContext)_localctx).a.getText():null));
				            ((AssignmentStatContext)_localctx).attr_type =  -1;
				       }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(ID);
				setState(153);
				match(OP_ASS);
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==DEC_NUM || _la==FLOAT_NUM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
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
		enterRule(_localctx, 10, RULE_whileStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WHILE_);
			setState(159);
			expr();
			setState(160);
			match(RPAREN);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(161);
				match(WS);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(LBRACE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(168);
				match(WS);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				stats();
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << ID) | (1L << FUNCTION_CALL))) != 0) );
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(179);
				match(WS);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
			match(RBRACE);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(186);
					match(WS);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 12, RULE_ifelseStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IF_);
			setState(193);
			expr();
			setState(194);
			match(RPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(195);
				match(WS);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(LBRACE);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(202);
				match(WS);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				stats();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << ID) | (1L << FUNCTION_CALL))) != 0) );
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(213);
				match(WS);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(RBRACE);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					match(WS);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(226);
				match(T__2);
				setState(227);
				expr();
				setState(228);
				match(RPAREN);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(229);
					match(WS);
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(LBRACE);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(236);
					match(WS);
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					stats();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << ID) | (1L << FUNCTION_CALL))) != 0) );
				setState(247);
				match(RBRACE);
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
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
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(267);
					stats();
					}
					}
					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << ID) | (1L << FUNCTION_CALL))) != 0) );
				setState(272);
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
		enterRule(_localctx, 14, RULE_forStat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(FOR_);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (DEC_NUM - 50)) | (1L << (ID - 50)) | (1L << (FLOAT_NUM - 50)) | (1L << (LPAREN - 50)) | (1L << (CHAR - 50)))) != 0)) {
				{
				{
				setState(277);
				expr();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(SEMICOL);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (DEC_NUM - 50)) | (1L << (ID - 50)) | (1L << (FLOAT_NUM - 50)) | (1L << (LPAREN - 50)) | (1L << (CHAR - 50)))) != 0)) {
				{
				{
				setState(284);
				expr();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(SEMICOL);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (DEC_NUM - 50)) | (1L << (ID - 50)) | (1L << (FLOAT_NUM - 50)) | (1L << (LPAREN - 50)) | (1L << (CHAR - 50)))) != 0)) {
				{
				{
				setState(291);
				expr();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(RPAREN);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(298);
				match(WS);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(LBRACE);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(305);
				match(WS);
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				stats();
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << ID) | (1L << FUNCTION_CALL))) != 0) );
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(316);
				match(WS);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
			match(RBRACE);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(323);
					match(WS);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				type();
				setState(330);
				match(FUNCTION_CALL);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(331);
					params();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(RPAREN);
				setState(338);
				match(LBRACE);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE) | (1L << WHILE_) | (1L << FOR_) | (1L << IF_) | (1L << BREAK_) | (1L << CONTINUE_) | (1L << ID) | (1L << FUNCTION_CALL))) != 0)) {
					{
					{
					setState(339);
					stats();
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(345);
					match(WS);
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(RETURN_);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEC_NUM || _la==FLOAT_NUM) {
					{
					setState(352);
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

				setState(355);
				match(SEMICOL);
				setState(356);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				type();
				setState(359);
				match(FUNCTION_CALL);
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHORT_TYPE) | (1L << INT_TYPE) | (1L << LONG_TYPE) | (1L << FLOAT_TYPE) | (1L << DOUBLE_TYPE) | (1L << LONGLONG_TYPE) | (1L << CHAR_TYPE) | (1L << VOID_TYPE))) != 0)) {
					{
					{
					setState(360);
					params();
					}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(RPAREN);
				setState(367);
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
		enterRule(_localctx, 18, RULE_declareStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			((DeclareStatContext)_localctx).type = type();
			setState(372);
			((DeclareStatContext)_localctx).a = match(ID);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_ASS) {
				{
				setState(373);
				match(OP_ASS);
				setState(374);
				((DeclareStatContext)_localctx).b = expr();
				}
			}

			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377);
				match(COMMA);
				setState(378);
				((DeclareStatContext)_localctx).c = match(ID);
				{
				setState(379);
				match(OP_ASS);
				setState(380);
				((DeclareStatContext)_localctx).d = expr();
				}
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(SEMICOL);

			            if (symbolTable.containsKey((((DeclareStatContext)_localctx).a!=null?((DeclareStatContext)_localctx).a.getText():null)))
			            {
			                System.out.println("Type Error " + ((DeclareStatContext)_localctx).a.getLine() + " : Redeclared identifier " + (((DeclareStatContext)_localctx).a!=null?((DeclareStatContext)_localctx).a.getText():null) + ".");
			                ((DeclareStatContext)_localctx).attr_type =  -2;
			            }
			            else if( (((DeclareStatContext)_localctx).type.attr_type != ((DeclareStatContext)_localctx).b.attr_type ) && ( (((DeclareStatContext)_localctx).b!=null?_input.getText(((DeclareStatContext)_localctx).b.start,((DeclareStatContext)_localctx).b.stop):null) != null) )
			            {
			                System.out.println("Type Error on Line " + (((DeclareStatContext)_localctx).b!=null?(((DeclareStatContext)_localctx).b.start):null).getLine() + " : Type mismatch for 2 side operands in an assignmentStat. ");
			                ((DeclareStatContext)_localctx).attr_type =  -2;
			                symbolTable.put((((DeclareStatContext)_localctx).a!=null?((DeclareStatContext)_localctx).a.getText():null), ((DeclareStatContext)_localctx).type.attr_type);
			            }
			            else
			            {
			                symbolTable.put((((DeclareStatContext)_localctx).a!=null?((DeclareStatContext)_localctx).a.getText():null), ((DeclareStatContext)_localctx).type.attr_type);
			            }

			            if((((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null) != null)
			            {
			                if (symbolTable.containsKey((((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null)))
			                {
			                    System.out.println("Type Error on Line " + ((DeclareStatContext)_localctx).c.getLine() + " : Redeclared identifier " + (((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null) + ".");
			                    ((DeclareStatContext)_localctx).attr_type =  -2;
			                }
			                else if( (((DeclareStatContext)_localctx).type.attr_type != ((DeclareStatContext)_localctx).d.attr_type ) && ( (((DeclareStatContext)_localctx).d!=null?_input.getText(((DeclareStatContext)_localctx).d.start,((DeclareStatContext)_localctx).d.stop):null) != null) )
			                {
			                    System.out.println("Type Error on Line " + (((DeclareStatContext)_localctx).d!=null?(((DeclareStatContext)_localctx).d.start):null).getLine() + " : Type mismatch for 2 side operands in an assignmentStat. ");
			                    ((DeclareStatContext)_localctx).attr_type =  -2;
			                    symbolTable.put((((DeclareStatContext)_localctx).c!=null?((DeclareStatContext)_localctx).c.getText():null), ((DeclareStatContext)_localctx).type.attr_type);
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
		enterRule(_localctx, 20, RULE_procedStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(FUNCTION_CALL);
			setState(390);
			arguments();
			setState(391);
			match(RPAREN);
			setState(392);
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
			setState(394);
			match(BREAK_);
			setState(395);
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
			setState(397);
			match(CONTINUE_);
			setState(398);
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
			setState(400);
			expr();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				expr();
				}
				}
				setState(407);
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
			setState(408);
			param();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(409);
				match(COMMA);
				setState(410);
				param();
				}
				}
				setState(415);
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
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				type();
				setState(417);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
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
			setState(422);
			((ExprContext)_localctx).a = operationStat();
			 ((ExprContext)_localctx).attr_type =  ((ExprContext)_localctx).a.attr_type ; 
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LAND || _la==OP_LOR) {
				{
				{
				setState(424);
				_la = _input.LA(1);
				if ( !(_la==OP_LAND || _la==OP_LOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(425);
				((ExprContext)_localctx).b = operationStat();
				}
				}
				setState(430);
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
			setState(431);
			((OperationStatContext)_localctx).a = add();
			 ((OperationStatContext)_localctx).attr_type =  ((OperationStatContext)_localctx).a.attr_type ; 
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ASS))) != 0)) {
				{
				{
				setState(433);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_EQ) | (1L << OP_LE) | (1L << OP_GE) | (1L << OP_NE) | (1L << OP_GT) | (1L << OP_LT) | (1L << OP_ADDAS) | (1L << OP_SUBAS) | (1L << OP_MULAS) | (1L << OP_DIVAS) | (1L << OP_XORAS) | (1L << OP_MODAS) | (1L << OP_LSAS) | (1L << OP_RSAS) | (1L << OP_ASS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(434);
				((OperationStatContext)_localctx).b = add();

				                if (((OperationStatContext)_localctx).a.attr_type != ((OperationStatContext)_localctx).b.attr_type)
				                {
				                    System.out.println("Type Error on Line " + (((OperationStatContext)_localctx).a!=null?(((OperationStatContext)_localctx).a.start):null).getLine() + " : Type mismatch for operationStat in the expression");
				                    ((OperationStatContext)_localctx).attr_type =  -2;
				                }
				            
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
			setState(442);
			((AddContext)_localctx).a = multiply();
			 ((AddContext)_localctx).attr_type =  ((AddContext)_localctx).a.attr_type ; 
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD || _la==OP_SUB) {
				{
				{
				setState(444);
				_la = _input.LA(1);
				if ( !(_la==OP_ADD || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(445);
				((AddContext)_localctx).b = multiply();

				            if (((AddContext)_localctx).a.attr_type != ((AddContext)_localctx).b.attr_type)
				            {
				                System.out.println("Type Error on Line " + (((AddContext)_localctx).a!=null?(((AddContext)_localctx).a.start):null).getLine() + " : Type mismatch for add or sub in the expression");
				                ((AddContext)_localctx).attr_type =  -2;
				            }
				        
				}
				}
				setState(452);
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
			setState(453);
			((MultiplyContext)_localctx).a = atom();
			 ((MultiplyContext)_localctx).attr_type =  ((MultiplyContext)_localctx).a.attr_type ; 
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(455);
				_la = _input.LA(1);
				if ( !(_la==OP_MUL || _la==OP_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(456);
				((MultiplyContext)_localctx).b = atom();

				            if (((MultiplyContext)_localctx).a.attr_type != ((MultiplyContext)_localctx).b.attr_type)
				            {
				                System.out.println("Type Error on Line " + (((MultiplyContext)_localctx).a!=null?(((MultiplyContext)_localctx).a.start):null).getLine() + " : Type mismatch for mul or div in the expression");
				                ((MultiplyContext)_localctx).attr_type =  -2;
				            }
				        
				}
				}
				setState(463);
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
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(DEC_NUM);
				 /* default it is integer */  ((AtomContext)_localctx).attr_type =  2 ; 
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(FLOAT_NUM);
				 ((AtomContext)_localctx).attr_type =  4 ; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				match(CHAR);
				 ((AtomContext)_localctx).attr_type =  7 ; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				((AtomContext)_localctx).ID = match(ID);

				            if(symbolTable.containsKey((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null)))
				            {
				                ((AtomContext)_localctx).attr_type =  symbolTable.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				            }
				            else
				            {
				                System.out.println("Type Error on Line " + ((AtomContext)_localctx).ID.getLine() + " : Unknown Idenifier " + (((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				                ((AtomContext)_localctx).attr_type =  -1;
				            }
				        
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(472);
				match(LPAREN);
				setState(473);
				((AtomContext)_localctx).expr = expr();
				setState(474);
				match(RPAREN);
				 ((AtomContext)_localctx).attr_type =  ((AtomContext)_localctx).expr.attr_type ; 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u01e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\7\2\63"+
		"\n\2\f\2\16\2\66\13\2\6\28\n\2\r\2\16\29\3\2\7\2=\n\2\f\2\16\2@\13\2\3"+
		"\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3"+
		"\3\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\7\3`"+
		"\n\3\f\3\16\3c\13\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\3\3\5\3m\n\3\3\3\3"+
		"\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0089\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0093\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009f"+
		"\n\6\3\7\3\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7\3\7\7\7\u00ac"+
		"\n\7\f\7\16\7\u00af\13\7\3\7\6\7\u00b2\n\7\r\7\16\7\u00b3\3\7\7\7\u00b7"+
		"\n\7\f\7\16\7\u00ba\13\7\3\7\3\7\7\7\u00be\n\7\f\7\16\7\u00c1\13\7\3\b"+
		"\3\b\3\b\3\b\7\b\u00c7\n\b\f\b\16\b\u00ca\13\b\3\b\3\b\7\b\u00ce\n\b\f"+
		"\b\16\b\u00d1\13\b\3\b\6\b\u00d4\n\b\r\b\16\b\u00d5\3\b\7\b\u00d9\n\b"+
		"\f\b\16\b\u00dc\13\b\3\b\3\b\7\b\u00e0\n\b\f\b\16\b\u00e3\13\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00e9\n\b\f\b\16\b\u00ec\13\b\3\b\3\b\7\b\u00f0\n\b\f\b\16"+
		"\b\u00f3\13\b\3\b\6\b\u00f6\n\b\r\b\16\b\u00f7\3\b\3\b\7\b\u00fc\n\b\f"+
		"\b\16\b\u00ff\13\b\7\b\u0101\n\b\f\b\16\b\u0104\13\b\3\b\3\b\7\b\u0108"+
		"\n\b\f\b\16\b\u010b\13\b\3\b\3\b\6\b\u010f\n\b\r\b\16\b\u0110\3\b\3\b"+
		"\5\b\u0115\n\b\3\t\3\t\7\t\u0119\n\t\f\t\16\t\u011c\13\t\3\t\3\t\7\t\u0120"+
		"\n\t\f\t\16\t\u0123\13\t\3\t\3\t\7\t\u0127\n\t\f\t\16\t\u012a\13\t\3\t"+
		"\3\t\7\t\u012e\n\t\f\t\16\t\u0131\13\t\3\t\3\t\7\t\u0135\n\t\f\t\16\t"+
		"\u0138\13\t\3\t\6\t\u013b\n\t\r\t\16\t\u013c\3\t\7\t\u0140\n\t\f\t\16"+
		"\t\u0143\13\t\3\t\3\t\7\t\u0147\n\t\f\t\16\t\u014a\13\t\3\n\3\n\3\n\7"+
		"\n\u014f\n\n\f\n\16\n\u0152\13\n\3\n\3\n\3\n\7\n\u0157\n\n\f\n\16\n\u015a"+
		"\13\n\3\n\7\n\u015d\n\n\f\n\16\n\u0160\13\n\3\n\3\n\5\n\u0164\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u016c\n\n\f\n\16\n\u016f\13\n\3\n\3\n\3\n\5\n"+
		"\u0174\n\n\3\13\3\13\3\13\3\13\5\13\u017a\n\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0180\n\13\f\13\16\13\u0183\13\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u0196\n\17\f\17\16\17"+
		"\u0199\13\17\3\20\3\20\3\20\7\20\u019e\n\20\f\20\16\20\u01a1\13\20\3\21"+
		"\3\21\3\21\3\21\5\21\u01a7\n\21\3\22\3\22\3\22\3\22\7\22\u01ad\n\22\f"+
		"\22\16\22\u01b0\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01b8\n\23\f"+
		"\23\16\23\u01bb\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01c3\n\24\f"+
		"\24\16\24\u01c6\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01ce\n\25\f"+
		"\25\16\25\u01d1\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u01e0\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\7\4\2\64\64\66\66\3\2()\4\2\27$\63\63\3\2/\60\3"+
		"\2\61\62\2\u0213\2\67\3\2\2\2\4H\3\2\2\2\6\u0088\3\2\2\2\b\u0092\3\2\2"+
		"\2\n\u009e\3\2\2\2\f\u00a0\3\2\2\2\16\u00c2\3\2\2\2\20\u0116\3\2\2\2\22"+
		"\u0173\3\2\2\2\24\u0175\3\2\2\2\26\u0187\3\2\2\2\30\u018c\3\2\2\2\32\u018f"+
		"\3\2\2\2\34\u0192\3\2\2\2\36\u019a\3\2\2\2 \u01a6\3\2\2\2\"\u01a8\3\2"+
		"\2\2$\u01b1\3\2\2\2&\u01bc\3\2\2\2(\u01c7\3\2\2\2*\u01df\3\2\2\2,-\7\25"+
		"\2\2-.\7\34\2\2./\7\65\2\2/\60\7\3\2\2\60\64\7\33\2\2\61\63\7G\2\2\62"+
		"\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64"+
		"\3\2\2\2\67,\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:>\3\2\2\2;=\5\22"+
		"\n\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AE\5\4"+
		"\3\2BD\5\22\n\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3"+
		"\2\2\2HI\5\6\4\2IM\7\4\2\2JL\5\36\20\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2M"+
		"N\3\2\2\2NP\3\2\2\2OM\3\2\2\2PT\78\2\2QS\7G\2\2RQ\3\2\2\2SV\3\2\2\2TR"+
		"\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2W[\7;\2\2XZ\7G\2\2YX\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2][\3\2\2\2^`\5\b\5\2_^\3\2\2\2`"+
		"c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\7G\2\2ed\3\2\2\2f"+
		"i\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7\22\2\2km\t\2\2\2"+
		"lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7?\2\2os\7<\2\2pr\7G\2\2qp\3\2\2\2ru"+
		"\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\b\3\1\2w\5\3\2\2\2"+
		"xy\7\6\2\2y\u0089\b\4\1\2z{\7\7\2\2{\u0089\b\4\1\2|}\7\b\2\2}\u0089\b"+
		"\4\1\2~\177\7\t\2\2\177\u0089\b\4\1\2\u0080\u0081\7\n\2\2\u0081\u0089"+
		"\b\4\1\2\u0082\u0083\7\13\2\2\u0083\u0089\b\4\1\2\u0084\u0085\7\f\2\2"+
		"\u0085\u0089\b\4\1\2\u0086\u0087\7\r\2\2\u0087\u0089\b\4\1\2\u0088x\3"+
		"\2\2\2\u0088z\3\2\2\2\u0088|\3\2\2\2\u0088~\3\2\2\2\u0088\u0080\3\2\2"+
		"\2\u0088\u0082\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0086\3\2\2\2\u0089\7"+
		"\3\2\2\2\u008a\u0093\5\n\6\2\u008b\u0093\5\f\7\2\u008c\u0093\5\16\b\2"+
		"\u008d\u0093\5\20\t\2\u008e\u0093\5\24\13\2\u008f\u0093\5\26\f\2\u0090"+
		"\u0093\5\30\r\2\u0091\u0093\5\32\16\2\u0092\u008a\3\2\2\2\u0092\u008b"+
		"\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
		"\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\t\3\2\2\2"+
		"\u0094\u0095\7\65\2\2\u0095\u0096\7\63\2\2\u0096\u0097\5\"\22\2\u0097"+
		"\u0098\7?\2\2\u0098\u0099\b\6\1\2\u0099\u009f\3\2\2\2\u009a\u009b\7\65"+
		"\2\2\u009b\u009c\7\63\2\2\u009c\u009d\t\2\2\2\u009d\u009f\7?\2\2\u009e"+
		"\u0094\3\2\2\2\u009e\u009a\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a1\7\16\2"+
		"\2\u00a1\u00a2\5\"\22\2\u00a2\u00a6\78\2\2\u00a3\u00a5\7G\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ad\7;\2\2\u00aa\u00ac\7G\2"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\5\b\5\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b7\7G\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bf\7<\2\2\u00bc\u00be\7G\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\r\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\5\"\22"+
		"\2\u00c4\u00c8\78\2\2\u00c5\u00c7\7G\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cf\7;\2\2\u00cc\u00ce\7G\2\2\u00cd\u00cc\3\2\2"+
		"\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\5\b\5\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00da\3\2"+
		"\2\2\u00d7\u00d9\7G\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00e1\7<\2\2\u00de\u00e0\7G\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u0102\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7\5\2\2\u00e5\u00e6\5\"\22\2\u00e6\u00ea\7"+
		"8\2\2\u00e7\u00e9\7G\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00f1\7;\2\2\u00ee\u00f0\7G\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\5\b\5\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fd\7<\2\2\u00fa\u00fc\7G\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2"+
		"\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u0100\u00e4\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0114\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0109\7\21"+
		"\2\2\u0106\u0108\7G\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u010e\7;\2\2\u010d\u010f\5\b\5\2\u010e\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0113\7<\2\2\u0113\u0115\3\2\2\2\u0114\u0105\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\17\3\2\2\2\u0116\u011a\7\17\2\2\u0117\u0119\5\"\22"+
		"\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0121\7?\2\2\u011e"+
		"\u0120\5\"\22\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3"+
		"\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0128\7?\2\2\u0125\u0127\5\"\22\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012f\78\2\2\u012c\u012e\7G\2\2\u012d\u012c\3\2\2"+
		"\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0136\7;\2\2\u0133\u0135\7G\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\5\b\5\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u0141\3\2\2\2\u013e\u0140\7G\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0148\7<\2\2\u0145\u0147\7G\2\2\u0146\u0145"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\21\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\5\6\4\2\u014c\u0150\7A\2\2"+
		"\u014d\u014f\5\36\20\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0154\78\2\2\u0154\u0158\7;\2\2\u0155\u0157\5\b\5\2\u0156\u0155\3\2\2"+
		"\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015e"+
		"\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\7G\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0163\7\22\2\2\u0162\u0164\t\2\2\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7?"+
		"\2\2\u0166\u0167\7<\2\2\u0167\u0174\3\2\2\2\u0168\u0169\5\6\4\2\u0169"+
		"\u016d\7A\2\2\u016a\u016c\5\36\20\2\u016b\u016a\3\2\2\2\u016c\u016f\3"+
		"\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0171\78\2\2\u0171\u0172\7?\2\2\u0172\u0174\3\2\2"+
		"\2\u0173\u014b\3\2\2\2\u0173\u0168\3\2\2\2\u0174\23\3\2\2\2\u0175\u0176"+
		"\5\6\4\2\u0176\u0179\7\65\2\2\u0177\u0178\7\63\2\2\u0178\u017a\5\"\22"+
		"\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u0181\3\2\2\2\u017b\u017c"+
		"\7>\2\2\u017c\u017d\7\65\2\2\u017d\u017e\7\63\2\2\u017e\u0180\5\"\22\2"+
		"\u017f\u017b\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7?\2\2\u0185"+
		"\u0186\b\13\1\2\u0186\25\3\2\2\2\u0187\u0188\7A\2\2\u0188\u0189\5\34\17"+
		"\2\u0189\u018a\78\2\2\u018a\u018b\7?\2\2\u018b\27\3\2\2\2\u018c\u018d"+
		"\7\23\2\2\u018d\u018e\7?\2\2\u018e\31\3\2\2\2\u018f\u0190\7\24\2\2\u0190"+
		"\u0191\7?\2\2\u0191\33\3\2\2\2\u0192\u0197\5\"\22\2\u0193\u0194\7>\2\2"+
		"\u0194\u0196\5\"\22\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\35\3\2\2\2\u0199\u0197\3\2\2\2\u019a"+
		"\u019f\5 \21\2\u019b\u019c\7>\2\2\u019c\u019e\5 \21\2\u019d\u019b\3\2"+
		"\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\37\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\5\6\4\2\u01a3\u01a4\7\65\2"+
		"\2\u01a4\u01a7\3\2\2\2\u01a5\u01a7\5\6\4\2\u01a6\u01a2\3\2\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a7!\3\2\2\2\u01a8\u01a9\5$\23\2\u01a9\u01ae\b\22\1\2\u01aa"+
		"\u01ab\t\3\2\2\u01ab\u01ad\5$\23\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af#\3\2\2\2\u01b0\u01ae"+
		"\3\2\2\2\u01b1\u01b2\5&\24\2\u01b2\u01b9\b\23\1\2\u01b3\u01b4\t\4\2\2"+
		"\u01b4\u01b5\5&\24\2\u01b5\u01b6\b\23\1\2\u01b6\u01b8\3\2\2\2\u01b7\u01b3"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"%\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\5(\25\2\u01bd\u01c4\b\24\1\2"+
		"\u01be\u01bf\t\5\2\2\u01bf\u01c0\5(\25\2\u01c0\u01c1\b\24\1\2\u01c1\u01c3"+
		"\3\2\2\2\u01c2\u01be\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\'\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\5*\26\2"+
		"\u01c8\u01cf\b\25\1\2\u01c9\u01ca\t\6\2\2\u01ca\u01cb\5*\26\2\u01cb\u01cc"+
		"\b\25\1\2\u01cc\u01ce\3\2\2\2\u01cd\u01c9\3\2\2\2\u01ce\u01d1\3\2\2\2"+
		"\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0)\3\2\2\2\u01d1\u01cf\3"+
		"\2\2\2\u01d2\u01d3\7\64\2\2\u01d3\u01e0\b\26\1\2\u01d4\u01d5\7\66\2\2"+
		"\u01d5\u01e0\b\26\1\2\u01d6\u01d7\7C\2\2\u01d7\u01e0\b\26\1\2\u01d8\u01d9"+
		"\7\65\2\2\u01d9\u01e0\b\26\1\2\u01da\u01db\7\67\2\2\u01db\u01dc\5\"\22"+
		"\2\u01dc\u01dd\78\2\2\u01dd\u01de\b\26\1\2\u01de\u01e0\3\2\2\2\u01df\u01d2"+
		"\3\2\2\2\u01df\u01d4\3\2\2\2\u01df\u01d6\3\2\2\2\u01df\u01d8\3\2\2\2\u01df"+
		"\u01da\3\2\2\2\u01e0+\3\2\2\2:\649>EMT[agls\u0088\u0092\u009e\u00a6\u00ad"+
		"\u00b3\u00b8\u00bf\u00c8\u00cf\u00d5\u00da\u00e1\u00ea\u00f1\u00f7\u00fd"+
		"\u0102\u0109\u0110\u0114\u011a\u0121\u0128\u012f\u0136\u013c\u0141\u0148"+
		"\u0150\u0158\u015e\u0163\u016d\u0173\u0179\u0181\u0197\u019f\u01a6\u01ae"+
		"\u01b9\u01c4\u01cf\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}