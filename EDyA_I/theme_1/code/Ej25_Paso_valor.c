#include<stdio.h>

void pasarValor(int);

int main(){
    int nums = 55, *ap;
    ap = &nums;

    printf("Pasar valor: %d\n", *ap);
    pasarValor(*ap);
    printf("Valor final: %d\n", *ap);

    return 0;
}

void pasarValor(int equis){
    printf("%d\n", equis);
    equis = 128;
    printf("%d\n", equis);
}
