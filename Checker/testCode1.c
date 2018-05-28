#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a = 10;
    int b = 10;
    int i;

    a=b=10;

    while(a == b)
    {   
        i = i * a;
        a = a + i;
    }

    return 0;
}