#include "llenarNodo.c"
#include "imprimirNodo.c"

#define TAM 2

int main(){
	struct nodo arr[TAM];
	int contador;
	printf("Crear elementos del arreglo\n");
	for (contador=0; contador<TAM; contador++){
		arr[contador] = llenarNodo();
	}

	printf("\n\n\n\t\aImprimir datos del arreglo\n");
	for (contador=0; contador<TAM; contador++){
		imprimirNodo(arr[contador]);
	}

	return 0;
}
