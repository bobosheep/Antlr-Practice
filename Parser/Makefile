init:	
	java -jar antlr-3.5.2-complete.jar
compile: myTestParser.java myParser.g
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myParser.g	
	javac -cp ./antlr-3.5.2-complete.jar myParserLexer.java myParserParser.java myTestParser.java
execution1:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestParser testCode1.c
execution2:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestParser testCode2.c
execution3:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestParser testCode3.c
executeAll:
	java -cp ./antlr-3.5.2-complete.jar:. myTestParser testCode1.c
	java -cp ./antlr-3.5.2-complete.jar:. myTestParser testCode2.c
	java -cp ./antlr-3.5.2-complete.jar:. myTestParser testCode3.c