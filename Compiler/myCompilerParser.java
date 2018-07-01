// $ANTLR 3.5.2 myCompiler.g 2018-07-01 21:42:22

    // import packages here.
    import java.util.HashMap;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "BREAK_", "CHAR", "CHAR_TYPE", 
		"COLON", "COMMA", "COMMENT1", "COMMENT2", "CONTINUE_", "DEC_NUM", "DEFINE", 
		"DIGIT", "DOUBLE_TYPE", "ELSE_", "EscapeSequence", "FLOAT_NUM", "FLOAT_NUM1", 
		"FLOAT_NUM2", "FLOAT_NUM3", "FLOAT_TYPE", "FOR_", "FUNCTION_CALL", "ID", 
		"IF_", "INCLUDE", "INT_TYPE", "LBRACE", "LBRACK", "LETTER", "LONGLONG_TYPE", 
		"LONG_TYPE", "LPAREN", "OP_ADD", "OP_ADDADD", "OP_ADDAS", "OP_AND", "OP_ASS", 
		"OP_DIV", "OP_DIVAS", "OP_EQ", "OP_GE", "OP_GT", "OP_LAND", "OP_LE", "OP_LOR", 
		"OP_LS", "OP_LSAS", "OP_LT", "OP_MODAS", "OP_MUL", "OP_MULAS", "OP_NE", 
		"OP_NOT", "OP_OR", "OP_RS", "OP_RSAS", "OP_SUB", "OP_SUBAS", "OP_SUBSUB", 
		"OP_XOR", "OP_XORAS", "PERIOD", "PREPROCESSOR", "RBRACE", "RBRACK", "RETURN_", 
		"RPAREN", "SEMICOL", "SHORT_TYPE", "STRING", "VOID_TYPE", "WHILE_", "WS", 
		"'printf'"
	};
	public static final int EOF=-1;
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
	public static final int EscapeSequence=18;
	public static final int FLOAT_NUM=19;
	public static final int FLOAT_NUM1=20;
	public static final int FLOAT_NUM2=21;
	public static final int FLOAT_NUM3=22;
	public static final int FLOAT_TYPE=23;
	public static final int FOR_=24;
	public static final int FUNCTION_CALL=25;
	public static final int ID=26;
	public static final int IF_=27;
	public static final int INCLUDE=28;
	public static final int INT_TYPE=29;
	public static final int LBRACE=30;
	public static final int LBRACK=31;
	public static final int LETTER=32;
	public static final int LONGLONG_TYPE=33;
	public static final int LONG_TYPE=34;
	public static final int LPAREN=35;
	public static final int OP_ADD=36;
	public static final int OP_ADDADD=37;
	public static final int OP_ADDAS=38;
	public static final int OP_AND=39;
	public static final int OP_ASS=40;
	public static final int OP_DIV=41;
	public static final int OP_DIVAS=42;
	public static final int OP_EQ=43;
	public static final int OP_GE=44;
	public static final int OP_GT=45;
	public static final int OP_LAND=46;
	public static final int OP_LE=47;
	public static final int OP_LOR=48;
	public static final int OP_LS=49;
	public static final int OP_LSAS=50;
	public static final int OP_LT=51;
	public static final int OP_MODAS=52;
	public static final int OP_MUL=53;
	public static final int OP_MULAS=54;
	public static final int OP_NE=55;
	public static final int OP_NOT=56;
	public static final int OP_OR=57;
	public static final int OP_RS=58;
	public static final int OP_RSAS=59;
	public static final int OP_SUB=60;
	public static final int OP_SUBAS=61;
	public static final int OP_SUBSUB=62;
	public static final int OP_XOR=63;
	public static final int OP_XORAS=64;
	public static final int PERIOD=65;
	public static final int PREPROCESSOR=66;
	public static final int RBRACE=67;
	public static final int RBRACK=68;
	public static final int RETURN_=69;
	public static final int RPAREN=70;
	public static final int SEMICOL=71;
	public static final int SHORT_TYPE=72;
	public static final int STRING=73;
	public static final int VOID_TYPE=74;
	public static final int WHILE_=75;
	public static final int WS=76;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


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
	       TextCode.add("\t pushq %rbp");
	       TextCode.add("\t movq %rsp,%rbp");
	       TextCode.add("\t pushq %rbx"); //callee saved registers.
	       TextCode.add("\t pushq %r12"); //callee saved registers.
	       TextCode.add("\t pushq %r13"); //callee saved registers.
	       TextCode.add("\t pushq %r14"); //callee saved registers.
	       TextCode.add("\t pushq %r15"); //callee saved registers.
	       TextCode.add("\t subq $8,%rsp\n"); // aligned 16-byte boundary.
	    }
	    
	    /*
	     * Output epilogue.
	     */
	    void epilogue()
	    {
	       /* handle epilogue */
	       
	       /* Follow x86 calling convention */
	       TextCode.add("\n\t addq $8,%rsp");
	       TextCode.add("\t popq %r15");
	       TextCode.add("\t popq %r14");
	       TextCode.add("\t popq %r13");
	       TextCode.add("\t popq %r12");
	       TextCode.add("\t popq %rbx");
	       TextCode.add("\t popq %rbp");
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



	// $ANTLR start "startstat"
	// myCompiler.g:118:1: startstat : declarations functions ;
	public final void startstat() throws RecognitionException {
		try {
			// myCompiler.g:119:5: ( declarations functions )
			// myCompiler.g:120:5: declarations functions
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
			    
			pushFollow(FOLLOW_declarations_in_startstat55);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_functions_in_startstat57);
			functions();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "startstat"



	// $ANTLR start "functions"
	// myCompiler.g:136:1: functions : ( function functions |);
	public final void functions() throws RecognitionException {
		try {
			// myCompiler.g:137:5: ( function functions |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR_TYPE||LA1_0==DOUBLE_TYPE||LA1_0==FLOAT_TYPE||LA1_0==INT_TYPE||(LA1_0 >= LONGLONG_TYPE && LA1_0 <= LONG_TYPE)||LA1_0==SHORT_TYPE||LA1_0==VOID_TYPE) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myCompiler.g:137:7: function functions
					{
					pushFollow(FOLLOW_function_in_functions75);
					function();
					state._fsp--;

					pushFollow(FOLLOW_functions_in_functions77);
					functions();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:139:5: 
					{
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
		}
	}
	// $ANTLR end "functions"



	// $ANTLR start "function"
	// myCompiler.g:141:1: function : type ID LPAREN RPAREN LBRACE l_declarations statements RBRACE ;
	public final void function() throws RecognitionException {
		Token ID1=null;

		try {
			// myCompiler.g:142:5: ( type ID LPAREN RPAREN LBRACE l_declarations statements RBRACE )
			// myCompiler.g:142:9: type ID LPAREN RPAREN LBRACE l_declarations statements RBRACE
			{
			pushFollow(FOLLOW_type_in_function108);
			type();
			state._fsp--;

			ID1=(Token)match(input,ID,FOLLOW_ID_in_function110); 
			match(input,LPAREN,FOLLOW_LPAREN_in_function112); 
			match(input,RPAREN,FOLLOW_RPAREN_in_function114); 
			match(input,LBRACE,FOLLOW_LBRACE_in_function124); 


			                if ( TRACEON ) System.out.println("function");
			                /* output function prologue */
			                prologue((ID1!=null?ID1.getText():null));
			            
			pushFollow(FOLLOW_l_declarations_in_function152);
			l_declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_function154);
			statements();
			state._fsp--;

			match(input,RBRACE,FOLLOW_RBRACE_in_function164); 

			                /* output function epilogue */	  
			                epilogue();
			            
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "declarations"
	// myCompiler.g:161:1: declarations : ( type ID SEMICOL declarations |);
	public final void declarations() throws RecognitionException {
		Token ID3=null;
		int type2 =0;

		try {
			// myCompiler.g:162:5: ( type ID SEMICOL declarations |)
			int alt2=2;
			switch ( input.LA(1) ) {
			case SHORT_TYPE:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INT_TYPE:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONG_TYPE:
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT_TYPE:
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE_TYPE:
				{
				int LA2_5 = input.LA(2);
				if ( (LA2_5==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONGLONG_TYPE:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR_TYPE:
				{
				int LA2_7 = input.LA(2);
				if ( (LA2_7==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID_TYPE:
				{
				int LA2_8 = input.LA(2);
				if ( (LA2_8==ID) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMICOL) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EOF:
				{
				alt2=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myCompiler.g:162:7: type ID SEMICOL declarations
					{
					pushFollow(FOLLOW_type_in_declarations196);
					type2=type();
					state._fsp--;

					ID3=(Token)match(input,ID,FOLLOW_ID_in_declarations198); 
					match(input,SEMICOL,FOLLOW_SEMICOL_in_declarations200); 
					pushFollow(FOLLOW_declarations_in_declarations202);
					declarations();
					state._fsp--;

					 
					        if ( TRACEON ) System.out.println("declarations : type ID SEMICOL declarations");

							/* code generation */
							
					        switch(type2) 
					        {
							    case 1: 
					                /* Type: short, size=> 2 bytes, alignment=> 2 byte boundary. */
							        DataCode.add("\t .common " + (ID3!=null?ID3.getText():null) + ",2,2");
									break;
					            case 2: 
					                /* Type: ineteger, size=> 4 bytes, alignment=> 4 byte boundary. */
							        DataCode.add("\t .common " + (ID3!=null?ID3.getText():null) + ",4,4");
									break;
					            case 3: 
					                /* Type: long long, size=> 8 bytes, alignment=> 8 byte boundary. */
							        DataCode.add("\t .common " + (ID3!=null?ID3.getText():null) + ",8,8");
									break;

					            case 4: 
					                /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
							        DataCode.add("\t .common " + (ID3!=null?ID3.getText():null) + ",4,4");
									break;
							    default:
							}
						  
					}
					break;
				case 2 :
					// myCompiler.g:191:5: 
					{
					    if ( TRACEON ) System.out.println("declarations : ");  
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
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "l_declarations"
	// myCompiler.g:195:1: l_declarations : ( type ID SEMICOL l_declarations |);
	public final void l_declarations() throws RecognitionException {
		Token ID5=null;
		int type4 =0;

		try {
			// myCompiler.g:196:5: ( type ID SEMICOL l_declarations |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CHAR_TYPE||LA3_0==DOUBLE_TYPE||LA3_0==FLOAT_TYPE||LA3_0==INT_TYPE||(LA3_0 >= LONGLONG_TYPE && LA3_0 <= LONG_TYPE)||LA3_0==SHORT_TYPE||LA3_0==VOID_TYPE) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= ID && LA3_0 <= IF_)||LA3_0==RBRACE||LA3_0==77) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myCompiler.g:197:5: type ID SEMICOL l_declarations
					{
					pushFollow(FOLLOW_type_in_l_declarations245);
					type4=type();
					state._fsp--;

					ID5=(Token)match(input,ID,FOLLOW_ID_in_l_declarations247); 
					match(input,SEMICOL,FOLLOW_SEMICOL_in_l_declarations249); 
					pushFollow(FOLLOW_l_declarations_in_l_declarations251);
					l_declarations();
					state._fsp--;


					        if( TRACEON ) System.out.println("l_declarations : type ID ';' l_declarations");
					        
							/* code generation */
							switch(type4) 
					        {
							    case 1: 
					                /* Type: short, size=> 2 bytes, alignment=> 2 byte boundary. */
							        DataCode.add("\t .common " + (ID5!=null?ID5.getText():null) + ",2,2");
									break;
					            case 2: 
					                /* Type: ineteger, size=> 4 bytes, alignment=> 4 byte boundary. */
							        DataCode.add("\t .common " + (ID5!=null?ID5.getText():null) + ",4,4");
									break;
					            case 3: 
					                /* Type: long long, size=> 8 bytes, alignment=> 8 byte boundary. */
							        DataCode.add("\t .common " + (ID5!=null?ID5.getText():null) + ",8,8");
									break;

					            case 4: 
					                /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
							        DataCode.add("\t .common " + (ID5!=null?ID5.getText():null) + ",4,4");
									break;
							    default:
							}
					    
					}
					break;
				case 2 :
					// myCompiler.g:225:5: 
					{
					   if( TRACEON ) System.out.println("l_declarations : ");         
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
		}
	}
	// $ANTLR end "l_declarations"



	// $ANTLR start "type"
	// myCompiler.g:229:1: type returns [int attr_type] : ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE );
	public final int type() throws RecognitionException {
		int attr_type = 0;


		try {
			// myCompiler.g:230:5: ( SHORT_TYPE | INT_TYPE | LONG_TYPE | FLOAT_TYPE | DOUBLE_TYPE | LONGLONG_TYPE | CHAR_TYPE | VOID_TYPE )
			int alt4=8;
			switch ( input.LA(1) ) {
			case SHORT_TYPE:
				{
				alt4=1;
				}
				break;
			case INT_TYPE:
				{
				alt4=2;
				}
				break;
			case LONG_TYPE:
				{
				alt4=3;
				}
				break;
			case FLOAT_TYPE:
				{
				alt4=4;
				}
				break;
			case DOUBLE_TYPE:
				{
				alt4=5;
				}
				break;
			case LONGLONG_TYPE:
				{
				alt4=6;
				}
				break;
			case CHAR_TYPE:
				{
				alt4=7;
				}
				break;
			case VOID_TYPE:
				{
				alt4=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myCompiler.g:230:9: SHORT_TYPE
					{
					match(input,SHORT_TYPE,FOLLOW_SHORT_TYPE_in_type294); 
					   if (TRACEON) System.out.println("type: SHORT") ; attr_type = 1 ;      
					}
					break;
				case 2 :
					// myCompiler.g:231:9: INT_TYPE
					{
					match(input,INT_TYPE,FOLLOW_INT_TYPE_in_type315); 
					   if (TRACEON) System.out.println("type: INT") ; attr_type = 2 ;        
					}
					break;
				case 3 :
					// myCompiler.g:232:9: LONG_TYPE
					{
					match(input,LONG_TYPE,FOLLOW_LONG_TYPE_in_type340); 
					   if (TRACEON) System.out.println("type: LONG") ; attr_type = 3 ;       
					}
					break;
				case 4 :
					// myCompiler.g:233:9: FLOAT_TYPE
					{
					match(input,FLOAT_TYPE,FOLLOW_FLOAT_TYPE_in_type363); 
					   if (TRACEON) System.out.println("type: FLOAT") ; attr_type = 4 ;      
					}
					break;
				case 5 :
					// myCompiler.g:234:9: DOUBLE_TYPE
					{
					match(input,DOUBLE_TYPE,FOLLOW_DOUBLE_TYPE_in_type384); 
					   if (TRACEON) System.out.println("type: DOUBLE") ; attr_type = 5 ;     
					}
					break;
				case 6 :
					// myCompiler.g:235:9: LONGLONG_TYPE
					{
					match(input,LONGLONG_TYPE,FOLLOW_LONGLONG_TYPE_in_type403); 
					   if (TRACEON) System.out.println("type: LONGLONG") ; attr_type = 6 ;   
					}
					break;
				case 7 :
					// myCompiler.g:236:9: CHAR_TYPE
					{
					match(input,CHAR_TYPE,FOLLOW_CHAR_TYPE_in_type418); 
					   if (TRACEON) System.out.println("type: CHAR") ; attr_type = 7 ;       
					}
					break;
				case 8 :
					// myCompiler.g:237:9: VOID_TYPE
					{
					match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type442); 
					   if (TRACEON) System.out.println("type: VOID") ; attr_type = 0 ;       
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
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myCompiler.g:240:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:240:11: ( statement statements |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= ID && LA5_0 <= IF_)||LA5_0==77) ) {
				alt5=1;
			}
			else if ( (LA5_0==RBRACE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myCompiler.g:240:13: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements458);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements460);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:242:5: 
					{
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
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// myCompiler.g:244:1: statement returns [int attr_type] : ( ID OP_ASS a= expr SEMICOL | IF_ LPAREN b= expr RPAREN ifthenstat | printstat );
	public final int statement() throws RecognitionException {
		int attr_type = 0;


		Token ID6=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			// myCompiler.g:245:5: ( ID OP_ASS a= expr SEMICOL | IF_ LPAREN b= expr RPAREN ifthenstat | printstat )
			int alt6=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt6=1;
				}
				break;
			case IF_:
				{
				alt6=2;
				}
				break;
			case 77:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// myCompiler.g:245:9: ID OP_ASS a= expr SEMICOL
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_statement491); 
					match(input,OP_ASS,FOLLOW_OP_ASS_in_statement493); 
					pushFollow(FOLLOW_expr_in_statement499);
					a=expr();
					state._fsp--;

					match(input,SEMICOL,FOLLOW_SEMICOL_in_statement501); 

					             if( TRACEON ) System.out.println("statement : ID OP_ASS a = expr SEMICOL ");
					            TextCode.add("\t movl " + "%" + reg_map.get((a!=null?((myCompilerParser.expr_return)a).reg_num:0)) + "," + (ID6!=null?ID6.getText():null) + "(%rip)");
					        
					}
					break;
				case 2 :
					// myCompiler.g:250:9: IF_ LPAREN b= expr RPAREN ifthenstat
					{
					match(input,IF_,FOLLOW_IF__in_statement521); 
					match(input,LPAREN,FOLLOW_LPAREN_in_statement523); 
					pushFollow(FOLLOW_expr_in_statement529);
					b=expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_statement531); 

					            if( TRACEON ) System.out.println("statement : IF_ LPAREN b = expr RPAREN");
					            String label = newLabel();
					            TextCode.add("\t cmpl " + "$0, " + "%" + reg_map.get((b!=null?((myCompilerParser.expr_return)b).reg_num:0)));
					            TextCode.add("\t je " + label);
					        
					pushFollow(FOLLOW_ifthenstat_in_statement552);
					ifthenstat();
					state._fsp--;


					            TextCode.add(label + ":");
					        
					}
					break;
				case 3 :
					// myCompiler.g:261:9: printstat
					{
					pushFollow(FOLLOW_printstat_in_statement573);
					printstat();
					state._fsp--;

					if( TRACEON ) System.out.println("statement : printstat");
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
		}
		return attr_type;
	}
	// $ANTLR end "statement"


	public static class expr_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "expr"
	// myCompiler.g:264:1: expr returns [int attr_type, int reg_num, String str] : a= multiply ( '+' b= multiply | '-' c= multiply )* ;
	public final myCompilerParser.expr_return expr() throws RecognitionException {
		myCompilerParser.expr_return retval = new myCompilerParser.expr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// myCompiler.g:265:2: (a= multiply ( '+' b= multiply | '-' c= multiply )* )
			// myCompiler.g:265:6: a= multiply ( '+' b= multiply | '-' c= multiply )*
			{
			pushFollow(FOLLOW_multiply_in_expr599);
			a=multiply();
			state._fsp--;


			            if( TRACEON ) System.out.println("expr : a = multiply");
			            retval.attr_type = (a!=null?((myCompilerParser.multiply_return)a).attr_type:0);
			            retval.reg_num = (a!=null?((myCompilerParser.multiply_return)a).reg_num:0);
			            retval.str = (a!=null?((myCompilerParser.multiply_return)a).str:null);
			        
			// myCompiler.g:272:9: ( '+' b= multiply | '-' c= multiply )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==OP_ADD) ) {
					alt7=1;
				}
				else if ( (LA7_0==OP_SUB) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:273:13: '+' b= multiply
					{
					match(input,OP_ADD,FOLLOW_OP_ADD_in_expr636); 
					pushFollow(FOLLOW_multiply_in_expr642);
					b=multiply();
					state._fsp--;

					   TextCode.add("\t addl " + "%" + reg_map.get((b!=null?((myCompilerParser.multiply_return)b).reg_num:0)) + ", %" + reg_map.get(retval.reg_num));     
					}
					break;
				case 2 :
					// myCompiler.g:275:13: '-' c= multiply
					{
					match(input,OP_SUB,FOLLOW_OP_SUB_in_expr670); 
					pushFollow(FOLLOW_multiply_in_expr676);
					c=multiply();
					state._fsp--;

					   TextCode.add("\t subl " + "%" + reg_map.get((c!=null?((myCompilerParser.multiply_return)c).reg_num:0)) + ", %" + reg_map.get(retval.reg_num));     
					}
					break;

				default :
					break loop7;
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
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class multiply_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "multiply"
	// myCompiler.g:281:1: multiply returns [int attr_type, int reg_num, String str] : a= signed ( '*' b= signed | '/' c= signed )* ;
	public final myCompilerParser.multiply_return multiply() throws RecognitionException {
		myCompilerParser.multiply_return retval = new myCompilerParser.multiply_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// myCompiler.g:282:5: (a= signed ( '*' b= signed | '/' c= signed )* )
			// myCompiler.g:282:9: a= signed ( '*' b= signed | '/' c= signed )*
			{
			pushFollow(FOLLOW_signed_in_multiply724);
			a=signed();
			state._fsp--;

			 
			            if( TRACEON ) System.out.println("multiply : a = signed");
			            retval.attr_type = (a!=null?((myCompilerParser.signed_return)a).attr_type:0);
			            retval.reg_num = (a!=null?((myCompilerParser.signed_return)a).reg_num:0);
			            retval.str = (a!=null?((myCompilerParser.signed_return)a).str:null);
			        
			// myCompiler.g:289:9: ( '*' b= signed | '/' c= signed )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==OP_MUL) ) {
					alt8=1;
				}
				else if ( (LA8_0==OP_DIV) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:290:13: '*' b= signed
					{
					match(input,OP_MUL,FOLLOW_OP_MUL_in_multiply760); 
					pushFollow(FOLLOW_signed_in_multiply766);
					b=signed();
					state._fsp--;

					 
					                TextCode.add("\t imul " + "%" + reg_map.get((b!=null?((myCompilerParser.signed_return)b).reg_num:0)) + ", %" + reg_map.get((a!=null?((myCompilerParser.signed_return)a).reg_num:0)));
					            
					}
					break;
				case 2 :
					// myCompiler.g:294:13: '/' c= signed
					{
					match(input,OP_DIV,FOLLOW_OP_DIV_in_multiply794); 
					pushFollow(FOLLOW_signed_in_multiply800);
					c=signed();
					state._fsp--;

					 
					                TextCode.add("\t movl " + "%" + reg_map.get((a!=null?((myCompilerParser.signed_return)a).reg_num:0)) + ", %eax");
					                TextCode.add("\t movl " + "$0" + ", %edx");
					                TextCode.add("\t idivl " + "%" + reg_map.get((c!=null?((myCompilerParser.signed_return)c).reg_num:0)));
					                TextCode.add("\t movl "  + "%eax" + ", %" + reg_map.get((a!=null?((myCompilerParser.signed_return)a).reg_num:0)));
					            
					}
					break;

				default :
					break loop8;
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
		}
		return retval;
	}
	// $ANTLR end "multiply"


	public static class signed_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "signed"
	// myCompiler.g:305:1: signed returns [int attr_type, int reg_num, String str] : ( atom | '-' atom );
	public final myCompilerParser.signed_return signed() throws RecognitionException {
		myCompilerParser.signed_return retval = new myCompilerParser.signed_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope atom7 =null;
		ParserRuleReturnScope atom8 =null;

		try {
			// myCompiler.g:306:2: ( atom | '-' atom )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==DEC_NUM||LA9_0==FLOAT_NUM||LA9_0==ID||LA9_0==LPAREN||LA9_0==STRING) ) {
				alt9=1;
			}
			else if ( (LA9_0==OP_SUB) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// myCompiler.g:306:6: atom
					{
					pushFollow(FOLLOW_atom_in_signed840);
					atom7=atom();
					state._fsp--;

					 
					            retval.attr_type = (atom7!=null?((myCompilerParser.atom_return)atom7).attr_type:0);
					            retval.reg_num = (atom7!=null?((myCompilerParser.atom_return)atom7).reg_num:0);
					            retval.str = (atom7!=null?((myCompilerParser.atom_return)atom7).str:null);
					        
					}
					break;
				case 2 :
					// myCompiler.g:312:6: '-' atom
					{
					match(input,OP_SUB,FOLLOW_OP_SUB_in_signed857); 
					pushFollow(FOLLOW_atom_in_signed859);
					atom8=atom();
					state._fsp--;


					            TextCode.add("\t negl " + "%" + reg_map.get((atom8!=null?((myCompilerParser.atom_return)atom8).reg_num:0)));
					            retval.attr_type = (atom8!=null?((myCompilerParser.atom_return)atom8).attr_type:0);
					            retval.reg_num = (atom8!=null?((myCompilerParser.atom_return)atom8).reg_num:0);
					            retval.str = (atom8!=null?((myCompilerParser.atom_return)atom8).str:null);
						    
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
		}
		return retval;
	}
	// $ANTLR end "signed"


	public static class atom_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "atom"
	// myCompiler.g:322:1: atom returns [int attr_type, int reg_num, String str] : ( DEC_NUM | FLOAT_NUM | STRING | ID | '(' expr ')' );
	public final myCompilerParser.atom_return atom() throws RecognitionException {
		myCompilerParser.atom_return retval = new myCompilerParser.atom_return();
		retval.start = input.LT(1);

		Token DEC_NUM9=null;
		Token FLOAT_NUM10=null;
		Token STRING11=null;
		Token ID12=null;
		ParserRuleReturnScope expr13 =null;

		try {
			// myCompiler.g:323:5: ( DEC_NUM | FLOAT_NUM | STRING | ID | '(' expr ')' )
			int alt10=5;
			switch ( input.LA(1) ) {
			case DEC_NUM:
				{
				alt10=1;
				}
				break;
			case FLOAT_NUM:
				{
				alt10=2;
				}
				break;
			case STRING:
				{
				alt10=3;
				}
				break;
			case ID:
				{
				alt10=4;
				}
				break;
			case LPAREN:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myCompiler.g:324:9: DEC_NUM
					{
					DEC_NUM9=(Token)match(input,DEC_NUM,FOLLOW_DEC_NUM_in_atom893); 
					 
					            retval.attr_type = 2;
					            retval.str = null;
					            retval.reg_num = reg.get();  /* get an register */
					            TextCode.add("\t movl " + "$" + (DEC_NUM9!=null?DEC_NUM9.getText():null) + ", %" + reg_map.get(retval.reg_num)); 
					        
					}
					break;
				case 2 :
					// myCompiler.g:331:9: FLOAT_NUM
					{
					FLOAT_NUM10=(Token)match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_atom913); 
					 
					            retval.attr_type = 4 ; 
					            retval.str = null;
					            retval.reg_num = reg.get();
					            TextCode.add("\t movl " + "$" + (FLOAT_NUM10!=null?FLOAT_NUM10.getText():null) + ", %" + reg_map.get(retval.reg_num));
					        
					}
					break;
				case 3 :
					// myCompiler.g:338:9: STRING
					{
					STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_atom937); 
					 retval.attr_type = 9; retval.str = (STRING11!=null?STRING11.getText():null); 
					}
					break;
				case 4 :
					// myCompiler.g:339:9: ID
					{
					ID12=(Token)match(input,ID,FOLLOW_ID_in_atom949); 

					            if(symbolTable.containsKey((ID12!=null?ID12.getText():null)))
					            {
					                retval.attr_type = symbolTable.get((ID12!=null?ID12.getText():null));
					            }
					            else
					            {
					                //System.out.println("Type Error on Line : " + ID12.getLine() + " : Unknown Idenifier " + (ID12!=null?ID12.getText():null) + ".");
					                retval.attr_type = -1;
					            }
					            retval.str = null;
					            retval.reg_num = reg.get(); /* get an register */
					            TextCode.add("\t movl " + (ID12!=null?ID12.getText():null) + "(%rip), %" + reg_map.get(retval.reg_num));
					        
					}
					break;
				case 5 :
					// myCompiler.g:354:6: '(' expr ')'
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atom966); 
					pushFollow(FOLLOW_expr_in_atom968);
					expr13=expr();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_atom970); 
					 retval.attr_type = (expr13!=null?((myCompilerParser.expr_return)expr13).attr_type:0); 
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
		}
		return retval;
	}
	// $ANTLR end "atom"



	// $ANTLR start "ifthenstat"
	// myCompiler.g:358:1: ifthenstat : ( statement | '{' statements '}' );
	public final void ifthenstat() throws RecognitionException {
		try {
			// myCompiler.g:359:2: ( statement | '{' statements '}' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( ((LA11_0 >= ID && LA11_0 <= IF_)||LA11_0==77) ) {
				alt11=1;
			}
			else if ( (LA11_0==LBRACE) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myCompiler.g:359:6: statement
					{
					pushFollow(FOLLOW_statement_in_ifthenstat990);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:360:6: '{' statements '}'
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_ifthenstat997); 
					pushFollow(FOLLOW_statements_in_ifthenstat999);
					statements();
					state._fsp--;

					match(input,RBRACE,FOLLOW_RBRACE_in_ifthenstat1001); 
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
		}
	}
	// $ANTLR end "ifthenstat"



	// $ANTLR start "printstat"
	// myCompiler.g:363:1: printstat : 'printf' LPAREN a= STRING ( COMMA ID )* RPAREN SEMICOL ;
	public final void printstat() throws RecognitionException {
		Token a=null;
		Token ID14=null;

		try {
			// myCompiler.g:364:5: ( 'printf' LPAREN a= STRING ( COMMA ID )* RPAREN SEMICOL )
			// myCompiler.g:364:9: 'printf' LPAREN a= STRING ( COMMA ID )* RPAREN SEMICOL
			{
			match(input,77,FOLLOW_77_in_printstat1017); 
			match(input,LPAREN,FOLLOW_LPAREN_in_printstat1019); 
			a=(Token)match(input,STRING,FOLLOW_STRING_in_printstat1023); 
			// myCompiler.g:364:34: ( COMMA ID )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myCompiler.g:364:35: COMMA ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_printstat1026); 
					ID14=(Token)match(input,ID,FOLLOW_ID_in_printstat1028); 
					}
					break;

				default :
					break loop12;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_printstat1033); 
			match(input,SEMICOL,FOLLOW_SEMICOL_in_printstat1035); 

			            String label = newLabel();
			            DataCode.add(label + ":");
			            DataCode.add("\t .string " + (a!=null?a.getText():null));


			        if ((ID14!=null?ID14.getText():null) != null)
			        {
			            TextCode.add("\t movl " + (ID14!=null?ID14.getText():null) + "(%rip), " + "%esi");
			            TextCode.add("\t movl " + "$" + label + ", " + "%edi");
			        }
			        TextCode.add("\t call printf");
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printstat"

	// Delegated rules



	public static final BitSet FOLLOW_declarations_in_startstat55 = new BitSet(new long[]{0x0000000620810080L,0x0000000000000500L});
	public static final BitSet FOLLOW_functions_in_startstat57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_functions75 = new BitSet(new long[]{0x0000000620810080L,0x0000000000000500L});
	public static final BitSet FOLLOW_functions_in_functions77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function108 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_function110 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_function112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_function114 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LBRACE_in_function124 = new BitSet(new long[]{0x000000062C810080L,0x0000000000002508L});
	public static final BitSet FOLLOW_l_declarations_in_function152 = new BitSet(new long[]{0x000000000C000000L,0x0000000000002008L});
	public static final BitSet FOLLOW_statements_in_function154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RBRACE_in_function164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations196 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_declarations198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOL_in_declarations200 = new BitSet(new long[]{0x0000000620810080L,0x0000000000000500L});
	public static final BitSet FOLLOW_declarations_in_declarations202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_l_declarations245 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_l_declarations247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOL_in_l_declarations249 = new BitSet(new long[]{0x0000000620810080L,0x0000000000000500L});
	public static final BitSet FOLLOW_l_declarations_in_l_declarations251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_TYPE_in_type294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_TYPE_in_type315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_TYPE_in_type340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_TYPE_in_type363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_TYPE_in_type384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONGLONG_TYPE_in_type403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_TYPE_in_type418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_TYPE_in_type442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements458 = new BitSet(new long[]{0x000000000C000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_statements_in_statements460 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_statement491 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_OP_ASS_in_statement493 = new BitSet(new long[]{0x1000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_expr_in_statement499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOL_in_statement501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF__in_statement521 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_statement523 = new BitSet(new long[]{0x1000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_expr_in_statement529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_statement531 = new BitSet(new long[]{0x000000004C000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_ifthenstat_in_statement552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printstat_in_statement573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_in_expr599 = new BitSet(new long[]{0x1000001000000002L});
	public static final BitSet FOLLOW_OP_ADD_in_expr636 = new BitSet(new long[]{0x1000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_multiply_in_expr642 = new BitSet(new long[]{0x1000001000000002L});
	public static final BitSet FOLLOW_OP_SUB_in_expr670 = new BitSet(new long[]{0x1000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_multiply_in_expr676 = new BitSet(new long[]{0x1000001000000002L});
	public static final BitSet FOLLOW_signed_in_multiply724 = new BitSet(new long[]{0x0020020000000002L});
	public static final BitSet FOLLOW_OP_MUL_in_multiply760 = new BitSet(new long[]{0x1000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_signed_in_multiply766 = new BitSet(new long[]{0x0020020000000002L});
	public static final BitSet FOLLOW_OP_DIV_in_multiply794 = new BitSet(new long[]{0x1000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_signed_in_multiply800 = new BitSet(new long[]{0x0020020000000002L});
	public static final BitSet FOLLOW_atom_in_signed840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OP_SUB_in_signed857 = new BitSet(new long[]{0x0000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_atom_in_signed859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_atom893 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_atom913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom966 = new BitSet(new long[]{0x1000000804082000L,0x0000000000000200L});
	public static final BitSet FOLLOW_expr_in_atom968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_atom970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_ifthenstat990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_ifthenstat997 = new BitSet(new long[]{0x000000000C000000L,0x0000000000002008L});
	public static final BitSet FOLLOW_statements_in_ifthenstat999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RBRACE_in_ifthenstat1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_77_in_printstat1017 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LPAREN_in_printstat1019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_STRING_in_printstat1023 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_printstat1026 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_printstat1028 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000040L});
	public static final BitSet FOLLOW_RPAREN_in_printstat1033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOL_in_printstat1035 = new BitSet(new long[]{0x0000000000000002L});
}
