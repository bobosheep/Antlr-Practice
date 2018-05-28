#include <stdio.h>
#include <stdlib.h>
/*  This is a comment   */
//  This is also a comment  

int main()
{
    short a = 1032;
    int b = 3210;
    char c = 'C';

    while(a > b)
    {
        a = a + 1;
        b = b - 1;
        if(a == b)
        {
            break;
        }
        else
        {
            continue;
        }
    }
    
    return 0;
}