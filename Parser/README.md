# Project 2-Parser
use ANTLR to develop a Parser for C code

## How to use 
*   Clone the reposity
    ```
    $ git clone https://github.com/bobosheep/AntlrPractice.git
    ```
*   If you don't have java, install it
    ```
    $ sudo apt install default-jre default-jdk
    ```
*   Compile the .g file and java files
    and you will see your dir appear some .class and .tokens
    ```
    $ make compile 
    ```
*   Then, you can execute it to test the C code(testCode1~3)
    *   excution1 for testCode1, excution2 for testCode2 and excution3 for testCode3
    ```
    $ make execution1
    $ make execution2
    $ make execution3 
    ```
    *   Or execute all test codes by executeAll
    ```
    $ make executeAll
    ```
    If you don't have any output, you done.
    you can modify the c code to see syntax error.

## Some Limit of my parser
1.  No support ++, --
2.  If you add a blank after 'else' condition, you will get error
3.  All of these condition, 'if', 'else if', 'else', 'while' and 'for', you should use '{' and '}' whether there is only one statement



##  Reference
*   [ANTLR](https://www.antlr.org/)