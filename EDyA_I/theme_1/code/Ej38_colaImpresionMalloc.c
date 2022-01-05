#include <stdio.h>
#include <stdlib.h>

enum estatus {imprimiendo, enPausa, enCola};

struct nodo{
    char nombreDoc[30];
    enum estatus estadoDoc;
    char *impresora;
    char *propietario;
    int paginas;
    int tamano;
};

struct nodo llenarDatosImpresion(char *, enum estatus, char *, char *, int, int);
void imprimirDatosImpresion(struct nodo);

int main (){
    struct nodo *colaImpresion;
    char nombre[30];
    short num, cont;
    printf("¿Cuántos elementos tiene se van a imprimir?\n");
    scanf("%d",&num);
    colaImpresion = (struct nodo *)malloc (num * sizeof(struct nodo));
    if (colaImpresion!=NULL) {
        for (cont=0 ; cont<num ; cont++){
            printf("Ingrese el nombre del documento %i.\n",cont+1);
            scanf("%s",nombre);
            *(colaImpresion+cont) = llenarDatosImpresion(nombre, enCola, "HP", "JAS", cont+5, cont+8);
        }
        printf("Vector insertado:\n");
        for (cont=0 ; cont<num ; cont++){
            imprimirDatosImpresion(*(colaImpresion+cont));
        }
        printf("\nLiberando espacio reservado dinAmicamente.\n");
        free(colaImpresion);
    }
    return 0;
}

struct nodo llenarDatosImpresion(char nombre[30], enum estatus estado, char *impresora, char *propietario, int numPags, int tamanio){
    struct nodo doc;
    short cont;
    for (cont = 0 ; cont<nombre[cont] ; cont++)
        doc.nombreDoc[cont] = nombre[cont];
    doc.estadoDoc = estado;
    doc.impresora = impresora;
    doc.propietario = propietario;
    doc.paginas = numPags;
    doc.tamano = tamanio;
    return doc;
}

void imprimirDatosImpresion(struct nodo doc){
    printf("\t[%s\t", doc.nombreDoc);
    switch(doc.estadoDoc){
        case imprimiendo:
            printf("IMPRIMIENDO\t"); break;
        case enPausa:
            printf("EN PAUSA\t"); break;
        case enCola:
            printf("EN COLA\t"); break;
    }
    printf("%s\t", doc.impresora);
    printf("%s\t", doc.propietario);
    printf("%d\t", doc.paginas);
    printf("%d]\n", doc.tamano);
}
