#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define PI 3.14159

void doNothing()
{
    int a, b;
    if(a || b)
        printf("Yes!");
    else  printf("No!");

    return ;
}

int main()
{
    float r = 5;
    double area = PI * r * r;
    long long perimeter = 0.5 * PI * r;
    printf("circle area = %.3f", area);
    printf("parimeter = %lld", perimeter);

    doNothing();

    return 0;
}