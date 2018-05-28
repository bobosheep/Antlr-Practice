# Project 3-Checker
use ANTLR to develop a Checker for a subset of C code

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
    If you don't have any error output, you success.
    You can modify the c code to see syntax error.

## Some Limit of my checker
1.  No support ++, --
2.  If you add a blank after 'else' condition, you will get error
3.  All of these condition, 'if', 'else if', 'else', 'while' and 'for', you should use '{' and '}' whether there is only one statement
4.  No support +=, -=, *=, /=, ^=
5.  Decimal number will be integer by default and real number will be float by default, so there will be type error if two types are different. 



##  Reference
*   [ANTLR](https://www.antlr.org/)