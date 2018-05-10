// $ANTLR 3.5.2 myParser.g 2018-05-11 03:59:16

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
		"COLON", "COMMA", "COMMENT1", "COMMENT2", "CONTINUE", "DEC_NUM", "DEFINE", 
		"DIGIT", "DOUBLE_TYPE", "ELSE_", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", 
		"FLOAT_NUM3", "FLOAT_TYPE", "FOR_", "FUNCTION_CALL", "ID", "IF_", "INCLUDE", 
		"INT_TYPE", "LBRACE", "LBRACK", "LETTER", "LONGLONG_TYPE", "LONG_TYPE", 
		"LPAREN", "OP_ADD", "OP_ADDADD", "OP_ADDAS", "OP_AND", "OP_ASS", "OP_DIV", 
		"OP_DIVAS", "OP_EQ", "OP_GE", "OP_GT", "OP_LAND", "OP_LE", "OP_LOR", "OP_LS", 
		"OP_LSAS", "OP_LT", "OP_MODAS", "OP_MUL", "OP_MULAS", "OP_NE", "OP_NOT", 
		"OP_OR", "OP_RS", "OP_RSAS", "OP_SUB", "OP_SUBAS", "OP_SUBSUB", "OP_XOR", 
		"OP_XORAS", "PERIOD", "RBRACE", "RBRACK", "RETURN_", "RPAREN", "SEMICOL", 
		"SHORT_TYPE", "STRING", "VOID_TYPE", "WHILE_", "WS", "'.h'", "'else if'", 
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
	public static final int CONTINUE=12;
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
		this.state.ruleMemo = new HashMap[125+1];


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
				if ( (LA3_0==CHAR_TYPE||LA3_0==FLOAT_TYPE||LA3_0==INT_TYPE||(LA3_0 >= LONGLONG_TYPE && LA3_0 <= LONG_TYPE)||LA3_0==SHORT_TYPE||LA3_0==VOID_TYPE) ) {
					int LA3_1 = input.LA(2);
					if ( (LA3_1==FUNCTION_CALL||LA3_1==WS) ) {
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
				if ( (LA4_0==CHAR_TYPE||LA4_0==FLOAT_TYPE||LA4_0==INT_TYPE||(LA4_0 >= LONGLONG_TYPE && LA4_0 <= LONG_TYPE)||LA4_0==SHORT_TYPE||LA4_0==VOID_TYPE) ) {
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
	// myParser.g:17:1: mainfunction : type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* ;
	public final void mainfunction() throws RecognitionException {
		int mainfunction_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myParser.g:17:13: ( type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* )
			// myParser.g:18:5: type 'main(' ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )*
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
				if ( (LA5_0==CHAR_TYPE||LA5_0==FLOAT_TYPE||LA5_0==INT_TYPE||(LA5_0 >= LONGLONG_TYPE && LA5_0 <= LONG_TYPE)||LA5_0==SHORT_TYPE||LA5_0==VOID_TYPE) ) {
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
					alt7=1;
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
				if ( (LA8_0==CHAR_TYPE||LA8_0==DEC_NUM||LA8_0==FLOAT_NUM||(LA8_0 >= FLOAT_TYPE && LA8_0 <= IF_)||LA8_0==INT_TYPE||(LA8_0 >= LONGLONG_TYPE && LA8_0 <= LPAREN)||LA8_0==SHORT_TYPE||(LA8_0 >= VOID_TYPE && LA8_0 <= WHILE_)) ) {
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

			match(input,RETURN_,FOLLOW_RETURN__in_mainfunction138); if (state.failed) return;
			// myParser.g:21:18: ( DEC_NUM | FLOAT_NUM )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==DEC_NUM||LA9_0==FLOAT_NUM) ) {
				alt9=1;
			}
			switch (alt9) {
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

			match(input,SEMICOL,FOLLOW_SEMICOL_in_mainfunction149); if (state.failed) return;
			match(input,RBRACE,FOLLOW_RBRACE_in_mainfunction156); if (state.failed) return;
			// myParser.g:22:12: ( WS )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myParser.g:22:12: WS
					{
					match(input,WS,FOLLOW_WS_in_mainfunction158); if (state.failed) return;
					}
					break;

				default :
					break loop10;
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
	// myParser.g:26:1: type : ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE );
	public final void type() throws RecognitionException {
		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// myParser.g:26:5: ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE )
			// myParser.g:
			{
			if ( input.LA(1)==CHAR_TYPE||input.LA(1)==FLOAT_TYPE||input.LA(1)==INT_TYPE||(input.LA(1) >= LONGLONG_TYPE && input.LA(1) <= LONG_TYPE)||input.LA(1)==SHORT_TYPE||input.LA(1)==VOID_TYPE ) {
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
	// myParser.g:36:1: stats : ( assignmentStat | whileStat | ifelseStat | forStat | declareStat | procedStat | exprList );
	public final void stats() throws RecognitionException {
		int stats_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// myParser.g:36:6: ( assignmentStat | whileStat | ifelseStat | forStat | declareStat | procedStat | exprList )
			int alt11=7;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case WS:
					{
					alt11=1;
					}
					break;
				case OP_ASS:
					{
					switch ( input.LA(3) ) {
					case WS:
						{
						alt11=1;
						}
						break;
					case DEC_NUM:
						{
						switch ( input.LA(4) ) {
						case SEMICOL:
							{
							int LA11_23 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_DIV:
						case OP_MUL:
							{
							int LA11_24 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_ADD:
						case OP_SUB:
							{
							int LA11_25 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_ADDADD:
						case OP_ADDAS:
						case OP_ASS:
						case OP_DIVAS:
						case OP_EQ:
						case OP_GE:
						case OP_GT:
						case OP_LE:
						case OP_LSAS:
						case OP_LT:
						case OP_MODAS:
						case OP_MULAS:
						case OP_NE:
						case OP_RSAS:
						case OP_SUBAS:
						case OP_SUBSUB:
						case OP_XORAS:
							{
							int LA11_26 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_LAND:
						case OP_LOR:
							{
							int LA11_27 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case COMMA:
							{
							alt11=7;
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
									new NoViableAltException("", 11, 19, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case FLOAT_NUM:
						{
						switch ( input.LA(4) ) {
						case SEMICOL:
							{
							int LA11_29 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_DIV:
						case OP_MUL:
							{
							int LA11_30 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_ADD:
						case OP_SUB:
							{
							int LA11_31 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_ADDADD:
						case OP_ADDAS:
						case OP_ASS:
						case OP_DIVAS:
						case OP_EQ:
						case OP_GE:
						case OP_GT:
						case OP_LE:
						case OP_LSAS:
						case OP_LT:
						case OP_MODAS:
						case OP_MULAS:
						case OP_NE:
						case OP_RSAS:
						case OP_SUBAS:
						case OP_SUBSUB:
						case OP_XORAS:
							{
							int LA11_32 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_LAND:
						case OP_LOR:
							{
							int LA11_33 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case COMMA:
							{
							alt11=7;
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
									new NoViableAltException("", 11, 20, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case ID:
						{
						switch ( input.LA(4) ) {
						case OP_DIV:
						case OP_MUL:
							{
							int LA11_35 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_ADD:
						case OP_SUB:
							{
							int LA11_36 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_ADDADD:
						case OP_ADDAS:
						case OP_ASS:
						case OP_DIVAS:
						case OP_EQ:
						case OP_GE:
						case OP_GT:
						case OP_LE:
						case OP_LSAS:
						case OP_LT:
						case OP_MODAS:
						case OP_MULAS:
						case OP_NE:
						case OP_RSAS:
						case OP_SUBAS:
						case OP_SUBSUB:
						case OP_XORAS:
							{
							int LA11_37 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case OP_LAND:
						case OP_LOR:
							{
							int LA11_38 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case SEMICOL:
							{
							int LA11_39 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case COMMA:
							{
							alt11=7;
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
									new NoViableAltException("", 11, 21, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case LPAREN:
						{
						switch ( input.LA(4) ) {
						case DEC_NUM:
							{
							int LA11_41 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case FLOAT_NUM:
							{
							int LA11_42 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case ID:
							{
							int LA11_43 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
							}

							}
							break;
						case LPAREN:
							{
							int LA11_44 = input.LA(5);
							if ( (synpred18_myParser()) ) {
								alt11=1;
							}
							else if ( (true) ) {
								alt11=7;
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
									new NoViableAltException("", 11, 22, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case COMMA:
				case OP_ADD:
				case OP_ADDADD:
				case OP_ADDAS:
				case OP_DIV:
				case OP_DIVAS:
				case OP_EQ:
				case OP_GE:
				case OP_GT:
				case OP_LAND:
				case OP_LE:
				case OP_LOR:
				case OP_LSAS:
				case OP_LT:
				case OP_MODAS:
				case OP_MUL:
				case OP_MULAS:
				case OP_NE:
				case OP_RSAS:
				case OP_SUB:
				case OP_SUBAS:
				case OP_SUBSUB:
				case OP_XORAS:
				case SEMICOL:
					{
					alt11=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case WHILE_:
				{
				alt11=2;
				}
				break;
			case IF_:
				{
				alt11=3;
				}
				break;
			case FOR_:
				{
				alt11=4;
				}
				break;
			case CHAR_TYPE:
			case FLOAT_TYPE:
			case INT_TYPE:
			case LONGLONG_TYPE:
			case LONG_TYPE:
			case SHORT_TYPE:
			case VOID_TYPE:
				{
				alt11=5;
				}
				break;
			case FUNCTION_CALL:
				{
				alt11=6;
				}
				break;
			case DEC_NUM:
			case FLOAT_NUM:
			case LPAREN:
				{
				alt11=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// myParser.g:37:5: assignmentStat
					{
					pushFollow(FOLLOW_assignmentStat_in_stats273);
					assignmentStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:38:5: whileStat
					{
					pushFollow(FOLLOW_whileStat_in_stats282);
					whileStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myParser.g:39:5: ifelseStat
					{
					pushFollow(FOLLOW_ifelseStat_in_stats296);
					ifelseStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myParser.g:40:5: forStat
					{
					pushFollow(FOLLOW_forStat_in_stats309);
					forStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myParser.g:41:5: declareStat
					{
					pushFollow(FOLLOW_declareStat_in_stats325);
					declareStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myParser.g:42:5: procedStat
					{
					pushFollow(FOLLOW_procedStat_in_stats337);
					procedStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// myParser.g:43:5: exprList
					{
					pushFollow(FOLLOW_exprList_in_stats350);
					exprList();
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
	// myParser.g:46:1: assignmentStat : ( ID ( WS )* OP_ASS ( WS )* expr SEMICOL | ID ( WS )* OP_ASS ( WS )* ( DEC_NUM | FLOAT_NUM ) SEMICOL );
	public final void assignmentStat() throws RecognitionException {
		int assignmentStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// myParser.g:46:15: ( ID ( WS )* OP_ASS ( WS )* expr SEMICOL | ID ( WS )* OP_ASS ( WS )* ( DEC_NUM | FLOAT_NUM ) SEMICOL )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ID) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==WS) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==OP_ASS) ) {
						switch ( input.LA(4) ) {
						case WS:
							{
							int LA16_11 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

							}
							break;
						case DEC_NUM:
							{
							int LA16_12 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

							}
							break;
						case FLOAT_NUM:
							{
							int LA16_13 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

							}
							break;
						case ID:
						case LPAREN:
							{
							alt16=1;
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
									new NoViableAltException("", 16, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA16_2==WS) ) {
						int LA16_5 = input.LA(4);
						if ( (LA16_5==OP_ASS) ) {
							int LA16_16 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

						}
						else if ( (LA16_5==WS) ) {
							int LA16_17 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 16, 5, input);
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
								new NoViableAltException("", 16, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA16_1==OP_ASS) ) {
					switch ( input.LA(3) ) {
					case WS:
						{
						switch ( input.LA(4) ) {
						case DEC_NUM:
							{
							int LA16_18 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

							}
							break;
						case FLOAT_NUM:
							{
							int LA16_19 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

							}
							break;
						case ID:
						case LPAREN:
							{
							alt16=1;
							}
							break;
						case WS:
							{
							int LA16_22 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
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
									new NoViableAltException("", 16, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case DEC_NUM:
						{
						int LA16_7 = input.LA(4);
						if ( (LA16_7==SEMICOL) ) {
							int LA16_23 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

						}
						else if ( ((LA16_7 >= OP_ADD && LA16_7 <= OP_ADDAS)||(LA16_7 >= OP_ASS && LA16_7 <= OP_LOR)||(LA16_7 >= OP_LSAS && LA16_7 <= OP_NE)||(LA16_7 >= OP_RSAS && LA16_7 <= OP_SUBSUB)||LA16_7==OP_XORAS) ) {
							alt16=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 16, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case FLOAT_NUM:
						{
						int LA16_8 = input.LA(4);
						if ( (LA16_8==SEMICOL) ) {
							int LA16_28 = input.LA(5);
							if ( (synpred26_myParser()) ) {
								alt16=1;
							}
							else if ( (true) ) {
								alt16=2;
							}

						}
						else if ( ((LA16_8 >= OP_ADD && LA16_8 <= OP_ADDAS)||(LA16_8 >= OP_ASS && LA16_8 <= OP_LOR)||(LA16_8 >= OP_LSAS && LA16_8 <= OP_NE)||(LA16_8 >= OP_RSAS && LA16_8 <= OP_SUBSUB)||LA16_8==OP_XORAS) ) {
							alt16=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 16, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case ID:
					case LPAREN:
						{
						alt16=1;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 3, input);
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
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// myParser.g:47:5: ID ( WS )* OP_ASS ( WS )* expr SEMICOL
					{
					match(input,ID,FOLLOW_ID_in_assignmentStat362); if (state.failed) return;
					// myParser.g:47:8: ( WS )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==WS) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// myParser.g:47:8: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat364); if (state.failed) return;
							}
							break;

						default :
							break loop12;
						}
					}

					match(input,OP_ASS,FOLLOW_OP_ASS_in_assignmentStat367); if (state.failed) return;
					// myParser.g:47:19: ( WS )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==WS) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// myParser.g:47:19: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat369); if (state.failed) return;
							}
							break;

						default :
							break loop13;
						}
					}

					pushFollow(FOLLOW_expr_in_assignmentStat372);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_assignmentStat374); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:48:5: ID ( WS )* OP_ASS ( WS )* ( DEC_NUM | FLOAT_NUM ) SEMICOL
					{
					match(input,ID,FOLLOW_ID_in_assignmentStat403); if (state.failed) return;
					// myParser.g:48:8: ( WS )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==WS) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// myParser.g:48:8: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat405); if (state.failed) return;
							}
							break;

						default :
							break loop14;
						}
					}

					match(input,OP_ASS,FOLLOW_OP_ASS_in_assignmentStat408); if (state.failed) return;
					// myParser.g:48:19: ( WS )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==WS) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// myParser.g:48:19: WS
							{
							match(input,WS,FOLLOW_WS_in_assignmentStat410); if (state.failed) return;
							}
							break;

						default :
							break loop15;
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
					match(input,SEMICOL,FOLLOW_SEMICOL_in_assignmentStat422); if (state.failed) return;
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
	// myParser.g:51:1: whileStat : WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )* ;
	public final void whileStat() throws RecognitionException {
		int whileStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// myParser.g:51:10: ( WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )* )
			// myParser.g:52:5: WHILE_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )*
			{
			match(input,WHILE_,FOLLOW_WHILE__in_whileStat438); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_whileStat440);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_whileStat443); if (state.failed) return;
			// myParser.g:52:25: ( WS )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==WS) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// myParser.g:52:25: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat445); if (state.failed) return;
					}
					break;

				default :
					break loop17;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_whileStat453); if (state.failed) return;
			// myParser.g:53:12: ( WS )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					int LA18_10 = input.LA(2);
					if ( (synpred31_myParser()) ) {
						alt18=1;
					}

				}

				switch (alt18) {
				case 1 :
					// myParser.g:53:12: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat455); if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			// myParser.g:54:9: ( stats )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==CHAR_TYPE||LA19_0==DEC_NUM||LA19_0==FLOAT_NUM||(LA19_0 >= FLOAT_TYPE && LA19_0 <= IF_)||LA19_0==INT_TYPE||(LA19_0 >= LONGLONG_TYPE && LA19_0 <= LPAREN)||LA19_0==SHORT_TYPE||(LA19_0 >= VOID_TYPE && LA19_0 <= WHILE_)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myParser.g:54:9: stats
					{
					pushFollow(FOLLOW_stats_in_whileStat466);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			// myParser.g:54:16: ( WS )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==WS) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// myParser.g:54:16: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat469); if (state.failed) return;
					}
					break;

				default :
					break loop20;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_whileStat477); if (state.failed) return;
			// myParser.g:55:12: ( WS )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					int LA21_11 = input.LA(2);
					if ( (synpred34_myParser()) ) {
						alt21=1;
					}

				}

				switch (alt21) {
				case 1 :
					// myParser.g:55:12: WS
					{
					match(input,WS,FOLLOW_WS_in_whileStat479); if (state.failed) return;
					}
					break;

				default :
					break loop21;
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
	// myParser.g:58:1: ifelseStat : IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )* ( 'else if' LPAREN expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )? ;
	public final void ifelseStat() throws RecognitionException {
		int ifelseStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// myParser.g:58:11: ( IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )* ( 'else if' LPAREN expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )? )
			// myParser.g:59:5: IF_ expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )* ( 'else if' LPAREN expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )* ( ELSE_ ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )?
			{
			match(input,IF_,FOLLOW_IF__in_ifelseStat492); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifelseStat494);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifelseStat497); if (state.failed) return;
			// myParser.g:59:22: ( WS )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==WS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myParser.g:59:22: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat499); if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat507); if (state.failed) return;
			// myParser.g:60:12: ( WS )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					int LA23_10 = input.LA(2);
					if ( (synpred36_myParser()) ) {
						alt23=1;
					}

				}

				switch (alt23) {
				case 1 :
					// myParser.g:60:12: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat509); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			// myParser.g:61:9: ( stats )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==CHAR_TYPE||LA24_0==DEC_NUM||LA24_0==FLOAT_NUM||(LA24_0 >= FLOAT_TYPE && LA24_0 <= IF_)||LA24_0==INT_TYPE||(LA24_0 >= LONGLONG_TYPE && LA24_0 <= LPAREN)||LA24_0==SHORT_TYPE||(LA24_0 >= VOID_TYPE && LA24_0 <= WHILE_)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// myParser.g:61:9: stats
					{
					pushFollow(FOLLOW_stats_in_ifelseStat520);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}

			// myParser.g:61:16: ( WS )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==WS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// myParser.g:61:16: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat523); if (state.failed) return;
					}
					break;

				default :
					break loop25;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat531); if (state.failed) return;
			// myParser.g:62:12: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					int LA26_13 = input.LA(2);
					if ( (synpred39_myParser()) ) {
						alt26=1;
					}

				}

				switch (alt26) {
				case 1 :
					// myParser.g:62:12: WS
					{
					match(input,WS,FOLLOW_WS_in_ifelseStat533); if (state.failed) return;
					}
					break;

				default :
					break loop26;
				}
			}

			// myParser.g:63:5: ( 'else if' LPAREN expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==76) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// myParser.g:63:6: 'else if' LPAREN expr RPAREN ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )*
					{
					match(input,76,FOLLOW_76_in_ifelseStat541); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_ifelseStat543); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_ifelseStat545);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_ifelseStat548); if (state.failed) return;
					// myParser.g:63:36: ( WS )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==WS) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// myParser.g:63:36: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat550); if (state.failed) return;
							}
							break;

						default :
							break loop27;
						}
					}

					match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat561); if (state.failed) return;
					// myParser.g:64:16: ( WS )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==WS) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// myParser.g:64:16: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat563); if (state.failed) return;
							}
							break;

						default :
							break loop28;
						}
					}

					// myParser.g:65:13: ( stats )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==CHAR_TYPE||LA29_0==DEC_NUM||LA29_0==FLOAT_NUM||(LA29_0 >= FLOAT_TYPE && LA29_0 <= IF_)||LA29_0==INT_TYPE||(LA29_0 >= LONGLONG_TYPE && LA29_0 <= LPAREN)||LA29_0==SHORT_TYPE||(LA29_0 >= VOID_TYPE && LA29_0 <= WHILE_)) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// myParser.g:65:13: stats
							{
							pushFollow(FOLLOW_stats_in_ifelseStat578);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop29;
						}
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat590); if (state.failed) return;
					// myParser.g:66:16: ( WS )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==WS) ) {
							int LA30_12 = input.LA(2);
							if ( (synpred43_myParser()) ) {
								alt30=1;
							}

						}

						switch (alt30) {
						case 1 :
							// myParser.g:66:16: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat592); if (state.failed) return;
							}
							break;

						default :
							break loop30;
						}
					}

					}
					break;

				default :
					break loop31;
				}
			}

			// myParser.g:68:5: ( ELSE_ ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )* )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==ELSE_) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// myParser.g:68:6: ELSE_ ( WS )* LBRACE ( WS )* ( stats )* RBRACE ( WS )*
					{
					match(input,ELSE_,FOLLOW_ELSE__in_ifelseStat608); if (state.failed) return;
					// myParser.g:68:12: ( WS )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==WS) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// myParser.g:68:12: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat610); if (state.failed) return;
							}
							break;

						default :
							break loop32;
						}
					}

					match(input,LBRACE,FOLLOW_LBRACE_in_ifelseStat621); if (state.failed) return;
					// myParser.g:69:16: ( WS )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==WS) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// myParser.g:69:16: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat623); if (state.failed) return;
							}
							break;

						default :
							break loop33;
						}
					}

					// myParser.g:70:13: ( stats )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==CHAR_TYPE||LA34_0==DEC_NUM||LA34_0==FLOAT_NUM||(LA34_0 >= FLOAT_TYPE && LA34_0 <= IF_)||LA34_0==INT_TYPE||(LA34_0 >= LONGLONG_TYPE && LA34_0 <= LPAREN)||LA34_0==SHORT_TYPE||(LA34_0 >= VOID_TYPE && LA34_0 <= WHILE_)) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// myParser.g:70:13: stats
							{
							pushFollow(FOLLOW_stats_in_ifelseStat638);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop34;
						}
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifelseStat650); if (state.failed) return;
					// myParser.g:71:17: ( WS )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==WS) ) {
							int LA35_11 = input.LA(2);
							if ( (synpred48_myParser()) ) {
								alt35=1;
							}

						}

						switch (alt35) {
						case 1 :
							// myParser.g:71:17: WS
							{
							match(input,WS,FOLLOW_WS_in_ifelseStat653); if (state.failed) return;
							}
							break;

						default :
							break loop35;
						}
					}

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
	// myParser.g:76:1: forStat : FOR_ ( WS )* ( expr )* ( WS )* SEMICOL ( WS )* ( expr )* ( WS )* SEMICOL ( WS )* ( expr )* ( WS )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )* ;
	public final void forStat() throws RecognitionException {
		int forStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// myParser.g:76:8: ( FOR_ ( WS )* ( expr )* ( WS )* SEMICOL ( WS )* ( expr )* ( WS )* SEMICOL ( WS )* ( expr )* ( WS )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )* )
			// myParser.g:77:5: FOR_ ( WS )* ( expr )* ( WS )* SEMICOL ( WS )* ( expr )* ( WS )* SEMICOL ( WS )* ( expr )* ( WS )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* ( WS )* RBRACE ( WS )*
			{
			match(input,FOR_,FOLLOW_FOR__in_forStat675); if (state.failed) return;
			// myParser.g:77:10: ( WS )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==WS) ) {
					int LA37_5 = input.LA(2);
					if ( (synpred50_myParser()) ) {
						alt37=1;
					}

				}

				switch (alt37) {
				case 1 :
					// myParser.g:77:10: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat677); if (state.failed) return;
					}
					break;

				default :
					break loop37;
				}
			}

			// myParser.g:77:14: ( expr )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==DEC_NUM||LA38_0==FLOAT_NUM||LA38_0==ID||LA38_0==LPAREN) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// myParser.g:77:14: expr
					{
					pushFollow(FOLLOW_expr_in_forStat680);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop38;
				}
			}

			// myParser.g:77:20: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// myParser.g:77:20: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat683); if (state.failed) return;
					}
					break;

				default :
					break loop39;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat686); if (state.failed) return;
			// myParser.g:77:32: ( WS )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==WS) ) {
					int LA40_5 = input.LA(2);
					if ( (synpred53_myParser()) ) {
						alt40=1;
					}

				}

				switch (alt40) {
				case 1 :
					// myParser.g:77:32: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat688); if (state.failed) return;
					}
					break;

				default :
					break loop40;
				}
			}

			// myParser.g:77:36: ( expr )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==DEC_NUM||LA41_0==FLOAT_NUM||LA41_0==ID||LA41_0==LPAREN) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// myParser.g:77:36: expr
					{
					pushFollow(FOLLOW_expr_in_forStat691);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop41;
				}
			}

			// myParser.g:77:42: ( WS )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==WS) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// myParser.g:77:42: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat694); if (state.failed) return;
					}
					break;

				default :
					break loop42;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_forStat697); if (state.failed) return;
			// myParser.g:77:54: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					int LA43_5 = input.LA(2);
					if ( (synpred56_myParser()) ) {
						alt43=1;
					}

				}

				switch (alt43) {
				case 1 :
					// myParser.g:77:54: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat699); if (state.failed) return;
					}
					break;

				default :
					break loop43;
				}
			}

			// myParser.g:77:58: ( expr )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==DEC_NUM||LA44_0==FLOAT_NUM||LA44_0==ID||LA44_0==LPAREN) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// myParser.g:77:58: expr
					{
					pushFollow(FOLLOW_expr_in_forStat702);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop44;
				}
			}

			// myParser.g:77:65: ( WS )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==WS) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// myParser.g:77:65: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat706); if (state.failed) return;
					}
					break;

				default :
					break loop45;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forStat709); if (state.failed) return;
			// myParser.g:77:76: ( WS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// myParser.g:77:76: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat711); if (state.failed) return;
					}
					break;

				default :
					break loop46;
				}
			}

			match(input,LBRACE,FOLLOW_LBRACE_in_forStat718); if (state.failed) return;
			// myParser.g:78:12: ( WS )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					int LA47_10 = input.LA(2);
					if ( (synpred60_myParser()) ) {
						alt47=1;
					}

				}

				switch (alt47) {
				case 1 :
					// myParser.g:78:12: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat720); if (state.failed) return;
					}
					break;

				default :
					break loop47;
				}
			}

			// myParser.g:79:9: ( stats )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==CHAR_TYPE||LA48_0==DEC_NUM||LA48_0==FLOAT_NUM||(LA48_0 >= FLOAT_TYPE && LA48_0 <= IF_)||LA48_0==INT_TYPE||(LA48_0 >= LONGLONG_TYPE && LA48_0 <= LPAREN)||LA48_0==SHORT_TYPE||(LA48_0 >= VOID_TYPE && LA48_0 <= WHILE_)) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// myParser.g:79:9: stats
					{
					pushFollow(FOLLOW_stats_in_forStat731);
					stats();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop48;
				}
			}

			// myParser.g:79:17: ( WS )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==WS) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// myParser.g:79:17: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat735); if (state.failed) return;
					}
					break;

				default :
					break loop49;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_forStat742); if (state.failed) return;
			// myParser.g:80:12: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					int LA50_11 = input.LA(2);
					if ( (synpred63_myParser()) ) {
						alt50=1;
					}

				}

				switch (alt50) {
				case 1 :
					// myParser.g:80:12: WS
					{
					match(input,WS,FOLLOW_WS_in_forStat744); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 8, forStat_StartIndex); }

		}
	}
	// $ANTLR end "forStat"



	// $ANTLR start "function"
	// myParser.g:83:1: function : ( type FUNCTION_CALL ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* | type ( WS )* FUNCTION_CALL ( params )* RPAREN SEMICOL );
	public final void function() throws RecognitionException {
		int function_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// myParser.g:83:9: ( type FUNCTION_CALL ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* | type ( WS )* FUNCTION_CALL ( params )* RPAREN SEMICOL )
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==CHAR_TYPE||LA59_0==FLOAT_TYPE||LA59_0==INT_TYPE||(LA59_0 >= LONGLONG_TYPE && LA59_0 <= LONG_TYPE)||LA59_0==SHORT_TYPE||LA59_0==VOID_TYPE) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==FUNCTION_CALL) ) {
					int LA59_2 = input.LA(3);
					if ( (LA59_2==CHAR_TYPE||LA59_2==FLOAT_TYPE||LA59_2==INT_TYPE||(LA59_2 >= LONGLONG_TYPE && LA59_2 <= LONG_TYPE)||LA59_2==SHORT_TYPE||LA59_2==VOID_TYPE) ) {
						switch ( input.LA(4) ) {
						case ID:
							{
							int LA59_6 = input.LA(5);
							if ( (synpred71_myParser()) ) {
								alt59=1;
							}
							else if ( (true) ) {
								alt59=2;
							}

							}
							break;
						case COMMA:
							{
							int LA59_7 = input.LA(5);
							if ( (synpred71_myParser()) ) {
								alt59=1;
							}
							else if ( (true) ) {
								alt59=2;
							}

							}
							break;
						case RPAREN:
							{
							int LA59_8 = input.LA(5);
							if ( (synpred71_myParser()) ) {
								alt59=1;
							}
							else if ( (true) ) {
								alt59=2;
							}

							}
							break;
						case CHAR_TYPE:
						case FLOAT_TYPE:
						case INT_TYPE:
						case LONGLONG_TYPE:
						case LONG_TYPE:
						case SHORT_TYPE:
						case VOID_TYPE:
							{
							int LA59_9 = input.LA(5);
							if ( (synpred71_myParser()) ) {
								alt59=1;
							}
							else if ( (true) ) {
								alt59=2;
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
									new NoViableAltException("", 59, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA59_2==RPAREN) ) {
						int LA59_5 = input.LA(4);
						if ( (LA59_5==SEMICOL) ) {
							alt59=2;
						}
						else if ( (LA59_5==LBRACE||LA59_5==WS) ) {
							alt59=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 59, 5, input);
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
								new NoViableAltException("", 59, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA59_1==WS) ) {
					alt59=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}

			switch (alt59) {
				case 1 :
					// myParser.g:84:5: type FUNCTION_CALL ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )*
					{
					pushFollow(FOLLOW_type_in_function757);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function759); if (state.failed) return;
					// myParser.g:84:24: ( params )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==CHAR_TYPE||LA51_0==FLOAT_TYPE||LA51_0==INT_TYPE||(LA51_0 >= LONGLONG_TYPE && LA51_0 <= LONG_TYPE)||LA51_0==SHORT_TYPE||LA51_0==VOID_TYPE) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// myParser.g:84:24: params
							{
							pushFollow(FOLLOW_params_in_function761);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop51;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_function764); if (state.failed) return;
					// myParser.g:84:39: ( WS )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==WS) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// myParser.g:84:39: WS
							{
							match(input,WS,FOLLOW_WS_in_function766); if (state.failed) return;
							}
							break;

						default :
							break loop52;
						}
					}

					match(input,LBRACE,FOLLOW_LBRACE_in_function773); if (state.failed) return;
					// myParser.g:85:13: ( WS )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==WS) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// myParser.g:85:13: WS
							{
							match(input,WS,FOLLOW_WS_in_function776); if (state.failed) return;
							}
							break;

						default :
							break loop53;
						}
					}

					// myParser.g:86:9: ( stats )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==CHAR_TYPE||LA54_0==DEC_NUM||LA54_0==FLOAT_NUM||(LA54_0 >= FLOAT_TYPE && LA54_0 <= IF_)||LA54_0==INT_TYPE||(LA54_0 >= LONGLONG_TYPE && LA54_0 <= LPAREN)||LA54_0==SHORT_TYPE||(LA54_0 >= VOID_TYPE && LA54_0 <= WHILE_)) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// myParser.g:86:9: stats
							{
							pushFollow(FOLLOW_stats_in_function787);
							stats();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop54;
						}
					}

					match(input,RETURN_,FOLLOW_RETURN__in_function799); if (state.failed) return;
					// myParser.g:87:18: ( DEC_NUM | FLOAT_NUM )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==DEC_NUM||LA55_0==FLOAT_NUM) ) {
						alt55=1;
					}
					switch (alt55) {
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

					match(input,SEMICOL,FOLLOW_SEMICOL_in_function810); if (state.failed) return;
					match(input,RBRACE,FOLLOW_RBRACE_in_function817); if (state.failed) return;
					// myParser.g:88:14: ( WS )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==WS) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// myParser.g:88:14: WS
							{
							match(input,WS,FOLLOW_WS_in_function821); if (state.failed) return;
							}
							break;

						default :
							break loop56;
						}
					}

					}
					break;
				case 2 :
					// myParser.g:89:5: type ( WS )* FUNCTION_CALL ( params )* RPAREN SEMICOL
					{
					pushFollow(FOLLOW_type_in_function860);
					type();
					state._fsp--;
					if (state.failed) return;
					// myParser.g:89:10: ( WS )*
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==WS) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// myParser.g:89:10: WS
							{
							match(input,WS,FOLLOW_WS_in_function862); if (state.failed) return;
							}
							break;

						default :
							break loop57;
						}
					}

					match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function865); if (state.failed) return;
					// myParser.g:89:28: ( params )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==CHAR_TYPE||LA58_0==FLOAT_TYPE||LA58_0==INT_TYPE||(LA58_0 >= LONGLONG_TYPE && LA58_0 <= LONG_TYPE)||LA58_0==SHORT_TYPE||LA58_0==VOID_TYPE) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// myParser.g:89:28: params
							{
							pushFollow(FOLLOW_params_in_function867);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop58;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_function870); if (state.failed) return;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_function873); if (state.failed) return;
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
	// myParser.g:94:1: declareStat : ( type ID SEMICOL | type exprList | type assignmentStat );
	public final void declareStat() throws RecognitionException {
		int declareStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myParser.g:94:12: ( type ID SEMICOL | type exprList | type assignmentStat )
			int alt60=3;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==CHAR_TYPE||LA60_0==FLOAT_TYPE||LA60_0==INT_TYPE||(LA60_0 >= LONGLONG_TYPE && LA60_0 <= LONG_TYPE)||LA60_0==SHORT_TYPE||LA60_0==VOID_TYPE) ) {
				int LA60_1 = input.LA(2);
				if ( (LA60_1==ID) ) {
					switch ( input.LA(3) ) {
					case SEMICOL:
						{
						int LA60_6 = input.LA(4);
						if ( (synpred74_myParser()) ) {
							alt60=1;
						}
						else if ( (synpred75_myParser()) ) {
							alt60=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 60, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case COMMA:
					case OP_ADD:
					case OP_ADDADD:
					case OP_ADDAS:
					case OP_DIV:
					case OP_DIVAS:
					case OP_EQ:
					case OP_GE:
					case OP_GT:
					case OP_LAND:
					case OP_LE:
					case OP_LOR:
					case OP_LSAS:
					case OP_LT:
					case OP_MODAS:
					case OP_MUL:
					case OP_MULAS:
					case OP_NE:
					case OP_RSAS:
					case OP_SUB:
					case OP_SUBAS:
					case OP_SUBSUB:
					case OP_XORAS:
						{
						alt60=2;
						}
						break;
					case OP_ASS:
						{
						switch ( input.LA(4) ) {
						case DEC_NUM:
							{
							int LA60_28 = input.LA(5);
							if ( (synpred75_myParser()) ) {
								alt60=2;
							}
							else if ( (true) ) {
								alt60=3;
							}

							}
							break;
						case FLOAT_NUM:
							{
							int LA60_29 = input.LA(5);
							if ( (synpred75_myParser()) ) {
								alt60=2;
							}
							else if ( (true) ) {
								alt60=3;
							}

							}
							break;
						case ID:
							{
							int LA60_30 = input.LA(5);
							if ( (synpred75_myParser()) ) {
								alt60=2;
							}
							else if ( (true) ) {
								alt60=3;
							}

							}
							break;
						case LPAREN:
							{
							int LA60_31 = input.LA(5);
							if ( (synpred75_myParser()) ) {
								alt60=2;
							}
							else if ( (true) ) {
								alt60=3;
							}

							}
							break;
						case WS:
							{
							alt60=3;
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
									new NoViableAltException("", 60, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case WS:
						{
						alt60=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 60, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( (LA60_1==DEC_NUM||LA60_1==FLOAT_NUM||LA60_1==LPAREN) ) {
					alt60=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// myParser.g:95:5: type ID SEMICOL
					{
					pushFollow(FOLLOW_type_in_declareStat887);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_declareStat889); if (state.failed) return;
					match(input,SEMICOL,FOLLOW_SEMICOL_in_declareStat891); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:96:5: type exprList
					{
					pushFollow(FOLLOW_type_in_declareStat903);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_exprList_in_declareStat905);
					exprList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myParser.g:97:5: type assignmentStat
					{
					pushFollow(FOLLOW_type_in_declareStat919);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_assignmentStat_in_declareStat921);
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
	// myParser.g:100:1: procedStat : FUNCTION_CALL arguments RPAREN SEMICOL ;
	public final void procedStat() throws RecognitionException {
		int procedStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myParser.g:100:11: ( FUNCTION_CALL arguments RPAREN SEMICOL )
			// myParser.g:101:5: FUNCTION_CALL arguments RPAREN SEMICOL
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_procedStat934); if (state.failed) return;
			pushFollow(FOLLOW_arguments_in_procedStat936);
			arguments();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_procedStat938); if (state.failed) return;
			match(input,SEMICOL,FOLLOW_SEMICOL_in_procedStat940); if (state.failed) return;
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
	// myParser.g:104:1: exprList : expr ( COMMA expr )* SEMICOL ;
	public final void exprList() throws RecognitionException {
		int exprList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myParser.g:104:9: ( expr ( COMMA expr )* SEMICOL )
			// myParser.g:105:5: expr ( COMMA expr )* SEMICOL
			{
			pushFollow(FOLLOW_expr_in_exprList952);
			expr();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:105:10: ( COMMA expr )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==COMMA) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// myParser.g:105:11: COMMA expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_exprList955); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_exprList957);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop61;
				}
			}

			match(input,SEMICOL,FOLLOW_SEMICOL_in_exprList961); if (state.failed) return;
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



	// $ANTLR start "arguments"
	// myParser.g:108:1: arguments : expr ( COMMA expr )* ;
	public final void arguments() throws RecognitionException {
		int arguments_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myParser.g:108:10: ( expr ( COMMA expr )* )
			// myParser.g:109:5: expr ( COMMA expr )*
			{
			pushFollow(FOLLOW_expr_in_arguments973);
			expr();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:109:10: ( COMMA expr )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==COMMA) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// myParser.g:109:11: COMMA expr
					{
					match(input,COMMA,FOLLOW_COMMA_in_arguments976); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_arguments978);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop62;
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
			if ( state.backtracking>0 ) { memoize(input, 13, arguments_StartIndex); }

		}
	}
	// $ANTLR end "arguments"



	// $ANTLR start "params"
	// myParser.g:112:1: params : param ( COMMA param )* ;
	public final void params() throws RecognitionException {
		int params_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myParser.g:112:7: ( param ( COMMA param )* )
			// myParser.g:113:5: param ( COMMA param )*
			{
			pushFollow(FOLLOW_param_in_params992);
			param();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:113:11: ( COMMA param )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==COMMA) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// myParser.g:113:12: COMMA param
					{
					match(input,COMMA,FOLLOW_COMMA_in_params995); if (state.failed) return;
					pushFollow(FOLLOW_param_in_params997);
					param();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop63;
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
			if ( state.backtracking>0 ) { memoize(input, 14, params_StartIndex); }

		}
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// myParser.g:116:1: param : ( type ID | type );
	public final void param() throws RecognitionException {
		int param_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myParser.g:116:6: ( type ID | type )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==CHAR_TYPE||LA64_0==FLOAT_TYPE||LA64_0==INT_TYPE||(LA64_0 >= LONGLONG_TYPE && LA64_0 <= LONG_TYPE)||LA64_0==SHORT_TYPE||LA64_0==VOID_TYPE) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==ID) ) {
					alt64=1;
				}
				else if ( (LA64_1==EOF||LA64_1==CHAR_TYPE||LA64_1==COMMA||LA64_1==FLOAT_TYPE||LA64_1==INT_TYPE||(LA64_1 >= LONGLONG_TYPE && LA64_1 <= LONG_TYPE)||LA64_1==RPAREN||LA64_1==SHORT_TYPE||LA64_1==VOID_TYPE) ) {
					alt64=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}

			switch (alt64) {
				case 1 :
					// myParser.g:117:5: type ID
					{
					pushFollow(FOLLOW_type_in_param1011);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_param1013); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:118:5: type
					{
					pushFollow(FOLLOW_type_in_param1025);
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
			if ( state.backtracking>0 ) { memoize(input, 15, param_StartIndex); }

		}
	}
	// $ANTLR end "param"



	// $ANTLR start "expr"
	// myParser.g:121:1: expr : operationStat ( ( OP_LAND | OP_LOR ) operationStat )* ;
	public final void expr() throws RecognitionException {
		int expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myParser.g:121:6: ( operationStat ( ( OP_LAND | OP_LOR ) operationStat )* )
			// myParser.g:122:5: operationStat ( ( OP_LAND | OP_LOR ) operationStat )*
			{
			pushFollow(FOLLOW_operationStat_in_expr1038);
			operationStat();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:122:19: ( ( OP_LAND | OP_LOR ) operationStat )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==OP_LAND||LA65_0==OP_LOR) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// myParser.g:122:20: ( OP_LAND | OP_LOR ) operationStat
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
					pushFollow(FOLLOW_operationStat_in_expr1049);
					operationStat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop65;
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
			if ( state.backtracking>0 ) { memoize(input, 16, expr_StartIndex); }

		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "operationStat"
	// myParser.g:125:1: operationStat : add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB ) add )* ;
	public final void operationStat() throws RecognitionException {
		int operationStat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// myParser.g:125:14: ( add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB ) add )* )
			// myParser.g:126:5: add ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB ) add )*
			{
			pushFollow(FOLLOW_add_in_operationStat1063);
			add();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:126:9: ( ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB ) add )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( ((LA66_0 >= OP_ADDADD && LA66_0 <= OP_ADDAS)||LA66_0==OP_ASS||(LA66_0 >= OP_DIVAS && LA66_0 <= OP_GT)||LA66_0==OP_LE||(LA66_0 >= OP_LSAS && LA66_0 <= OP_MODAS)||(LA66_0 >= OP_MULAS && LA66_0 <= OP_NE)||LA66_0==OP_RSAS||(LA66_0 >= OP_SUBAS && LA66_0 <= OP_SUBSUB)||LA66_0==OP_XORAS) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// myParser.g:126:10: ( OP_EQ | OP_LE | OP_GE | OP_NE | OP_GT | OP_LT | OP_ASS | OP_ADDAS | OP_SUBAS | OP_MULAS | OP_DIVAS | OP_XORAS | OP_MODAS | OP_LSAS | OP_RSAS | OP_ADDADD | OP_SUBSUB ) add
					{
					if ( (input.LA(1) >= OP_ADDADD && input.LA(1) <= OP_ADDAS)||input.LA(1)==OP_ASS||(input.LA(1) >= OP_DIVAS && input.LA(1) <= OP_GT)||input.LA(1)==OP_LE||(input.LA(1) >= OP_LSAS && input.LA(1) <= OP_MODAS)||(input.LA(1) >= OP_MULAS && input.LA(1) <= OP_NE)||input.LA(1)==OP_RSAS||(input.LA(1) >= OP_SUBAS && input.LA(1) <= OP_SUBSUB)||input.LA(1)==OP_XORAS ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_add_in_operationStat1162);
					add();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop66;
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
			if ( state.backtracking>0 ) { memoize(input, 17, operationStat_StartIndex); }

		}
	}
	// $ANTLR end "operationStat"



	// $ANTLR start "add"
	// myParser.g:131:1: add : multiply ( ( OP_ADD | OP_SUB ) multiply )* ;
	public final void add() throws RecognitionException {
		int add_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// myParser.g:131:4: ( multiply ( ( OP_ADD | OP_SUB ) multiply )* )
			// myParser.g:132:5: multiply ( ( OP_ADD | OP_SUB ) multiply )*
			{
			pushFollow(FOLLOW_multiply_in_add1176);
			multiply();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:132:14: ( ( OP_ADD | OP_SUB ) multiply )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==OP_ADD||LA67_0==OP_SUB) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// myParser.g:132:15: ( OP_ADD | OP_SUB ) multiply
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
					pushFollow(FOLLOW_multiply_in_add1187);
					multiply();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop67;
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
			if ( state.backtracking>0 ) { memoize(input, 18, add_StartIndex); }

		}
	}
	// $ANTLR end "add"



	// $ANTLR start "multiply"
	// myParser.g:135:1: multiply : atom ( ( OP_MUL | OP_DIV ) atom )* ;
	public final void multiply() throws RecognitionException {
		int multiply_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// myParser.g:135:9: ( atom ( ( OP_MUL | OP_DIV ) atom )* )
			// myParser.g:136:5: atom ( ( OP_MUL | OP_DIV ) atom )*
			{
			pushFollow(FOLLOW_atom_in_multiply1201);
			atom();
			state._fsp--;
			if (state.failed) return;
			// myParser.g:136:10: ( ( OP_MUL | OP_DIV ) atom )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==OP_DIV||LA68_0==OP_MUL) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// myParser.g:136:11: ( OP_MUL | OP_DIV ) atom
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
					pushFollow(FOLLOW_atom_in_multiply1213);
					atom();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop68;
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
			if ( state.backtracking>0 ) { memoize(input, 19, multiply_StartIndex); }

		}
	}
	// $ANTLR end "multiply"



	// $ANTLR start "atom"
	// myParser.g:139:1: atom : ( DEC_NUM | FLOAT_NUM | ID | LPAREN expr RPAREN );
	public final void atom() throws RecognitionException {
		int atom_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// myParser.g:139:5: ( DEC_NUM | FLOAT_NUM | ID | LPAREN expr RPAREN )
			int alt69=4;
			switch ( input.LA(1) ) {
			case DEC_NUM:
				{
				alt69=1;
				}
				break;
			case FLOAT_NUM:
				{
				alt69=2;
				}
				break;
			case ID:
				{
				alt69=3;
				}
				break;
			case LPAREN:
				{
				alt69=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// myParser.g:140:5: DEC_NUM
					{
					match(input,DEC_NUM,FOLLOW_DEC_NUM_in_atom1227); if (state.failed) return;
					}
					break;
				case 2 :
					// myParser.g:141:5: FLOAT_NUM
					{
					match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_atom1247); if (state.failed) return;
					}
					break;
				case 3 :
					// myParser.g:142:5: ID
					{
					match(input,ID,FOLLOW_ID_in_atom1265); if (state.failed) return;
					}
					break;
				case 4 :
					// myParser.g:143:5: LPAREN expr RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom1290); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_atom1292);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_atom1294); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 20, atom_StartIndex); }

		}
	}
	// $ANTLR end "atom"

	// $ANTLR start synpred18_myParser
	public final void synpred18_myParser_fragment() throws RecognitionException {
		// myParser.g:37:5: ( assignmentStat )
		// myParser.g:37:5: assignmentStat
		{
		pushFollow(FOLLOW_assignmentStat_in_synpred18_myParser273);
		assignmentStat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred18_myParser

	// $ANTLR start synpred26_myParser
	public final void synpred26_myParser_fragment() throws RecognitionException {
		// myParser.g:47:5: ( ID ( WS )* OP_ASS ( WS )* expr SEMICOL )
		// myParser.g:47:5: ID ( WS )* OP_ASS ( WS )* expr SEMICOL
		{
		match(input,ID,FOLLOW_ID_in_synpred26_myParser362); if (state.failed) return;
		// myParser.g:47:8: ( WS )*
		loop71:
		while (true) {
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==WS) ) {
				alt71=1;
			}

			switch (alt71) {
			case 1 :
				// myParser.g:47:8: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred26_myParser364); if (state.failed) return;
				}
				break;

			default :
				break loop71;
			}
		}

		match(input,OP_ASS,FOLLOW_OP_ASS_in_synpred26_myParser367); if (state.failed) return;
		// myParser.g:47:19: ( WS )*
		loop72:
		while (true) {
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==WS) ) {
				alt72=1;
			}

			switch (alt72) {
			case 1 :
				// myParser.g:47:19: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred26_myParser369); if (state.failed) return;
				}
				break;

			default :
				break loop72;
			}
		}

		pushFollow(FOLLOW_expr_in_synpred26_myParser372);
		expr();
		state._fsp--;
		if (state.failed) return;
		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred26_myParser374); if (state.failed) return;
		}

	}
	// $ANTLR end synpred26_myParser

	// $ANTLR start synpred31_myParser
	public final void synpred31_myParser_fragment() throws RecognitionException {
		// myParser.g:53:12: ( WS )
		// myParser.g:53:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred31_myParser455); if (state.failed) return;
		}

	}
	// $ANTLR end synpred31_myParser

	// $ANTLR start synpred34_myParser
	public final void synpred34_myParser_fragment() throws RecognitionException {
		// myParser.g:55:12: ( WS )
		// myParser.g:55:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred34_myParser479); if (state.failed) return;
		}

	}
	// $ANTLR end synpred34_myParser

	// $ANTLR start synpred36_myParser
	public final void synpred36_myParser_fragment() throws RecognitionException {
		// myParser.g:60:12: ( WS )
		// myParser.g:60:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred36_myParser509); if (state.failed) return;
		}

	}
	// $ANTLR end synpred36_myParser

	// $ANTLR start synpred39_myParser
	public final void synpred39_myParser_fragment() throws RecognitionException {
		// myParser.g:62:12: ( WS )
		// myParser.g:62:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred39_myParser533); if (state.failed) return;
		}

	}
	// $ANTLR end synpred39_myParser

	// $ANTLR start synpred43_myParser
	public final void synpred43_myParser_fragment() throws RecognitionException {
		// myParser.g:66:16: ( WS )
		// myParser.g:66:16: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred43_myParser592); if (state.failed) return;
		}

	}
	// $ANTLR end synpred43_myParser

	// $ANTLR start synpred48_myParser
	public final void synpred48_myParser_fragment() throws RecognitionException {
		// myParser.g:71:17: ( WS )
		// myParser.g:71:17: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred48_myParser653); if (state.failed) return;
		}

	}
	// $ANTLR end synpred48_myParser

	// $ANTLR start synpred50_myParser
	public final void synpred50_myParser_fragment() throws RecognitionException {
		// myParser.g:77:10: ( WS )
		// myParser.g:77:10: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred50_myParser677); if (state.failed) return;
		}

	}
	// $ANTLR end synpred50_myParser

	// $ANTLR start synpred53_myParser
	public final void synpred53_myParser_fragment() throws RecognitionException {
		// myParser.g:77:32: ( WS )
		// myParser.g:77:32: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred53_myParser688); if (state.failed) return;
		}

	}
	// $ANTLR end synpred53_myParser

	// $ANTLR start synpred56_myParser
	public final void synpred56_myParser_fragment() throws RecognitionException {
		// myParser.g:77:54: ( WS )
		// myParser.g:77:54: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred56_myParser699); if (state.failed) return;
		}

	}
	// $ANTLR end synpred56_myParser

	// $ANTLR start synpred60_myParser
	public final void synpred60_myParser_fragment() throws RecognitionException {
		// myParser.g:78:12: ( WS )
		// myParser.g:78:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred60_myParser720); if (state.failed) return;
		}

	}
	// $ANTLR end synpred60_myParser

	// $ANTLR start synpred63_myParser
	public final void synpred63_myParser_fragment() throws RecognitionException {
		// myParser.g:80:12: ( WS )
		// myParser.g:80:12: WS
		{
		match(input,WS,FOLLOW_WS_in_synpred63_myParser744); if (state.failed) return;
		}

	}
	// $ANTLR end synpred63_myParser

	// $ANTLR start synpred71_myParser
	public final void synpred71_myParser_fragment() throws RecognitionException {
		// myParser.g:84:5: ( type FUNCTION_CALL ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )* )
		// myParser.g:84:5: type FUNCTION_CALL ( params )* RPAREN ( WS )* LBRACE ( WS )* ( stats )* 'return' ( DEC_NUM | FLOAT_NUM )? SEMICOL RBRACE ( WS )*
		{
		pushFollow(FOLLOW_type_in_synpred71_myParser757);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_synpred71_myParser759); if (state.failed) return;
		// myParser.g:84:24: ( params )*
		loop81:
		while (true) {
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==CHAR_TYPE||LA81_0==FLOAT_TYPE||LA81_0==INT_TYPE||(LA81_0 >= LONGLONG_TYPE && LA81_0 <= LONG_TYPE)||LA81_0==SHORT_TYPE||LA81_0==VOID_TYPE) ) {
				alt81=1;
			}

			switch (alt81) {
			case 1 :
				// myParser.g:84:24: params
				{
				pushFollow(FOLLOW_params_in_synpred71_myParser761);
				params();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop81;
			}
		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred71_myParser764); if (state.failed) return;
		// myParser.g:84:39: ( WS )*
		loop82:
		while (true) {
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==WS) ) {
				alt82=1;
			}

			switch (alt82) {
			case 1 :
				// myParser.g:84:39: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred71_myParser766); if (state.failed) return;
				}
				break;

			default :
				break loop82;
			}
		}

		match(input,LBRACE,FOLLOW_LBRACE_in_synpred71_myParser773); if (state.failed) return;
		// myParser.g:85:13: ( WS )*
		loop83:
		while (true) {
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==WS) ) {
				alt83=1;
			}

			switch (alt83) {
			case 1 :
				// myParser.g:85:13: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred71_myParser776); if (state.failed) return;
				}
				break;

			default :
				break loop83;
			}
		}

		// myParser.g:86:9: ( stats )*
		loop84:
		while (true) {
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==CHAR_TYPE||LA84_0==DEC_NUM||LA84_0==FLOAT_NUM||(LA84_0 >= FLOAT_TYPE && LA84_0 <= IF_)||LA84_0==INT_TYPE||(LA84_0 >= LONGLONG_TYPE && LA84_0 <= LPAREN)||LA84_0==SHORT_TYPE||(LA84_0 >= VOID_TYPE && LA84_0 <= WHILE_)) ) {
				alt84=1;
			}

			switch (alt84) {
			case 1 :
				// myParser.g:86:9: stats
				{
				pushFollow(FOLLOW_stats_in_synpred71_myParser787);
				stats();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop84;
			}
		}

		match(input,RETURN_,FOLLOW_RETURN__in_synpred71_myParser799); if (state.failed) return;
		// myParser.g:87:18: ( DEC_NUM | FLOAT_NUM )?
		int alt85=2;
		int LA85_0 = input.LA(1);
		if ( (LA85_0==DEC_NUM||LA85_0==FLOAT_NUM) ) {
			alt85=1;
		}
		switch (alt85) {
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

		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred71_myParser810); if (state.failed) return;
		match(input,RBRACE,FOLLOW_RBRACE_in_synpred71_myParser817); if (state.failed) return;
		// myParser.g:88:14: ( WS )*
		loop86:
		while (true) {
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==WS) ) {
				alt86=1;
			}

			switch (alt86) {
			case 1 :
				// myParser.g:88:14: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred71_myParser821); if (state.failed) return;
				}
				break;

			default :
				break loop86;
			}
		}

		}

	}
	// $ANTLR end synpred71_myParser

	// $ANTLR start synpred74_myParser
	public final void synpred74_myParser_fragment() throws RecognitionException {
		// myParser.g:95:5: ( type ID SEMICOL )
		// myParser.g:95:5: type ID SEMICOL
		{
		pushFollow(FOLLOW_type_in_synpred74_myParser887);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred74_myParser889); if (state.failed) return;
		match(input,SEMICOL,FOLLOW_SEMICOL_in_synpred74_myParser891); if (state.failed) return;
		}

	}
	// $ANTLR end synpred74_myParser

	// $ANTLR start synpred75_myParser
	public final void synpred75_myParser_fragment() throws RecognitionException {
		// myParser.g:96:5: ( type exprList )
		// myParser.g:96:5: type exprList
		{
		pushFollow(FOLLOW_type_in_synpred75_myParser903);
		type();
		state._fsp--;
		if (state.failed) return;
		pushFollow(FOLLOW_exprList_in_synpred75_myParser905);
		exprList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred75_myParser

	// Delegated rules

	public final boolean synpred60_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred74_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred74_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred39_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred39_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred36_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred36_myParser_fragment(); // can never throw exception
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
	public final boolean synpred75_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred75_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_myParser_fragment(); // can never throw exception
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
	public final boolean synpred71_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred48_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred34_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred34_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred63_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred63_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred31_myParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred31_myParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_INCLUDE_in_startStat48 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_OP_LT_in_startStat51 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_startStat53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_startStat55 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_OP_GT_in_startStat57 = new BitSet(new long[]{0x0000000318400080L,0x0000000000000540L});
	public static final BitSet FOLLOW_WS_in_startStat59 = new BitSet(new long[]{0x0000000318400080L,0x0000000000000540L});
	public static final BitSet FOLLOW_function_in_startStat70 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000140L});
	public static final BitSet FOLLOW_mainfunction_in_startStat78 = new BitSet(new long[]{0x0000000310400082L,0x0000000000000140L});
	public static final BitSet FOLLOW_function_in_startStat84 = new BitSet(new long[]{0x0000000310400082L,0x0000000000000140L});
	public static final BitSet FOLLOW_type_in_mainfunction97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_mainfunction99 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_mainfunction101 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_mainfunction104 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_mainfunction106 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_mainfunction113 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_mainfunction115 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_mainfunction126 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000348L});
	public static final BitSet FOLLOW_RETURN__in_mainfunction138 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_mainfunction149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_mainfunction156 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_mainfunction158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_assignmentStat_in_stats273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileStat_in_stats282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifelseStat_in_stats296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStat_in_stats309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declareStat_in_stats325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedStat_in_stats337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprList_in_stats350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentStat362 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat364 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_OP_ASS_in_assignmentStat367 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat369 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_expr_in_assignmentStat372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_assignmentStat374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignmentStat403 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat405 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_OP_ASS_in_assignmentStat408 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_assignmentStat410 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_set_in_assignmentStat413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_assignmentStat422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE__in_whileStat438 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_whileStat440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_whileStat443 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_whileStat445 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_whileStat453 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_whileStat455 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_stats_in_whileStat466 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_whileStat469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_whileStat477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_whileStat479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_IF__in_ifelseStat492 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_ifelseStat494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_ifelseStat497 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat499 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat507 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_ifelseStat509 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_stats_in_ifelseStat520 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_ifelseStat523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat531 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat533 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_76_in_ifelseStat541 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifelseStat543 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_ifelseStat545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_ifelseStat548 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat550 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat561 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_ifelseStat563 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_stats_in_ifelseStat578 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000342L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat590 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat592 = new BitSet(new long[]{0x0000000000020002L,0x0000000000001400L});
	public static final BitSet FOLLOW_ELSE__in_ifelseStat608 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat610 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_ifelseStat621 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_ifelseStat623 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_stats_in_ifelseStat638 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000342L});
	public static final BitSet FOLLOW_RBRACE_in_ifelseStat650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_ifelseStat653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_FOR__in_forStat675 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000420L});
	public static final BitSet FOLLOW_WS_in_forStat677 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000420L});
	public static final BitSet FOLLOW_expr_in_forStat680 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000420L});
	public static final BitSet FOLLOW_WS_in_forStat683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000420L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat686 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000420L});
	public static final BitSet FOLLOW_WS_in_forStat688 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000420L});
	public static final BitSet FOLLOW_expr_in_forStat691 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000420L});
	public static final BitSet FOLLOW_WS_in_forStat694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000420L});
	public static final BitSet FOLLOW_SEMICOL_in_forStat697 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000410L});
	public static final BitSet FOLLOW_WS_in_forStat699 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000410L});
	public static final BitSet FOLLOW_expr_in_forStat702 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000410L});
	public static final BitSet FOLLOW_WS_in_forStat706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000410L});
	public static final BitSet FOLLOW_RPAREN_in_forStat709 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_forStat711 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_forStat718 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_forStat720 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_stats_in_forStat731 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000742L});
	public static final BitSet FOLLOW_WS_in_forStat735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
	public static final BitSet FOLLOW_RBRACE_in_forStat742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_forStat744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_in_function757 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_function759 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_function761 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_function764 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_function766 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_function773 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_function776 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_function787 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000348L});
	public static final BitSet FOLLOW_RETURN__in_function799 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_function810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_function817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_function821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_in_function860 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_function862 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_function865 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_function867 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_function870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_function873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declareStat887 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_declareStat889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_declareStat891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declareStat903 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_exprList_in_declareStat905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declareStat919 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_assignmentStat_in_declareStat921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_procedStat934 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_arguments_in_procedStat936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_procedStat938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_procedStat940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList952 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_exprList955 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_exprList957 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_exprList961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_arguments973 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_arguments976 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_arguments978 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_param_in_params992 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_params995 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000140L});
	public static final BitSet FOLLOW_param_in_params997 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_type_in_param1011 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_param1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_param1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operationStat_in_expr1038 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_set_in_expr1041 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_operationStat_in_expr1049 = new BitSet(new long[]{0x0000A00000000002L});
	public static final BitSet FOLLOW_add_in_operationStat1063 = new BitSet(new long[]{0xB46E5EB000000002L});
	public static final BitSet FOLLOW_set_in_operationStat1066 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_add_in_operationStat1162 = new BitSet(new long[]{0xB46E5EB000000002L});
	public static final BitSet FOLLOW_multiply_in_add1176 = new BitSet(new long[]{0x0800000800000002L});
	public static final BitSet FOLLOW_set_in_add1179 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_multiply_in_add1187 = new BitSet(new long[]{0x0800000800000002L});
	public static final BitSet FOLLOW_atom_in_multiply1201 = new BitSet(new long[]{0x0010010000000002L});
	public static final BitSet FOLLOW_set_in_multiply1204 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_atom_in_multiply1213 = new BitSet(new long[]{0x0010010000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_atom1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_atom1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom1290 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_expr_in_atom1292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RPAREN_in_atom1294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStat_in_synpred18_myParser273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred26_myParser362 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_synpred26_myParser364 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_OP_ASS_in_synpred26_myParser367 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_synpred26_myParser369 = new BitSet(new long[]{0x0000000402042000L,0x0000000000000400L});
	public static final BitSet FOLLOW_expr_in_synpred26_myParser372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred26_myParser374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred31_myParser455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred34_myParser479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred36_myParser509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred39_myParser533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred43_myParser592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred48_myParser653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred50_myParser677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred53_myParser688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred56_myParser699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred60_myParser720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_synpred63_myParser744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred71_myParser757 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_synpred71_myParser759 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_params_in_synpred71_myParser761 = new BitSet(new long[]{0x0000000310400080L,0x0000000000000150L});
	public static final BitSet FOLLOW_RPAREN_in_synpred71_myParser764 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_synpred71_myParser766 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LBRACE_in_synpred71_myParser773 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000748L});
	public static final BitSet FOLLOW_WS_in_synpred71_myParser776 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000748L});
	public static final BitSet FOLLOW_stats_in_synpred71_myParser787 = new BitSet(new long[]{0x0000000717C42080L,0x0000000000000348L});
	public static final BitSet FOLLOW_RETURN__in_synpred71_myParser799 = new BitSet(new long[]{0x0000000000042000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred71_myParser810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RBRACE_in_synpred71_myParser817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_WS_in_synpred71_myParser821 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_type_in_synpred74_myParser887 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_synpred74_myParser889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_SEMICOL_in_synpred74_myParser891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred75_myParser903 = new BitSet(new long[]{0x0000000402042000L});
	public static final BitSet FOLLOW_exprList_in_synpred75_myParser905 = new BitSet(new long[]{0x0000000000000002L});
}
