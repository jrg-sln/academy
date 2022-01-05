#include <stdio.h>
#include <stdlib.h>

enum bool {falso, verdadero};

enum bool insertar();
struct nodo *borrar();
int mostrar();

struct nodo {
	char nombre[20];
	struct nodo *ap;
};

struct nodo *primero = NULL;
struct nodo *ultimo = NULL;
struct nodo *lista = NULL;
int numElem = 0;
int main(){
	system("clear");
	int opc = 0;
	enum bool res;
	while (1) {
		printf("############ LISTA SIMPLEMENTE LIGADA ############\n");
		printf("1. Insertar elemento.\n");
		printf("2. Borrar elemento.\n");
		printf("3. Salir.\n");
		scanf("%d",&opc);
		switch (opc){
			case 1:
				system("clear");
				res = insertar();
				if (res == falso)
					printf("El elemento no se pudo insertar.\n");
				else
					printf("Elemento insertado correctamente.\n");
				mostrar();
				break;
			case 2:
				system("clear");
				struct nodo *reg = borrar();
				if (reg == NULL)
					printf("El elemento no se pudo borrar.\n");
				else
					printf("Elemento borrado correctamente.\n");
				mostrar();
				break;
			case 3:
				system("clear");
				printf("AdiOs!!\n");
				if(lista != NULL)
					free(lista);
				mostrar();
				return 84;
		}
	}
}

enum bool insertar(){
	if (primero==NULL){
		lista = (struct nodo *)realloc(lista,1*sizeof(struct nodo));
		if (lista!=NULL){
			printf("Inserte el nombre del elemento:");
			setbuf(stdin,NULL);
			scanf("%s",lista->nombre);
			primero = lista;
			lista->ap=primero;
			numElem++;
			return verdadero;
		} else {
			return falso;
		}
	} else {
		struct nodo *lista2 = (struct nodo *)realloc(lista,1*sizeof(struct nodo));
		if (lista2!=NULL){
			printf("Inserte el nombre del elemento:");
			setbuf(stdin,NULL);
			scanf("%s",(lista+numElem)->nombre);
			(lista+numElem)->ap=primero;
			(lista+(numElem-1))->ap=(lista+numElem);
			numElem++;
			return verdadero;
		} else {
			return falso;
		}
	}
	return falso;
}

struct nodo *borrar(){
	if (primero == NULL){
		return NULL;
	} else {
		if (numElem == 1){
			printf("Un solo elemento\n");
			numElem -= 1;
			struct nodo *tmp = (lista+numElem);
			free(lista);
			lista = NULL;
			primero = NULL;
			return tmp;
		} else {
			printf("Varios elementos\n");
			numElem--;
			struct nodo *tmp = (lista+numElem);
			(lista+(numElem-1))->ap = primero;
			return tmp;
		}
	}
	return NULL;
}

int mostrar(){
	if (lista == NULL){
		printf("La lista estA vacIa.\n");
		printf("primero ->");
		printf("primero\n");
	} else {
		int i=0;
		printf("Los elementos de la lista son:\n\n");
		printf("primero ->");
		for (; i<numElem ;i++) {
			printf("\t| %s | ->",(lista+i)->nombre);
		}
		printf("primero\n");
	}
	return 5;
}
