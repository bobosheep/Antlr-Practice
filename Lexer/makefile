init:	
	java -jar antlr-3.5.2-complete.jar
createTokens :	mytest.g
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool mytest.g
compile	:	myTestLexer.java
	javac -cp ./antlr-3.5.2-complete.jar myTestLexer.java mytest.java
execution1:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestLexer testCode1.c
execution2:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestLexer testCode2.c
execution3:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestLexer testCode3.c
executeAll:
	java -cp ./antlr-3.5.2-complete.jar:. myTestLexer testCode1.c
	java -cp ./antlr-3.5.2-complete.jar:. myTestLexer testCode2.c
	java -cp ./antlr-3.5.2-complete.jar:. myTestLexer testCode3.c
