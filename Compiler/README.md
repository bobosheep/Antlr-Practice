# Project 4-Compiler
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
    


## Some Limit of my compiler
1.  Support global variable, local variable.
2.  Only have if statement.
3.  Can use printf to print a variable or not.
4.  Should have a space between function name and left paren


##  Reference
*   [ANTLR](https://www.antlr.org/)