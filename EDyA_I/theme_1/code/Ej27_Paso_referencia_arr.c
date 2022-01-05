#include<stdio.h>

void pasarReferencia(int m[]);

int main(){
    int nums[] = {55,44,33,22,11}, cont;
    pasarReferencia(nums);
    for (cont=0 ; cont<5 ; cont++){
        printf("%i\n",nums[cont]);
    }

    return 0;
}

void pasarReferencia(int m[]){
    int cont;
    for (cont=0 ; cont<5 ; cont++){
        m[cont]=cont;
    }
}
