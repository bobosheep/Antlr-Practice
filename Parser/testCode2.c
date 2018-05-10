#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void doNothing()
{
    int a, b;
    if(a >= b)
    {
        a -= b;
    }
    else
    {
        b += a;
    }

    return ;
}

int main()
{
    float r = 5;
    double area = PI * r * r;
    long long perimeter = 0.5 * PI * r;

    doNothing();

    return 0;
}