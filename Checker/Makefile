init:	
	java -jar antlr-3.5.2-complete.jar
compile: myTestChecker.java myChecker.g
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myChecker.g	
	javac -cp ./antlr-3.5.2-complete.jar:. myTestChecker.java
execution1:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestChecker testCode1.c
execution2:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestChecker testCode2.c
execution3:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestChecker testCode3.c
executeAll:
	java -cp ./antlr-3.5.2-complete.jar:. myTestChecker testCode1.c
	java -cp ./antlr-3.5.2-complete.jar:. myTestChecker testCode2.c
	java -cp ./antlr-3.5.2-complete.jar:. myTestChecker testCode3.c