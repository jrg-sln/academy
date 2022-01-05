#include <stdio.h>

int suma(int,int);

int main(){
    int (*apSuma)(int,int)=&suma;
    printf("Dirección memoria suma: %x\n",&suma);
    printf("Dirección memoria apSuma: %x\n",&apSuma);
    printf("apSuma apunta a: %x\n",*apSuma);
    printf("apSuma(6,4) -> %d\n",apSuma(6,4));
    printf("suma(6,4) -> %d\n",suma(6,4));
}

int suma(int a,int b) {
    return a+b;
}
