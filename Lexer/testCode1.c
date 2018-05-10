#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, i;
    char c;
    a = b = 10;
    c = 'h';
    printf("a = b = %d, c = %c", a, c);
    while(a == b)
    {   
        i *= a;
        a += i;
    }

    for( i = 0 ; i < 10 ; i++)
    {
        b <<= i;
    }

    if (a != b)
    {
        printf("a != b\n");
    }
    else 
    {
        printf("a == b\n");
    }
    return 0;
}