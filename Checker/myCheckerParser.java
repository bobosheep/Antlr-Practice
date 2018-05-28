// $ANTLR 3.5.2 myChecker.g 2018-05-29 00:51:32

    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myCheckerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BREAK_", "CHAR", "CHAR_TYPE", 
		"COLON", "COMMA", "COMMENT1", "COMMENT2", "CONTINUE_", "DEC_NUM", "DEFINE", 
		"DIGIT", "DOUBLE_TYPE", "ELSE_", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", 
		"FLOAT_NUM3", "FLOAT_TYPE", "FOR_", "FUNCTION_CALL", "ID", "IF_", "INCLUDE", 
		"INT_TYPE", "LBRACE", "LBRACK", "LETTER", "LONGLONG_TYPE", "LONG_TYPE", 
		"LPAREN", "OP_ADD", "OP_ADDADD", "OP_ADDAS", "OP_AND", "OP_ASS", "OP_DIV", 
		"OP_DIVAS", "OP_EQ", "OP_GE", "OP_GT", "OP_LAND", "OP_LE", "OP_LOR", "OP_LS", 
		"OP_LSAS", "OP_LT", "OP_MODAS", "OP_MUL", "OP_MULAS", "OP_NE", "OP_NOT", 
		"OP_OR", "OP_RS", "OP_RSAS", "OP_SUB", "OP_SUBAS", "OP_SUBSUB", "OP_XOR", 
		"OP_XORAS", "PERIOD", "RBRACE", "RBRACK", "RETURN_", "RPAREN", "SEMICOL", 
		"SHORT_TYPE", "STRING", "VOID_TYPE", "WHILE_", "WS", "'.h'", "'else if('", 
		"'main('"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCheckerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[112+1];


	}

	@Override public String[] getTokenNames() { return myCheckerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myChecker.g"; }


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




	// $ANTLR start "startStat"
	// myChecker.g:51:1: startStat : ( INCLUDE '<' ID '.h' '>' ( WS )* )+ ( function )* mainfunction ( function )* ;
	public final void startStat() throws RecognitionException {
		int startStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myChecker.g:51:10: ( ( INCLUDE '<' ID '.h' '>' ( WS )* )+ ( function )* mainfunction ( function )* )
			// myChecker.g:52:5: ( INCLUDE '<' ID '.h' '>' ( WS )* )+ ( function )* mainfunction ( function )*
			{
			// myChecker.g:52:5: ( INCLUDE '<' ID '.h' '>' ( WS )* )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==INCLUDE) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myChecker.g:52:6: INCLUDE '<' ID '.h' '>' ( WS )*
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_startStat68); if (state.failed) return;
					match(input,OP_LT,FOLLOW_OP_LT_in_startStat71); if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_startStat73); if (state.failed) return;
					match(input,75,FOLLOW_75_in_startStat75); if (state.failed) return;
					match(input,OP_GT,FOLLOW_OP_GT_in_startStat77); if (state.failed) return;
					// myChecker.g:52:31: ( WS )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==WS) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// myChecker.g:52:31: WS
							{
							match(input,WS,FOLLOW_WS_in_startStat79); if (state.failed) return;
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// myChecker.g:54:5: ( function )*
			loop3:
			while (true) {
				int alt3=2;
				switch ( input.LA(1) ) {
				case SHORT_TYPE:
					{
					int LA3_1 = input.LA(2);
					if ( (LA3_1==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				case INT_TYPE:
					{
					int LA3_2 = input.LA(2);
					if ( (LA3_2==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				case LONG_TYPE:
					{
					int LA3_3 = input.LA(2);
					if ( (LA3_3==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				case FLOAT_TYPE:
					{
					int LA3_4 = input.LA(2);
					if ( (LA3_4==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				case DOUBLE_TYPE:
					{
					int LA3_5 = input.LA(2);
					if ( (LA3_5==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				case LONGLONG_TYPE:
					{
					int LA3_6 = input.LA(2);
					if ( (LA3_6==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				case CHAR_TYPE:
					{
					int LA3_7 = input.LA(2);
					if ( (LA3_7==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				case VOID_TYPE:
					{
					int LA3_8 = input.LA(2);
					if ( (LA3_8==FUNCTION_CALL) ) {
						alt3=1;
					}

					}
					break;
				}
				switch (alt3) {
				case 1 :
					// myChecker.g:54:5: function
					{
					pushFollow(FOLLOW_function_in_startStat90);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_mainfunction_in_startStat98);
			mainfunction();
			state._fsp--;
			if (state.failed) return;
			// myChecker.g:56:5: ( function )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CHAR_TYPE||LA4_0==DOUBLE_TYPE||LA4_0==FLOAT_TYPE||LA4_0==INT_TYPE||(LA4_0 >= LONGLONG_TYPE && LA4_0 <= LONG_TYPE)||LA4_0==SHORT_TYPE||LA4_0==VOID_TYPE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myChecker.g:56:5: function
					{
					pushFollow(FOLLOW_function_in_startStat104);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, startStat_StartIndex); }

		}
	}
	// $ANTLR end "startStat"



	// $ANTLR start "mainfunction"
	// myChecker.g:59:1: mainfunction : type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RETURN_ ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* ;
	public final void mainfunction() throws RecognitionException {
		int mainfunction_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myChecker.g:59:13: ( type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RETURN_ ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* )
			// myChecker.g:60:5: type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RETURN_ ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )*
			{
			pushFollow(FOLLOW_type_in_mainfunction117);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,77,FOLLOW_77_in_mainfunction119); if (state.failed) return;
			// myChecker.g:60:18: ( params )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CHAR_TYPE||LA5_0==DOUBLE_TYPE||LA5_0==FLOAT_TYPE||LA5_0==INT_TYPE||(LA5_0 >= LONGLONG_TYPE && LA5_0 <= LONG_TYPE)||LA5_0==SHORT_TYPE||LA5_0==VOID_TYPE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myChecker.g:60:18: params
					{
					pushFollow(FOLLOW_params_in_mainfunction121);
					params();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_mainfunction124); if (state.failed) return;
			// myChecker.g:60:33: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myChecker.g:60:33: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction126); if (state.failed) return;
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_mainfunction133); if (state.failed) return;
			// myChecker.g:61:12: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					int LA7_16 = input.LA(2);
					if ( (synpred7_myChecker()) ) {
						alt7=1;
					}

				}

				switch (alt7) {
				case 1 :
					// myChecker.g:61:12: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction135); if (state.failed) return;
					}
					break;

				default :
					break loop7;
				}
			}

			// myChecker.g:62:9: ( stats )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==BREAK_||LA8_0==CHAR_TYPE||LA8_0==CONTINUE_||LA8_0==DOUBLE_TYPE||(LA8_0 >= FLOAT_TYPE && LA8_0 <= IF_)||LA8_0==INT_TYPE||(LA8_0 >= LONGLONG_TYPE && LA8_0 <= LONG_TYPE)||LA8_0==SHORT_TYPE||(LA8_0 >= VOID_TYPE && LA8_0 <= WHILE_)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myChecker.g:62:9: stats
					{
					pushFollow(FOLLOW_stats_in_mainfunction146);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}

			// myChecker.g:62:17: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myChecker.g:62:17: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction150); if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,RETURN_,FOLLOW_RETURN__in_mainfunction161); if (state.failed) return;
			// myChecker.g:63:17: ( DEC_NUM | FLOAT_NUM )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DEC_NUM||LA10_0==FLOAT_NUM) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// myChecker.g:
					{
					if ( input.LA(1)==DEC_NUM||input.LA(1)==FLOAT_NUM ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_mainfunction172); if (state.failed) return;
			match(input,RBRACE,FOLLOW_RBRACE_in_mainfunction179); if (state.failed) return;
			// myChecker.g:64:12: ( WS )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myChecker.g:64:12: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction181); if (state.failed) return;
					}
					break;

				default :
					break loop11;
				}
			}

			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("MAIN (){ stats } ") ; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, mainfunction_StartIndex); }

		}
	}
	// $ANTLR end "mainfunction"



	// $ANTLR start "type"
	// myChecker.g:69:1: type returns [int attr_type] : ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE );
	public final int type() throws RecognitionException {
		int attr_type = 0;

		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return attr_type; }

			// myChecker.g:70:5: ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE )
			int alt12=8;
			switch ( input.LA(1) ) {
			case SHORT_TYPE:
				{
				alt12=1;
				}
				break;
			case INT_TYPE:
				{
				alt12=2;
				}
				break;
			case LONG_TYPE:
				{
				alt12=3;
				}
				break;
			case FLOAT_TYPE:
				{
				alt12=4;
				}
				break;
			case DOUBLE_TYPE:
				{
				alt12=5;
				}
				break;
			case LONGLONG_TYPE:
				{
				alt12=6;
				}
				break;
			case CHAR_TYPE:
				{
				alt12=7;
				}
				break;
			case VOID_TYPE:
				{
				alt12=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return attr_type;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// myChecker.g:70:9: SHORT_TYPE
					{
					match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_type215); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: SHORT") ; attr_type = 1 ; }
					}
					break;
				case 2 :
					// myChecker.g:71:9: INT_TYPE
					{
					match(input,INT_TYPE,FOLLOW_INT_TYPE_in_type236); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: INT") ; attr_type = 2 ; }
					}
					break;
				case 3 :
					// myChecker.g:72:9: LONG_TYPE
					{
					match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_type261); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: LONG") ; attr_type = 3 ; }
					}
					break;
				case 4 :
					// myChecker.g:73:9: FLOAT_TYPE
					{
					match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_type284); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: FLOAT") ; attr_type = 4 ; }
					}
					break;
				case 5 :
					// myChecker.g:74:9: DOUBLE_TYPE
					{
					match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_type305); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: DOUBLE") ; attr_type = 5 ; }
					}
					break;
				case 6 :
					// myChecker.g:75:9: LONGLONG_TYPE
					{
					match(input,LONGLONG_TYPE,FOLLOW_LONGLONG_TYPE_in_type324); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: LONGLONG") ; attr_type = 6 ; }
					}
					break;
				case 7 :
					// myChecker.g:76:9: CHAR_TYPE
					{
					match(input,CHAR_TYPE,FOLLOW_CHAR_TYPE_in_type339); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: CHAR") ; attr_type = 7 ; }
					}
					break;
				case 8 :
					// myChecker.g:77:9: VOID_TYPE
					{
					match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type362); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("type: VOID") ; attr_type = 8 ; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, type_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "stats"
	// myChecker.g:80:1: stats : ( assignmentStat | whileStat | ifelseStat | forStat | declareStat | procedStat | breakStat | continueStat );
	public final void stats() throws RecognitionException {
		int stats_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// myChecker.g:81:5: ( assignmentStat | whileStat | ifelseStat | forStat | declareStat | procedStat | breakStat | continueStat )
			int alt13=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt13=1;
				}
				break;
			case WHILE_:
				{
				alt13=2;
				}
				break;
			case IF_:
				{
				alt13=3;
				}
				break;
			case FOR_:
				{
				alt13=4;
				}
				break;
			case CHAR_TYPE:
			case DOUBLE_TYPE:
			case FLOAT_TYPE:
			case INT_TYPE:
			case LONGLONG_TYPE:
			case LONG_TYPE:
			case SHORT_TYPE:
			case VOID_TYPE:
				{
				alt13=5;
				}
				break;
			case FUNCTION_CALL:
				{
				alt13=6;
				}
				break;
			case BREAK_:
				{
				alt13=7;
				}
				break;
			case CONTINUE_:
				{
				alt13=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myChecker.g:81:9: assignmentStat
					{
					pushFollow(FOLLOW_assignmentStat_in_stats385);
					assignmentStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:82:9: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_stats397);
					whileStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myChecker.g:83:9: ifelseStat
					{
					pushFollow(FOLLOW_ifelseStat_in_stats414);
					ifelseStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myChecker.g:84:9: forStat
					{
					pushFollow(FOLLOW_forStat_in_stats430);
					forStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myChecker.g:85:9: declareStat
					{
					pushFollow(FOLLOW_declareStat_in_stats449);
					declareStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myChecker.g:86:9: procedStat
					{
					pushFollow(FOLLOW_procedStat_in_stats464);
					procedStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// myChecker.g:88:9: breakStat
					{
					pushFollow(FOLLOW_breakStat_in_stats484);
					breakStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// myChecker.g:89:9: continueStat
					{
					pushFollow(FOLLOW_continueStat_in_stats501);
					continueStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, stats_StartIndex); }

		}
	}
	// $ANTLR end "stats"



	// $ANTLR start "assignmentStat"
	// myChecker.g:92:1: assignmentStat returns [int attr_type] : (a= ID OP_ASS expr SEMICOL | ID OP_ASS ( DEC_NUM | FLOAT_NUM ) SEMICOL );
	public final int assignmentStat() throws RecognitionException {
		int attr_type = 0;

		int assignmentStat_StartIndex = input.index();

		Token a=null;
		ParserRuleReturnScope expr1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return attr_type; }

			// myChecker.g:93:5: (a= ID OP_ASS expr SEMICOL | ID OP_ASS ( DEC_NUM | FLOAT_NUM ) SEMICOL )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ID) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==OP_ASS) ) {
					int LA14_2 = input.LA(3);
					if ( (synpred27_myChecker()) ) {
						alt14=1;
					}
					else if ( (true) ) {
						alt14=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return attr_type;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return attr_type;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// myChecker.g:93:9: a= ID OP_ASS expr SEMICOL
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_assignmentStat528); if (state.failed) return attr_type;
					match(input,OP_ASS,FOLLOW_OP_ASS_in_assignmentStat530); if (state.failed) return attr_type;
					pushFollow(FOLLOW_expr_in_assignmentStat532);
					expr1=expr();
					state._fsp--;
					if (state.failed) return attr_type;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_assignmentStat534); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
					       if(symbolTable.containsKey((a!=null?a.getText():null)))
					       {
					           if(symbolTable.get((a!=null?a.getText():null)) != (expr1!=null?((myCheckerParser.expr_return)expr1).attr_type:0))
					           {
					                System.out.println("Type Error on Line : " + a.getLine() + " : Type mismatch for the two side of assignment");
					                attr_type = -2;
					           }
					           else
					           {
					                attr_type = symbolTable.get((a!=null?a.getText():null));
					           }
					       } 
					       else
					       {
					            System.out.println("Type Error on Line : " + a.getLine() + " : Unknown Idenifier " + (a!=null?a.getText():null));
					            attr_type = -1;
					       }
					    }
					}
					break;
				case 2 :
					// myChecker.g:113:9: ID OP_ASS ( DEC_NUM | FLOAT_NUM ) SEMICOL
					{
					match(input,ID,FOLLOW_ID_in_assignmentStat572); if (state.failed) return attr_type;
					match(input,OP_ASS,FOLLOW_OP_ASS_in_assignmentStat575); if (state.failed) return attr_type;
					if ( input.LA(1)==DEC_NUM||input.LA(1)==FLOAT_NUM ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return attr_type;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,SEMICOL,FOLLOW_SEMICOL_in_assignmentStat587); if (state.failed) return attr_type;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, assignmentStat_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "assignmentStat"



	// $ANTLR start "whileStat"
	// myChecker.g:116:1: whileStat : WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ;
	public final void whileStat() throws RecognitionException {
		int whileStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// myChecker.g:117:5: ( WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* )
			// myChecker.g:119:5: WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )*
			{
			match(input,WHILE_,FOLLOW_WHILE__in_whileStat613); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_whileStat615);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat618); if (state.failed) return;
			// myChecker.g:119:25: ( WS )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==WS) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// myChecker.g:119:25: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat620); if (state.failed) return;
					}
					break;

				default :
					break loop15;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_whileStat628); if (state.failed) return;
			// myChecker.g:120:12: ( WS )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==WS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// myChecker.g:120:12: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat630); if (state.failed) return;
					}
					break;

				default :
					break loop16;
				}
			}

			// myChecker.g:121:9: ( stats )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==BREAK_||LA17_0==CHAR_TYPE||LA17_0==CONTINUE_||LA17_0==DOUBLE_TYPE||(LA17_0 >= FLOAT_TYPE && LA17_0 <= IF_)||LA17_0==INT_TYPE||(LA17_0 >= LONGLONG_TYPE && LA17_0 <= LONG_TYPE)||LA17_0==SHORT_TYPE||(LA17_0 >= VOID_TYPE && LA17_0 <= WHILE_)) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// myChecker.g:121:9: stats
					{
					pushFollow(FOLLOW_stats_in_whileStat641);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			// myChecker.g:121:16: ( WS )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// myChecker.g:121:16: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat644); if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_whileStat652); if (state.failed) return;
			// myChecker.g:122:12: ( WS )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					int LA19_1 = input.LA(2);
					if ( (synpred33_myChecker()) ) {
						alt19=1;
					}

				}

				switch (alt19) {
				case 1 :
					// myChecker.g:122:12: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat654); if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, whileStat_StartIndex); }

		}
	}
	// $ANTLR end "whileStat"



	// $ANTLR start "ifelseStat"
	// myChecker.g:125:1: ifelseStat : IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )? ;
	public final void ifelseStat() throws RecognitionException {
		int ifelseStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// myChecker.g:126:5: ( IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )? )
			// myChecker.g:128:5: IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )?
			{
			match(input,IF_,FOLLOW_IF__in_ifelseStat680); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifelseStat682);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifelseStat685); if (state.failed) return;
			// myChecker.g:128:22: ( WS )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==WS) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// myChecker.g:128:22: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat687); if (state.failed) return;
					}
					break;

				default :
					break loop20;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat695); if (state.failed) return;
			// myChecker.g:129:12: ( WS )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// myChecker.g:129:12: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat697); if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}

			// myChecker.g:130:13: ( stats )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==BREAK_||LA22_0==CHAR_TYPE||LA22_0==CONTINUE_||LA22_0==DOUBLE_TYPE||(LA22_0 >= FLOAT_TYPE && LA22_0 <= IF_)||LA22_0==INT_TYPE||(LA22_0 >= LONGLONG_TYPE && LA22_0 <= LONG_TYPE)||LA22_0==SHORT_TYPE||(LA22_0 >= VOID_TYPE && LA22_0 <= WHILE_)) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myChecker.g:130:13: stats
					{
					pushFollow(FOLLOW_stats_in_ifelseStat712);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			// myChecker.g:130:20: ( WS )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// myChecker.g:130:20: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat715); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat723); if (state.failed) return;
			// myChecker.g:131:12: ( WS )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WS) ) {
					int LA24_3 = input.LA(2);
					if ( (synpred38_myChecker()) ) {
						alt24=1;
					}

				}

				switch (alt24) {
				case 1 :
					// myChecker.g:131:12: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat725); if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}

			// myChecker.g:132:5: ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==76) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// myChecker.g:132:6: 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )*
					{
					match(input,76,FOLLOW_76_in_ifelseStat733); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_ifelseStat735);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_ifelseStat738); if (state.failed) return;
					// myChecker.g:132:30: ( WS )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==WS) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// myChecker.g:132:30: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat740); if (state.failed) return;
							}
							break;

						default :
							break loop25;
						}
					}

					match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat751); if (state.failed) return;
					// myChecker.g:133:16: ( WS )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==WS) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// myChecker.g:133:16: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat753); if (state.failed) return;
							}
							break;

						default :
							break loop26;
						}
					}

					// myChecker.g:134:13: ( stats )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==BREAK_||LA27_0==CHAR_TYPE||LA27_0==CONTINUE_||LA27_0==DOUBLE_TYPE||(LA27_0 >= FLOAT_TYPE && LA27_0 <= IF_)||LA27_0==INT_TYPE||(LA27_0 >= LONGLONG_TYPE && LA27_0 <= LONG_TYPE)||LA27_0==SHORT_TYPE||(LA27_0 >= VOID_TYPE && LA27_0 <= WHILE_)) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// myChecker.g:134:13: stats
							{
							pushFollow(FOLLOW_stats_in_ifelseStat768);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat780); if (state.failed) return;
					// myChecker.g:135:16: ( WS )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==WS) ) {
							int LA28_2 = input.LA(2);
							if ( (synpred42_myChecker()) ) {
								alt28=1;
							}

						}

						switch (alt28) {
						case 1 :
							// myChecker.g:135:16: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat782); if (state.failed) return;
							}
							break;

						default :
							break loop28;
						}
					}

					}
					break;

				default :
					break loop29;
				}
			}

			// myChecker.g:137:5: ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ELSE_) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// myChecker.g:137:6: ELSE_ ( WS )* LBRACE ( stats )+ RBRACE
					{
					match(input,ELSE_,FOLLOW_ELSE__in_ifelseStat798); if (state.failed) return;
					// myChecker.g:137:12: ( WS )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==WS) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// myChecker.g:137:12: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat800); if (state.failed) return;
							}
							break;

						default :
							break loop30;
						}
					}

					match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat811); if (state.failed) return;
					// myChecker.g:139:13: ( stats )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==BREAK_||LA31_0==CHAR_TYPE||LA31_0==CONTINUE_||LA31_0==DOUBLE_TYPE||(LA31_0 >= FLOAT_TYPE && LA31_0 <= IF_)||LA31_0==INT_TYPE||(LA31_0 >= LONGLONG_TYPE && LA31_0 <= LONG_TYPE)||LA31_0==SHORT_TYPE||(LA31_0 >= VOID_TYPE && LA31_0 <= WHILE_)) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// myChecker.g:139:13: stats
							{
							pushFollow(FOLLOW_stats_in_ifelseStat825);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat837); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, ifelseStat_StartIndex); }

		}
	}
	// $ANTLR end "ifelseStat"



	// $ANTLR start "forStat"
	// myChecker.g:145:1: forStat : FOR_ ( expr )* SEMICOL ( expr )* SEMICOL ( expr )* RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ;
	public final void forStat() throws RecognitionException {
		int forStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// myChecker.g:146:5: ( FOR_ ( expr )* SEMICOL ( expr )* SEMICOL ( expr )* RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* )
			// myChecker.g:148:5: FOR_ ( expr )* SEMICOL ( expr )* SEMICOL ( expr )* RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )*
			{
			match(input,FOR_,FOLLOW_FOR__in_forStat869); if (state.failed) return;
			// myChecker.g:148:10: ( expr )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==CHAR||LA33_0==DEC_NUM||LA33_0==FLOAT_NUM||LA33_0==ID||LA33_0==LPAREN) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// myChecker.g:148:10: expr
					{
					pushFollow(FOLLOW_expr_in_forStat871);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop33;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat875); if (state.failed) return;
			// myChecker.g:148:26: ( expr )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==CHAR||LA34_0==DEC_NUM||LA34_0==FLOAT_NUM||LA34_0==ID||LA34_0==LPAREN) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// myChecker.g:148:26: expr
					{
					pushFollow(FOLLOW_expr_in_forStat878);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat881); if (state.failed) return;
			// myChecker.g:148:40: ( expr )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==CHAR||LA35_0==DEC_NUM||LA35_0==FLOAT_NUM||LA35_0==ID||LA35_0==LPAREN) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// myChecker.g:148:40: expr
					{
					pushFollow(FOLLOW_expr_in_forStat883);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat886); if (state.failed) return;
			// myChecker.g:148:53: ( WS )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// myChecker.g:148:53: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat888); if (state.failed) return;
					}
					break;

				default :
					break loop36;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_forStat895); if (state.failed) return;
			// myChecker.g:149:12: ( WS )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==WS) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// myChecker.g:149:12: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat897); if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}

			// myChecker.g:150:9: ( stats )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==BREAK_||LA38_0==CHAR_TYPE||LA38_0==CONTINUE_||LA38_0==DOUBLE_TYPE||(LA38_0 >= FLOAT_TYPE && LA38_0 <= IF_)||LA38_0==INT_TYPE||(LA38_0 >= LONGLONG_TYPE && LA38_0 <= LONG_TYPE)||LA38_0==SHORT_TYPE||(LA38_0 >= VOID_TYPE && LA38_0 <= WHILE_)) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// myChecker.g:150:9: stats
					{
					pushFollow(FOLLOW_stats_in_forStat908);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}

			// myChecker.g:150:17: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// myChecker.g:150:17: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat912); if (state.failed) return;
					}
					break;

				default :
					break loop39;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_forStat919); if (state.failed) return;
			// myChecker.g:151:12: ( WS )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==WS) ) {
					int LA40_1 = input.LA(2);
					if ( (synpred54_myChecker()) ) {
						alt40=1;
					}

				}

				switch (alt40) {
				case 1 :
					// myChecker.g:151:12: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat921); if (state.failed) return;
					}
					break;

				default :
					break loop40;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, forStat_StartIndex); }

		}
	}
	// $ANTLR end "forStat"



	// $ANTLR start "function"
	// myChecker.g:154:1: function : ( type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE | type FUNCTION_CALL ( params )* RPAREN SEMICOL );
	public final void function() throws RecognitionException {
		int function_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// myChecker.g:155:5: ( type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE | type FUNCTION_CALL ( params )* RPAREN SEMICOL )
			int alt46=2;
			switch ( input.LA(1) ) {
			case SHORT_TYPE:
				{
				int LA46_1 = input.LA(2);
				if ( (LA46_1==FUNCTION_CALL) ) {
					int LA46_9 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT_TYPE:
				{
				int LA46_2 = input.LA(2);
				if ( (LA46_2==FUNCTION_CALL) ) {
					int LA46_10 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG_TYPE:
				{
				int LA46_3 = input.LA(2);
				if ( (LA46_3==FUNCTION_CALL) ) {
					int LA46_11 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT_TYPE:
				{
				int LA46_4 = input.LA(2);
				if ( (LA46_4==FUNCTION_CALL) ) {
					int LA46_12 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE_TYPE:
				{
				int LA46_5 = input.LA(2);
				if ( (LA46_5==FUNCTION_CALL) ) {
					int LA46_13 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONGLONG_TYPE:
				{
				int LA46_6 = input.LA(2);
				if ( (LA46_6==FUNCTION_CALL) ) {
					int LA46_14 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR_TYPE:
				{
				int LA46_7 = input.LA(2);
				if ( (LA46_7==FUNCTION_CALL) ) {
					int LA46_15 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID_TYPE:
				{
				int LA46_8 = input.LA(2);
				if ( (LA46_8==FUNCTION_CALL) ) {
					int LA46_16 = input.LA(3);
					if ( (synpred60_myChecker()) ) {
						alt46=1;
					}
					else if ( (true) ) {
						alt46=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}
			switch (alt46) {
				case 1 :
					// myChecker.g:157:5: type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE
					{
					pushFollow(FOLLOW_type_in_function944);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function946); if (state.failed) return;
					// myChecker.g:157:24: ( params )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==CHAR_TYPE||LA41_0==DOUBLE_TYPE||LA41_0==FLOAT_TYPE||LA41_0==INT_TYPE||(LA41_0 >= LONGLONG_TYPE && LA41_0 <= LONG_TYPE)||LA41_0==SHORT_TYPE||LA41_0==VOID_TYPE) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// myChecker.g:157:24: params
							{
							pushFollow(FOLLOW_params_in_function948);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop41;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_function951); if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_function958); if (state.failed) return;
					// myChecker.g:159:9: ( stats )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==BREAK_||LA42_0==CHAR_TYPE||LA42_0==CONTINUE_||LA42_0==DOUBLE_TYPE||(LA42_0 >= FLOAT_TYPE && LA42_0 <= IF_)||LA42_0==INT_TYPE||(LA42_0 >= LONGLONG_TYPE && LA42_0 <= LONG_TYPE)||LA42_0==SHORT_TYPE||(LA42_0 >= VOID_TYPE && LA42_0 <= WHILE_)) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// myChecker.g:159:9: stats
							{
							pushFollow(FOLLOW_stats_in_function969);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop42;
						}
					}

					// myChecker.g:159:16: ( WS )*
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==WS) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// myChecker.g:159:16: WS
							{
							match(input,WS,FOLLOW_WS_in_function972); if (state.failed) return;
							}
							break;

						default :
							break loop43;
						}
					}

					match(input,RETURN_,FOLLOW_RETURN__in_function983); if (state.failed) return;
					// myChecker.g:160:18: ( DEC_NUM | FLOAT_NUM )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==DEC_NUM||LA44_0==FLOAT_NUM) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// myChecker.g:
							{
							if ( input.LA(1)==DEC_NUM||input.LA(1)==FLOAT_NUM ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					match(input,SEMICOL,FOLLOW_SEMICOL_in_function994); if (state.failed) return;
					match(input,RBRACE,FOLLOW_RBRACE_in_function1001); if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:162:9: type FUNCTION_CALL ( params )* RPAREN SEMICOL
					{
					pushFollow(FOLLOW_type_in_function1044);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function1046); if (state.failed) return;
					// myChecker.g:162:28: ( params )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==CHAR_TYPE||LA45_0==DOUBLE_TYPE||LA45_0==FLOAT_TYPE||LA45_0==INT_TYPE||(LA45_0 >= LONGLONG_TYPE && LA45_0 <= LONG_TYPE)||LA45_0==SHORT_TYPE||LA45_0==VOID_TYPE) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// myChecker.g:162:28: params
							{
							pushFollow(FOLLOW_params_in_function1048);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop45;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_function1051); if (state.failed) return;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_function1054); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, function_StartIndex); }

		}
	}
	// $ANTLR end "function"



	// $ANTLR start "declareStat"
	// myChecker.g:167:1: declareStat returns [int attr_type] : type a= ID ( OP_ASS b= expr )? ( COMMA c= ID ( OP_ASS d= expr ) )* SEMICOL ;
	public final int declareStat() throws RecognitionException {
		int attr_type = 0;

		int declareStat_StartIndex = input.index();

		Token a=null;
		Token c=null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope d =null;
		int type2 =0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return attr_type; }

			// myChecker.g:168:5: ( type a= ID ( OP_ASS b= expr )? ( COMMA c= ID ( OP_ASS d= expr ) )* SEMICOL )
			// myChecker.g:168:9: type a= ID ( OP_ASS b= expr )? ( COMMA c= ID ( OP_ASS d= expr ) )* SEMICOL
			{
			pushFollow(FOLLOW_type_in_declareStat1075);
			type2=type();
			state._fsp--;
			if (state.failed) return attr_type;
			a=(Token)match(input,ID,FOLLOW_ID_in_declareStat1081); if (state.failed) return attr_type;
			// myChecker.g:168:21: ( OP_ASS b= expr )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==OP_ASS) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// myChecker.g:168:22: OP_ASS b= expr
					{
					match(input,OP_ASS,FOLLOW_OP_ASS_in_declareStat1084); if (state.failed) return attr_type;
					pushFollow(FOLLOW_expr_in_declareStat1090);
					b=expr();
					state._fsp--;
					if (state.failed) return attr_type;
					}
					break;

			}

			// myChecker.g:168:40: ( COMMA c= ID ( OP_ASS d= expr ) )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==COMMA) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// myChecker.g:168:41: COMMA c= ID ( OP_ASS d= expr )
					{
					match(input,COMMA,FOLLOW_COMMA_in_declareStat1095); if (state.failed) return attr_type;
					c=(Token)match(input,ID,FOLLOW_ID_in_declareStat1101); if (state.failed) return attr_type;
					// myChecker.g:168:54: ( OP_ASS d= expr )
					// myChecker.g:168:55: OP_ASS d= expr
					{
					match(input,OP_ASS,FOLLOW_OP_ASS_in_declareStat1104); if (state.failed) return attr_type;
					pushFollow(FOLLOW_expr_in_declareStat1110);
					d=expr();
					state._fsp--;
					if (state.failed) return attr_type;
					}

					}
					break;

				default :
					break loop48;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_declareStat1115); if (state.failed) return attr_type;
			if ( state.backtracking==0 ) {
			            if (symbolTable.containsKey((a!=null?a.getText():null)))
			            {
			                System.out.println("Type Error : " + a.getLine() + " : Redeclared identifier " + (a!=null?a.getText():null) + ".");
			                attr_type = -2;
			            }
			            else if( (type2 != (b!=null?((myCheckerParser.expr_return)b).attr_type:0) ) && ( (b!=null?input.toString(b.start,b.stop):null) != null) )
			            {
			                System.out.println("Type Error on Line : " + (b!=null?(b.start):null).getLine() + " : Type mismatch for 2 side operands in an assignment.");
			                attr_type = -2;
			                symbolTable.put((a!=null?a.getText():null), type2);
			            }
			            else
			            {
			                symbolTable.put((a!=null?a.getText():null), type2);
			            }

			            if((c!=null?c.getText():null) != null)
			            {
			                if (symbolTable.containsKey((c!=null?c.getText():null)))
			                {
			                    System.out.println("Type Error on Line : " + c.getLine() + " : Redeclared identifier " + (c!=null?c.getText():null) + ".");
			                    attr_type = -2;
			                }
			                else if( (type2 != (d!=null?((myCheckerParser.expr_return)d).attr_type:0) ) && ( (d!=null?input.toString(d.start,d.stop):null) != null) )
			                {
			                    System.out.println("Type Error on Line : " + (d!=null?(d.start):null).getLine() + " : Type mismatch for 2 side operands in an assignment.");
			                    attr_type = -2;
			                    symbolTable.put((c!=null?c.getText():null), type2);
			                }
			                else
			                {
			                    symbolTable.put((c!=null?c.getText():null), type2);
			                }
			            }
			        }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, declareStat_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "declareStat"



	// $ANTLR start "procedStat"
	// myChecker.g:208:1: procedStat : FUNCTION_CALL arguments RPAREN SEMICOL ;
	public final void procedStat() throws RecognitionException {
		int procedStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myChecker.g:209:5: ( FUNCTION_CALL arguments RPAREN SEMICOL )
			// myChecker.g:209:9: FUNCTION_CALL arguments RPAREN SEMICOL
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_procedStat1149); if (state.failed) return;
			pushFollow(FOLLOW_arguments_in_procedStat1151);
			arguments();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_procedStat1153); if (state.failed) return;
			match(input,SEMICOL,FOLLOW_SEMICOL_in_procedStat1155); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, procedStat_StartIndex); }

		}
	}
	// $ANTLR end "procedStat"



	// $ANTLR start "breakStat"
	// myChecker.g:216:1: breakStat : BREAK_ SEMICOL ;
	public final void breakStat() throws RecognitionException {
		int breakStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myChecker.g:217:5: ( BREAK_ SEMICOL )
			// myChecker.g:217:9: BREAK_ SEMICOL
			{
			match(input,BREAK_,FOLLOW_BREAK__in_breakStat1171); if (state.failed) return;
			match(input,SEMICOL,FOLLOW_SEMICOL_in_breakStat1173); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, breakStat_StartIndex); }

		}
	}
	// $ANTLR end "breakStat"



	// $ANTLR start "continueStat"
	// myChecker.g:220:1: continueStat : CONTINUE_ SEMICOL ;
	public final void continueStat() throws RecognitionException {
		int continueStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myChecker.g:221:5: ( CONTINUE_ SEMICOL )
			// myChecker.g:221:9: CONTINUE_ SEMICOL
			{
			match(input,CONTINUE_,FOLLOW_CONTINUE__in_continueStat1188); if (state.failed) return;
			match(input,SEMICOL,FOLLOW_SEMICOL_in_continueStat1190); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, continueStat_StartIndex); }

		}
	}
	// $ANTLR end "continueStat"



	// $ANTLR start "arguments"
	// myChecker.g:224:1: arguments : expr ( COMMA expr )* ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myChecker.g:225:5: ( expr ( COMMA expr )* )
			// myChecker.g:225:9: expr ( COMMA expr )*
			{
			pushFollow(FOLLOW_expr_in_arguments1205);
			expr();
			state._fsp--;
			if (state.failed) return;
			// myChecker.g:225:14: ( COMMA expr )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==COMMA) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// myChecker.g:225:15: COMMA expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_arguments1208); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_arguments1210);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"



	// $ANTLR start "params"
	// myChecker.g:228:1: params : param ( COMMA param )* ;
	public final void params() throws RecognitionException {
		int params_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myChecker.g:229:5: ( param ( COMMA param )* )
			// myChecker.g:229:9: param ( COMMA param )*
			{
			pushFollow(FOLLOW_param_in_params1227);
			param();
			state._fsp--;
			if (state.failed) return;
			// myChecker.g:229:15: ( COMMA param )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==COMMA) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// myChecker.g:229:16: COMMA param
					{
					match(input,COMMA,FOLLOW_COMMA_in_params1230); if (state.failed) return;
					pushFollow(FOLLOW_param_in_params1232);
					param();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop50;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, params_StartIndex); }

		}
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// myChecker.g:232:1: param : ( type ID | type );
	public final void param() throws RecognitionException {
		int param_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myChecker.g:233:5: ( type ID | type )
			int alt51=2;
			alt51 = dfa51.predict(input);
			switch (alt51) {
				case 1 :
					// myChecker.g:233:9: type ID
					{
					pushFollow(FOLLOW_type_in_param1249);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_param1251); if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:234:9: type
					{
					pushFollow(FOLLOW_type_in_param1266);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, param_StartIndex); }

		}
	}
	// $ANTLR end "param"


	public static class expr_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "expr"
	// myChecker.g:237:1: expr returns [int attr_type] : a= operationStat ( ( OP_LAND | OP_LOR ) b= operationStat )* ;
	public final myCheckerParser.expr_return expr() throws RecognitionException {
		myCheckerParser.expr_return retval = new myCheckerParser.expr_return();
		retval.start = input.LT(1);
		int expr_StartIndex = input.index();

		int a =0;
		int b =0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// myChecker.g:238:5: (a= operationStat ( ( OP_LAND | OP_LOR ) b= operationStat )* )
			// myChecker.g:238:9: a= operationStat ( ( OP_LAND | OP_LOR ) b= operationStat )*
			{
			pushFollow(FOLLOW_operationStat_in_expr1289);
			a=operationStat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = a ; }
			// myChecker.g:239:5: ( ( OP_LAND | OP_LOR ) b= operationStat )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==OP_LAND||LA52_0==OP_LOR) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// myChecker.g:239:6: ( OP_LAND | OP_LOR ) b= operationStat
					{
					if ( input.LA(1)==OP_LAND||input.LA(1)==OP_LOR ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_operationStat_in_expr1310);
					b=operationStat();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop52;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr"



	// $ANTLR start "operationStat"
	// myChecker.g:242:1: operationStat returns [int attr_type] : a= add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) b= add )* ;
	public final int operationStat() throws RecognitionException {
		int attr_type = 0;

		int operationStat_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return attr_type; }

			// myChecker.g:243:5: (a= add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) b= add )* )
			// myChecker.g:243:9: a= add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) b= add )*
			{
			pushFollow(FOLLOW_add_in_operationStat1335);
			a=add();
			state._fsp--;
			if (state.failed) return attr_type;
			if ( state.backtracking==0 ) { attr_type = (a!=null?((myCheckerParser.add_return)a).attr_type:0) ; }
			// myChecker.g:244:9: ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) b= add )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==OP_ADDAS||LA53_0==OP_ASS||(LA53_0 >= OP_DIVAS && LA53_0 <= OP_GT)||LA53_0==OP_LE||(LA53_0 >= OP_LSAS && LA53_0 <= OP_MODAS)||(LA53_0 >= OP_MULAS && LA53_0 <= OP_NE)||LA53_0==OP_RSAS||LA53_0==OP_SUBAS||LA53_0==OP_XORAS) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// myChecker.g:244:10: ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) b= add
					{
					if ( input.LA(1)==OP_ADDAS||input.LA(1)==OP_ASS||(input.LA(1) >= OP_DIVAS && input.LA(1) <= OP_GT)||input.LA(1)==OP_LE||(input.LA(1) >= OP_LSAS && input.LA(1) <= OP_MODAS)||(input.LA(1) >= OP_MULAS && input.LA(1) <= OP_NE)||input.LA(1)==OP_RSAS||input.LA(1)==OP_SUBAS||input.LA(1)==OP_XORAS ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return attr_type;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_add_in_operationStat1441);
					b=add();
					state._fsp--;
					if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
					                if ((a!=null?((myCheckerParser.add_return)a).attr_type:0) != (b!=null?((myCheckerParser.add_return)b).attr_type:0))
					                {
					                    System.out.println("Type Error on Line : " + (a!=null?(a.start):null).getLine() + " : Type mismatch for operation in the expression.");
					                    attr_type = -2;
					                }
					            }
					}
					break;

				default :
					break loop53;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, operationStat_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "operationStat"


	public static class add_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "add"
	// myChecker.g:257:1: add returns [int attr_type] : a= multiply ( ( OP_ADD | OP_SUB ) b= multiply )* ;
	public final myCheckerParser.add_return add() throws RecognitionException {
		myCheckerParser.add_return retval = new myCheckerParser.add_return();
		retval.start = input.LT(1);
		int add_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// myChecker.g:258:5: (a= multiply ( ( OP_ADD | OP_SUB ) b= multiply )* )
			// myChecker.g:259:5: a= multiply ( ( OP_ADD | OP_SUB ) b= multiply )*
			{
			pushFollow(FOLLOW_multiply_in_add1494);
			a=multiply();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = (a!=null?((myCheckerParser.multiply_return)a).attr_type:0) ; }
			// myChecker.g:260:5: ( ( OP_ADD | OP_SUB ) b= multiply )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==OP_ADD||LA54_0==OP_SUB) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// myChecker.g:260:6: ( OP_ADD | OP_SUB ) b= multiply
					{
					if ( input.LA(1)==OP_ADD||input.LA(1)==OP_SUB ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiply_in_add1515);
					b=multiply();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					            if ((a!=null?((myCheckerParser.multiply_return)a).attr_type:0) != (b!=null?((myCheckerParser.multiply_return)b).attr_type:0))
					            {
					                System.out.println("Type Error on Line : " + (a!=null?(a.start):null).getLine() + " : Type mismatch for add or sub in the expression.");
					                retval.attr_type = -2;
					            }
					        }
					}
					break;

				default :
					break loop54;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, add_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "add"


	public static class multiply_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "multiply"
	// myChecker.g:271:1: multiply returns [int attr_type] : a= atom ( ( OP_MUL | OP_DIV ) b= atom )* ;
	public final myCheckerParser.multiply_return multiply() throws RecognitionException {
		myCheckerParser.multiply_return retval = new myCheckerParser.multiply_return();
		retval.start = input.LT(1);
		int multiply_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// myChecker.g:272:5: (a= atom ( ( OP_MUL | OP_DIV ) b= atom )* )
			// myChecker.g:273:5: a= atom ( ( OP_MUL | OP_DIV ) b= atom )*
			{
			pushFollow(FOLLOW_atom_in_multiply1557);
			a=atom();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = (a!=null?((myCheckerParser.atom_return)a).attr_type:0) ; }
			// myChecker.g:274:5: ( ( OP_MUL | OP_DIV ) b= atom )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==OP_DIV||LA55_0==OP_MUL) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// myChecker.g:274:6: ( OP_MUL | OP_DIV ) b= atom
					{
					if ( input.LA(1)==OP_DIV||input.LA(1)==OP_MUL ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multiply1580);
					b=atom();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					            if ((a!=null?((myCheckerParser.atom_return)a).attr_type:0) != (b!=null?((myCheckerParser.atom_return)b).attr_type:0))
					            {
					                System.out.println("Type Error on Line : " + (a!=null?(a.start):null).getLine() + " : Type mismatch for mul or div in the expression.");
					                retval.attr_type = -2;
					            }
					        }
					}
					break;

				default :
					break loop55;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, multiply_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "multiply"


	public static class atom_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "atom"
	// myChecker.g:286:1: atom returns [int attr_type] : ( DEC_NUM | FLOAT_NUM | CHAR | ID | LPAREN expr RPAREN );
	public final myCheckerParser.atom_return atom() throws RecognitionException {
		myCheckerParser.atom_return retval = new myCheckerParser.atom_return();
		retval.start = input.LT(1);
		int atom_StartIndex = input.index();

		Token ID3=null;
		ParserRuleReturnScope expr4 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// myChecker.g:287:5: ( DEC_NUM | FLOAT_NUM | CHAR | ID | LPAREN expr RPAREN )
			int alt56=5;
			switch ( input.LA(1) ) {
			case DEC_NUM:
				{
				alt56=1;
				}
				break;
			case FLOAT_NUM:
				{
				alt56=2;
				}
				break;
			case CHAR:
				{
				alt56=3;
				}
				break;
			case ID:
				{
				alt56=4;
				}
				break;
			case LPAREN:
				{
				alt56=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// myChecker.g:287:9: DEC_NUM
					{
					match(input,DEC_NUM,FOLLOW_DEC_NUM_in_atom1617); if (state.failed) return retval;
					if ( state.backtracking==0 ) { /* default it is integer */  retval.attr_type = 2 ; }
					}
					break;
				case 2 :
					// myChecker.g:288:9: FLOAT_NUM
					{
					match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_atom1644); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = 4 ; }
					}
					break;
				case 3 :
					// myChecker.g:289:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_atom1669); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = 7 ; }
					}
					break;
				case 4 :
					// myChecker.g:290:9: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_atom1696); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					            if(symbolTable.containsKey((ID3!=null?ID3.getText():null)))
					            {
					                retval.attr_type = symbolTable.get((ID3!=null?ID3.getText():null));
					            }
					            else
					            {
					                System.out.println("Type Error on Line : " + ID3.getLine() + " : Unknown Idenifier " + (ID3!=null?ID3.getText():null) + ".");
					                retval.attr_type = -1;
					            }
					        }
					}
					break;
				case 5 :
					// myChecker.g:302:9: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom1734); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_atom1736);
					expr4=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_atom1738); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = (expr4!=null?((myCheckerParser.expr_return)expr4).attr_type:0) ; }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, atom_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atom"

	// $ANTLR start synpred7_myChecker
	public final void synpred7_myChecker_fragment() throws RecognitionException {
		// myChecker.g:61:12: ( WS )
		// myChecker.g:61:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred7_myChecker135); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_myChecker

	// $ANTLR start synpred27_myChecker
	public final void synpred27_myChecker_fragment() throws RecognitionException {
		Token a=null;

		// myChecker.g:93:9: (a= ID OP_ASS expr SEMICOL )
		// myChecker.g:93:9: a= ID OP_ASS expr SEMICOL
		{
		a=(Token)match(input,ID,FOLLOW_ID_in_synpred27_myChecker528); if (state.failed) return;
		match(input,OP_ASS,FOLLOW_OP_ASS_in_synpred27_myChecker530); if (state.failed) return;
		pushFollow(FOLLOW_expr_in_synpred27_myChecker532);
		expr();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred27_myChecker534); if (state.failed) return;
		}

	}
	// $ANTLR end synpred27_myChecker

	// $ANTLR start synpred33_myChecker
	public final void synpred33_myChecker_fragment() throws RecognitionException {
		// myChecker.g:122:12: ( WS )
		// myChecker.g:122:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred33_myChecker654); if (state.failed) return;
		}

	}
	// $ANTLR end synpred33_myChecker

	// $ANTLR start synpred38_myChecker
	public final void synpred38_myChecker_fragment() throws RecognitionException {
		// myChecker.g:131:12: ( WS )
		// myChecker.g:131:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred38_myChecker725); if (state.failed) return;
		}

	}
	// $ANTLR end synpred38_myChecker

	// $ANTLR start synpred42_myChecker
	public final void synpred42_myChecker_fragment() throws RecognitionException {
		// myChecker.g:135:16: ( WS )
		// myChecker.g:135:16: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred42_myChecker782); if (state.failed) return;
		}

	}
	// $ANTLR end synpred42_myChecker

	// $ANTLR start synpred54_myChecker
	public final void synpred54_myChecker_fragment() throws RecognitionException {
		// myChecker.g:151:12: ( WS )
		// myChecker.g:151:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred54_myChecker921); if (state.failed) return;
		}

	}
	// $ANTLR end synpred54_myChecker

	// $ANTLR start synpred60_myChecker
	public final void synpred60_myChecker_fragment() throws RecognitionException {
		// myChecker.g:157:5: ( type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE )
		// myChecker.g:157:5: type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE
		{
		pushFollow(FOLLOW_type_in_synpred60_myChecker944);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_synpred60_myChecker946); if (state.failed) return;
		// myChecker.g:157:24: ( params )*
		loop64:
		while (true) {
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==CHAR_TYPE||LA64_0==DOUBLE_TYPE||LA64_0==FLOAT_TYPE||LA64_0==INT_TYPE||(LA64_0 >= LONGLONG_TYPE && LA64_0 <= LONG_TYPE)||LA64_0==SHORT_TYPE||LA64_0==VOID_TYPE) ) {
				alt64=1;
			}

			switch (alt64) {
			case 1 :
				// myChecker.g:157:24: params
				{
				pushFollow(FOLLOW_params_in_synpred60_myChecker948);
				params();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop64;
			}
		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred60_myChecker951); if (state.failed) return;
		match(input,LBRACE,FOLLOW_LBRACE_in_synpred60_myChecker958); if (state.failed) return;
		// myChecker.g:159:9: ( stats )*
		loop65:
		while (true) {
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==BREAK_||LA65_0==CHAR_TYPE||LA65_0==CONTINUE_||LA65_0==DOUBLE_TYPE||(LA65_0 >= FLOAT_TYPE && LA65_0 <= IF_)||LA65_0==INT_TYPE||(LA65_0 >= LONGLONG_TYPE && LA65_0 <= LONG_TYPE)||LA65_0==SHORT_TYPE||(LA65_0 >= VOID_TYPE && LA65_0 <= WHILE_)) ) {
				alt65=1;
			}

			switch (alt65) {
			case 1 :
				// myChecker.g:159:9: stats
				{
				pushFollow(FOLLOW_stats_in_synpred60_myChecker969);
				stats();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop65;
			}
		}

		// myChecker.g:159:16: ( WS )*
		loop66:
		while (true) {
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==WS) ) {
				alt66=1;
			}

			switch (alt66) {
			case 1 :
				// myChecker.g:159:16: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred60_myChecker972); if (state.failed) return;
				}
				break;

			default :
				break loop66;
			}
		}

		match(input,RETURN_,FOLLOW_RETURN__in_synpred60_myChecker983); if (state.failed) return;
		// myChecker.g:160:18: ( DEC_NUM | FLOAT_NUM )?
		int alt67=2;
		int LA67_0 = input.LA(1);
		if ( (LA67_0==DEC_NUM||LA67_0==FLOAT_NUM) ) {
			alt67=1;
		}
		switch (alt67) {
			case 1 :
				// myChecker.g:
				{
				if ( input.LA(1)==DEC_NUM||input.LA(1)==FLOAT_NUM ) {
					input.consume();
					state.errorRecovery=false;
					state.failed=false;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return;}
					MismatchedSetException mse = new MismatchedSetException(null,input);
					throw mse;
				}
				}
				break;

		}

		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred60_myChecker994); if (state.failed) return;
		match(input,RBRACE,FOLLOW_RBRACE_in_synpred60_myChecker1001); if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_myChecker

	// Delegated rules

	public final boolean synpred60_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred54_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred54_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred42_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred42_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred33_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA51 dfa51 = new DFA51(this);
	static final String DFA51_eotS =
		"\151\uffff";
	static final String DFA51_eofS =
		"\1\uffff\10\12\140\uffff";
	static final String DFA51_minS =
		"\11\7\140\uffff";
	static final String DFA51_maxS =
		"\11\110\140\uffff";
	static final String DFA51_acceptS =
		"\11\uffff\1\1\1\2\136\uffff";
	static final String DFA51_specialS =
		"\151\uffff}>";
	static final String[] DFA51_transitionS = {
			"\1\7\10\uffff\1\5\5\uffff\1\4\5\uffff\1\2\3\uffff\1\6\1\3\44\uffff\1"+
			"\1\1\uffff\1\10",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
			"\1\12\1\uffff\1\12\6\uffff\1\12\5\uffff\1\12\2\uffff\1\11\2\uffff\1"+
			"\12\3\uffff\2\12\42\uffff\1\12\1\uffff\1\12\1\uffff\1\12",
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
			"",
			"",
			"",
			""
	};

	static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
	static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
	static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
	static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
	static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
	static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
	static final short[][] DFA51_transition;

	static {
		int numStates = DFA51_transitionS.length;
		DFA51_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
		}
	}

	protected class DFA51 extends DFA {

		public DFA51(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 51;
			this.eot = DFA51_eot;
			this.eof = DFA51_eof;
			this.min = DFA51_min;
			this.max = DFA51_max;
			this.accept = DFA51_accept;
			this.special = DFA51_special;
			this.transition = DFA51_transition;
		}
		@Override
		public String getDescription() {
			return "232:1: param : ( type ID | type );";
		}
	}

	public static final BitSet FOLLOW_INCLUDE_in_startStat68 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OP_LT_in_startStat71 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_startStat73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_startStat75 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_OP_GT_in_startStat77 = new BitSet(new long[]{0x0000000318410080L,0x0000000000000540L});
	public static final BitSet FOLLOW_WS_in_startStat79 = new BitSet(new long[]{0x0000000318410080L,0x0000000000000540L});
	public static final BitSet FOLLOW_function_in_startStat90 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000140L});
	public static final BitSet FOLLOW_mainfunction_in_startStat98 = new BitSet(new long[]{0x0000000310410082L,0x0000000000000140L});
	public static final BitSet FOLLOW_function_in_startStat104 = new BitSet(new long[]{0x0000000310410082L,0x0000000000000140L});
	public static final BitSet FOLLOW_type_in_mainfunction117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_mainfunction119 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_mainfunction121 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_mainfunction124 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_mainfunction126 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_mainfunction133 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_mainfunction135 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_mainfunction146 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_mainfunction150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_RETURN__in_mainfunction161 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_mainfunction172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_mainfunction179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_mainfunction181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_SHORT_TYPE_in_type215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_type236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_TYPE_in_type261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_TYPE_in_type284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_TYPE_in_type305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONGLONG_TYPE_in_type324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_TYPE_in_type339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_type362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStat_in_stats385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_stats397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelseStat_in_stats414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_stats430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareStat_in_stats449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedStat_in_stats464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breakStat_in_stats484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continueStat_in_stats501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentStat528 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_OP_ASS_in_assignmentStat530 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_assignmentStat532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_assignmentStat534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentStat572 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_OP_ASS_in_assignmentStat575 = new BitSet(new long[]{0x0000000000042000L});
	public static final BitSet FOLLOW_set_in_assignmentStat578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_assignmentStat587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE__in_whileStat613 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_whileStat615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat618 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_whileStat620 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_whileStat628 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_whileStat630 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_whileStat641 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_whileStat644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_whileStat652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_whileStat654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_IF__in_ifelseStat680 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_ifelseStat682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_ifelseStat685 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat687 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat695 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_ifelseStat697 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_ifelseStat712 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_ifelseStat715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat723 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat725 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_76_in_ifelseStat733 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_ifelseStat735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_ifelseStat738 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat740 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat751 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_ifelseStat753 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_ifelseStat768 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000342L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat780 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat782 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_ELSE__in_ifelseStat798 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat800 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat811 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000340L});
	public static final BitSet FOLLOW_stats_in_ifelseStat825 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000342L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR__in_forStat869 = new BitSet(new long[]{0x0000000402042040L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_forStat871 = new BitSet(new long[]{0x0000000402042040L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat875 = new BitSet(new long[]{0x0000000402042040L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_forStat878 = new BitSet(new long[]{0x0000000402042040L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat881 = new BitSet(new long[]{0x0000000402042040L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_forStat883 = new BitSet(new long[]{0x0000000402042040L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_forStat886 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_forStat888 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_forStat895 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_forStat897 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_forStat908 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_forStat912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_forStat919 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_forStat921 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_in_function944 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_function946 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_function948 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_function951 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LBRACE_in_function958 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_function969 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_function972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_RETURN__in_function983 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_function994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_function1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function1044 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_function1046 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_function1048 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_function1051 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_function1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declareStat1075 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_declareStat1081 = new BitSet(new long[]{0x0000008000000200L,0x0000000000000020L});
	public static final BitSet FOLLOW_OP_ASS_in_declareStat1084 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_declareStat1090 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_declareStat1095 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_declareStat1101 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_OP_ASS_in_declareStat1104 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_declareStat1110 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_declareStat1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_procedStat1149 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_arguments_in_procedStat1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_procedStat1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_procedStat1155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK__in_breakStat1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_breakStat1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE__in_continueStat1188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_continueStat1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arguments1205 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_arguments1208 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_arguments1210 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_param_in_params1227 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_params1230 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000140L});
	public static final BitSet FOLLOW_param_in_params1232 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_type_in_param1249 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_param1251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_param1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationStat_in_expr1289 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_set_in_expr1298 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_operationStat_in_expr1310 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_add_in_operationStat1335 = new BitSet(new long[]{0x946E5EA000000002L});
	public static final BitSet FOLLOW_set_in_operationStat1349 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_add_in_operationStat1441 = new BitSet(new long[]{0x946E5EA000000002L});
	public static final BitSet FOLLOW_multiply_in_add1494 = new BitSet(new long[]{0x0800000800000002L});
	public static final BitSet FOLLOW_set_in_add1503 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_multiply_in_add1515 = new BitSet(new long[]{0x0800000800000002L});
	public static final BitSet FOLLOW_atom_in_multiply1557 = new BitSet(new long[]{0x0010010000000002L});
	public static final BitSet FOLLOW_set_in_multiply1567 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_atom_in_multiply1580 = new BitSet(new long[]{0x0010010000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_atom1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_atom1644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_atom1669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom1734 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_atom1736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_atom1738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred7_myChecker135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred27_myChecker528 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_OP_ASS_in_synpred27_myChecker530 = new BitSet(new long[]{0x0000000402042040L});
	public static final BitSet FOLLOW_expr_in_synpred27_myChecker532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred27_myChecker534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred33_myChecker654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred38_myChecker725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred42_myChecker782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred54_myChecker921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred60_myChecker944 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_synpred60_myChecker946 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_synpred60_myChecker948 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_synpred60_myChecker951 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LBRACE_in_synpred60_myChecker958 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_synpred60_myChecker969 = new BitSet(new long[]{0x0000000317C110A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_synpred60_myChecker972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_RETURN__in_synpred60_myChecker983 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred60_myChecker994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_synpred60_myChecker1001 = new BitSet(new long[]{0x0000000000000002L});
}
