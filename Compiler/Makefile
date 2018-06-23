init:	
	java -jar antlr-3.5.2-complete.jar
compile: myTestCompiler.java myCompiler.g
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g	
	javac -cp ./antlr-3.5.2-complete.jar myCompilerLexer.java myCompilerParser.java myTestCompiler.java register.java
execution1:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestCompiler testCode1.c > testCode1.s
	gcc testCode1.s -o testCode1Exe
execution2:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestCompiler testCode2.c > testCode2.s
	gcc testCode2.s -o testCode2Exe
execution3:	
	java -cp ./antlr-3.5.2-complete.jar:. myTestCompiler testCode3.c > testCode3.s
	gcc testCode3.s -o testCode3Exe
executeAll:
	java -cp ./antlr-3.5.2-complete.jar:. myTestCompiler testCode1.c > testCode1.s
	java -cp ./antlr-3.5.2-complete.jar:. myTestCompiler testCode2.c > testCode2.s
	java -cp ./antlr-3.5.2-complete.jar:. myTestCompiler testCode3.c > testCode3.s
	gcc testCode1.s -o testCode1Exe
	gcc testCode2.s -o testCode2Exe
	gcc testCode3.s -o testCode3Exe

clean:
	rm -rf *.class *.tokens .antlr/