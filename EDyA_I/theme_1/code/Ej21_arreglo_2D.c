#include<stdio.h>

int main(){
    short renglon, columna;
    short nums[4][3] = {{99,88,77},{66,55,44},{33,22,11},{999,555,111}};
    printf("Arreglo bidimensional\n");

    for (renglon = 0; renglon < 4 ; renglon++){
        for (columna = 0; columna < 3 ; columna++){
            printf("%x\t",&nums[renglon][columna]);
        }
        printf("\n");
    }

    return 0;
}
