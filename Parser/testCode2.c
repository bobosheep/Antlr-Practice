#include <stdio.h>
#include <stdlib.h>
#include <math.h>

//comment comment

void doSomething(long long perimeter)
{
    int i = 50, something;
    if(perimeter >= 50)
    {
        something = 0;
        while(i > 50)
        {
            something += i;
            i -= 1;
        }
    }
    else
    {
        something = 0;
        while(i > 50)
        {
            something -= i;
            i -= 1;
        }
    }

    return ;
}

int main()
{
    float r = 5, PI = 3.14;

    double area = PI * r * r;
    long long perimeter = 0.5 * PI * r;

    doNothing(perimeter);

    return 0;
}