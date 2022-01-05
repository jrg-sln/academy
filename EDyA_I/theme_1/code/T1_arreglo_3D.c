#include<stdio.h>

int main(){
    short indice, *ap;
    short eme, ene, ele, renglon, columna, plano;

    eme = 4;
    ene = 5;
    ele = 3;
    printf("Matriz de dimensiones %dx%dx%d.\n", eme, ene, ele);

    renglon = 3;
    columna = 1;
    plano = 2;
    printf("Se busca el elemento [%d,%d,%d].\n", renglon,columna,plano);

    short arreglo3D[eme][ene][ele];
    ap = arreglo3D;

    for (indice=0 ; indice<eme*ene*ele ; indice++)
        *(ap+indice) = rand()%100;

    for (indice = 0; indice<eme*ene*ele ; indice++){
        if ((indice%ene)==0)
            printf("\n");
        if ((indice%(ene*eme))==0)
            printf("\n");

        printf("%i:%i\t",indice, *(ap+indice));
    }
    printf("\n");

    printf("El elemento seleccionado es: %d\n", *(ap+(((renglon*ene)+columna)+(eme*ene*plano))));

    return 0;
}
