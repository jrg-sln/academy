#include<stdio.h>

void pasarReferencia(int *);

int main(){
    int nums[] = {55,44,33,22,11}, *ap;
    ap = nums;

    printf("Pasar referencia: %d\n", *ap);
    pasarReferencia(ap);
    printf("Valor final: %d\n", *ap);

    return 0;
}

void pasarReferencia(int *equis){
    printf("%d\n", *equis);
    *equis = 128;
    printf("%d\n", *equis);
}
