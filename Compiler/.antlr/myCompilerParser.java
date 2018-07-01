// Generated from /home/bobosheep/Compiler/AntlrPractice/Compiler/myCompiler.g by ANTLR 4.7.1

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LPAREN=2, RPAREN=3, LBRACK=4, RBRACK=5, LBRACE=6, RBRACE=7, PERIOD=8, 
		COMMA=9, SEMICOL=10, COLON=11, OP_EQ=12, OP_LE=13, OP_GE=14, OP_NE=15, 
		OP_GT=16, OP_LT=17, OP_ADDAS=18, OP_SUBAS=19, OP_MULAS=20, OP_DIVAS=21, 
		OP_XORAS=22, OP_MODAS=23, OP_LSAS=24, OP_RSAS=25, OP_ADDADD=26, OP_SUBSUB=27, 
		OP_NOT=28, OP_LAND=29, OP_LOR=30, OP_AND=31, OP_OR=32, OP_XOR=33, OP_LS=34, 
		OP_RS=35, OP_ADD=36, OP_SUB=37, OP_MUL=38, OP_DIV=39, OP_ASS=40, SHORT_TYPE=41, 
		INT_TYPE=42, LONG_TYPE=43, FLOAT_TYPE=44, DOUBLE_TYPE=45, LONGLONG_TYPE=46, 
		CHAR_TYPE=47, VOID_TYPE=48, WHILE_=49, FOR_=50, IF_=51, ELSE_=52, RETURN_=53, 
		BREAK_=54, CONTINUE_=55, INCLUDE=56, DEFINE=57, DEC_NUM=58, ID=59, FLOAT_NUM=60, 
		FUNCTION_CALL=61, ARRAY=62, CHAR=63, STRING=64, COMMENT1=65, COMMENT2=66, 
		WS=67, PREPROCESSOR=68;
	public static final int
		RULE_startstat = 0, RULE_functions = 1, RULE_function = 2, RULE_declarations = 3, 
		RULE_l_declarations = 4, RULE_type = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_expr = 8, RULE_multiply = 9, RULE_signed = 10, RULE_atom = 11, RULE_ifthenstat = 12, 
		RULE_printstat = 13;
	public static final String[] ruleNames = {
		"startstat", "functions", "function", "declarations", "l_declarations", 
		"type", "statements", "statement", "expr", "multiply", "signed", "atom", 
		"ifthenstat", "printstat"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'printf'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'.'", "','", 
		"';'", "':'", "'=='", "'<='", "'>='", "'!='", "'>'", "'<'", "'+='", "'-='", 
		"'*='", "'/='", "'^='", "'%='", "'<<='", "'>>='", "'++'", "'--'", "'!'", 
		"'&&'", "'||'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'+'", "'-'", "'*'", 
		"'/'", "'='", "'short'", "'int'", "'long'", "'float'", "'double'", "'long long'", 
		"'char'", "'void'", "'while'", "'for'", "'if'", "'else'", "'return'", 
		"'break'", "'continue'", "'#include'", "'#define'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
		"PERIOD", "COMMA", "SEMICOL", "COLON", "OP_EQ", "OP_LE", "OP_GE", "OP_NE", 
		"OP_GT", "OP_LT", "OP_ADDAS", "OP_SUBAS", "OP_MULAS", "OP_DIVAS", "OP_XORAS", 
		"OP_MODAS", "OP_LSAS", "OP_RSAS", "OP_ADDADD", "OP_SUBSUB", "OP_NOT", 
		"OP_LAND", "OP_LOR", "OP_AND", "OP_OR", "OP_XOR", "OP_LS", "OP_RS", "OP_ADD", 
		"OP_SUB", "OP_MUL", "OP_DIV", "OP_ASS", "SHORT_TYPE", "INT_TYPE", "LONG_TYPE", 
		"FLOAT_TYPE", "DOUBLE_TYPE", "LONGLONG_TYPE", "CHAR_TYPE", "VOID_TYPE", 
		"WHILE_", "FOR_", "IF_", "ELSE_", "RETURN_", "BREAK_", "CONTINUE_", "INCLUDE", 
		"DEFINE", "DEC_NUM", "ID", "FLOAT_NUM", "FUNCTION_CALL", "ARRAY", "CHAR", 
		"STRING", "COMMENT1", "COMMENT2", "WS", "PREPROCESSOR"
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
	public String getGrammarFileName() { return "myCompiler.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = false;
	    HashMap<String,Integer> symbolTable = new HashMap<String,Integer>();
	    HashMap<Integer,String> reg_map = new HashMap<Integer,String>();

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

	    int labelCount = 0;

	    List<String> DataCode = new ArrayList<String>();
	    List<String> TextCode = new ArrayList<String>();
	 
	    public static register reg = new register(0, 9);
	    
	    /*
	     * Output prologue.
	     */
	    void prologue(String id)
	    {
	       TextCode.add("\n\n/* Text section */");
	       TextCode.add("\t.section .text");
	       TextCode.add("\t.global " + id);
	       TextCode.add("\t.type " + id + ",@function");
	       TextCode.add(id + ":");
	       
	       /* Follow x86 calling convention */
	       TextCode.add("\t pushq \%rbp");
	       TextCode.add("\t movq \%rsp,\%rbp");
	       TextCode.add("\t pushq \%rbx"); //callee saved registers.
	       TextCode.add("\t pushq \%r12"); //callee saved registers.
	       TextCode.add("\t pushq \%r13"); //callee saved registers.
	       TextCode.add("\t pushq \%r14"); //callee saved registers.
	       TextCode.add("\t pushq \%r15"); //callee saved registers.
	       TextCode.add("\t subq $8,\%rsp\n"); // aligned 16-byte boundary.
	    }
	    
	    /*
	     * Output epilogue.
	     */
	    void epilogue()
	    {
	       /* handle epilogue */
	       
	       /* Follow x86 calling convention */
	       TextCode.add("\n\t addq $8,\%rsp");
	       TextCode.add("\t popq \%r15");
	       TextCode.add("\t popq \%r14");
	       TextCode.add("\t popq \%r13");
	       TextCode.add("\t popq \%r12");
	       TextCode.add("\t popq \%rbx");
	       TextCode.add("\t popq \%rbp");
	       TextCode.add("\t ret");
	    }
	    
	    
	    /* Generate a new label */
	    String newLabel()
	    {
	       labelCount ++;
	       return (new String("L")) + Integer.toString(labelCount);
	    } 
	    
	    
	    public List<String> getDataCode()
	    {
	       return DataCode;
	    }
	    
	    public List<String> getTextCode()
	    {
	       return TextCode;
	    }

	public myCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartstatContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public StartstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startstat; }
	}

	public final StartstatContext startstat() throws RecognitionException {
		StartstatContext _localctx = new StartstatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startstat);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        reg_map.put(0,"r14d");
			        reg_map.put(1,"ebx");
			        reg_map.put(2,"ecx");
			        reg_map.put(3,"r15d");
			        reg_map.put(4,"r8d");
			        reg_map.put(5,"r9d");
			        reg_map.put(6,"r10d");
			        reg_map.put(7,"r11d");
			        reg_map.put(8,"r12d");
			        reg_map.put(9,"r13d");
			    
			setState(29);
			declarations();
			setState(30);
			functions();
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

	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case LONGLONG_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				function();
				setState(33);
				functions();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(myCompilerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCompilerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCompilerParser.LBRACE, 0); }
		public L_declarationsContext l_declarations() {
			return getRuleContext(L_declarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(myCompilerParser.RBRACE, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			type();
			setState(39);
			match(ID);
			setState(40);
			match(LPAREN);
			setState(41);
			match(RPAREN);
			setState(42);
			match(LBRACE);


			                if ( TRACEON ) System.out.println("function");
			                /* output function prologue */
			                prologue((((FunctionContext)_localctx).ID!=null?((FunctionContext)_localctx).ID.getText():null));
			            
			setState(44);
			l_declarations();
			setState(45);
			statements();
			setState(46);
			match(RBRACE);

			                /* output function epilogue */	  
			                epilogue();
			            
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(myCompilerParser.SEMICOL, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				type();
				setState(50);
				match(ID);
				setState(51);
				match(SEMICOL);
				setState(52);
				declarations();
				 
				        if ( TRACEON ) System.out.println("declarations : type ID SEMICOL declarations");

						/* code generation */
						
				        switch(((DeclarationsContext)_localctx).type.attr_type) 
				        {
						    case 1: 
				                /* Type: short, size=> 2 bytes, alignment=> 2 byte boundary. */
						        DataCode.add("\t .common " + (((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null) + ",2,2");
								break;
				            case 2: 
				                /* Type: ineteger, size=> 4 bytes, alignment=> 4 byte boundary. */
						        DataCode.add("\t .common " + (((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null) + ",4,4");
								break;
				            case 3: 
				                /* Type: long long, size=> 8 bytes, alignment=> 8 byte boundary. */
						        DataCode.add("\t .common " + (((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null) + ",8,8");
								break;

				            case 4: 
				                /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
						        DataCode.add("\t .common " + (((DeclarationsContext)_localctx).ID!=null?((DeclarationsContext)_localctx).ID.getText():null) + ",4,4");
								break;
						    default:
						}
					  
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				    if ( TRACEON ) System.out.println("declarations : ");  
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

	public static class L_declarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode SEMICOL() { return getToken(myCompilerParser.SEMICOL, 0); }
		public L_declarationsContext l_declarations() {
			return getRuleContext(L_declarationsContext.class,0);
		}
		public L_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_declarations; }
	}

	public final L_declarationsContext l_declarations() throws RecognitionException {
		L_declarationsContext _localctx = new L_declarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_l_declarations);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
			case INT_TYPE:
			case LONG_TYPE:
			case FLOAT_TYPE:
			case DOUBLE_TYPE:
			case LONGLONG_TYPE:
			case CHAR_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				type();
				setState(59);
				match(ID);
				setState(60);
				match(SEMICOL);
				setState(61);
				l_declarations();

				        if( TRACEON ) System.out.println("l_declarations : type ID ';' l_declarations");
				        
						/* code generation */
						switch(((L_declarationsContext)_localctx).type.attr_type) 
				        {
						    case 1: 
				                /* Type: short, size=> 2 bytes, alignment=> 2 byte boundary. */
						        DataCode.add("\t .common " + (((L_declarationsContext)_localctx).ID!=null?((L_declarationsContext)_localctx).ID.getText():null) + ",2,2");
								break;
				            case 2: 
				                /* Type: ineteger, size=> 4 bytes, alignment=> 4 byte boundary. */
						        DataCode.add("\t .common " + (((L_declarationsContext)_localctx).ID!=null?((L_declarationsContext)_localctx).ID.getText():null) + ",4,4");
								break;
				            case 3: 
				                /* Type: long long, size=> 8 bytes, alignment=> 8 byte boundary. */
						        DataCode.add("\t .common " + (((L_declarationsContext)_localctx).ID!=null?((L_declarationsContext)_localctx).ID.getText():null) + ",8,8");
								break;

				            case 4: 
				                /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
						        DataCode.add("\t .common " + (((L_declarationsContext)_localctx).ID!=null?((L_declarationsContext)_localctx).ID.getText():null) + ",4,4");
								break;
						    default:
						}
				    
				}
				break;
			case T__0:
			case RBRACE:
			case IF_:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				   if( TRACEON ) System.out.println("l_declarations : ");         
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

	public static class TypeContext extends ParserRuleContext {
		public int attr_type;
		public TerminalNode SHORT_TYPE() { return getToken(myCompilerParser.SHORT_TYPE, 0); }
		public TerminalNode INT_TYPE() { return getToken(myCompilerParser.INT_TYPE, 0); }
		public TerminalNode LONG_TYPE() { return getToken(myCompilerParser.LONG_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(myCompilerParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(myCompilerParser.DOUBLE_TYPE, 0); }
		public TerminalNode LONGLONG_TYPE() { return getToken(myCompilerParser.LONGLONG_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(myCompilerParser.CHAR_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(myCompilerParser.VOID_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHORT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(SHORT_TYPE);
				   if (TRACEON) System.out.println("type: SHORT") ; ((TypeContext)_localctx).attr_type =  1 ;      
				}
				break;
			case INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(INT_TYPE);
				   if (TRACEON) System.out.println("type: INT") ; ((TypeContext)_localctx).attr_type =  2 ;        
				}
				break;
			case LONG_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(LONG_TYPE);
				   if (TRACEON) System.out.println("type: LONG") ; ((TypeContext)_localctx).attr_type =  3 ;       
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(FLOAT_TYPE);
				   if (TRACEON) System.out.println("type: FLOAT") ; ((TypeContext)_localctx).attr_type =  4 ;      
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(DOUBLE_TYPE);
				   if (TRACEON) System.out.println("type: DOUBLE") ; ((TypeContext)_localctx).attr_type =  5 ;     
				}
				break;
			case LONGLONG_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(LONGLONG_TYPE);
				   if (TRACEON) System.out.println("type: LONGLONG") ; ((TypeContext)_localctx).attr_type =  6 ;   
				}
				break;
			case CHAR_TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(CHAR_TYPE);
				   if (TRACEON) System.out.println("type: CHAR") ; ((TypeContext)_localctx).attr_type =  7 ;       
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				match(VOID_TYPE);
				   if (TRACEON) System.out.println("type: VOID") ; ((TypeContext)_localctx).attr_type =  0 ;       
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case IF_:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				statement();
				setState(86);
				statements();
				}
				break;
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public int attr_type;
		public ExprContext a;
		public ExprContext b;
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public TerminalNode OP_ASS() { return getToken(myCompilerParser.OP_ASS, 0); }
		public TerminalNode SEMICOL() { return getToken(myCompilerParser.SEMICOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IF_() { return getToken(myCompilerParser.IF_, 0); }
		public TerminalNode LPAREN() { return getToken(myCompilerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCompilerParser.RPAREN, 0); }
		public IfthenstatContext ifthenstat() {
			return getRuleContext(IfthenstatContext.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(ID);
				setState(92);
				match(OP_ASS);
				setState(93);
				((StatementContext)_localctx).a = expr();
				setState(94);
				match(SEMICOL);

				             if( TRACEON ) System.out.println("statement : ID OP_ASS a = expr SEMICOL ");
				            TextCode.add("\t movl " + "\%" + reg_map.get(((StatementContext)_localctx).a.reg_num) + "," + (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null) + "(\%rip)");
				        
				}
				break;
			case IF_:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(IF_);
				setState(98);
				match(LPAREN);
				setState(99);
				((StatementContext)_localctx).b = expr();
				setState(100);
				match(RPAREN);

				            if( TRACEON ) System.out.println("statement : IF_ LPAREN b = expr RPAREN");
				            String label = newLabel();
				            TextCode.add("\t cmpl " + "$0, " + "\%" + reg_map.get(((StatementContext)_localctx).b.reg_num));
				            TextCode.add("\t je " + label);
				        
				setState(102);
				ifthenstat();

				            TextCode.add(label + ":");
				        
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				printstat();
				if( TRACEON ) System.out.println("statement : printstat");
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

	public static class ExprContext extends ParserRuleContext {
		public int attr_type;
		public int reg_num;
		public String str;
		public MultiplyContext a;
		public MultiplyContext b;
		public MultiplyContext c;
		public List<MultiplyContext> multiply() {
			return getRuleContexts(MultiplyContext.class);
		}
		public MultiplyContext multiply(int i) {
			return getRuleContext(MultiplyContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((ExprContext)_localctx).a = multiply();

			            if( TRACEON ) System.out.println("expr : a = multiply");
			            ((ExprContext)_localctx).attr_type =  ((ExprContext)_localctx).a.attr_type;
			            ((ExprContext)_localctx).reg_num =  ((ExprContext)_localctx).a.reg_num;
			            ((ExprContext)_localctx).str =  ((ExprContext)_localctx).a.str;
			        
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ADD || _la==OP_SUB) {
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_ADD:
					{
					setState(112);
					match(OP_ADD);
					setState(113);
					((ExprContext)_localctx).b = multiply();
					   TextCode.add("\t addl " + "\%" + reg_map.get(((ExprContext)_localctx).b.reg_num) + ", \%" + reg_map.get(_localctx.reg_num));     
					}
					break;
				case OP_SUB:
					{
					setState(116);
					match(OP_SUB);
					setState(117);
					((ExprContext)_localctx).c = multiply();
					   TextCode.add("\t subl " + "\%" + reg_map.get(((ExprContext)_localctx).c.reg_num) + ", \%" + reg_map.get(_localctx.reg_num));     
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124);
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
		public int reg_num;
		public String str;
		public SignedContext a;
		public SignedContext b;
		public SignedContext c;
		public List<SignedContext> signed() {
			return getRuleContexts(SignedContext.class);
		}
		public SignedContext signed(int i) {
			return getRuleContext(SignedContext.class,i);
		}
		public MultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply; }
	}

	public final MultiplyContext multiply() throws RecognitionException {
		MultiplyContext _localctx = new MultiplyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((MultiplyContext)_localctx).a = signed();
			 
			            if( TRACEON ) System.out.println("multiply : a = signed");
			            ((MultiplyContext)_localctx).attr_type =  ((MultiplyContext)_localctx).a.attr_type;
			            ((MultiplyContext)_localctx).reg_num =  ((MultiplyContext)_localctx).a.reg_num;
			            ((MultiplyContext)_localctx).str =  ((MultiplyContext)_localctx).a.str;
			        
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_MUL:
					{
					setState(127);
					match(OP_MUL);
					setState(128);
					((MultiplyContext)_localctx).b = signed();
					 
					                TextCode.add("\t imul " + "\%" + reg_map.get(((MultiplyContext)_localctx).b.reg_num) + ", \%" + reg_map.get(((MultiplyContext)_localctx).a.reg_num));
					            
					}
					break;
				case OP_DIV:
					{
					setState(131);
					match(OP_DIV);
					setState(132);
					((MultiplyContext)_localctx).c = signed();
					 
					                TextCode.add("\t movl " + "\%" + reg_map.get(((MultiplyContext)_localctx).a.reg_num) + ", \%eax");
					                TextCode.add("\t movl " + "$0" + ", \%edx");
					                TextCode.add("\t idivl " + "\%" + reg_map.get(((MultiplyContext)_localctx).c.reg_num));
					                TextCode.add("\t movl "  + "\%eax" + ", \%" + reg_map.get(((MultiplyContext)_localctx).a.reg_num));
					            
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
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

	public static class SignedContext extends ParserRuleContext {
		public int attr_type;
		public int reg_num;
		public String str;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed; }
	}

	public final SignedContext signed() throws RecognitionException {
		SignedContext _localctx = new SignedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signed);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case DEC_NUM:
			case ID:
			case FLOAT_NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				atom();
				 
				            ((SignedContext)_localctx).attr_type =  ((SignedContext)_localctx).atom.attr_type;
				            ((SignedContext)_localctx).reg_num =  ((SignedContext)_localctx).atom.reg_num;
				            ((SignedContext)_localctx).str =  ((SignedContext)_localctx).atom.str;
				        
				}
				break;
			case OP_SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(OP_SUB);
				setState(144);
				atom();

				            TextCode.add("\t negl " + "\%" + reg_map.get(((SignedContext)_localctx).atom.reg_num));
				            ((SignedContext)_localctx).attr_type =  ((SignedContext)_localctx).atom.attr_type;
				            ((SignedContext)_localctx).reg_num =  ((SignedContext)_localctx).atom.reg_num;
				            ((SignedContext)_localctx).str =  ((SignedContext)_localctx).atom.str;
					    
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

	public static class AtomContext extends ParserRuleContext {
		public int attr_type;
		public int reg_num;
		public String str;
		public TerminalNode DEC_NUM() { return getToken(myCompilerParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myCompilerParser.FLOAT_NUM, 0); }
		public TerminalNode STRING() { return getToken(myCompilerParser.STRING, 0); }
		public TerminalNode ID() { return getToken(myCompilerParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(DEC_NUM);
				 
				            ((AtomContext)_localctx).attr_type =  2;
				            ((AtomContext)_localctx).str =  null;
				            ((AtomContext)_localctx).reg_num =  reg.get();  /* get an register */
				            TextCode.add("\t movl " + "$" + (((AtomContext)_localctx).DEC_NUM!=null?((AtomContext)_localctx).DEC_NUM.getText():null) + ", \%" + reg_map.get(_localctx.reg_num)); 
				        
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(FLOAT_NUM);
				 
				            ((AtomContext)_localctx).attr_type =  4 ; 
				            ((AtomContext)_localctx).str =  null;
				            ((AtomContext)_localctx).reg_num =  reg.get();
				            TextCode.add("\t movl " + "$" + (((AtomContext)_localctx).FLOAT_NUM!=null?((AtomContext)_localctx).FLOAT_NUM.getText():null) + ", \%" + reg_map.get(_localctx.reg_num));
				        
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(STRING);
				 ((AtomContext)_localctx).attr_type =  9; ((AtomContext)_localctx).str =  (((AtomContext)_localctx).STRING!=null?((AtomContext)_localctx).STRING.getText():null); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(ID);

				            if(symbolTable.containsKey((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null)))
				            {
				                ((AtomContext)_localctx).attr_type =  symbolTable.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				            }
				            else
				            {
				                //System.out.println("Type Error on Line : " + ((AtomContext)_localctx).ID.getLine() + " : Unknown Idenifier " + (((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null) + ".");
				                ((AtomContext)_localctx).attr_type =  -1;
				            }
				            ((AtomContext)_localctx).str =  null;
				            ((AtomContext)_localctx).reg_num =  reg.get(); /* get an register */
				            TextCode.add("\t movl " + (((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null) + "(\%rip), \%" + reg_map.get(_localctx.reg_num));
				        
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				match(LPAREN);
				setState(158);
				expr();
				setState(159);
				match(RPAREN);
				 ((AtomContext)_localctx).attr_type =  ((AtomContext)_localctx).expr.attr_type; 
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

	public static class IfthenstatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IfthenstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthenstat; }
	}

	public final IfthenstatContext ifthenstat() throws RecognitionException {
		IfthenstatContext _localctx = new IfthenstatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifthenstat);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case IF_:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				statement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(LBRACE);
				setState(166);
				statements();
				setState(167);
				match(RBRACE);
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

	public static class PrintstatContext extends ParserRuleContext {
		public Token a;
		public TerminalNode LPAREN() { return getToken(myCompilerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCompilerParser.RPAREN, 0); }
		public TerminalNode SEMICOL() { return getToken(myCompilerParser.SEMICOL, 0); }
		public TerminalNode STRING() { return getToken(myCompilerParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(myCompilerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCompilerParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(myCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myCompilerParser.ID, i);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printstat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__0);
			setState(172);
			match(LPAREN);
			setState(173);
			((PrintstatContext)_localctx).a = match(STRING);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(174);
				match(COMMA);
				setState(175);
				match(ID);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(RPAREN);
			setState(182);
			match(SEMICOL);

			            String label = newLabel();
			            DataCode.add(label + ":");
			            DataCode.add("\t .string " + (((PrintstatContext)_localctx).a!=null?((PrintstatContext)_localctx).a.getText():null));


			        if ((((PrintstatContext)_localctx).ID!=null?((PrintstatContext)_localctx).ID.getText():null) != null)
			        {
			            TextCode.add("\t movl " + (((PrintstatContext)_localctx).ID!=null?((PrintstatContext)_localctx).ID.getText():null) + "(\%rip), " + "\%esi");
			            TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
			        }
			        TextCode.add("\t call printf");
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6D\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7\3\b\3"+
		"\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7"+
		"\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u008a\n\13\f\13\16\13\u008d\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u0096\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00a5\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00ac\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6\13\17\3\17\3\17\3\17\3\17\3\17"+
		"\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00c5\2\36\3\2\2\2\4"+
		"&\3\2\2\2\6(\3\2\2\2\b:\3\2\2\2\nC\3\2\2\2\fU\3\2\2\2\16[\3\2\2\2\20n"+
		"\3\2\2\2\22p\3\2\2\2\24\177\3\2\2\2\26\u0095\3\2\2\2\30\u00a4\3\2\2\2"+
		"\32\u00ab\3\2\2\2\34\u00ad\3\2\2\2\36\37\b\2\1\2\37 \5\b\5\2 !\5\4\3\2"+
		"!\3\3\2\2\2\"#\5\6\4\2#$\5\4\3\2$\'\3\2\2\2%\'\3\2\2\2&\"\3\2\2\2&%\3"+
		"\2\2\2\'\5\3\2\2\2()\5\f\7\2)*\7=\2\2*+\7\4\2\2+,\7\5\2\2,-\7\b\2\2-."+
		"\b\4\1\2./\5\n\6\2/\60\5\16\b\2\60\61\7\t\2\2\61\62\b\4\1\2\62\7\3\2\2"+
		"\2\63\64\5\f\7\2\64\65\7=\2\2\65\66\7\f\2\2\66\67\5\b\5\2\678\b\5\1\2"+
		"8;\3\2\2\29;\b\5\1\2:\63\3\2\2\2:9\3\2\2\2;\t\3\2\2\2<=\5\f\7\2=>\7=\2"+
		"\2>?\7\f\2\2?@\5\n\6\2@A\b\6\1\2AD\3\2\2\2BD\b\6\1\2C<\3\2\2\2CB\3\2\2"+
		"\2D\13\3\2\2\2EF\7+\2\2FV\b\7\1\2GH\7,\2\2HV\b\7\1\2IJ\7-\2\2JV\b\7\1"+
		"\2KL\7.\2\2LV\b\7\1\2MN\7/\2\2NV\b\7\1\2OP\7\60\2\2PV\b\7\1\2QR\7\61\2"+
		"\2RV\b\7\1\2ST\7\62\2\2TV\b\7\1\2UE\3\2\2\2UG\3\2\2\2UI\3\2\2\2UK\3\2"+
		"\2\2UM\3\2\2\2UO\3\2\2\2UQ\3\2\2\2US\3\2\2\2V\r\3\2\2\2WX\5\20\t\2XY\5"+
		"\16\b\2Y\\\3\2\2\2Z\\\3\2\2\2[W\3\2\2\2[Z\3\2\2\2\\\17\3\2\2\2]^\7=\2"+
		"\2^_\7*\2\2_`\5\22\n\2`a\7\f\2\2ab\b\t\1\2bo\3\2\2\2cd\7\65\2\2de\7\4"+
		"\2\2ef\5\22\n\2fg\7\5\2\2gh\b\t\1\2hi\5\32\16\2ij\b\t\1\2jo\3\2\2\2kl"+
		"\5\34\17\2lm\b\t\1\2mo\3\2\2\2n]\3\2\2\2nc\3\2\2\2nk\3\2\2\2o\21\3\2\2"+
		"\2pq\5\24\13\2q|\b\n\1\2rs\7&\2\2st\5\24\13\2tu\b\n\1\2u{\3\2\2\2vw\7"+
		"\'\2\2wx\5\24\13\2xy\b\n\1\2y{\3\2\2\2zr\3\2\2\2zv\3\2\2\2{~\3\2\2\2|"+
		"z\3\2\2\2|}\3\2\2\2}\23\3\2\2\2~|\3\2\2\2\177\u0080\5\26\f\2\u0080\u008b"+
		"\b\13\1\2\u0081\u0082\7(\2\2\u0082\u0083\5\26\f\2\u0083\u0084\b\13\1\2"+
		"\u0084\u008a\3\2\2\2\u0085\u0086\7)\2\2\u0086\u0087\5\26\f\2\u0087\u0088"+
		"\b\13\1\2\u0088\u008a\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0085\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\5\30\r\2\u008f\u0090\b\f\1\2"+
		"\u0090\u0096\3\2\2\2\u0091\u0092\7\'\2\2\u0092\u0093\5\30\r\2\u0093\u0094"+
		"\b\f\1\2\u0094\u0096\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0096"+
		"\27\3\2\2\2\u0097\u0098\7<\2\2\u0098\u00a5\b\r\1\2\u0099\u009a\7>\2\2"+
		"\u009a\u00a5\b\r\1\2\u009b\u009c\7B\2\2\u009c\u00a5\b\r\1\2\u009d\u009e"+
		"\7=\2\2\u009e\u00a5\b\r\1\2\u009f\u00a0\7\4\2\2\u00a0\u00a1\5\22\n\2\u00a1"+
		"\u00a2\7\5\2\2\u00a2\u00a3\b\r\1\2\u00a3\u00a5\3\2\2\2\u00a4\u0097\3\2"+
		"\2\2\u00a4\u0099\3\2\2\2\u00a4\u009b\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4"+
		"\u009f\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00ac\5\20\t\2\u00a7\u00a8\7\b\2"+
		"\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7\t\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00a6\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\7\3\2"+
		"\2\u00ae\u00af\7\4\2\2\u00af\u00b4\7B\2\2\u00b0\u00b1\7\13\2\2\u00b1\u00b3"+
		"\7=\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\5"+
		"\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\b\17\1\2\u00ba\35\3\2\2\2\20&:CU"+
		"[nz|\u0089\u008b\u0095\u00a4\u00ab\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}