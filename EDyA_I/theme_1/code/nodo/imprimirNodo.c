#include<stdio.h>

void imprimirNodo(struct nodo ente){
	printf("######## DATOS DEL VEHiCULO #########\n");
	printf("Nombre: %s\n", ente.nombre);
	printf("Modelo: %d\n", ente.modelo);
}
