// $ANTLR 3.5.2 myParser.g 2018-05-11 11:51:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myParserParser extends Parser {
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


	public myParserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myParserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[118+1];


	}

	@Override public String[] getTokenNames() { return myParserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myParser.g"; }



	// $ANTLR start "startStat"
	// myParser.g:9:1: startStat : ( INCLUDE '<' ID '.h' '>' ( WS )* )+ ( function )* mainfunction ( function )* ;
	public final void startStat() throws RecognitionException {
		int startStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myParser.g:9:10: ( ( INCLUDE '<' ID '.h' '>' ( WS )* )+ ( function )* mainfunction ( function )* )
			// myParser.g:10:5: ( INCLUDE '<' ID '.h' '>' ( WS )* )+ ( function )* mainfunction ( function )*
			{
			// myParser.g:10:5: ( INCLUDE '<' ID '.h' '>' ( WS )* )+
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
					// myParser.g:10:6: INCLUDE '<' ID '.h' '>' ( WS )*
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_startStat48); if (state.failed) return;
					match(input,OP_LT,FOLLOW_OP_LT_in_startStat51); if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_startStat53); if (state.failed) return;
					match(input,75,FOLLOW_75_in_startStat55); if (state.failed) return;
					match(input,OP_GT,FOLLOW_OP_GT_in_startStat57); if (state.failed) return;
					// myParser.g:10:31: ( WS )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==WS) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// myParser.g:10:31: WS
							{
							match(input,WS,FOLLOW_WS_in_startStat59); if (state.failed) return;
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

			// myParser.g:12:5: ( function )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CHAR_TYPE||LA3_0==DOUBLE_TYPE||LA3_0==FLOAT_TYPE||LA3_0==INT_TYPE||(LA3_0 >= LONGLONG_TYPE && LA3_0 <= LONG_TYPE)||LA3_0==SHORT_TYPE||LA3_0==VOID_TYPE) ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==FUNCTION_CALL) ) {
						alt3=1;
					}

				}

				switch (alt3) {
				case 1 :
					// myParser.g:12:5: function
					{
					pushFollow(FOLLOW_function_in_startStat70);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_mainfunction_in_startStat78);
			mainfunction();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:14:5: ( function )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CHAR_TYPE||LA4_0==DOUBLE_TYPE||LA4_0==FLOAT_TYPE||LA4_0==INT_TYPE||(LA4_0 >= LONGLONG_TYPE && LA4_0 <= LONG_TYPE)||LA4_0==SHORT_TYPE||LA4_0==VOID_TYPE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myParser.g:14:5: function
					{
					pushFollow(FOLLOW_function_in_startStat84);
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
	// myParser.g:17:1: mainfunction : type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RETURN_ ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* ;
	public final void mainfunction() throws RecognitionException {
		int mainfunction_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myParser.g:17:13: ( type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RETURN_ ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* )
			// myParser.g:18:5: type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RETURN_ ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )*
			{
			pushFollow(FOLLOW_type_in_mainfunction97);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,77,FOLLOW_77_in_mainfunction99); if (state.failed) return;
			// myParser.g:18:18: ( params )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==CHAR_TYPE||LA5_0==DOUBLE_TYPE||LA5_0==FLOAT_TYPE||LA5_0==INT_TYPE||(LA5_0 >= LONGLONG_TYPE && LA5_0 <= LONG_TYPE)||LA5_0==SHORT_TYPE||LA5_0==VOID_TYPE) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myParser.g:18:18: params
					{
					pushFollow(FOLLOW_params_in_mainfunction101);
					params();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_mainfunction104); if (state.failed) return;
			// myParser.g:18:33: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myParser.g:18:33: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction106); if (state.failed) return;
					}
					break;

				default :
					break loop6;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_mainfunction113); if (state.failed) return;
			// myParser.g:19:12: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					int LA7_12 = input.LA(2);
					if ( (synpred7_myParser()) ) {
						alt7=1;
					}

				}

				switch (alt7) {
				case 1 :
					// myParser.g:19:12: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction115); if (state.failed) return;
					}
					break;

				default :
					break loop7;
				}
			}

			// myParser.g:20:9: ( stats )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==BREAK_||LA8_0==CHAR_TYPE||(LA8_0 >= CONTINUE_ && LA8_0 <= DEC_NUM)||LA8_0==DOUBLE_TYPE||LA8_0==FLOAT_NUM||(LA8_0 >= FLOAT_TYPE && LA8_0 <= IF_)||LA8_0==INT_TYPE||(LA8_0 >= LONGLONG_TYPE && LA8_0 <= LPAREN)||LA8_0==SHORT_TYPE||(LA8_0 >= VOID_TYPE && LA8_0 <= WHILE_)) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myParser.g:20:9: stats
					{
					pushFollow(FOLLOW_stats_in_mainfunction126);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop8;
				}
			}

			// myParser.g:20:17: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myParser.g:20:17: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction130); if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,RETURN_,FOLLOW_RETURN__in_mainfunction141); if (state.failed) return;
			// myParser.g:21:17: ( DEC_NUM | FLOAT_NUM )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==DEC_NUM||LA10_0==FLOAT_NUM) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// myParser.g:
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

			match(input,SEMICOL,FOLLOW_SEMICOL_in_mainfunction152); if (state.failed) return;
			match(input,RBRACE,FOLLOW_RBRACE_in_mainfunction159); if (state.failed) return;
			// myParser.g:22:12: ( WS )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myParser.g:22:12: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction161); if (state.failed) return;
					}
					break;

				default :
					break loop11;
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
			if ( state.backtracking>0 ) { memoize(input, 2, mainfunction_StartIndex); }

		}
	}
	// $ANTLR end "mainfunction"



	// $ANTLR start "type"
	// myParser.g:26:1: type : ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE );
	public final void type() throws RecognitionException {
		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// myParser.g:26:5: ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE )
			// myParser.g:
			{
			if ( input.LA(1)==CHAR_TYPE||input.LA(1)==DOUBLE_TYPE||input.LA(1)==FLOAT_TYPE||input.LA(1)==INT_TYPE||(input.LA(1) >= LONGLONG_TYPE && input.LA(1) <= LONG_TYPE)||input.LA(1)==SHORT_TYPE||input.LA(1)==VOID_TYPE ) {
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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, type_StartIndex); }

		}
	}
	// $ANTLR end "type"



	// $ANTLR start "stats"
	// myParser.g:37:1: stats : ( assignmentStat | whileStat | ifelseStat | forStat | declareStat | procedStat | exprList | breakStat | continueStat );
	public final void stats() throws RecognitionException {
		int stats_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// myParser.g:37:6: ( assignmentStat | whileStat | ifelseStat | forStat | declareStat | procedStat | exprList | breakStat | continueStat )
			int alt12=9;
			alt12 = dfa12.predict(input);
			switch (alt12) {
				case 1 :
					// myParser.g:38:5: assignmentStat
					{
					pushFollow(FOLLOW_assignmentStat_in_stats288);
					assignmentStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:39:5: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_stats297);
					whileStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myParser.g:40:5: ifelseStat
					{
					pushFollow(FOLLOW_ifelseStat_in_stats311);
					ifelseStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myParser.g:41:5: forStat
					{
					pushFollow(FOLLOW_forStat_in_stats324);
					forStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myParser.g:42:5: declareStat
					{
					pushFollow(FOLLOW_declareStat_in_stats340);
					declareStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myParser.g:43:5: procedStat
					{
					pushFollow(FOLLOW_procedStat_in_stats352);
					procedStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// myParser.g:44:5: exprList
					{
					pushFollow(FOLLOW_exprList_in_stats365);
					exprList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// myParser.g:45:5: breakStat
					{
					pushFollow(FOLLOW_breakStat_in_stats380);
					breakStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// myParser.g:46:5: continueStat
					{
					pushFollow(FOLLOW_continueStat_in_stats394);
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
	// myParser.g:49:1: assignmentStat : ( ID ( WS )* OP_ASS ( WS )* expr SEMICOL | ID ( WS )* OP_ASS ( WS )* ( DEC_NUM | FLOAT_NUM ) SEMICOL );
	public final void assignmentStat() throws RecognitionException {
		int assignmentStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// myParser.g:49:15: ( ID ( WS )* OP_ASS ( WS )* expr SEMICOL | ID ( WS )* OP_ASS ( WS )* ( DEC_NUM | FLOAT_NUM ) SEMICOL )
			int alt17=2;
			alt17 = dfa17.predict(input);
			switch (alt17) {
				case 1 :
					// myParser.g:50:5: ID ( WS )* OP_ASS ( WS )* expr SEMICOL
					{
					match(input,ID,FOLLOW_ID_in_assignmentStat410); if (state.failed) return;
					// myParser.g:50:8: ( WS )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==WS) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// myParser.g:50:8: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat412); if (state.failed) return;
							}
							break;

						default :
							break loop13;
						}
					}

					match(input,OP_ASS,FOLLOW_OP_ASS_in_assignmentStat415); if (state.failed) return;
					// myParser.g:50:19: ( WS )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==WS) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// myParser.g:50:19: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat417); if (state.failed) return;
							}
							break;

						default :
							break loop14;
						}
					}

					pushFollow(FOLLOW_expr_in_assignmentStat420);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_assignmentStat422); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:51:5: ID ( WS )* OP_ASS ( WS )* ( DEC_NUM | FLOAT_NUM ) SEMICOL
					{
					match(input,ID,FOLLOW_ID_in_assignmentStat451); if (state.failed) return;
					// myParser.g:51:8: ( WS )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==WS) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// myParser.g:51:8: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat453); if (state.failed) return;
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,OP_ASS,FOLLOW_OP_ASS_in_assignmentStat456); if (state.failed) return;
					// myParser.g:51:19: ( WS )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==WS) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// myParser.g:51:19: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat458); if (state.failed) return;
							}
							break;

						default :
							break loop16;
						}
					}

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
					match(input,SEMICOL,FOLLOW_SEMICOL_in_assignmentStat470); if (state.failed) return;
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
	}
	// $ANTLR end "assignmentStat"



	// $ANTLR start "whileStat"
	// myParser.g:54:1: whileStat : WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ;
	public final void whileStat() throws RecognitionException {
		int whileStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// myParser.g:54:10: ( WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* )
			// myParser.g:55:5: WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )*
			{
			match(input,WHILE_,FOLLOW_WHILE__in_whileStat486); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_whileStat488);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat491); if (state.failed) return;
			// myParser.g:55:25: ( WS )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// myParser.g:55:25: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat493); if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_whileStat501); if (state.failed) return;
			// myParser.g:56:12: ( WS )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myParser.g:56:12: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat503); if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			// myParser.g:57:9: ( stats )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BREAK_||LA20_0==CHAR_TYPE||(LA20_0 >= CONTINUE_ && LA20_0 <= DEC_NUM)||LA20_0==DOUBLE_TYPE||LA20_0==FLOAT_NUM||(LA20_0 >= FLOAT_TYPE && LA20_0 <= IF_)||LA20_0==INT_TYPE||(LA20_0 >= LONGLONG_TYPE && LA20_0 <= LPAREN)||LA20_0==SHORT_TYPE||(LA20_0 >= VOID_TYPE && LA20_0 <= WHILE_)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// myParser.g:57:9: stats
					{
					pushFollow(FOLLOW_stats_in_whileStat514);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			// myParser.g:57:16: ( WS )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// myParser.g:57:16: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat517); if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_whileStat525); if (state.failed) return;
			// myParser.g:58:12: ( WS )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==WS) ) {
					int LA22_1 = input.LA(2);
					if ( (synpred38_myParser()) ) {
						alt22=1;
					}

				}

				switch (alt22) {
				case 1 :
					// myParser.g:58:12: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat527); if (state.failed) return;
					}
					break;

				default :
					break loop22;
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
	// myParser.g:61:1: ifelseStat : IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )? ;
	public final void ifelseStat() throws RecognitionException {
		int ifelseStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// myParser.g:61:11: ( IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )? )
			// myParser.g:62:5: IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )?
			{
			match(input,IF_,FOLLOW_IF__in_ifelseStat540); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifelseStat542);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifelseStat545); if (state.failed) return;
			// myParser.g:62:22: ( WS )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// myParser.g:62:22: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat547); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat555); if (state.failed) return;
			// myParser.g:63:12: ( WS )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// myParser.g:63:12: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat557); if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}

			// myParser.g:64:9: ( stats )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==BREAK_||LA25_0==CHAR_TYPE||(LA25_0 >= CONTINUE_ && LA25_0 <= DEC_NUM)||LA25_0==DOUBLE_TYPE||LA25_0==FLOAT_NUM||(LA25_0 >= FLOAT_TYPE && LA25_0 <= IF_)||LA25_0==INT_TYPE||(LA25_0 >= LONGLONG_TYPE && LA25_0 <= LPAREN)||LA25_0==SHORT_TYPE||(LA25_0 >= VOID_TYPE && LA25_0 <= WHILE_)) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// myParser.g:64:9: stats
					{
					pushFollow(FOLLOW_stats_in_ifelseStat568);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			// myParser.g:64:16: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// myParser.g:64:16: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat571); if (state.failed) return;
					}
					break;

				default :
					break loop26;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat579); if (state.failed) return;
			// myParser.g:65:12: ( WS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					int LA27_3 = input.LA(2);
					if ( (synpred43_myParser()) ) {
						alt27=1;
					}

				}

				switch (alt27) {
				case 1 :
					// myParser.g:65:12: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat581); if (state.failed) return;
					}
					break;

				default :
					break loop27;
				}
			}

			// myParser.g:66:5: ( 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )* )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==76) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// myParser.g:66:6: 'else if(' expr RPAREN ( WS )* LBRACE ( WS )* ( stats )+ RBRACE ( WS )*
					{
					match(input,76,FOLLOW_76_in_ifelseStat589); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_ifelseStat591);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_ifelseStat594); if (state.failed) return;
					// myParser.g:66:30: ( WS )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==WS) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// myParser.g:66:30: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat596); if (state.failed) return;
							}
							break;

						default :
							break loop28;
						}
					}

					match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat607); if (state.failed) return;
					// myParser.g:67:16: ( WS )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==WS) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// myParser.g:67:16: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat609); if (state.failed) return;
							}
							break;

						default :
							break loop29;
						}
					}

					// myParser.g:68:13: ( stats )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==BREAK_||LA30_0==CHAR_TYPE||(LA30_0 >= CONTINUE_ && LA30_0 <= DEC_NUM)||LA30_0==DOUBLE_TYPE||LA30_0==FLOAT_NUM||(LA30_0 >= FLOAT_TYPE && LA30_0 <= IF_)||LA30_0==INT_TYPE||(LA30_0 >= LONGLONG_TYPE && LA30_0 <= LPAREN)||LA30_0==SHORT_TYPE||(LA30_0 >= VOID_TYPE && LA30_0 <= WHILE_)) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// myParser.g:68:13: stats
							{
							pushFollow(FOLLOW_stats_in_ifelseStat624);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat636); if (state.failed) return;
					// myParser.g:69:16: ( WS )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==WS) ) {
							int LA31_2 = input.LA(2);
							if ( (synpred47_myParser()) ) {
								alt31=1;
							}

						}

						switch (alt31) {
						case 1 :
							// myParser.g:69:16: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat638); if (state.failed) return;
							}
							break;

						default :
							break loop31;
						}
					}

					}
					break;

				default :
					break loop32;
				}
			}

			// myParser.g:71:5: ( ELSE_ ( WS )* LBRACE ( stats )+ RBRACE )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==ELSE_) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// myParser.g:71:6: ELSE_ ( WS )* LBRACE ( stats )+ RBRACE
					{
					match(input,ELSE_,FOLLOW_ELSE__in_ifelseStat654); if (state.failed) return;
					// myParser.g:71:12: ( WS )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==WS) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// myParser.g:71:12: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat656); if (state.failed) return;
							}
							break;

						default :
							break loop33;
						}
					}

					match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat667); if (state.failed) return;
					// myParser.g:73:13: ( stats )+
					int cnt34=0;
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==BREAK_||LA34_0==CHAR_TYPE||(LA34_0 >= CONTINUE_ && LA34_0 <= DEC_NUM)||LA34_0==DOUBLE_TYPE||LA34_0==FLOAT_NUM||(LA34_0 >= FLOAT_TYPE && LA34_0 <= IF_)||LA34_0==INT_TYPE||(LA34_0 >= LONGLONG_TYPE && LA34_0 <= LPAREN)||LA34_0==SHORT_TYPE||(LA34_0 >= VOID_TYPE && LA34_0 <= WHILE_)) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// myParser.g:73:13: stats
							{
							pushFollow(FOLLOW_stats_in_ifelseStat681);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(34, input);
							throw eee;
						}
						cnt34++;
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat693); if (state.failed) return;
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
	// myParser.g:79:1: forStat : FOR_ ( expr )* SEMICOL ( expr )* SEMICOL ( expr )* RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* ;
	public final void forStat() throws RecognitionException {
		int forStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// myParser.g:79:8: ( FOR_ ( expr )* SEMICOL ( expr )* SEMICOL ( expr )* RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )* )
			// myParser.g:80:5: FOR_ ( expr )* SEMICOL ( expr )* SEMICOL ( expr )* RPAREN ( WS )* LBRACE ( WS )* ( stats )+ ( WS )* RBRACE ( WS )*
			{
			match(input,FOR_,FOLLOW_FOR__in_forStat715); if (state.failed) return;
			// myParser.g:80:10: ( expr )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==DEC_NUM||LA36_0==FLOAT_NUM||LA36_0==ID||LA36_0==LPAREN) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// myParser.g:80:10: expr
					{
					pushFollow(FOLLOW_expr_in_forStat717);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop36;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat721); if (state.failed) return;
			// myParser.g:80:26: ( expr )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==DEC_NUM||LA37_0==FLOAT_NUM||LA37_0==ID||LA37_0==LPAREN) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// myParser.g:80:26: expr
					{
					pushFollow(FOLLOW_expr_in_forStat724);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat727); if (state.failed) return;
			// myParser.g:80:40: ( expr )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==DEC_NUM||LA38_0==FLOAT_NUM||LA38_0==ID||LA38_0==LPAREN) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// myParser.g:80:40: expr
					{
					pushFollow(FOLLOW_expr_in_forStat729);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop38;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat732); if (state.failed) return;
			// myParser.g:80:53: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// myParser.g:80:53: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat734); if (state.failed) return;
					}
					break;

				default :
					break loop39;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_forStat741); if (state.failed) return;
			// myParser.g:81:12: ( WS )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==WS) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// myParser.g:81:12: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat743); if (state.failed) return;
					}
					break;

				default :
					break loop40;
				}
			}

			// myParser.g:82:9: ( stats )+
			int cnt41=0;
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==BREAK_||LA41_0==CHAR_TYPE||(LA41_0 >= CONTINUE_ && LA41_0 <= DEC_NUM)||LA41_0==DOUBLE_TYPE||LA41_0==FLOAT_NUM||(LA41_0 >= FLOAT_TYPE && LA41_0 <= IF_)||LA41_0==INT_TYPE||(LA41_0 >= LONGLONG_TYPE && LA41_0 <= LPAREN)||LA41_0==SHORT_TYPE||(LA41_0 >= VOID_TYPE && LA41_0 <= WHILE_)) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// myParser.g:82:9: stats
					{
					pushFollow(FOLLOW_stats_in_forStat754);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt41 >= 1 ) break loop41;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(41, input);
					throw eee;
				}
				cnt41++;
			}

			// myParser.g:82:17: ( WS )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==WS) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// myParser.g:82:17: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat758); if (state.failed) return;
					}
					break;

				default :
					break loop42;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_forStat765); if (state.failed) return;
			// myParser.g:83:12: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					int LA43_1 = input.LA(2);
					if ( (synpred59_myParser()) ) {
						alt43=1;
					}

				}

				switch (alt43) {
				case 1 :
					// myParser.g:83:12: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat767); if (state.failed) return;
					}
					break;

				default :
					break loop43;
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
	// myParser.g:86:1: function : ( type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE | type FUNCTION_CALL ( params )* RPAREN SEMICOL );
	public final void function() throws RecognitionException {
		int function_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// myParser.g:86:9: ( type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE | type FUNCTION_CALL ( params )* RPAREN SEMICOL )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==CHAR_TYPE||LA49_0==DOUBLE_TYPE||LA49_0==FLOAT_TYPE||LA49_0==INT_TYPE||(LA49_0 >= LONGLONG_TYPE && LA49_0 <= LONG_TYPE)||LA49_0==SHORT_TYPE||LA49_0==VOID_TYPE) ) {
				int LA49_1 = input.LA(2);
				if ( (LA49_1==FUNCTION_CALL) ) {
					int LA49_2 = input.LA(3);
					if ( (LA49_2==CHAR_TYPE||LA49_2==DOUBLE_TYPE||LA49_2==FLOAT_TYPE||LA49_2==INT_TYPE||(LA49_2 >= LONGLONG_TYPE && LA49_2 <= LONG_TYPE)||LA49_2==SHORT_TYPE||LA49_2==VOID_TYPE) ) {
						switch ( input.LA(4) ) {
						case ID:
							{
							switch ( input.LA(5) ) {
							case COMMA:
								{
								int LA49_11 = input.LA(6);
								if ( (LA49_11==CHAR_TYPE||LA49_11==DOUBLE_TYPE||LA49_11==FLOAT_TYPE||LA49_11==INT_TYPE||(LA49_11 >= LONGLONG_TYPE && LA49_11 <= LONG_TYPE)||LA49_11==SHORT_TYPE||LA49_11==VOID_TYPE) ) {
									int LA49_21 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RPAREN:
								{
								int LA49_12 = input.LA(6);
								if ( (LA49_12==LBRACE) ) {
									alt49=1;
								}
								else if ( (LA49_12==SEMICOL) ) {
									alt49=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

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
								switch ( input.LA(6) ) {
								case ID:
									{
									int LA49_24 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								case COMMA:
									{
									int LA49_25 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								case RPAREN:
									{
									int LA49_26 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

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
									int LA49_27 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 49, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						case COMMA:
							{
							int LA49_6 = input.LA(5);
							if ( (LA49_6==CHAR_TYPE||LA49_6==DOUBLE_TYPE||LA49_6==FLOAT_TYPE||LA49_6==INT_TYPE||(LA49_6 >= LONGLONG_TYPE && LA49_6 <= LONG_TYPE)||LA49_6==SHORT_TYPE||LA49_6==VOID_TYPE) ) {
								switch ( input.LA(6) ) {
								case ID:
									{
									int LA49_28 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								case RPAREN:
									{
									int LA49_29 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

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
									int LA49_30 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								case COMMA:
									{
									int LA49_31 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 14, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 49, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case RPAREN:
							{
							int LA49_7 = input.LA(5);
							if ( (LA49_7==LBRACE) ) {
								alt49=1;
							}
							else if ( (LA49_7==SEMICOL) ) {
								alt49=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 49, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

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
							switch ( input.LA(5) ) {
							case ID:
								{
								switch ( input.LA(6) ) {
								case COMMA:
									{
									int LA49_32 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								case RPAREN:
									{
									int LA49_33 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

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
									int LA49_34 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case COMMA:
								{
								int LA49_18 = input.LA(6);
								if ( (LA49_18==CHAR_TYPE||LA49_18==DOUBLE_TYPE||LA49_18==FLOAT_TYPE||LA49_18==INT_TYPE||(LA49_18 >= LONGLONG_TYPE && LA49_18 <= LONG_TYPE)||LA49_18==SHORT_TYPE||LA49_18==VOID_TYPE) ) {
									int LA49_35 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case RPAREN:
								{
								int LA49_19 = input.LA(6);
								if ( (LA49_19==LBRACE) ) {
									alt49=1;
								}
								else if ( (LA49_19==SEMICOL) ) {
									alt49=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

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
								switch ( input.LA(6) ) {
								case ID:
									{
									int LA49_38 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								case COMMA:
									{
									int LA49_39 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								case RPAREN:
									{
									int LA49_40 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

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
									int LA49_41 = input.LA(7);
									if ( (synpred65_myParser()) ) {
										alt49=1;
									}
									else if ( (true) ) {
										alt49=2;
									}

									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 49, 20, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 49, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 49, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA49_2==RPAREN) ) {
						int LA49_4 = input.LA(4);
						if ( (LA49_4==LBRACE) ) {
							alt49=1;
						}
						else if ( (LA49_4==SEMICOL) ) {
							alt49=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 49, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 49, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// myParser.g:87:5: type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE
					{
					pushFollow(FOLLOW_type_in_function780);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function782); if (state.failed) return;
					// myParser.g:87:24: ( params )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==CHAR_TYPE||LA44_0==DOUBLE_TYPE||LA44_0==FLOAT_TYPE||LA44_0==INT_TYPE||(LA44_0 >= LONGLONG_TYPE && LA44_0 <= LONG_TYPE)||LA44_0==SHORT_TYPE||LA44_0==VOID_TYPE) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// myParser.g:87:24: params
							{
							pushFollow(FOLLOW_params_in_function784);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop44;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_function787); if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_function794); if (state.failed) return;
					// myParser.g:89:9: ( stats )*
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==BREAK_||LA45_0==CHAR_TYPE||(LA45_0 >= CONTINUE_ && LA45_0 <= DEC_NUM)||LA45_0==DOUBLE_TYPE||LA45_0==FLOAT_NUM||(LA45_0 >= FLOAT_TYPE && LA45_0 <= IF_)||LA45_0==INT_TYPE||(LA45_0 >= LONGLONG_TYPE && LA45_0 <= LPAREN)||LA45_0==SHORT_TYPE||(LA45_0 >= VOID_TYPE && LA45_0 <= WHILE_)) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// myParser.g:89:9: stats
							{
							pushFollow(FOLLOW_stats_in_function805);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop45;
						}
					}

					// myParser.g:89:16: ( WS )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==WS) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// myParser.g:89:16: WS
							{
							match(input,WS,FOLLOW_WS_in_function808); if (state.failed) return;
							}
							break;

						default :
							break loop46;
						}
					}

					match(input,RETURN_,FOLLOW_RETURN__in_function819); if (state.failed) return;
					// myParser.g:90:18: ( DEC_NUM | FLOAT_NUM )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==DEC_NUM||LA47_0==FLOAT_NUM) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// myParser.g:
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

					match(input,SEMICOL,FOLLOW_SEMICOL_in_function830); if (state.failed) return;
					match(input,RBRACE,FOLLOW_RBRACE_in_function837); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:92:5: type FUNCTION_CALL ( params )* RPAREN SEMICOL
					{
					pushFollow(FOLLOW_type_in_function877);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function879); if (state.failed) return;
					// myParser.g:92:24: ( params )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==CHAR_TYPE||LA48_0==DOUBLE_TYPE||LA48_0==FLOAT_TYPE||LA48_0==INT_TYPE||(LA48_0 >= LONGLONG_TYPE && LA48_0 <= LONG_TYPE)||LA48_0==SHORT_TYPE||LA48_0==VOID_TYPE) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// myParser.g:92:24: params
							{
							pushFollow(FOLLOW_params_in_function881);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop48;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_function884); if (state.failed) return;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_function887); if (state.failed) return;
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
	// myParser.g:97:1: declareStat : ( type ID SEMICOL | type exprList | type assignmentStat );
	public final void declareStat() throws RecognitionException {
		int declareStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myParser.g:97:12: ( type ID SEMICOL | type exprList | type assignmentStat )
			int alt50=3;
			alt50 = dfa50.predict(input);
			switch (alt50) {
				case 1 :
					// myParser.g:98:5: type ID SEMICOL
					{
					pushFollow(FOLLOW_type_in_declareStat901);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_declareStat903); if (state.failed) return;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_declareStat905); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:99:5: type exprList
					{
					pushFollow(FOLLOW_type_in_declareStat917);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_exprList_in_declareStat919);
					exprList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myParser.g:100:5: type assignmentStat
					{
					pushFollow(FOLLOW_type_in_declareStat933);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_assignmentStat_in_declareStat935);
					assignmentStat();
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
			if ( state.backtracking>0 ) { memoize(input, 10, declareStat_StartIndex); }

		}
	}
	// $ANTLR end "declareStat"



	// $ANTLR start "procedStat"
	// myParser.g:103:1: procedStat : FUNCTION_CALL arguments RPAREN SEMICOL ;
	public final void procedStat() throws RecognitionException {
		int procedStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myParser.g:103:11: ( FUNCTION_CALL arguments RPAREN SEMICOL )
			// myParser.g:104:5: FUNCTION_CALL arguments RPAREN SEMICOL
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_procedStat948); if (state.failed) return;
			pushFollow(FOLLOW_arguments_in_procedStat950);
			arguments();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_procedStat952); if (state.failed) return;
			match(input,SEMICOL,FOLLOW_SEMICOL_in_procedStat954); if (state.failed) return;
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



	// $ANTLR start "exprList"
	// myParser.g:107:1: exprList : expr ( COMMA expr )* SEMICOL ;
	public final void exprList() throws RecognitionException {
		int exprList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myParser.g:107:9: ( expr ( COMMA expr )* SEMICOL )
			// myParser.g:108:5: expr ( COMMA expr )* SEMICOL
			{
			pushFollow(FOLLOW_expr_in_exprList966);
			expr();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:108:10: ( COMMA expr )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==COMMA) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// myParser.g:108:11: COMMA expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprList969); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_exprList971);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop51;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_exprList975); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, exprList_StartIndex); }

		}
	}
	// $ANTLR end "exprList"



	// $ANTLR start "breakStat"
	// myParser.g:111:1: breakStat : BREAK_ SEMICOL ;
	public final void breakStat() throws RecognitionException {
		int breakStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myParser.g:111:10: ( BREAK_ SEMICOL )
			// myParser.g:112:5: BREAK_ SEMICOL
			{
			match(input,BREAK_,FOLLOW_BREAK__in_breakStat987); if (state.failed) return;
			match(input,SEMICOL,FOLLOW_SEMICOL_in_breakStat989); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, breakStat_StartIndex); }

		}
	}
	// $ANTLR end "breakStat"



	// $ANTLR start "continueStat"
	// myParser.g:115:1: continueStat : CONTINUE_ SEMICOL ;
	public final void continueStat() throws RecognitionException {
		int continueStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myParser.g:115:13: ( CONTINUE_ SEMICOL )
			// myParser.g:116:5: CONTINUE_ SEMICOL
			{
			match(input,CONTINUE_,FOLLOW_CONTINUE__in_continueStat1001); if (state.failed) return;
			match(input,SEMICOL,FOLLOW_SEMICOL_in_continueStat1003); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, continueStat_StartIndex); }

		}
	}
	// $ANTLR end "continueStat"



	// $ANTLR start "arguments"
	// myParser.g:119:1: arguments : expr ( COMMA expr )* ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myParser.g:119:10: ( expr ( COMMA expr )* )
			// myParser.g:120:5: expr ( COMMA expr )*
			{
			pushFollow(FOLLOW_expr_in_arguments1015);
			expr();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:120:10: ( COMMA expr )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==COMMA) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// myParser.g:120:11: COMMA expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_arguments1018); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_arguments1020);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop52;
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
			if ( state.backtracking>0 ) { memoize(input, 15, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"



	// $ANTLR start "params"
	// myParser.g:123:1: params : param ( COMMA param )* ;
	public final void params() throws RecognitionException {
		int params_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myParser.g:123:7: ( param ( COMMA param )* )
			// myParser.g:124:5: param ( COMMA param )*
			{
			pushFollow(FOLLOW_param_in_params1034);
			param();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:124:11: ( COMMA param )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==COMMA) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// myParser.g:124:12: COMMA param
					{
					match(input,COMMA,FOLLOW_COMMA_in_params1037); if (state.failed) return;
					pushFollow(FOLLOW_param_in_params1039);
					param();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 16, params_StartIndex); }

		}
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// myParser.g:127:1: param : ( type ID | type );
	public final void param() throws RecognitionException {
		int param_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// myParser.g:127:6: ( type ID | type )
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==CHAR_TYPE||LA54_0==DOUBLE_TYPE||LA54_0==FLOAT_TYPE||LA54_0==INT_TYPE||(LA54_0 >= LONGLONG_TYPE && LA54_0 <= LONG_TYPE)||LA54_0==SHORT_TYPE||LA54_0==VOID_TYPE) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==ID) ) {
					alt54=1;
				}
				else if ( (LA54_1==EOF||LA54_1==CHAR_TYPE||LA54_1==COMMA||LA54_1==DOUBLE_TYPE||LA54_1==FLOAT_TYPE||LA54_1==INT_TYPE||(LA54_1 >= LONGLONG_TYPE && LA54_1 <= LONG_TYPE)||LA54_1==RPAREN||LA54_1==SHORT_TYPE||LA54_1==VOID_TYPE) ) {
					alt54=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}

			switch (alt54) {
				case 1 :
					// myParser.g:128:5: type ID
					{
					pushFollow(FOLLOW_type_in_param1053);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_param1055); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:129:5: type
					{
					pushFollow(FOLLOW_type_in_param1067);
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
			if ( state.backtracking>0 ) { memoize(input, 17, param_StartIndex); }

		}
	}
	// $ANTLR end "param"



	// $ANTLR start "expr"
	// myParser.g:132:1: expr : operationStat ( ( OP_LAND | OP_LOR ) operationStat )* ;
	public final void expr() throws RecognitionException {
		int expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// myParser.g:132:6: ( operationStat ( ( OP_LAND | OP_LOR ) operationStat )* )
			// myParser.g:133:5: operationStat ( ( OP_LAND | OP_LOR ) operationStat )*
			{
			pushFollow(FOLLOW_operationStat_in_expr1080);
			operationStat();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:133:19: ( ( OP_LAND | OP_LOR ) operationStat )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==OP_LAND||LA55_0==OP_LOR) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// myParser.g:133:20: ( OP_LAND | OP_LOR ) operationStat
					{
					if ( input.LA(1)==OP_LAND||input.LA(1)==OP_LOR ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_operationStat_in_expr1091);
					operationStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop55;
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
			if ( state.backtracking>0 ) { memoize(input, 18, expr_StartIndex); }

		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "operationStat"
	// myParser.g:136:1: operationStat : add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) add )* ;
	public final void operationStat() throws RecognitionException {
		int operationStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// myParser.g:136:14: ( add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) add )* )
			// myParser.g:137:5: add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) add )*
			{
			pushFollow(FOLLOW_add_in_operationStat1105);
			add();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:137:9: ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) add )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==OP_ADDAS||LA56_0==OP_ASS||(LA56_0 >= OP_DIVAS && LA56_0 <= OP_GT)||LA56_0==OP_LE||(LA56_0 >= OP_LSAS && LA56_0 <= OP_MODAS)||(LA56_0 >= OP_MULAS && LA56_0 <= OP_NE)||LA56_0==OP_RSAS||LA56_0==OP_SUBAS||LA56_0==OP_XORAS) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// myParser.g:137:10: ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS ) add
					{
					if ( input.LA(1)==OP_ADDAS||input.LA(1)==OP_ASS||(input.LA(1) >= OP_DIVAS && input.LA(1) <= OP_GT)||input.LA(1)==OP_LE||(input.LA(1) >= OP_LSAS && input.LA(1) <= OP_MODAS)||(input.LA(1) >= OP_MULAS && input.LA(1) <= OP_NE)||input.LA(1)==OP_RSAS||input.LA(1)==OP_SUBAS||input.LA(1)==OP_XORAS ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_add_in_operationStat1196);
					add();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop56;
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
			if ( state.backtracking>0 ) { memoize(input, 19, operationStat_StartIndex); }

		}
	}
	// $ANTLR end "operationStat"



	// $ANTLR start "add"
	// myParser.g:142:1: add : multiply ( ( OP_ADD | OP_SUB ) multiply )* ;
	public final void add() throws RecognitionException {
		int add_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// myParser.g:142:4: ( multiply ( ( OP_ADD | OP_SUB ) multiply )* )
			// myParser.g:143:5: multiply ( ( OP_ADD | OP_SUB ) multiply )*
			{
			pushFollow(FOLLOW_multiply_in_add1210);
			multiply();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:143:14: ( ( OP_ADD | OP_SUB ) multiply )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==OP_ADD||LA57_0==OP_SUB) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// myParser.g:143:15: ( OP_ADD | OP_SUB ) multiply
					{
					if ( input.LA(1)==OP_ADD||input.LA(1)==OP_SUB ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiply_in_add1221);
					multiply();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop57;
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
			if ( state.backtracking>0 ) { memoize(input, 20, add_StartIndex); }

		}
	}
	// $ANTLR end "add"



	// $ANTLR start "multiply"
	// myParser.g:146:1: multiply : atom ( ( OP_MUL | OP_DIV ) atom )* ;
	public final void multiply() throws RecognitionException {
		int multiply_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// myParser.g:146:9: ( atom ( ( OP_MUL | OP_DIV ) atom )* )
			// myParser.g:147:5: atom ( ( OP_MUL | OP_DIV ) atom )*
			{
			pushFollow(FOLLOW_atom_in_multiply1235);
			atom();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:147:10: ( ( OP_MUL | OP_DIV ) atom )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==OP_DIV||LA58_0==OP_MUL) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// myParser.g:147:11: ( OP_MUL | OP_DIV ) atom
					{
					if ( input.LA(1)==OP_DIV||input.LA(1)==OP_MUL ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_multiply1247);
					atom();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop58;
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
			if ( state.backtracking>0 ) { memoize(input, 21, multiply_StartIndex); }

		}
	}
	// $ANTLR end "multiply"



	// $ANTLR start "atom"
	// myParser.g:150:1: atom : ( DEC_NUM | FLOAT_NUM | ID | LPAREN expr RPAREN );
	public final void atom() throws RecognitionException {
		int atom_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return; }

			// myParser.g:150:5: ( DEC_NUM | FLOAT_NUM | ID | LPAREN expr RPAREN )
			int alt59=4;
			switch ( input.LA(1) ) {
			case DEC_NUM:
				{
				alt59=1;
				}
				break;
			case FLOAT_NUM:
				{
				alt59=2;
				}
				break;
			case ID:
				{
				alt59=3;
				}
				break;
			case LPAREN:
				{
				alt59=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// myParser.g:151:5: DEC_NUM
					{
					match(input,DEC_NUM,FOLLOW_DEC_NUM_in_atom1261); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:152:5: FLOAT_NUM
					{
					match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_atom1281); if (state.failed) return;
					}
					break;
				case 3 :
					// myParser.g:153:5: ID
					{
					match(input,ID,FOLLOW_ID_in_atom1299); if (state.failed) return;
					}
					break;
				case 4 :
					// myParser.g:154:5: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom1324); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_atom1326);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_atom1328); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 22, atom_StartIndex); }

		}
	}
	// $ANTLR end "atom"

	// $ANTLR start synpred7_myParser
	public final void synpred7_myParser_fragment() throws RecognitionException {
		// myParser.g:19:12: ( WS )
		// myParser.g:19:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred7_myParser115); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_myParser

	// $ANTLR start synpred20_myParser
	public final void synpred20_myParser_fragment() throws RecognitionException {
		// myParser.g:38:5: ( assignmentStat )
		// myParser.g:38:5: assignmentStat
		{
		pushFollow(FOLLOW_assignmentStat_in_synpred20_myParser288);
		assignmentStat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred20_myParser

	// $ANTLR start synpred26_myParser
	public final void synpred26_myParser_fragment() throws RecognitionException {
		// myParser.g:44:5: ( exprList )
		// myParser.g:44:5: exprList
		{
		pushFollow(FOLLOW_exprList_in_synpred26_myParser365);
		exprList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_myParser

	// $ANTLR start synpred30_myParser
	public final void synpred30_myParser_fragment() throws RecognitionException {
		// myParser.g:50:5: ( ID ( WS )* OP_ASS ( WS )* expr SEMICOL )
		// myParser.g:50:5: ID ( WS )* OP_ASS ( WS )* expr SEMICOL
		{
		match(input,ID,FOLLOW_ID_in_synpred30_myParser410); if (state.failed) return;
		// myParser.g:50:8: ( WS )*
		loop61:
		while (true) {
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==WS) ) {
				alt61=1;
			}

			switch (alt61) {
			case 1 :
				// myParser.g:50:8: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred30_myParser412); if (state.failed) return;
				}
				break;

			default :
				break loop61;
			}
		}

		match(input,OP_ASS,FOLLOW_OP_ASS_in_synpred30_myParser415); if (state.failed) return;
		// myParser.g:50:19: ( WS )*
		loop62:
		while (true) {
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==WS) ) {
				alt62=1;
			}

			switch (alt62) {
			case 1 :
				// myParser.g:50:19: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred30_myParser417); if (state.failed) return;
				}
				break;

			default :
				break loop62;
			}
		}

		pushFollow(FOLLOW_expr_in_synpred30_myParser420);
		expr();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred30_myParser422); if (state.failed) return;
		}

	}
	// $ANTLR end synpred30_myParser

	// $ANTLR start synpred38_myParser
	public final void synpred38_myParser_fragment() throws RecognitionException {
		// myParser.g:58:12: ( WS )
		// myParser.g:58:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred38_myParser527); if (state.failed) return;
		}

	}
	// $ANTLR end synpred38_myParser

	// $ANTLR start synpred43_myParser
	public final void synpred43_myParser_fragment() throws RecognitionException {
		// myParser.g:65:12: ( WS )
		// myParser.g:65:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred43_myParser581); if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_myParser

	// $ANTLR start synpred47_myParser
	public final void synpred47_myParser_fragment() throws RecognitionException {
		// myParser.g:69:16: ( WS )
		// myParser.g:69:16: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred47_myParser638); if (state.failed) return;
		}

	}
	// $ANTLR end synpred47_myParser

	// $ANTLR start synpred59_myParser
	public final void synpred59_myParser_fragment() throws RecognitionException {
		// myParser.g:83:12: ( WS )
		// myParser.g:83:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred59_myParser767); if (state.failed) return;
		}

	}
	// $ANTLR end synpred59_myParser

	// $ANTLR start synpred65_myParser
	public final void synpred65_myParser_fragment() throws RecognitionException {
		// myParser.g:87:5: ( type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE )
		// myParser.g:87:5: type FUNCTION_CALL ( params )* RPAREN LBRACE ( stats )* ( WS )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE
		{
		pushFollow(FOLLOW_type_in_synpred65_myParser780);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_synpred65_myParser782); if (state.failed) return;
		// myParser.g:87:24: ( params )*
		loop69:
		while (true) {
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==CHAR_TYPE||LA69_0==DOUBLE_TYPE||LA69_0==FLOAT_TYPE||LA69_0==INT_TYPE||(LA69_0 >= LONGLONG_TYPE && LA69_0 <= LONG_TYPE)||LA69_0==SHORT_TYPE||LA69_0==VOID_TYPE) ) {
				alt69=1;
			}

			switch (alt69) {
			case 1 :
				// myParser.g:87:24: params
				{
				pushFollow(FOLLOW_params_in_synpred65_myParser784);
				params();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop69;
			}
		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred65_myParser787); if (state.failed) return;
		match(input,LBRACE,FOLLOW_LBRACE_in_synpred65_myParser794); if (state.failed) return;
		// myParser.g:89:9: ( stats )*
		loop70:
		while (true) {
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==BREAK_||LA70_0==CHAR_TYPE||(LA70_0 >= CONTINUE_ && LA70_0 <= DEC_NUM)||LA70_0==DOUBLE_TYPE||LA70_0==FLOAT_NUM||(LA70_0 >= FLOAT_TYPE && LA70_0 <= IF_)||LA70_0==INT_TYPE||(LA70_0 >= LONGLONG_TYPE && LA70_0 <= LPAREN)||LA70_0==SHORT_TYPE||(LA70_0 >= VOID_TYPE && LA70_0 <= WHILE_)) ) {
				alt70=1;
			}

			switch (alt70) {
			case 1 :
				// myParser.g:89:9: stats
				{
				pushFollow(FOLLOW_stats_in_synpred65_myParser805);
				stats();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop70;
			}
		}

		// myParser.g:89:16: ( WS )*
		loop71:
		while (true) {
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==WS) ) {
				alt71=1;
			}

			switch (alt71) {
			case 1 :
				// myParser.g:89:16: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred65_myParser808); if (state.failed) return;
				}
				break;

			default :
				break loop71;
			}
		}

		match(input,RETURN_,FOLLOW_RETURN__in_synpred65_myParser819); if (state.failed) return;
		// myParser.g:90:18: ( DEC_NUM | FLOAT_NUM )?
		int alt72=2;
		int LA72_0 = input.LA(1);
		if ( (LA72_0==DEC_NUM||LA72_0==FLOAT_NUM) ) {
			alt72=1;
		}
		switch (alt72) {
			case 1 :
				// myParser.g:
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

		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred65_myParser830); if (state.failed) return;
		match(input,RBRACE,FOLLOW_RBRACE_in_synpred65_myParser837); if (state.failed) return;
		}

	}
	// $ANTLR end synpred65_myParser

	// $ANTLR start synpred67_myParser
	public final void synpred67_myParser_fragment() throws RecognitionException {
		// myParser.g:98:5: ( type ID SEMICOL )
		// myParser.g:98:5: type ID SEMICOL
		{
		pushFollow(FOLLOW_type_in_synpred67_myParser901);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred67_myParser903); if (state.failed) return;
		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred67_myParser905); if (state.failed) return;
		}

	}
	// $ANTLR end synpred67_myParser

	// $ANTLR start synpred68_myParser
	public final void synpred68_myParser_fragment() throws RecognitionException {
		// myParser.g:99:5: ( type exprList )
		// myParser.g:99:5: type exprList
		{
		pushFollow(FOLLOW_type_in_synpred68_myParser917);
		type();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_exprList_in_synpred68_myParser919);
		exprList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred68_myParser

	// Delegated rules

	public final boolean synpred30_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred30_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred65_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred26_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred26_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA12 dfa12 = new DFA12(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA50 dfa50 = new DFA50(this);
	static final String DFA12_eotS =
		"\u01fc\uffff";
	static final String DFA12_eofS =
		"\u01fc\uffff";
	static final String DFA12_minS =
		"\1\5\1\11\13\uffff\1\15\7\uffff\3\11\1\15\1\0\4\15\1\uffff\1\0\4\15\1"+
		"\uffff\4\15\1\0\1\uffff\3\43\1\15\17\uffff\3\11\1\15\3\11\1\15\3\11\1"+
		"\15\3\11\1\15\17\uffff\3\11\1\15\3\11\1\15\3\11\1\15\3\11\1\15\3\11\1"+
		"\15\3\11\1\15\3\11\1\15\3\11\1\15\17\uffff\4\15\1\11\4\15\1\11\4\15\1"+
		"\11\3\43\1\15\5\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff"+
		"\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff"+
		"\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff"+
		"\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff"+
		"\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff"+
		"\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff"+
		"\5\0\1\uffff\31\0\1\uffff\25\0\1\uffff\25\0\1\uffff\23\0";
	static final String DFA12_maxS =
		"\1\111\1\112\13\uffff\1\112\7\uffff\3\105\1\42\1\0\4\42\1\uffff\1\0\4"+
		"\42\1\uffff\4\42\1\0\1\uffff\3\104\1\42\17\uffff\3\105\1\42\3\105\1\42"+
		"\3\105\1\42\3\105\1\42\17\uffff\3\105\1\42\3\105\1\42\3\105\1\42\3\105"+
		"\1\42\3\105\1\42\3\105\1\42\3\105\1\42\3\105\1\42\17\uffff\4\42\1\105"+
		"\4\42\1\105\4\42\1\105\3\104\1\42\5\0\1\uffff\5\0\1\uffff\5\0\1\uffff"+
		"\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff"+
		"\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff"+
		"\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff"+
		"\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff"+
		"\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff"+
		"\11\0\1\uffff\5\0\1\uffff\5\0\1\uffff\31\0\1\uffff\25\0\1\uffff\25\0\1"+
		"\uffff\23\0";
	static final String DFA12_acceptS =
		"\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\10\1\11\1\1\u01ef\uffff";
	static final String DFA12_specialS =
		"\31\uffff\1\0\5\uffff\1\1\11\uffff\1\2\165\uffff\1\3\1\4\1\5\1\6\1\7\1"+
		"\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\15\1\16\1\17\1\20\1\21\1\uffff"+
		"\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\uffff\1\33\1\34\1\35\1"+
		"\36\1\37\1\uffff\1\40\1\41\1\42\1\43\1\44\1\uffff\1\45\1\46\1\47\1\50"+
		"\1\51\1\52\1\53\1\54\1\55\1\uffff\1\56\1\57\1\60\1\61\1\62\1\uffff\1\63"+
		"\1\64\1\65\1\66\1\67\1\uffff\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1"+
		"\100\1\uffff\1\101\1\102\1\103\1\104\1\105\1\uffff\1\106\1\107\1\110\1"+
		"\111\1\112\1\uffff\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123"+
		"\1\uffff\1\124\1\125\1\126\1\127\1\130\1\uffff\1\131\1\132\1\133\1\134"+
		"\1\135\1\uffff\1\136\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1"+
		"\uffff\1\147\1\150\1\151\1\152\1\153\1\uffff\1\154\1\155\1\156\1\157\1"+
		"\160\1\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\uffff"+
		"\1\172\1\173\1\174\1\175\1\176\1\uffff\1\177\1\u0080\1\u0081\1\u0082\1"+
		"\u0083\1\uffff\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a"+
		"\1\u008b\1\u008c\1\uffff\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\uffff"+
		"\1\u0092\1\u0093\1\u0094\1\u0095\1\u0096\1\uffff\1\u0097\1\u0098\1\u0099"+
		"\1\u009a\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\uffff\1\u00a0\1\u00a1"+
		"\1\u00a2\1\u00a3\1\u00a4\1\uffff\1\u00a5\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
		"\1\uffff\1\u00aa\1\u00ab\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1"+
		"\1\u00b2\1\uffff\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\1\uffff\1\u00b8"+
		"\1\u00b9\1\u00ba\1\u00bb\1\u00bc\1\uffff\1\u00bd\1\u00be\1\u00bf\1\u00c0"+
		"\1\u00c1\1\u00c2\1\u00c3\1\u00c4\1\u00c5\1\uffff\1\u00c6\1\u00c7\1\u00c8"+
		"\1\u00c9\1\u00ca\1\uffff\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\uffff"+
		"\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8"+
		"\1\uffff\1\u00d9\1\u00da\1\u00db\1\u00dc\1\u00dd\1\uffff\1\u00de\1\u00df"+
		"\1\u00e0\1\u00e1\1\u00e2\1\uffff\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7"+
		"\1\u00e8\1\u00e9\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0"+
		"\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\1\u00f8\1\u00f9"+
		"\1\u00fa\1\u00fb\1\uffff\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101"+
		"\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109\1\u010a"+
		"\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\uffff\1\u0111\1\u0112"+
		"\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118\1\u0119\1\u011a\1\u011b"+
		"\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120\1\u0121\1\u0122\1\u0123\1\u0124"+
		"\1\u0125\1\uffff\1\u0126\1\u0127\1\u0128\1\u0129\1\u012a\1\u012b\1\u012c"+
		"\1\u012d\1\u012e\1\u012f\1\u0130\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135"+
		"\1\u0136\1\u0137\1\u0138}>";
	static final String[] DFA12_transitionS = {
			"\1\12\1\uffff\1\5\4\uffff\1\13\1\7\2\uffff\1\5\1\uffff\1\7\3\uffff\1"+
			"\5\1\4\1\6\1\1\1\3\1\uffff\1\5\3\uffff\2\5\1\7\43\uffff\1\5\1\uffff\1"+
			"\5\1\2",
			"\1\7\31\uffff\1\7\1\uffff\1\7\1\uffff\1\15\10\7\1\uffff\6\7\3\uffff"+
			"\3\7\2\uffff\1\7\5\uffff\1\7\4\uffff\1\14",
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
			"\1\25\4\uffff\1\26\6\uffff\1\27\10\uffff\1\30\47\uffff\1\14",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\7\31\uffff\1\33\1\uffff\1\34\1\uffff\1\34\1\32\4\34\1\35\1\34\1\35"+
			"\1\uffff\3\34\1\32\2\34\3\uffff\1\34\1\33\1\34\2\uffff\1\34\5\uffff\1"+
			"\31",
			"\1\7\31\uffff\1\41\1\uffff\1\42\1\uffff\1\42\1\40\4\42\1\43\1\42\1\43"+
			"\1\uffff\3\42\1\40\2\42\3\uffff\1\42\1\41\1\42\2\uffff\1\42\5\uffff\1"+
			"\37",
			"\1\7\31\uffff\1\46\1\uffff\1\47\1\uffff\1\47\1\45\4\47\1\50\1\47\1\50"+
			"\1\uffff\3\47\1\45\2\47\3\uffff\1\47\1\46\1\47\2\uffff\1\47\5\uffff\1"+
			"\51",
			"\1\53\4\uffff\1\54\6\uffff\1\55\10\uffff\1\56",
			"\1\uffff",
			"\1\76\4\uffff\1\77\6\uffff\1\100\10\uffff\1\101",
			"\1\102\4\uffff\1\103\6\uffff\1\104\10\uffff\1\105",
			"\1\106\4\uffff\1\107\6\uffff\1\110\10\uffff\1\111",
			"\1\112\4\uffff\1\113\6\uffff\1\114\10\uffff\1\115",
			"",
			"\1\uffff",
			"\1\135\4\uffff\1\136\6\uffff\1\137\10\uffff\1\140",
			"\1\141\4\uffff\1\142\6\uffff\1\143\10\uffff\1\144",
			"\1\145\4\uffff\1\146\6\uffff\1\147\10\uffff\1\150",
			"\1\151\4\uffff\1\152\6\uffff\1\153\10\uffff\1\154",
			"",
			"\1\155\4\uffff\1\156\6\uffff\1\157\10\uffff\1\160",
			"\1\161\4\uffff\1\162\6\uffff\1\163\10\uffff\1\164",
			"\1\165\4\uffff\1\166\6\uffff\1\167\10\uffff\1\170",
			"\1\171\4\uffff\1\172\6\uffff\1\173\10\uffff\1\174",
			"\1\uffff",
			"",
			"\1\u008d\1\uffff\1\u008e\1\uffff\1\u008e\1\u008c\4\u008e\1\u008f\1\u008e"+
			"\1\u008f\1\uffff\3\u008e\1\u008c\2\u008e\3\uffff\1\u008e\1\u008d\1\u008e"+
			"\2\uffff\1\u008e\4\uffff\1\u0090",
			"\1\u0092\1\uffff\1\u0093\1\uffff\1\u0093\1\u0091\4\u0093\1\u0094\1\u0093"+
			"\1\u0094\1\uffff\3\u0093\1\u0091\2\u0093\3\uffff\1\u0093\1\u0092\1\u0093"+
			"\2\uffff\1\u0093\4\uffff\1\u0095",
			"\1\u0097\1\uffff\1\u0098\1\uffff\1\u0098\1\u0096\4\u0098\1\u0099\1\u0098"+
			"\1\u0099\1\uffff\3\u0098\1\u0096\2\u0098\3\uffff\1\u0098\1\u0097\1\u0098"+
			"\2\uffff\1\u0098\4\uffff\1\u009a",
			"\1\u009b\4\uffff\1\u009c\6\uffff\1\u009d\10\uffff\1\u009e",
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
			"\1\7\31\uffff\1\u009f\1\uffff\1\u00a0\1\uffff\1\u00a0\1\u00a3\4\u00a0"+
			"\1\u00a1\1\u00a0\1\u00a1\1\uffff\3\u00a0\1\u00a3\2\u00a0\3\uffff\1\u00a0"+
			"\1\u009f\1\u00a0\2\uffff\1\u00a0\5\uffff\1\u00a2",
			"\1\7\31\uffff\1\u00a5\1\uffff\1\u00a6\1\uffff\1\u00a6\1\u00a9\4\u00a6"+
			"\1\u00a7\1\u00a6\1\u00a7\1\uffff\3\u00a6\1\u00a9\2\u00a6\3\uffff\1\u00a6"+
			"\1\u00a5\1\u00a6\2\uffff\1\u00a6\5\uffff\1\u00a8",
			"\1\7\31\uffff\1\u00ab\1\uffff\1\u00ac\1\uffff\1\u00ac\1\u00af\4\u00ac"+
			"\1\u00ad\1\u00ac\1\u00ad\1\uffff\3\u00ac\1\u00af\2\u00ac\3\uffff\1\u00ac"+
			"\1\u00ab\1\u00ac\2\uffff\1\u00ac\5\uffff\1\u00ae",
			"\1\u00b1\4\uffff\1\u00b2\6\uffff\1\u00b3\10\uffff\1\u00b4",
			"\1\7\31\uffff\1\u00b9\1\uffff\1\u00b6\1\uffff\1\u00b6\1\u00b5\4\u00b6"+
			"\1\u00b7\1\u00b6\1\u00b7\1\uffff\3\u00b6\1\u00b5\2\u00b6\3\uffff\1\u00b6"+
			"\1\u00b9\1\u00b6\2\uffff\1\u00b6\5\uffff\1\u00b8",
			"\1\7\31\uffff\1\u00bf\1\uffff\1\u00bc\1\uffff\1\u00bc\1\u00bb\4\u00bc"+
			"\1\u00bd\1\u00bc\1\u00bd\1\uffff\3\u00bc\1\u00bb\2\u00bc\3\uffff\1\u00bc"+
			"\1\u00bf\1\u00bc\2\uffff\1\u00bc\5\uffff\1\u00be",
			"\1\7\31\uffff\1\u00c5\1\uffff\1\u00c2\1\uffff\1\u00c2\1\u00c1\4\u00c2"+
			"\1\u00c3\1\u00c2\1\u00c3\1\uffff\3\u00c2\1\u00c1\2\u00c2\3\uffff\1\u00c2"+
			"\1\u00c5\1\u00c2\2\uffff\1\u00c2\5\uffff\1\u00c4",
			"\1\u00c7\4\uffff\1\u00c8\6\uffff\1\u00c9\10\uffff\1\u00ca",
			"\1\7\31\uffff\1\u00cc\1\uffff\1\u00cf\1\uffff\1\u00cf\1\u00cb\4\u00cf"+
			"\1\u00cd\1\u00cf\1\u00cd\1\uffff\3\u00cf\1\u00cb\2\u00cf\3\uffff\1\u00cf"+
			"\1\u00cc\1\u00cf\2\uffff\1\u00cf\5\uffff\1\u00ce",
			"\1\7\31\uffff\1\u00d2\1\uffff\1\u00d5\1\uffff\1\u00d5\1\u00d1\4\u00d5"+
			"\1\u00d3\1\u00d5\1\u00d3\1\uffff\3\u00d5\1\u00d1\2\u00d5\3\uffff\1\u00d5"+
			"\1\u00d2\1\u00d5\2\uffff\1\u00d5\5\uffff\1\u00d4",
			"\1\7\31\uffff\1\u00d8\1\uffff\1\u00db\1\uffff\1\u00db\1\u00d7\4\u00db"+
			"\1\u00d9\1\u00db\1\u00d9\1\uffff\3\u00db\1\u00d7\2\u00db\3\uffff\1\u00db"+
			"\1\u00d8\1\u00db\2\uffff\1\u00db\5\uffff\1\u00da",
			"\1\u00dd\4\uffff\1\u00de\6\uffff\1\u00df\10\uffff\1\u00e0",
			"\1\7\31\uffff\1\u00e2\1\uffff\1\u00e3\1\uffff\1\u00e3\1\u00e1\4\u00e3"+
			"\1\u00e5\1\u00e3\1\u00e5\1\uffff\3\u00e3\1\u00e1\2\u00e3\3\uffff\1\u00e3"+
			"\1\u00e2\1\u00e3\2\uffff\1\u00e3\5\uffff\1\u00e4",
			"\1\7\31\uffff\1\u00e8\1\uffff\1\u00e9\1\uffff\1\u00e9\1\u00e7\4\u00e9"+
			"\1\u00eb\1\u00e9\1\u00eb\1\uffff\3\u00e9\1\u00e7\2\u00e9\3\uffff\1\u00e9"+
			"\1\u00e8\1\u00e9\2\uffff\1\u00e9\5\uffff\1\u00ea",
			"\1\7\31\uffff\1\u00ee\1\uffff\1\u00ef\1\uffff\1\u00ef\1\u00ed\4\u00ef"+
			"\1\u00f1\1\u00ef\1\u00f1\1\uffff\3\u00ef\1\u00ed\2\u00ef\3\uffff\1\u00ef"+
			"\1\u00ee\1\u00ef\2\uffff\1\u00ef\5\uffff\1\u00f0",
			"\1\u00f3\4\uffff\1\u00f4\6\uffff\1\u00f5\10\uffff\1\u00f6",
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
			"\1\7\31\uffff\1\u00f7\1\uffff\1\u00f8\1\uffff\1\u00f8\1\u00fb\4\u00f8"+
			"\1\u00f9\1\u00f8\1\u00f9\1\uffff\3\u00f8\1\u00fb\2\u00f8\3\uffff\1\u00f8"+
			"\1\u00f7\1\u00f8\2\uffff\1\u00f8\5\uffff\1\u00fa",
			"\1\7\31\uffff\1\u00fd\1\uffff\1\u00fe\1\uffff\1\u00fe\1\u0101\4\u00fe"+
			"\1\u00ff\1\u00fe\1\u00ff\1\uffff\3\u00fe\1\u0101\2\u00fe\3\uffff\1\u00fe"+
			"\1\u00fd\1\u00fe\2\uffff\1\u00fe\5\uffff\1\u0100",
			"\1\7\31\uffff\1\u0103\1\uffff\1\u0104\1\uffff\1\u0104\1\u0107\4\u0104"+
			"\1\u0105\1\u0104\1\u0105\1\uffff\3\u0104\1\u0107\2\u0104\3\uffff\1\u0104"+
			"\1\u0103\1\u0104\2\uffff\1\u0104\5\uffff\1\u0106",
			"\1\u0109\4\uffff\1\u010a\6\uffff\1\u010b\10\uffff\1\u010c",
			"\1\7\31\uffff\1\u0111\1\uffff\1\u010e\1\uffff\1\u010e\1\u010d\4\u010e"+
			"\1\u010f\1\u010e\1\u010f\1\uffff\3\u010e\1\u010d\2\u010e\3\uffff\1\u010e"+
			"\1\u0111\1\u010e\2\uffff\1\u010e\5\uffff\1\u0110",
			"\1\7\31\uffff\1\u0117\1\uffff\1\u0114\1\uffff\1\u0114\1\u0113\4\u0114"+
			"\1\u0115\1\u0114\1\u0115\1\uffff\3\u0114\1\u0113\2\u0114\3\uffff\1\u0114"+
			"\1\u0117\1\u0114\2\uffff\1\u0114\5\uffff\1\u0116",
			"\1\7\31\uffff\1\u011d\1\uffff\1\u011a\1\uffff\1\u011a\1\u0119\4\u011a"+
			"\1\u011b\1\u011a\1\u011b\1\uffff\3\u011a\1\u0119\2\u011a\3\uffff\1\u011a"+
			"\1\u011d\1\u011a\2\uffff\1\u011a\5\uffff\1\u011c",
			"\1\u011f\4\uffff\1\u0120\6\uffff\1\u0121\10\uffff\1\u0122",
			"\1\7\31\uffff\1\u0124\1\uffff\1\u0127\1\uffff\1\u0127\1\u0123\4\u0127"+
			"\1\u0125\1\u0127\1\u0125\1\uffff\3\u0127\1\u0123\2\u0127\3\uffff\1\u0127"+
			"\1\u0124\1\u0127\2\uffff\1\u0127\5\uffff\1\u0126",
			"\1\7\31\uffff\1\u012a\1\uffff\1\u012d\1\uffff\1\u012d\1\u0129\4\u012d"+
			"\1\u012b\1\u012d\1\u012b\1\uffff\3\u012d\1\u0129\2\u012d\3\uffff\1\u012d"+
			"\1\u012a\1\u012d\2\uffff\1\u012d\5\uffff\1\u012c",
			"\1\7\31\uffff\1\u0130\1\uffff\1\u0133\1\uffff\1\u0133\1\u012f\4\u0133"+
			"\1\u0131\1\u0133\1\u0131\1\uffff\3\u0133\1\u012f\2\u0133\3\uffff\1\u0133"+
			"\1\u0130\1\u0133\2\uffff\1\u0133\5\uffff\1\u0132",
			"\1\u0135\4\uffff\1\u0136\6\uffff\1\u0137\10\uffff\1\u0138",
			"\1\7\31\uffff\1\u013a\1\uffff\1\u013b\1\uffff\1\u013b\1\u0139\4\u013b"+
			"\1\u013d\1\u013b\1\u013d\1\uffff\3\u013b\1\u0139\2\u013b\3\uffff\1\u013b"+
			"\1\u013a\1\u013b\2\uffff\1\u013b\5\uffff\1\u013c",
			"\1\7\31\uffff\1\u0140\1\uffff\1\u0141\1\uffff\1\u0141\1\u013f\4\u0141"+
			"\1\u0143\1\u0141\1\u0143\1\uffff\3\u0141\1\u013f\2\u0141\3\uffff\1\u0141"+
			"\1\u0140\1\u0141\2\uffff\1\u0141\5\uffff\1\u0142",
			"\1\7\31\uffff\1\u0146\1\uffff\1\u0147\1\uffff\1\u0147\1\u0145\4\u0147"+
			"\1\u0149\1\u0147\1\u0149\1\uffff\3\u0147\1\u0145\2\u0147\3\uffff\1\u0147"+
			"\1\u0146\1\u0147\2\uffff\1\u0147\5\uffff\1\u0148",
			"\1\u014b\4\uffff\1\u014c\6\uffff\1\u014d\10\uffff\1\u014e",
			"\1\7\31\uffff\1\u014f\1\uffff\1\u0150\1\uffff\1\u0150\1\u0153\4\u0150"+
			"\1\u0151\1\u0150\1\u0151\1\uffff\3\u0150\1\u0153\2\u0150\3\uffff\1\u0150"+
			"\1\u014f\1\u0150\2\uffff\1\u0150\5\uffff\1\u0152",
			"\1\7\31\uffff\1\u0155\1\uffff\1\u0156\1\uffff\1\u0156\1\u0159\4\u0156"+
			"\1\u0157\1\u0156\1\u0157\1\uffff\3\u0156\1\u0159\2\u0156\3\uffff\1\u0156"+
			"\1\u0155\1\u0156\2\uffff\1\u0156\5\uffff\1\u0158",
			"\1\7\31\uffff\1\u015b\1\uffff\1\u015c\1\uffff\1\u015c\1\u015f\4\u015c"+
			"\1\u015d\1\u015c\1\u015d\1\uffff\3\u015c\1\u015f\2\u015c\3\uffff\1\u015c"+
			"\1\u015b\1\u015c\2\uffff\1\u015c\5\uffff\1\u015e",
			"\1\u0161\4\uffff\1\u0162\6\uffff\1\u0163\10\uffff\1\u0164",
			"\1\7\31\uffff\1\u0169\1\uffff\1\u0166\1\uffff\1\u0166\1\u0165\4\u0166"+
			"\1\u0167\1\u0166\1\u0167\1\uffff\3\u0166\1\u0165\2\u0166\3\uffff\1\u0166"+
			"\1\u0169\1\u0166\2\uffff\1\u0166\5\uffff\1\u0168",
			"\1\7\31\uffff\1\u016f\1\uffff\1\u016c\1\uffff\1\u016c\1\u016b\4\u016c"+
			"\1\u016d\1\u016c\1\u016d\1\uffff\3\u016c\1\u016b\2\u016c\3\uffff\1\u016c"+
			"\1\u016f\1\u016c\2\uffff\1\u016c\5\uffff\1\u016e",
			"\1\7\31\uffff\1\u0175\1\uffff\1\u0172\1\uffff\1\u0172\1\u0171\4\u0172"+
			"\1\u0173\1\u0172\1\u0173\1\uffff\3\u0172\1\u0171\2\u0172\3\uffff\1\u0172"+
			"\1\u0175\1\u0172\2\uffff\1\u0172\5\uffff\1\u0174",
			"\1\u0177\4\uffff\1\u0178\6\uffff\1\u0179\10\uffff\1\u017a",
			"\1\7\31\uffff\1\u017c\1\uffff\1\u017f\1\uffff\1\u017f\1\u017b\4\u017f"+
			"\1\u017d\1\u017f\1\u017d\1\uffff\3\u017f\1\u017b\2\u017f\3\uffff\1\u017f"+
			"\1\u017c\1\u017f\2\uffff\1\u017f\5\uffff\1\u017e",
			"\1\7\31\uffff\1\u0182\1\uffff\1\u0185\1\uffff\1\u0185\1\u0181\4\u0185"+
			"\1\u0183\1\u0185\1\u0183\1\uffff\3\u0185\1\u0181\2\u0185\3\uffff\1\u0185"+
			"\1\u0182\1\u0185\2\uffff\1\u0185\5\uffff\1\u0184",
			"\1\7\31\uffff\1\u0188\1\uffff\1\u018b\1\uffff\1\u018b\1\u0187\4\u018b"+
			"\1\u0189\1\u018b\1\u0189\1\uffff\3\u018b\1\u0187\2\u018b\3\uffff\1\u018b"+
			"\1\u0188\1\u018b\2\uffff\1\u018b\5\uffff\1\u018a",
			"\1\u018d\4\uffff\1\u018e\6\uffff\1\u018f\10\uffff\1\u0190",
			"\1\7\31\uffff\1\u0192\1\uffff\1\u0193\1\uffff\1\u0193\1\u0191\4\u0193"+
			"\1\u0195\1\u0193\1\u0195\1\uffff\3\u0193\1\u0191\2\u0193\3\uffff\1\u0193"+
			"\1\u0192\1\u0193\2\uffff\1\u0193\5\uffff\1\u0194",
			"\1\7\31\uffff\1\u0198\1\uffff\1\u0199\1\uffff\1\u0199\1\u0197\4\u0199"+
			"\1\u019b\1\u0199\1\u019b\1\uffff\3\u0199\1\u0197\2\u0199\3\uffff\1\u0199"+
			"\1\u0198\1\u0199\2\uffff\1\u0199\5\uffff\1\u019a",
			"\1\7\31\uffff\1\u019e\1\uffff\1\u019f\1\uffff\1\u019f\1\u019d\4\u019f"+
			"\1\u01a1\1\u019f\1\u01a1\1\uffff\3\u019f\1\u019d\2\u019f\3\uffff\1\u019f"+
			"\1\u019e\1\u019f\2\uffff\1\u019f\5\uffff\1\u01a0",
			"\1\u01a3\4\uffff\1\u01a4\6\uffff\1\u01a5\10\uffff\1\u01a6",
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
			"\1\u01a7\4\uffff\1\u01a8\6\uffff\1\u01a9\10\uffff\1\u01aa",
			"\1\u01ab\4\uffff\1\u01ac\6\uffff\1\u01ad\10\uffff\1\u01ae",
			"\1\u01af\4\uffff\1\u01b0\6\uffff\1\u01b1\10\uffff\1\u01b2",
			"\1\u01b3\4\uffff\1\u01b4\6\uffff\1\u01b5\10\uffff\1\u01b6",
			"\1\7\31\uffff\1\u01b8\1\uffff\1\u01b9\1\uffff\1\u01b9\1\u01b7\4\u01b9"+
			"\1\u01ba\1\u01b9\1\u01ba\1\uffff\3\u01b9\1\u01b7\2\u01b9\3\uffff\1\u01b9"+
			"\1\u01b8\1\u01b9\2\uffff\1\u01b9\5\uffff\1\u01bb",
			"\1\u01bd\4\uffff\1\u01be\6\uffff\1\u01bf\10\uffff\1\u01c0",
			"\1\u01c1\4\uffff\1\u01c2\6\uffff\1\u01c3\10\uffff\1\u01c4",
			"\1\u01c5\4\uffff\1\u01c6\6\uffff\1\u01c7\10\uffff\1\u01c8",
			"\1\u01c9\4\uffff\1\u01ca\6\uffff\1\u01cb\10\uffff\1\u01cc",
			"\1\7\31\uffff\1\u01ce\1\uffff\1\u01cf\1\uffff\1\u01cf\1\u01cd\4\u01cf"+
			"\1\u01d0\1\u01cf\1\u01d0\1\uffff\3\u01cf\1\u01cd\2\u01cf\3\uffff\1\u01cf"+
			"\1\u01ce\1\u01cf\2\uffff\1\u01cf\5\uffff\1\u01d1",
			"\1\u01d3\4\uffff\1\u01d4\6\uffff\1\u01d5\10\uffff\1\u01d6",
			"\1\u01d7\4\uffff\1\u01d8\6\uffff\1\u01d9\10\uffff\1\u01da",
			"\1\u01db\4\uffff\1\u01dc\6\uffff\1\u01dd\10\uffff\1\u01de",
			"\1\u01df\4\uffff\1\u01e0\6\uffff\1\u01e1\10\uffff\1\u01e2",
			"\1\7\31\uffff\1\u01e4\1\uffff\1\u01e5\1\uffff\1\u01e5\1\u01e3\4\u01e5"+
			"\1\u01e6\1\u01e5\1\u01e6\1\uffff\3\u01e5\1\u01e3\2\u01e5\3\uffff\1\u01e5"+
			"\1\u01e4\1\u01e5\2\uffff\1\u01e5\5\uffff\1\u01e7",
			"\1\u01ea\1\uffff\1\u01eb\1\uffff\1\u01eb\1\u01e9\4\u01eb\1\u01ec\1\u01eb"+
			"\1\u01ec\1\uffff\3\u01eb\1\u01e9\2\u01eb\3\uffff\1\u01eb\1\u01ea\1\u01eb"+
			"\2\uffff\1\u01eb\4\uffff\1\u01ed",
			"\1\u01ef\1\uffff\1\u01f0\1\uffff\1\u01f0\1\u01ee\4\u01f0\1\u01f1\1\u01f0"+
			"\1\u01f1\1\uffff\3\u01f0\1\u01ee\2\u01f0\3\uffff\1\u01f0\1\u01ef\1\u01f0"+
			"\2\uffff\1\u01f0\4\uffff\1\u01f2",
			"\1\u01f4\1\uffff\1\u01f5\1\uffff\1\u01f5\1\u01f3\4\u01f5\1\u01f6\1\u01f5"+
			"\1\u01f6\1\uffff\3\u01f5\1\u01f3\2\u01f5\3\uffff\1\u01f5\1\u01f4\1\u01f5"+
			"\2\uffff\1\u01f5\4\uffff\1\u01f7",
			"\1\u01f8\4\uffff\1\u01f9\6\uffff\1\u01fa\10\uffff\1\u01fb",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "37:1: stats : ( assignmentStat | whileStat | ifelseStat | forStat | declareStat | procedStat | exprList | breakStat | continueStat );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA12_25 = input.LA(1);
						 
						int index12_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_25);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA12_31 = input.LA(1);
						 
						int index12_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_31);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA12_41 = input.LA(1);
						 
						int index12_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_41);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA12_159 = input.LA(1);
						 
						int index12_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_159);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA12_160 = input.LA(1);
						 
						int index12_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_160);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA12_161 = input.LA(1);
						 
						int index12_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_161);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA12_162 = input.LA(1);
						 
						int index12_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_162);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA12_163 = input.LA(1);
						 
						int index12_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_163);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA12_165 = input.LA(1);
						 
						int index12_165 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_165);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA12_166 = input.LA(1);
						 
						int index12_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_166);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA12_167 = input.LA(1);
						 
						int index12_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_167);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA12_168 = input.LA(1);
						 
						int index12_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_168);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA12_169 = input.LA(1);
						 
						int index12_169 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_169);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA12_171 = input.LA(1);
						 
						int index12_171 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_171);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA12_172 = input.LA(1);
						 
						int index12_172 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_172);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA12_173 = input.LA(1);
						 
						int index12_173 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_173);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA12_174 = input.LA(1);
						 
						int index12_174 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_174);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA12_175 = input.LA(1);
						 
						int index12_175 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_175);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA12_177 = input.LA(1);
						 
						int index12_177 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_177);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA12_178 = input.LA(1);
						 
						int index12_178 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_178);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA12_179 = input.LA(1);
						 
						int index12_179 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_179);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA12_180 = input.LA(1);
						 
						int index12_180 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_180);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA12_181 = input.LA(1);
						 
						int index12_181 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_181);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA12_182 = input.LA(1);
						 
						int index12_182 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_182);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA12_183 = input.LA(1);
						 
						int index12_183 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_183);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA12_184 = input.LA(1);
						 
						int index12_184 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_184);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA12_185 = input.LA(1);
						 
						int index12_185 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_185);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA12_187 = input.LA(1);
						 
						int index12_187 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_187);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA12_188 = input.LA(1);
						 
						int index12_188 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_188);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA12_189 = input.LA(1);
						 
						int index12_189 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_189);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA12_190 = input.LA(1);
						 
						int index12_190 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_190);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA12_191 = input.LA(1);
						 
						int index12_191 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_191);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA12_193 = input.LA(1);
						 
						int index12_193 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_193);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA12_194 = input.LA(1);
						 
						int index12_194 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_194);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA12_195 = input.LA(1);
						 
						int index12_195 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_195);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA12_196 = input.LA(1);
						 
						int index12_196 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_196);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA12_197 = input.LA(1);
						 
						int index12_197 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_197);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA12_199 = input.LA(1);
						 
						int index12_199 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_199);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA12_200 = input.LA(1);
						 
						int index12_200 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_200);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA12_201 = input.LA(1);
						 
						int index12_201 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_201);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA12_202 = input.LA(1);
						 
						int index12_202 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_202);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA12_203 = input.LA(1);
						 
						int index12_203 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_203);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA12_204 = input.LA(1);
						 
						int index12_204 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_204);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA12_205 = input.LA(1);
						 
						int index12_205 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_205);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA12_206 = input.LA(1);
						 
						int index12_206 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_206);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA12_207 = input.LA(1);
						 
						int index12_207 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_207);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA12_209 = input.LA(1);
						 
						int index12_209 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_209);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA12_210 = input.LA(1);
						 
						int index12_210 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_210);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA12_211 = input.LA(1);
						 
						int index12_211 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_211);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA12_212 = input.LA(1);
						 
						int index12_212 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_212);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA12_213 = input.LA(1);
						 
						int index12_213 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_213);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA12_215 = input.LA(1);
						 
						int index12_215 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_215);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA12_216 = input.LA(1);
						 
						int index12_216 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_216);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA12_217 = input.LA(1);
						 
						int index12_217 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_217);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA12_218 = input.LA(1);
						 
						int index12_218 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_218);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA12_219 = input.LA(1);
						 
						int index12_219 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_219);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA12_221 = input.LA(1);
						 
						int index12_221 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_221);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA12_222 = input.LA(1);
						 
						int index12_222 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_222);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA12_223 = input.LA(1);
						 
						int index12_223 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_223);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA12_224 = input.LA(1);
						 
						int index12_224 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_224);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA12_225 = input.LA(1);
						 
						int index12_225 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_225);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA12_226 = input.LA(1);
						 
						int index12_226 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_226);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA12_227 = input.LA(1);
						 
						int index12_227 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_227);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA12_228 = input.LA(1);
						 
						int index12_228 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_228);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA12_229 = input.LA(1);
						 
						int index12_229 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_229);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA12_231 = input.LA(1);
						 
						int index12_231 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_231);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA12_232 = input.LA(1);
						 
						int index12_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_232);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA12_233 = input.LA(1);
						 
						int index12_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_233);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA12_234 = input.LA(1);
						 
						int index12_234 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_234);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA12_235 = input.LA(1);
						 
						int index12_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_235);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA12_237 = input.LA(1);
						 
						int index12_237 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_237);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA12_238 = input.LA(1);
						 
						int index12_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_238);
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA12_239 = input.LA(1);
						 
						int index12_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_239);
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA12_240 = input.LA(1);
						 
						int index12_240 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_240);
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA12_241 = input.LA(1);
						 
						int index12_241 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_241);
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA12_243 = input.LA(1);
						 
						int index12_243 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_243);
						if ( s>=0 ) return s;
						break;

					case 76 : 
						int LA12_244 = input.LA(1);
						 
						int index12_244 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_244);
						if ( s>=0 ) return s;
						break;

					case 77 : 
						int LA12_245 = input.LA(1);
						 
						int index12_245 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_245);
						if ( s>=0 ) return s;
						break;

					case 78 : 
						int LA12_246 = input.LA(1);
						 
						int index12_246 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_246);
						if ( s>=0 ) return s;
						break;

					case 79 : 
						int LA12_247 = input.LA(1);
						 
						int index12_247 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_247);
						if ( s>=0 ) return s;
						break;

					case 80 : 
						int LA12_248 = input.LA(1);
						 
						int index12_248 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_248);
						if ( s>=0 ) return s;
						break;

					case 81 : 
						int LA12_249 = input.LA(1);
						 
						int index12_249 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_249);
						if ( s>=0 ) return s;
						break;

					case 82 : 
						int LA12_250 = input.LA(1);
						 
						int index12_250 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_250);
						if ( s>=0 ) return s;
						break;

					case 83 : 
						int LA12_251 = input.LA(1);
						 
						int index12_251 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_251);
						if ( s>=0 ) return s;
						break;

					case 84 : 
						int LA12_253 = input.LA(1);
						 
						int index12_253 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_253);
						if ( s>=0 ) return s;
						break;

					case 85 : 
						int LA12_254 = input.LA(1);
						 
						int index12_254 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_254);
						if ( s>=0 ) return s;
						break;

					case 86 : 
						int LA12_255 = input.LA(1);
						 
						int index12_255 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_255);
						if ( s>=0 ) return s;
						break;

					case 87 : 
						int LA12_256 = input.LA(1);
						 
						int index12_256 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_256);
						if ( s>=0 ) return s;
						break;

					case 88 : 
						int LA12_257 = input.LA(1);
						 
						int index12_257 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_257);
						if ( s>=0 ) return s;
						break;

					case 89 : 
						int LA12_259 = input.LA(1);
						 
						int index12_259 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_259);
						if ( s>=0 ) return s;
						break;

					case 90 : 
						int LA12_260 = input.LA(1);
						 
						int index12_260 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_260);
						if ( s>=0 ) return s;
						break;

					case 91 : 
						int LA12_261 = input.LA(1);
						 
						int index12_261 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_261);
						if ( s>=0 ) return s;
						break;

					case 92 : 
						int LA12_262 = input.LA(1);
						 
						int index12_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_262);
						if ( s>=0 ) return s;
						break;

					case 93 : 
						int LA12_263 = input.LA(1);
						 
						int index12_263 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_263);
						if ( s>=0 ) return s;
						break;

					case 94 : 
						int LA12_265 = input.LA(1);
						 
						int index12_265 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_265);
						if ( s>=0 ) return s;
						break;

					case 95 : 
						int LA12_266 = input.LA(1);
						 
						int index12_266 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_266);
						if ( s>=0 ) return s;
						break;

					case 96 : 
						int LA12_267 = input.LA(1);
						 
						int index12_267 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_267);
						if ( s>=0 ) return s;
						break;

					case 97 : 
						int LA12_268 = input.LA(1);
						 
						int index12_268 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_268);
						if ( s>=0 ) return s;
						break;

					case 98 : 
						int LA12_269 = input.LA(1);
						 
						int index12_269 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_269);
						if ( s>=0 ) return s;
						break;

					case 99 : 
						int LA12_270 = input.LA(1);
						 
						int index12_270 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_270);
						if ( s>=0 ) return s;
						break;

					case 100 : 
						int LA12_271 = input.LA(1);
						 
						int index12_271 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_271);
						if ( s>=0 ) return s;
						break;

					case 101 : 
						int LA12_272 = input.LA(1);
						 
						int index12_272 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_272);
						if ( s>=0 ) return s;
						break;

					case 102 : 
						int LA12_273 = input.LA(1);
						 
						int index12_273 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_273);
						if ( s>=0 ) return s;
						break;

					case 103 : 
						int LA12_275 = input.LA(1);
						 
						int index12_275 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_275);
						if ( s>=0 ) return s;
						break;

					case 104 : 
						int LA12_276 = input.LA(1);
						 
						int index12_276 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_276);
						if ( s>=0 ) return s;
						break;

					case 105 : 
						int LA12_277 = input.LA(1);
						 
						int index12_277 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_277);
						if ( s>=0 ) return s;
						break;

					case 106 : 
						int LA12_278 = input.LA(1);
						 
						int index12_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_278);
						if ( s>=0 ) return s;
						break;

					case 107 : 
						int LA12_279 = input.LA(1);
						 
						int index12_279 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_279);
						if ( s>=0 ) return s;
						break;

					case 108 : 
						int LA12_281 = input.LA(1);
						 
						int index12_281 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_281);
						if ( s>=0 ) return s;
						break;

					case 109 : 
						int LA12_282 = input.LA(1);
						 
						int index12_282 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_282);
						if ( s>=0 ) return s;
						break;

					case 110 : 
						int LA12_283 = input.LA(1);
						 
						int index12_283 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_283);
						if ( s>=0 ) return s;
						break;

					case 111 : 
						int LA12_284 = input.LA(1);
						 
						int index12_284 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_284);
						if ( s>=0 ) return s;
						break;

					case 112 : 
						int LA12_285 = input.LA(1);
						 
						int index12_285 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_285);
						if ( s>=0 ) return s;
						break;

					case 113 : 
						int LA12_287 = input.LA(1);
						 
						int index12_287 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_287);
						if ( s>=0 ) return s;
						break;

					case 114 : 
						int LA12_288 = input.LA(1);
						 
						int index12_288 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_288);
						if ( s>=0 ) return s;
						break;

					case 115 : 
						int LA12_289 = input.LA(1);
						 
						int index12_289 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_289);
						if ( s>=0 ) return s;
						break;

					case 116 : 
						int LA12_290 = input.LA(1);
						 
						int index12_290 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_290);
						if ( s>=0 ) return s;
						break;

					case 117 : 
						int LA12_291 = input.LA(1);
						 
						int index12_291 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_291);
						if ( s>=0 ) return s;
						break;

					case 118 : 
						int LA12_292 = input.LA(1);
						 
						int index12_292 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_292);
						if ( s>=0 ) return s;
						break;

					case 119 : 
						int LA12_293 = input.LA(1);
						 
						int index12_293 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_293);
						if ( s>=0 ) return s;
						break;

					case 120 : 
						int LA12_294 = input.LA(1);
						 
						int index12_294 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_294);
						if ( s>=0 ) return s;
						break;

					case 121 : 
						int LA12_295 = input.LA(1);
						 
						int index12_295 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_295);
						if ( s>=0 ) return s;
						break;

					case 122 : 
						int LA12_297 = input.LA(1);
						 
						int index12_297 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_297);
						if ( s>=0 ) return s;
						break;

					case 123 : 
						int LA12_298 = input.LA(1);
						 
						int index12_298 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_298);
						if ( s>=0 ) return s;
						break;

					case 124 : 
						int LA12_299 = input.LA(1);
						 
						int index12_299 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_299);
						if ( s>=0 ) return s;
						break;

					case 125 : 
						int LA12_300 = input.LA(1);
						 
						int index12_300 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_300);
						if ( s>=0 ) return s;
						break;

					case 126 : 
						int LA12_301 = input.LA(1);
						 
						int index12_301 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_301);
						if ( s>=0 ) return s;
						break;

					case 127 : 
						int LA12_303 = input.LA(1);
						 
						int index12_303 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_303);
						if ( s>=0 ) return s;
						break;

					case 128 : 
						int LA12_304 = input.LA(1);
						 
						int index12_304 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_304);
						if ( s>=0 ) return s;
						break;

					case 129 : 
						int LA12_305 = input.LA(1);
						 
						int index12_305 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_305);
						if ( s>=0 ) return s;
						break;

					case 130 : 
						int LA12_306 = input.LA(1);
						 
						int index12_306 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_306);
						if ( s>=0 ) return s;
						break;

					case 131 : 
						int LA12_307 = input.LA(1);
						 
						int index12_307 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_307);
						if ( s>=0 ) return s;
						break;

					case 132 : 
						int LA12_309 = input.LA(1);
						 
						int index12_309 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_309);
						if ( s>=0 ) return s;
						break;

					case 133 : 
						int LA12_310 = input.LA(1);
						 
						int index12_310 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_310);
						if ( s>=0 ) return s;
						break;

					case 134 : 
						int LA12_311 = input.LA(1);
						 
						int index12_311 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_311);
						if ( s>=0 ) return s;
						break;

					case 135 : 
						int LA12_312 = input.LA(1);
						 
						int index12_312 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_312);
						if ( s>=0 ) return s;
						break;

					case 136 : 
						int LA12_313 = input.LA(1);
						 
						int index12_313 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_313);
						if ( s>=0 ) return s;
						break;

					case 137 : 
						int LA12_314 = input.LA(1);
						 
						int index12_314 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_314);
						if ( s>=0 ) return s;
						break;

					case 138 : 
						int LA12_315 = input.LA(1);
						 
						int index12_315 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_315);
						if ( s>=0 ) return s;
						break;

					case 139 : 
						int LA12_316 = input.LA(1);
						 
						int index12_316 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_316);
						if ( s>=0 ) return s;
						break;

					case 140 : 
						int LA12_317 = input.LA(1);
						 
						int index12_317 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_317);
						if ( s>=0 ) return s;
						break;

					case 141 : 
						int LA12_319 = input.LA(1);
						 
						int index12_319 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_319);
						if ( s>=0 ) return s;
						break;

					case 142 : 
						int LA12_320 = input.LA(1);
						 
						int index12_320 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_320);
						if ( s>=0 ) return s;
						break;

					case 143 : 
						int LA12_321 = input.LA(1);
						 
						int index12_321 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_321);
						if ( s>=0 ) return s;
						break;

					case 144 : 
						int LA12_322 = input.LA(1);
						 
						int index12_322 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_322);
						if ( s>=0 ) return s;
						break;

					case 145 : 
						int LA12_323 = input.LA(1);
						 
						int index12_323 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_323);
						if ( s>=0 ) return s;
						break;

					case 146 : 
						int LA12_325 = input.LA(1);
						 
						int index12_325 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_325);
						if ( s>=0 ) return s;
						break;

					case 147 : 
						int LA12_326 = input.LA(1);
						 
						int index12_326 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_326);
						if ( s>=0 ) return s;
						break;

					case 148 : 
						int LA12_327 = input.LA(1);
						 
						int index12_327 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_327);
						if ( s>=0 ) return s;
						break;

					case 149 : 
						int LA12_328 = input.LA(1);
						 
						int index12_328 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_328);
						if ( s>=0 ) return s;
						break;

					case 150 : 
						int LA12_329 = input.LA(1);
						 
						int index12_329 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_329);
						if ( s>=0 ) return s;
						break;

					case 151 : 
						int LA12_331 = input.LA(1);
						 
						int index12_331 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_331);
						if ( s>=0 ) return s;
						break;

					case 152 : 
						int LA12_332 = input.LA(1);
						 
						int index12_332 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_332);
						if ( s>=0 ) return s;
						break;

					case 153 : 
						int LA12_333 = input.LA(1);
						 
						int index12_333 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_333);
						if ( s>=0 ) return s;
						break;

					case 154 : 
						int LA12_334 = input.LA(1);
						 
						int index12_334 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_334);
						if ( s>=0 ) return s;
						break;

					case 155 : 
						int LA12_335 = input.LA(1);
						 
						int index12_335 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_335);
						if ( s>=0 ) return s;
						break;

					case 156 : 
						int LA12_336 = input.LA(1);
						 
						int index12_336 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_336);
						if ( s>=0 ) return s;
						break;

					case 157 : 
						int LA12_337 = input.LA(1);
						 
						int index12_337 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_337);
						if ( s>=0 ) return s;
						break;

					case 158 : 
						int LA12_338 = input.LA(1);
						 
						int index12_338 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_338);
						if ( s>=0 ) return s;
						break;

					case 159 : 
						int LA12_339 = input.LA(1);
						 
						int index12_339 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_339);
						if ( s>=0 ) return s;
						break;

					case 160 : 
						int LA12_341 = input.LA(1);
						 
						int index12_341 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_341);
						if ( s>=0 ) return s;
						break;

					case 161 : 
						int LA12_342 = input.LA(1);
						 
						int index12_342 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_342);
						if ( s>=0 ) return s;
						break;

					case 162 : 
						int LA12_343 = input.LA(1);
						 
						int index12_343 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_343);
						if ( s>=0 ) return s;
						break;

					case 163 : 
						int LA12_344 = input.LA(1);
						 
						int index12_344 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_344);
						if ( s>=0 ) return s;
						break;

					case 164 : 
						int LA12_345 = input.LA(1);
						 
						int index12_345 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_345);
						if ( s>=0 ) return s;
						break;

					case 165 : 
						int LA12_347 = input.LA(1);
						 
						int index12_347 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_347);
						if ( s>=0 ) return s;
						break;

					case 166 : 
						int LA12_348 = input.LA(1);
						 
						int index12_348 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_348);
						if ( s>=0 ) return s;
						break;

					case 167 : 
						int LA12_349 = input.LA(1);
						 
						int index12_349 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_349);
						if ( s>=0 ) return s;
						break;

					case 168 : 
						int LA12_350 = input.LA(1);
						 
						int index12_350 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_350);
						if ( s>=0 ) return s;
						break;

					case 169 : 
						int LA12_351 = input.LA(1);
						 
						int index12_351 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_351);
						if ( s>=0 ) return s;
						break;

					case 170 : 
						int LA12_353 = input.LA(1);
						 
						int index12_353 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_353);
						if ( s>=0 ) return s;
						break;

					case 171 : 
						int LA12_354 = input.LA(1);
						 
						int index12_354 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_354);
						if ( s>=0 ) return s;
						break;

					case 172 : 
						int LA12_355 = input.LA(1);
						 
						int index12_355 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_355);
						if ( s>=0 ) return s;
						break;

					case 173 : 
						int LA12_356 = input.LA(1);
						 
						int index12_356 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_356);
						if ( s>=0 ) return s;
						break;

					case 174 : 
						int LA12_357 = input.LA(1);
						 
						int index12_357 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_357);
						if ( s>=0 ) return s;
						break;

					case 175 : 
						int LA12_358 = input.LA(1);
						 
						int index12_358 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_358);
						if ( s>=0 ) return s;
						break;

					case 176 : 
						int LA12_359 = input.LA(1);
						 
						int index12_359 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_359);
						if ( s>=0 ) return s;
						break;

					case 177 : 
						int LA12_360 = input.LA(1);
						 
						int index12_360 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_360);
						if ( s>=0 ) return s;
						break;

					case 178 : 
						int LA12_361 = input.LA(1);
						 
						int index12_361 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_361);
						if ( s>=0 ) return s;
						break;

					case 179 : 
						int LA12_363 = input.LA(1);
						 
						int index12_363 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_363);
						if ( s>=0 ) return s;
						break;

					case 180 : 
						int LA12_364 = input.LA(1);
						 
						int index12_364 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_364);
						if ( s>=0 ) return s;
						break;

					case 181 : 
						int LA12_365 = input.LA(1);
						 
						int index12_365 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_365);
						if ( s>=0 ) return s;
						break;

					case 182 : 
						int LA12_366 = input.LA(1);
						 
						int index12_366 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_366);
						if ( s>=0 ) return s;
						break;

					case 183 : 
						int LA12_367 = input.LA(1);
						 
						int index12_367 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_367);
						if ( s>=0 ) return s;
						break;

					case 184 : 
						int LA12_369 = input.LA(1);
						 
						int index12_369 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_369);
						if ( s>=0 ) return s;
						break;

					case 185 : 
						int LA12_370 = input.LA(1);
						 
						int index12_370 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_370);
						if ( s>=0 ) return s;
						break;

					case 186 : 
						int LA12_371 = input.LA(1);
						 
						int index12_371 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_371);
						if ( s>=0 ) return s;
						break;

					case 187 : 
						int LA12_372 = input.LA(1);
						 
						int index12_372 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_372);
						if ( s>=0 ) return s;
						break;

					case 188 : 
						int LA12_373 = input.LA(1);
						 
						int index12_373 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_373);
						if ( s>=0 ) return s;
						break;

					case 189 : 
						int LA12_375 = input.LA(1);
						 
						int index12_375 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_375);
						if ( s>=0 ) return s;
						break;

					case 190 : 
						int LA12_376 = input.LA(1);
						 
						int index12_376 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_376);
						if ( s>=0 ) return s;
						break;

					case 191 : 
						int LA12_377 = input.LA(1);
						 
						int index12_377 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_377);
						if ( s>=0 ) return s;
						break;

					case 192 : 
						int LA12_378 = input.LA(1);
						 
						int index12_378 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_378);
						if ( s>=0 ) return s;
						break;

					case 193 : 
						int LA12_379 = input.LA(1);
						 
						int index12_379 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_379);
						if ( s>=0 ) return s;
						break;

					case 194 : 
						int LA12_380 = input.LA(1);
						 
						int index12_380 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_380);
						if ( s>=0 ) return s;
						break;

					case 195 : 
						int LA12_381 = input.LA(1);
						 
						int index12_381 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_381);
						if ( s>=0 ) return s;
						break;

					case 196 : 
						int LA12_382 = input.LA(1);
						 
						int index12_382 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_382);
						if ( s>=0 ) return s;
						break;

					case 197 : 
						int LA12_383 = input.LA(1);
						 
						int index12_383 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_383);
						if ( s>=0 ) return s;
						break;

					case 198 : 
						int LA12_385 = input.LA(1);
						 
						int index12_385 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_385);
						if ( s>=0 ) return s;
						break;

					case 199 : 
						int LA12_386 = input.LA(1);
						 
						int index12_386 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_386);
						if ( s>=0 ) return s;
						break;

					case 200 : 
						int LA12_387 = input.LA(1);
						 
						int index12_387 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_387);
						if ( s>=0 ) return s;
						break;

					case 201 : 
						int LA12_388 = input.LA(1);
						 
						int index12_388 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_388);
						if ( s>=0 ) return s;
						break;

					case 202 : 
						int LA12_389 = input.LA(1);
						 
						int index12_389 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_389);
						if ( s>=0 ) return s;
						break;

					case 203 : 
						int LA12_391 = input.LA(1);
						 
						int index12_391 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_391);
						if ( s>=0 ) return s;
						break;

					case 204 : 
						int LA12_392 = input.LA(1);
						 
						int index12_392 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_392);
						if ( s>=0 ) return s;
						break;

					case 205 : 
						int LA12_393 = input.LA(1);
						 
						int index12_393 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_393);
						if ( s>=0 ) return s;
						break;

					case 206 : 
						int LA12_394 = input.LA(1);
						 
						int index12_394 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_394);
						if ( s>=0 ) return s;
						break;

					case 207 : 
						int LA12_395 = input.LA(1);
						 
						int index12_395 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_395);
						if ( s>=0 ) return s;
						break;

					case 208 : 
						int LA12_397 = input.LA(1);
						 
						int index12_397 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_397);
						if ( s>=0 ) return s;
						break;

					case 209 : 
						int LA12_398 = input.LA(1);
						 
						int index12_398 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_398);
						if ( s>=0 ) return s;
						break;

					case 210 : 
						int LA12_399 = input.LA(1);
						 
						int index12_399 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_399);
						if ( s>=0 ) return s;
						break;

					case 211 : 
						int LA12_400 = input.LA(1);
						 
						int index12_400 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_400);
						if ( s>=0 ) return s;
						break;

					case 212 : 
						int LA12_401 = input.LA(1);
						 
						int index12_401 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_401);
						if ( s>=0 ) return s;
						break;

					case 213 : 
						int LA12_402 = input.LA(1);
						 
						int index12_402 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_402);
						if ( s>=0 ) return s;
						break;

					case 214 : 
						int LA12_403 = input.LA(1);
						 
						int index12_403 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_403);
						if ( s>=0 ) return s;
						break;

					case 215 : 
						int LA12_404 = input.LA(1);
						 
						int index12_404 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_404);
						if ( s>=0 ) return s;
						break;

					case 216 : 
						int LA12_405 = input.LA(1);
						 
						int index12_405 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_405);
						if ( s>=0 ) return s;
						break;

					case 217 : 
						int LA12_407 = input.LA(1);
						 
						int index12_407 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_407);
						if ( s>=0 ) return s;
						break;

					case 218 : 
						int LA12_408 = input.LA(1);
						 
						int index12_408 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_408);
						if ( s>=0 ) return s;
						break;

					case 219 : 
						int LA12_409 = input.LA(1);
						 
						int index12_409 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_409);
						if ( s>=0 ) return s;
						break;

					case 220 : 
						int LA12_410 = input.LA(1);
						 
						int index12_410 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_410);
						if ( s>=0 ) return s;
						break;

					case 221 : 
						int LA12_411 = input.LA(1);
						 
						int index12_411 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_411);
						if ( s>=0 ) return s;
						break;

					case 222 : 
						int LA12_413 = input.LA(1);
						 
						int index12_413 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_413);
						if ( s>=0 ) return s;
						break;

					case 223 : 
						int LA12_414 = input.LA(1);
						 
						int index12_414 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_414);
						if ( s>=0 ) return s;
						break;

					case 224 : 
						int LA12_415 = input.LA(1);
						 
						int index12_415 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_415);
						if ( s>=0 ) return s;
						break;

					case 225 : 
						int LA12_416 = input.LA(1);
						 
						int index12_416 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_416);
						if ( s>=0 ) return s;
						break;

					case 226 : 
						int LA12_417 = input.LA(1);
						 
						int index12_417 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_417);
						if ( s>=0 ) return s;
						break;

					case 227 : 
						int LA12_419 = input.LA(1);
						 
						int index12_419 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_419);
						if ( s>=0 ) return s;
						break;

					case 228 : 
						int LA12_420 = input.LA(1);
						 
						int index12_420 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_420);
						if ( s>=0 ) return s;
						break;

					case 229 : 
						int LA12_421 = input.LA(1);
						 
						int index12_421 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_421);
						if ( s>=0 ) return s;
						break;

					case 230 : 
						int LA12_422 = input.LA(1);
						 
						int index12_422 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_422);
						if ( s>=0 ) return s;
						break;

					case 231 : 
						int LA12_423 = input.LA(1);
						 
						int index12_423 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_423);
						if ( s>=0 ) return s;
						break;

					case 232 : 
						int LA12_424 = input.LA(1);
						 
						int index12_424 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_424);
						if ( s>=0 ) return s;
						break;

					case 233 : 
						int LA12_425 = input.LA(1);
						 
						int index12_425 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_425);
						if ( s>=0 ) return s;
						break;

					case 234 : 
						int LA12_426 = input.LA(1);
						 
						int index12_426 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_426);
						if ( s>=0 ) return s;
						break;

					case 235 : 
						int LA12_427 = input.LA(1);
						 
						int index12_427 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_427);
						if ( s>=0 ) return s;
						break;

					case 236 : 
						int LA12_428 = input.LA(1);
						 
						int index12_428 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_428);
						if ( s>=0 ) return s;
						break;

					case 237 : 
						int LA12_429 = input.LA(1);
						 
						int index12_429 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_429);
						if ( s>=0 ) return s;
						break;

					case 238 : 
						int LA12_430 = input.LA(1);
						 
						int index12_430 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_430);
						if ( s>=0 ) return s;
						break;

					case 239 : 
						int LA12_431 = input.LA(1);
						 
						int index12_431 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_431);
						if ( s>=0 ) return s;
						break;

					case 240 : 
						int LA12_432 = input.LA(1);
						 
						int index12_432 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_432);
						if ( s>=0 ) return s;
						break;

					case 241 : 
						int LA12_433 = input.LA(1);
						 
						int index12_433 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_433);
						if ( s>=0 ) return s;
						break;

					case 242 : 
						int LA12_434 = input.LA(1);
						 
						int index12_434 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_434);
						if ( s>=0 ) return s;
						break;

					case 243 : 
						int LA12_435 = input.LA(1);
						 
						int index12_435 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_435);
						if ( s>=0 ) return s;
						break;

					case 244 : 
						int LA12_436 = input.LA(1);
						 
						int index12_436 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_436);
						if ( s>=0 ) return s;
						break;

					case 245 : 
						int LA12_437 = input.LA(1);
						 
						int index12_437 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_437);
						if ( s>=0 ) return s;
						break;

					case 246 : 
						int LA12_438 = input.LA(1);
						 
						int index12_438 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_438);
						if ( s>=0 ) return s;
						break;

					case 247 : 
						int LA12_439 = input.LA(1);
						 
						int index12_439 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_439);
						if ( s>=0 ) return s;
						break;

					case 248 : 
						int LA12_440 = input.LA(1);
						 
						int index12_440 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_440);
						if ( s>=0 ) return s;
						break;

					case 249 : 
						int LA12_441 = input.LA(1);
						 
						int index12_441 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_441);
						if ( s>=0 ) return s;
						break;

					case 250 : 
						int LA12_442 = input.LA(1);
						 
						int index12_442 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_442);
						if ( s>=0 ) return s;
						break;

					case 251 : 
						int LA12_443 = input.LA(1);
						 
						int index12_443 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_443);
						if ( s>=0 ) return s;
						break;

					case 252 : 
						int LA12_445 = input.LA(1);
						 
						int index12_445 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_445);
						if ( s>=0 ) return s;
						break;

					case 253 : 
						int LA12_446 = input.LA(1);
						 
						int index12_446 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_446);
						if ( s>=0 ) return s;
						break;

					case 254 : 
						int LA12_447 = input.LA(1);
						 
						int index12_447 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_447);
						if ( s>=0 ) return s;
						break;

					case 255 : 
						int LA12_448 = input.LA(1);
						 
						int index12_448 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_448);
						if ( s>=0 ) return s;
						break;

					case 256 : 
						int LA12_449 = input.LA(1);
						 
						int index12_449 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_449);
						if ( s>=0 ) return s;
						break;

					case 257 : 
						int LA12_450 = input.LA(1);
						 
						int index12_450 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_450);
						if ( s>=0 ) return s;
						break;

					case 258 : 
						int LA12_451 = input.LA(1);
						 
						int index12_451 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_451);
						if ( s>=0 ) return s;
						break;

					case 259 : 
						int LA12_452 = input.LA(1);
						 
						int index12_452 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_452);
						if ( s>=0 ) return s;
						break;

					case 260 : 
						int LA12_453 = input.LA(1);
						 
						int index12_453 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_453);
						if ( s>=0 ) return s;
						break;

					case 261 : 
						int LA12_454 = input.LA(1);
						 
						int index12_454 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_454);
						if ( s>=0 ) return s;
						break;

					case 262 : 
						int LA12_455 = input.LA(1);
						 
						int index12_455 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_455);
						if ( s>=0 ) return s;
						break;

					case 263 : 
						int LA12_456 = input.LA(1);
						 
						int index12_456 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_456);
						if ( s>=0 ) return s;
						break;

					case 264 : 
						int LA12_457 = input.LA(1);
						 
						int index12_457 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_457);
						if ( s>=0 ) return s;
						break;

					case 265 : 
						int LA12_458 = input.LA(1);
						 
						int index12_458 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_458);
						if ( s>=0 ) return s;
						break;

					case 266 : 
						int LA12_459 = input.LA(1);
						 
						int index12_459 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_459);
						if ( s>=0 ) return s;
						break;

					case 267 : 
						int LA12_460 = input.LA(1);
						 
						int index12_460 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_460);
						if ( s>=0 ) return s;
						break;

					case 268 : 
						int LA12_461 = input.LA(1);
						 
						int index12_461 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_461);
						if ( s>=0 ) return s;
						break;

					case 269 : 
						int LA12_462 = input.LA(1);
						 
						int index12_462 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_462);
						if ( s>=0 ) return s;
						break;

					case 270 : 
						int LA12_463 = input.LA(1);
						 
						int index12_463 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_463);
						if ( s>=0 ) return s;
						break;

					case 271 : 
						int LA12_464 = input.LA(1);
						 
						int index12_464 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_464);
						if ( s>=0 ) return s;
						break;

					case 272 : 
						int LA12_465 = input.LA(1);
						 
						int index12_465 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_465);
						if ( s>=0 ) return s;
						break;

					case 273 : 
						int LA12_467 = input.LA(1);
						 
						int index12_467 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_467);
						if ( s>=0 ) return s;
						break;

					case 274 : 
						int LA12_468 = input.LA(1);
						 
						int index12_468 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_468);
						if ( s>=0 ) return s;
						break;

					case 275 : 
						int LA12_469 = input.LA(1);
						 
						int index12_469 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_469);
						if ( s>=0 ) return s;
						break;

					case 276 : 
						int LA12_470 = input.LA(1);
						 
						int index12_470 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_470);
						if ( s>=0 ) return s;
						break;

					case 277 : 
						int LA12_471 = input.LA(1);
						 
						int index12_471 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_471);
						if ( s>=0 ) return s;
						break;

					case 278 : 
						int LA12_472 = input.LA(1);
						 
						int index12_472 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_472);
						if ( s>=0 ) return s;
						break;

					case 279 : 
						int LA12_473 = input.LA(1);
						 
						int index12_473 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_473);
						if ( s>=0 ) return s;
						break;

					case 280 : 
						int LA12_474 = input.LA(1);
						 
						int index12_474 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_474);
						if ( s>=0 ) return s;
						break;

					case 281 : 
						int LA12_475 = input.LA(1);
						 
						int index12_475 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_475);
						if ( s>=0 ) return s;
						break;

					case 282 : 
						int LA12_476 = input.LA(1);
						 
						int index12_476 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_476);
						if ( s>=0 ) return s;
						break;

					case 283 : 
						int LA12_477 = input.LA(1);
						 
						int index12_477 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_477);
						if ( s>=0 ) return s;
						break;

					case 284 : 
						int LA12_478 = input.LA(1);
						 
						int index12_478 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_478);
						if ( s>=0 ) return s;
						break;

					case 285 : 
						int LA12_479 = input.LA(1);
						 
						int index12_479 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_479);
						if ( s>=0 ) return s;
						break;

					case 286 : 
						int LA12_480 = input.LA(1);
						 
						int index12_480 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_480);
						if ( s>=0 ) return s;
						break;

					case 287 : 
						int LA12_481 = input.LA(1);
						 
						int index12_481 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_481);
						if ( s>=0 ) return s;
						break;

					case 288 : 
						int LA12_482 = input.LA(1);
						 
						int index12_482 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_482);
						if ( s>=0 ) return s;
						break;

					case 289 : 
						int LA12_483 = input.LA(1);
						 
						int index12_483 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_483);
						if ( s>=0 ) return s;
						break;

					case 290 : 
						int LA12_484 = input.LA(1);
						 
						int index12_484 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_484);
						if ( s>=0 ) return s;
						break;

					case 291 : 
						int LA12_485 = input.LA(1);
						 
						int index12_485 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_485);
						if ( s>=0 ) return s;
						break;

					case 292 : 
						int LA12_486 = input.LA(1);
						 
						int index12_486 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_486);
						if ( s>=0 ) return s;
						break;

					case 293 : 
						int LA12_487 = input.LA(1);
						 
						int index12_487 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_487);
						if ( s>=0 ) return s;
						break;

					case 294 : 
						int LA12_489 = input.LA(1);
						 
						int index12_489 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_489);
						if ( s>=0 ) return s;
						break;

					case 295 : 
						int LA12_490 = input.LA(1);
						 
						int index12_490 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_490);
						if ( s>=0 ) return s;
						break;

					case 296 : 
						int LA12_491 = input.LA(1);
						 
						int index12_491 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_491);
						if ( s>=0 ) return s;
						break;

					case 297 : 
						int LA12_492 = input.LA(1);
						 
						int index12_492 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_492);
						if ( s>=0 ) return s;
						break;

					case 298 : 
						int LA12_493 = input.LA(1);
						 
						int index12_493 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_493);
						if ( s>=0 ) return s;
						break;

					case 299 : 
						int LA12_494 = input.LA(1);
						 
						int index12_494 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_494);
						if ( s>=0 ) return s;
						break;

					case 300 : 
						int LA12_495 = input.LA(1);
						 
						int index12_495 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_495);
						if ( s>=0 ) return s;
						break;

					case 301 : 
						int LA12_496 = input.LA(1);
						 
						int index12_496 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_496);
						if ( s>=0 ) return s;
						break;

					case 302 : 
						int LA12_497 = input.LA(1);
						 
						int index12_497 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_497);
						if ( s>=0 ) return s;
						break;

					case 303 : 
						int LA12_498 = input.LA(1);
						 
						int index12_498 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_498);
						if ( s>=0 ) return s;
						break;

					case 304 : 
						int LA12_499 = input.LA(1);
						 
						int index12_499 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_499);
						if ( s>=0 ) return s;
						break;

					case 305 : 
						int LA12_500 = input.LA(1);
						 
						int index12_500 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_500);
						if ( s>=0 ) return s;
						break;

					case 306 : 
						int LA12_501 = input.LA(1);
						 
						int index12_501 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_501);
						if ( s>=0 ) return s;
						break;

					case 307 : 
						int LA12_502 = input.LA(1);
						 
						int index12_502 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_502);
						if ( s>=0 ) return s;
						break;

					case 308 : 
						int LA12_503 = input.LA(1);
						 
						int index12_503 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_503);
						if ( s>=0 ) return s;
						break;

					case 309 : 
						int LA12_504 = input.LA(1);
						 
						int index12_504 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_504);
						if ( s>=0 ) return s;
						break;

					case 310 : 
						int LA12_505 = input.LA(1);
						 
						int index12_505 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_505);
						if ( s>=0 ) return s;
						break;

					case 311 : 
						int LA12_506 = input.LA(1);
						 
						int index12_506 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_506);
						if ( s>=0 ) return s;
						break;

					case 312 : 
						int LA12_507 = input.LA(1);
						 
						int index12_507 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred20_myParser()) ) {s = 12;}
						else if ( (synpred26_myParser()) ) {s = 7;}
						 
						input.seek(index12_507);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 12, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA17_eotS =
		"\u00d5\uffff";
	static final String DFA17_eofS =
		"\u00d5\uffff";
	static final String DFA17_minS =
		"\1\31\2\47\2\15\1\47\1\15\2\43\2\uffff\1\15\2\43\2\uffff\1\15\1\47\2\43"+
		"\2\uffff\1\15\1\0\4\uffff\1\0\4\uffff\2\43\2\uffff\1\15\1\0\4\uffff\1"+
		"\0\4\uffff\1\15\2\43\2\uffff\1\15\1\47\1\0\4\uffff\1\0\4\uffff\2\43\2"+
		"\uffff\1\15\37\uffff\1\0\4\uffff\1\0\4\uffff\2\0\2\uffff\1\0\36\uffff"+
		"\2\0\2\uffff\2\0\4\uffff\1\0\4\uffff\3\0\2\uffff\2\0\36\uffff\1\0\4\uffff"+
		"\1\0\4\uffff\2\0\2\uffff\1\0";
	static final String DFA17_maxS =
		"\1\31\6\112\2\105\2\uffff\1\112\2\105\2\uffff\2\112\2\105\2\uffff\1\112"+
		"\1\0\4\uffff\1\0\4\uffff\2\105\2\uffff\1\112\1\0\4\uffff\1\0\4\uffff\1"+
		"\112\2\105\2\uffff\2\112\1\0\4\uffff\1\0\4\uffff\2\105\2\uffff\1\112\37"+
		"\uffff\1\0\4\uffff\1\0\4\uffff\2\0\2\uffff\1\0\36\uffff\2\0\2\uffff\2"+
		"\0\4\uffff\1\0\4\uffff\3\0\2\uffff\2\0\36\uffff\1\0\4\uffff\1\0\4\uffff"+
		"\2\0\2\uffff\1\0";
	static final String DFA17_acceptS =
		"\11\uffff\1\1\113\uffff\1\2\177\uffff";
	static final String DFA17_specialS =
		"\27\uffff\1\0\4\uffff\1\1\11\uffff\1\2\4\uffff\1\3\13\uffff\1\4\4\uffff"+
		"\1\5\50\uffff\1\6\4\uffff\1\7\4\uffff\1\10\1\11\2\uffff\1\12\36\uffff"+
		"\1\13\1\14\2\uffff\1\15\1\16\4\uffff\1\17\4\uffff\1\20\1\21\1\22\2\uffff"+
		"\1\23\1\24\36\uffff\1\25\4\uffff\1\26\4\uffff\1\27\1\30\2\uffff\1\31}>";
	static final String[] DFA17_transitionS = {
			"\1\1",
			"\1\3\42\uffff\1\2",
			"\1\4\42\uffff\1\5",
			"\1\7\4\uffff\1\10\6\uffff\1\11\10\uffff\1\11\47\uffff\1\6",
			"\1\14\4\uffff\1\15\6\uffff\1\11\10\uffff\1\11\47\uffff\1\13",
			"\1\20\42\uffff\1\21",
			"\1\22\4\uffff\1\23\6\uffff\1\11\10\uffff\1\11\47\uffff\1\26",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\27",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\34",
			"",
			"",
			"\1\41\4\uffff\1\42\6\uffff\1\11\10\uffff\1\11\47\uffff\1\45",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\46",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\53",
			"",
			"",
			"\1\61\4\uffff\1\62\6\uffff\1\11\10\uffff\1\11\47\uffff\1\60",
			"\1\65\42\uffff\1\66",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\67",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\74",
			"",
			"",
			"\1\101\4\uffff\1\102\6\uffff\1\11\10\uffff\1\11\47\uffff\1\105",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\145",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\152",
			"",
			"",
			"\1\157\4\uffff\1\160\6\uffff\1\11\10\uffff\1\11\47\uffff\1\163",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\u0092\4\uffff\1\u0093\6\uffff\1\11\10\uffff\1\11\47\uffff\1\u0096",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\u0097",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\u009c",
			"",
			"",
			"\1\u00a2\4\uffff\1\u00a3\6\uffff\1\11\10\uffff\1\11\47\uffff\1\u00a1",
			"\1\u00a6\42\uffff\1\u00a7",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\u00c6",
			"\1\11\1\uffff\1\11\1\uffff\11\11\1\uffff\6\11\3\uffff\3\11\2\uffff\1"+
			"\11\5\uffff\1\u00cb",
			"",
			"",
			"\1\u00d0\4\uffff\1\u00d1\6\uffff\1\11\10\uffff\1\11\47\uffff\1\u00d4",
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
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
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
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
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
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"\1\uffff"
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "49:1: assignmentStat : ( ID ( WS )* OP_ASS ( WS )* expr SEMICOL | ID ( WS )* OP_ASS ( WS )* ( DEC_NUM | FLOAT_NUM ) SEMICOL );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_23 = input.LA(1);
						 
						int index17_23 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_23);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA17_28 = input.LA(1);
						 
						int index17_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_28);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA17_38 = input.LA(1);
						 
						int index17_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_38);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA17_43 = input.LA(1);
						 
						int index17_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_43);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA17_55 = input.LA(1);
						 
						int index17_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_55);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA17_60 = input.LA(1);
						 
						int index17_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_60);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA17_101 = input.LA(1);
						 
						int index17_101 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_101);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA17_106 = input.LA(1);
						 
						int index17_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_106);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA17_111 = input.LA(1);
						 
						int index17_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_111);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA17_112 = input.LA(1);
						 
						int index17_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_112);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA17_115 = input.LA(1);
						 
						int index17_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_115);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA17_146 = input.LA(1);
						 
						int index17_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_146);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA17_147 = input.LA(1);
						 
						int index17_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_147);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA17_150 = input.LA(1);
						 
						int index17_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_150);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA17_151 = input.LA(1);
						 
						int index17_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_151);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA17_156 = input.LA(1);
						 
						int index17_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_156);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA17_161 = input.LA(1);
						 
						int index17_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_161);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA17_162 = input.LA(1);
						 
						int index17_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_162);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA17_163 = input.LA(1);
						 
						int index17_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_163);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA17_166 = input.LA(1);
						 
						int index17_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_166);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA17_167 = input.LA(1);
						 
						int index17_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_167);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA17_198 = input.LA(1);
						 
						int index17_198 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_198);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA17_203 = input.LA(1);
						 
						int index17_203 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_203);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA17_208 = input.LA(1);
						 
						int index17_208 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_208);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA17_209 = input.LA(1);
						 
						int index17_209 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_209);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA17_212 = input.LA(1);
						 
						int index17_212 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred30_myParser()) ) {s = 9;}
						else if ( (true) ) {s = 85;}
						 
						input.seek(index17_212);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA50_eotS =
		"\u00a9\uffff";
	static final String DFA50_eofS =
		"\u00a9\uffff";
	static final String DFA50_minS =
		"\1\7\1\15\1\11\3\uffff\1\0\2\uffff\1\15\24\uffff\3\11\1\15\1\uffff\1\0"+
		"\3\15\1\uffff\1\15\1\0\3\15\1\uffff\4\15\1\uffff\1\0\1\15\3\43\1\15\17"+
		"\uffff\20\0\17\uffff\34\0\17\uffff\27\0";
	static final String DFA50_maxS =
		"\1\110\1\42\1\112\3\uffff\1\0\2\uffff\1\112\24\uffff\3\105\1\42\1\uffff"+
		"\1\0\3\42\1\uffff\1\42\1\0\3\42\1\uffff\4\42\1\uffff\1\0\1\42\3\104\1"+
		"\42\17\uffff\20\0\17\uffff\34\0\17\uffff\27\0";
	static final String DFA50_acceptS =
		"\3\uffff\1\2\10\uffff\1\3\20\uffff\1\1\u008b\uffff";
	static final String DFA50_specialS =
		"\6\uffff\1\0\34\uffff\1\1\5\uffff\1\2\11\uffff\1\3\24\uffff\1\4\1\5\1"+
		"\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\17"+
		"\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
		"\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56"+
		"\1\57\17\uffff\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72"+
		"\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106}>";
	static final String[] DFA50_transitionS = {
			"\1\1\10\uffff\1\1\5\uffff\1\1\5\uffff\1\1\3\uffff\2\1\44\uffff\1\1\1"+
			"\uffff\1\1",
			"\1\3\4\uffff\1\3\6\uffff\1\2\10\uffff\1\3",
			"\1\3\31\uffff\1\3\1\uffff\1\3\1\uffff\1\11\10\3\1\uffff\6\3\3\uffff"+
			"\3\3\2\uffff\1\3\5\uffff\1\6\4\uffff\1\14",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"\1\36\4\uffff\1\37\6\uffff\1\40\10\uffff\1\41\47\uffff\1\14",
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
			"\1\3\31\uffff\1\45\1\uffff\1\50\1\uffff\1\50\1\44\4\50\1\46\1\50\1\46"+
			"\1\uffff\3\50\1\44\2\50\3\uffff\1\50\1\45\1\50\2\uffff\1\50\5\uffff\1"+
			"\43",
			"\1\3\31\uffff\1\53\1\uffff\1\56\1\uffff\1\56\1\52\4\56\1\54\1\56\1\54"+
			"\1\uffff\3\56\1\52\2\56\3\uffff\1\56\1\53\1\56\2\uffff\1\56\5\uffff\1"+
			"\51",
			"\1\3\31\uffff\1\60\1\uffff\1\64\1\uffff\1\64\1\57\4\64\1\61\1\64\1\61"+
			"\1\uffff\3\64\1\57\2\64\3\uffff\1\64\1\60\1\64\2\uffff\1\64\5\uffff\1"+
			"\63",
			"\1\65\4\uffff\1\66\6\uffff\1\67\10\uffff\1\70",
			"",
			"\1\uffff",
			"\1\110\4\uffff\1\111\6\uffff\1\112\10\uffff\1\113",
			"\1\114\4\uffff\1\115\6\uffff\1\116\10\uffff\1\117",
			"\1\120\4\uffff\1\121\6\uffff\1\122\10\uffff\1\123",
			"",
			"\1\124\4\uffff\1\125\6\uffff\1\126\10\uffff\1\127",
			"\1\uffff",
			"\1\147\4\uffff\1\150\6\uffff\1\151\10\uffff\1\152",
			"\1\153\4\uffff\1\154\6\uffff\1\155\10\uffff\1\156",
			"\1\157\4\uffff\1\160\6\uffff\1\161\10\uffff\1\162",
			"",
			"\1\163\4\uffff\1\164\6\uffff\1\165\10\uffff\1\166",
			"\1\167\4\uffff\1\170\6\uffff\1\171\10\uffff\1\172",
			"\1\173\4\uffff\1\174\6\uffff\1\175\10\uffff\1\176",
			"\1\177\4\uffff\1\u0080\6\uffff\1\u0081\10\uffff\1\u0082",
			"",
			"\1\uffff",
			"\1\u0092\4\uffff\1\u0093\6\uffff\1\u0094\10\uffff\1\u0095",
			"\1\u0097\1\uffff\1\u0098\1\uffff\1\u0098\1\u0096\4\u0098\1\u0099\1\u0098"+
			"\1\u0099\1\uffff\3\u0098\1\u0096\2\u0098\3\uffff\1\u0098\1\u0097\1\u0098"+
			"\2\uffff\1\u0098\4\uffff\1\u009a",
			"\1\u009c\1\uffff\1\u009d\1\uffff\1\u009d\1\u009b\4\u009d\1\u009e\1\u009d"+
			"\1\u009e\1\uffff\3\u009d\1\u009b\2\u009d\3\uffff\1\u009d\1\u009c\1\u009d"+
			"\2\uffff\1\u009d\4\uffff\1\u009f",
			"\1\u00a1\1\uffff\1\u00a2\1\uffff\1\u00a2\1\u00a0\4\u00a2\1\u00a3\1\u00a2"+
			"\1\u00a3\1\uffff\3\u00a2\1\u00a0\2\u00a2\3\uffff\1\u00a2\1\u00a1\1\u00a2"+
			"\2\uffff\1\u00a2\4\uffff\1\u00a4",
			"\1\u00a5\4\uffff\1\u00a6\6\uffff\1\u00a7\10\uffff\1\u00a8",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
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
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
	static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
	static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
	static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
	static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
	static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
	static final short[][] DFA50_transition;

	static {
		int numStates = DFA50_transitionS.length;
		DFA50_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
		}
	}

	protected class DFA50 extends DFA {

		public DFA50(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 50;
			this.eot = DFA50_eot;
			this.eof = DFA50_eof;
			this.min = DFA50_min;
			this.max = DFA50_max;
			this.accept = DFA50_accept;
			this.special = DFA50_special;
			this.transition = DFA50_transition;
		}
		@Override
		public String getDescription() {
			return "97:1: declareStat : ( type ID SEMICOL | type exprList | type assignmentStat );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA50_6 = input.LA(1);
						 
						int index50_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred67_myParser()) ) {s = 29;}
						else if ( (synpred68_myParser()) ) {s = 3;}
						 
						input.seek(index50_6);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA50_35 = input.LA(1);
						 
						int index50_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_35);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA50_41 = input.LA(1);
						 
						int index50_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_41);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA50_51 = input.LA(1);
						 
						int index50_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_51);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA50_72 = input.LA(1);
						 
						int index50_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_72);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA50_73 = input.LA(1);
						 
						int index50_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_73);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA50_74 = input.LA(1);
						 
						int index50_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_74);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA50_75 = input.LA(1);
						 
						int index50_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_75);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA50_76 = input.LA(1);
						 
						int index50_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_76);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA50_77 = input.LA(1);
						 
						int index50_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_77);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA50_78 = input.LA(1);
						 
						int index50_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_78);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA50_79 = input.LA(1);
						 
						int index50_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_79);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA50_80 = input.LA(1);
						 
						int index50_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_80);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA50_81 = input.LA(1);
						 
						int index50_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_81);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA50_82 = input.LA(1);
						 
						int index50_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_82);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA50_83 = input.LA(1);
						 
						int index50_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_83);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA50_84 = input.LA(1);
						 
						int index50_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_84);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA50_85 = input.LA(1);
						 
						int index50_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_85);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA50_86 = input.LA(1);
						 
						int index50_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_86);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA50_87 = input.LA(1);
						 
						int index50_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_87);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA50_103 = input.LA(1);
						 
						int index50_103 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_103);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA50_104 = input.LA(1);
						 
						int index50_104 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_104);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA50_105 = input.LA(1);
						 
						int index50_105 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_105);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA50_106 = input.LA(1);
						 
						int index50_106 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_106);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA50_107 = input.LA(1);
						 
						int index50_107 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_107);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA50_108 = input.LA(1);
						 
						int index50_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_108);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA50_109 = input.LA(1);
						 
						int index50_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_109);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA50_110 = input.LA(1);
						 
						int index50_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_110);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA50_111 = input.LA(1);
						 
						int index50_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_111);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA50_112 = input.LA(1);
						 
						int index50_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_112);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA50_113 = input.LA(1);
						 
						int index50_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_113);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA50_114 = input.LA(1);
						 
						int index50_114 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_114);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA50_115 = input.LA(1);
						 
						int index50_115 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_115);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA50_116 = input.LA(1);
						 
						int index50_116 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_116);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA50_117 = input.LA(1);
						 
						int index50_117 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_117);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA50_118 = input.LA(1);
						 
						int index50_118 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_118);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA50_119 = input.LA(1);
						 
						int index50_119 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_119);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA50_120 = input.LA(1);
						 
						int index50_120 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_120);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA50_121 = input.LA(1);
						 
						int index50_121 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_121);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA50_122 = input.LA(1);
						 
						int index50_122 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_122);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA50_123 = input.LA(1);
						 
						int index50_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_123);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA50_124 = input.LA(1);
						 
						int index50_124 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_124);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA50_125 = input.LA(1);
						 
						int index50_125 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_125);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA50_126 = input.LA(1);
						 
						int index50_126 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_126);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA50_127 = input.LA(1);
						 
						int index50_127 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_127);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA50_128 = input.LA(1);
						 
						int index50_128 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_128);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA50_129 = input.LA(1);
						 
						int index50_129 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_129);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA50_130 = input.LA(1);
						 
						int index50_130 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_130);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA50_146 = input.LA(1);
						 
						int index50_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_146);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA50_147 = input.LA(1);
						 
						int index50_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_147);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA50_148 = input.LA(1);
						 
						int index50_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_148);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA50_149 = input.LA(1);
						 
						int index50_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_149);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA50_150 = input.LA(1);
						 
						int index50_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_150);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA50_151 = input.LA(1);
						 
						int index50_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_151);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA50_152 = input.LA(1);
						 
						int index50_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_152);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA50_153 = input.LA(1);
						 
						int index50_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_153);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA50_154 = input.LA(1);
						 
						int index50_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_154);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA50_155 = input.LA(1);
						 
						int index50_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_155);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA50_156 = input.LA(1);
						 
						int index50_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_156);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA50_157 = input.LA(1);
						 
						int index50_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_157);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA50_158 = input.LA(1);
						 
						int index50_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_158);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA50_159 = input.LA(1);
						 
						int index50_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_159);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA50_160 = input.LA(1);
						 
						int index50_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_160);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA50_161 = input.LA(1);
						 
						int index50_161 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_161);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA50_162 = input.LA(1);
						 
						int index50_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_162);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA50_163 = input.LA(1);
						 
						int index50_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_163);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA50_164 = input.LA(1);
						 
						int index50_164 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_164);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA50_165 = input.LA(1);
						 
						int index50_165 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_165);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA50_166 = input.LA(1);
						 
						int index50_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_166);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA50_167 = input.LA(1);
						 
						int index50_167 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_167);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA50_168 = input.LA(1);
						 
						int index50_168 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_myParser()) ) {s = 3;}
						else if ( (true) ) {s = 12;}
						 
						input.seek(index50_168);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 50, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_INCLUDE_in_startStat48 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OP_LT_in_startStat51 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_startStat53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_startStat55 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_OP_GT_in_startStat57 = new BitSet(new long[]{0x0000000318410080L,0x0000000000000540L});
	public static final BitSet FOLLOW_WS_in_startStat59 = new BitSet(new long[]{0x0000000318410080L,0x0000000000000540L});
	public static final BitSet FOLLOW_function_in_startStat70 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000140L});
	public static final BitSet FOLLOW_mainfunction_in_startStat78 = new BitSet(new long[]{0x0000000310410082L,0x0000000000000140L});
	public static final BitSet FOLLOW_function_in_startStat84 = new BitSet(new long[]{0x0000000310410082L,0x0000000000000140L});
	public static final BitSet FOLLOW_type_in_mainfunction97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_mainfunction99 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_mainfunction101 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_mainfunction104 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_mainfunction106 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_mainfunction113 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_mainfunction115 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_mainfunction126 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_mainfunction130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_RETURN__in_mainfunction141 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_mainfunction152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_mainfunction159 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_mainfunction161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_assignmentStat_in_stats288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_stats297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelseStat_in_stats311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_stats324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareStat_in_stats340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedStat_in_stats352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprList_in_stats365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breakStat_in_stats380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continueStat_in_stats394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentStat410 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat412 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_OP_ASS_in_assignmentStat415 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat417 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_expr_in_assignmentStat420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_assignmentStat422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentStat451 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat453 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_OP_ASS_in_assignmentStat456 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat458 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_set_in_assignmentStat461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_assignmentStat470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE__in_whileStat486 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_whileStat488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat491 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_whileStat493 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_whileStat501 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_whileStat503 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_whileStat514 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_whileStat517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_whileStat525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_whileStat527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_IF__in_ifelseStat540 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_ifelseStat542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_ifelseStat545 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat547 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat555 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_ifelseStat557 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_ifelseStat568 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_ifelseStat571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat579 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat581 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_76_in_ifelseStat589 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_ifelseStat591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_ifelseStat594 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat596 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat607 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_ifelseStat609 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_ifelseStat624 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000342L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat636 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat638 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_ELSE__in_ifelseStat654 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat656 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat667 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000340L});
	public static final BitSet FOLLOW_stats_in_ifelseStat681 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000342L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR__in_forStat715 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_forStat717 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat721 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expr_in_forStat724 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat727 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000010L});
	public static final BitSet FOLLOW_expr_in_forStat729 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_forStat732 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_forStat734 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_forStat741 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_WS_in_forStat743 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000740L});
	public static final BitSet FOLLOW_stats_in_forStat754 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_forStat758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_forStat765 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_forStat767 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_in_function780 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_function782 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_function784 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_function787 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LBRACE_in_function794 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_function805 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_function808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_RETURN__in_function819 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_function830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_function837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function877 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_function879 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_function881 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_function884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_function887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declareStat901 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_declareStat903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_declareStat905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declareStat917 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_exprList_in_declareStat919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declareStat933 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_assignmentStat_in_declareStat935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_procedStat948 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_arguments_in_procedStat950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_procedStat952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_procedStat954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList966 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_exprList969 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_exprList971 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_exprList975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK__in_breakStat987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_breakStat989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE__in_continueStat1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_continueStat1003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arguments1015 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_arguments1018 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_arguments1020 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_param_in_params1034 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_params1037 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000140L});
	public static final BitSet FOLLOW_param_in_params1039 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_type_in_param1053 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_param1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_param1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationStat_in_expr1080 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_set_in_expr1083 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_operationStat_in_expr1091 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_add_in_operationStat1105 = new BitSet(new long[]{0x946E5EA000000002L});
	public static final BitSet FOLLOW_set_in_operationStat1108 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_add_in_operationStat1196 = new BitSet(new long[]{0x946E5EA000000002L});
	public static final BitSet FOLLOW_multiply_in_add1210 = new BitSet(new long[]{0x0800000800000002L});
	public static final BitSet FOLLOW_set_in_add1213 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_multiply_in_add1221 = new BitSet(new long[]{0x0800000800000002L});
	public static final BitSet FOLLOW_atom_in_multiply1235 = new BitSet(new long[]{0x0010010000000002L});
	public static final BitSet FOLLOW_set_in_multiply1238 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_atom_in_multiply1247 = new BitSet(new long[]{0x0010010000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_atom1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_atom1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom1324 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_atom1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_atom1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred7_myParser115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStat_in_synpred20_myParser288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprList_in_synpred26_myParser365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred30_myParser410 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_synpred30_myParser412 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_OP_ASS_in_synpred30_myParser415 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_synpred30_myParser417 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_expr_in_synpred30_myParser420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred30_myParser422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred38_myParser527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred43_myParser581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred47_myParser638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred59_myParser767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred65_myParser780 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_synpred65_myParser782 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_synpred65_myParser784 = new BitSet(new long[]{0x0000000310410080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_synpred65_myParser787 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_LBRACE_in_synpred65_myParser794 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_synpred65_myParser805 = new BitSet(new long[]{0x0000000717C530A0L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_synpred65_myParser808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000408L});
	public static final BitSet FOLLOW_RETURN__in_synpred65_myParser819 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred65_myParser830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_synpred65_myParser837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred67_myParser901 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_synpred67_myParser903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred67_myParser905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred68_myParser917 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_exprList_in_synpred68_myParser919 = new BitSet(new long[]{0x0000000000000002L});
}
