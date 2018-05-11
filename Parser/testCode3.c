#include <stdio.h>
#include <stdlib.h>
/*  This is a comment   */
//  This is also a comment  

int main()
{
    short a = 1032;
    short b = 3210;
    a ^= b ^= a ^= b;

    while(a > b)
    {
        a += 1;
        b -= 1;
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