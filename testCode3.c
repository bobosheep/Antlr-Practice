#include <stdio.h>
#include <stdlib.h>
/*  This is a comment   */
//  This is also a comment  

int main()
{
    short a = 1032;
    short b = 3210;
    int arr[105] = { 0 }, i;
    printf("Befor : a = %d, b = %d\n", a, b);
    a ^= b ^= a ^= b;
    printf("After  : a = %d, b = %d\n", a, b);

    while(a > b)
    {
        a++;
        b--;
        if(a == b)
            break;
        else 
            continue;
    }

    arr[0] = 1;
    arr[1] = 1;
    for(i = 2 ; i < 50 ; i++)
        arr[i] = arr[i - 1] + arr[i - 2];
    
    return 0;
}