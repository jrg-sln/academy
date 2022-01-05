#include<stdio.h>
#include"nodo.c"

struct nodo llenarNodo(){
	struct nodo ford;
	printf("Ingrese el nombre del vehIculo.\n");
	setbuf(stdin, NULL);
	gets(ford.nombre);
	printf("Ingrese el modelo del vehIculo.\n");
	setbuf(stdin, NULL);
	scanf("%d",&ford.modelo);
	
	return ford;
}
