#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,i;
    a=b=10;

    while(a == b)
    {   
        i *= a;
        a += i;
    }

    return 0;
}