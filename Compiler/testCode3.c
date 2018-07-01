#include<stdio.h>

int hello;
void main ()
{
    int world;
    float helloworld;
    hello  = 10;
    world = 100;
    helloworld = world / hello; 
    world  = 0;
    if (helloworld)
        printf (" Helloworld %d!\n" , hello);
    if (world)
        printf (" %d\n", helloworld);

}