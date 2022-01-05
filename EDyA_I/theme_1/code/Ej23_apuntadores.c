#include<stdio.h>

int main () {
    short a = 5, b = 10;
    short *apEnt;
    apEnt = &a;
    printf("&a = %x\n", &a);
    printf("apEnt -> %x\n", apEnt);
    b = *apEnt; // b = 5
    printf("b = %d\n", b);
    b = *apEnt+1; // b = 6
    printf("b = %d\n", b);
    *apEnt = 0; // a = 0
    printf("a = %d\n", a);
    return 34;
}
