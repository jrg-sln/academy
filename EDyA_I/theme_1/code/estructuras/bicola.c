#include <stdio.h>

int mostrar();
enum bool insertarP();
enum bool insertarU();
int obtenerU();
int obtenerP();

#define min 0
#define max 5
enum bool {false,true};

struct nodo {
	int dato;
} cola [max];

int prim=-1;
int ult=-1;

int main () {
	int opc;
	system("clear");
	while (1) {
		printf("############## COLA CIRCULAR ###############\n");
		printf("1) Insertar elemento por P.\n");
		printf("2) Insertar elemento por U.\n");
		printf("3) Obtener elemento por P.\n");
		printf("4) Obtener elemento por U.\n");
		printf("5) Salir.\n");
		scanf("%d",&opc);
		switch (opc){
			case 1:
				system("clear");
				enum bool resP = insertarP();
				if (resP == true){
					printf("Elemento insertado.\n");
				} else {
					printf("No se pudo insertar el elemento.\n");
				}
				mostrar();
				break;
			case 2:
				system("clear");
				enum bool resU = insertarU();
				if (resU == true){
					printf("Elemento insertado.\n");
				} else {
					printf("No se pudo insertar el elemento.\n");
				}
				mostrar();
				break;
			case 3:
				system("clear");
				int posP = obtenerP();
				if (posP != NULL) {
					printf("Se obtiene el valor %d.\n",posP);
				} else {
					printf("La cola estA vacIa.\n");
				}
				mostrar();
				break;
			case 4:
				system("clear");
				int posU = obtenerU();
				if (posU != NULL) {
					printf("Se obtiene el valor %d.\n",posU);
				} else {
					printf("La cola estA vacIa.\n");
				}
				mostrar();
				break;
			case 5:
				system("clear");
				mostrar();
				printf("AdiOs.\n");
				return 98;
		}
	}
	return 55;
}

enum bool insertarP(){
	if (prim == -1){
		prim = min;
		ult = min;
		printf("Insertar elemento: \n");
		scanf("%d",&cola[prim].dato);
		return true;
	} else {
		if ((ult == max-1 && prim == min) || (ult == prim-1)) {
			return false;
		} else {
			if (prim == min)
				prim = max-1;
			else
				prim -= 1;
			printf("Insertar elemento: \n");
			scanf("%d",&cola[prim].dato);
			return true;
		}
	}
}

enum bool insertarU(){
	if (prim == -1){
		prim = min;
		ult = min;
		printf("Insertar elemento: \n");
		scanf("%d",&cola[ult].dato);
		return true;
	} else {
		if ((ult == max-1 && prim == min) || (ult == prim-1)) {
			return false;
		} else {
			if (ult == max-1)
				ult = min;
			else
				ult += 1;
			printf("Insertar elemento: \n");
			scanf("%d",&cola[ult].dato);
			return true;
		}
	}
}

int obtenerP (){
	if (prim == -1) {
		return NULL;
	} else {
		if ( prim == ult) {
			int reg = cola[prim].dato;
			cola[prim].dato = 0;
			prim = -1;
			ult = -1;
			return reg;
		} else {
			int reg = cola[prim].dato;
			cola[prim].dato = 0;
			if ( prim == (max-1))
				prim = min;
			else
				prim += 1;
			return reg;
		}
	}
}

int obtenerU (){
	if (prim == -1) {
		return NULL;
	} else {
		if ( prim == ult) {
			int reg = cola[ult].dato;
			cola[ult].dato = 0;
			prim = -1;
			ult = -1;
			return reg;
		} else {
			int reg = cola[ult].dato;
			cola[ult].dato = 0;
			if ( ult == min)
				ult = max-1;
			else
				ult -= 1;
			return reg;
		}
	}
}

int mostrar () {
	int i;
	printf ("\nLos elementos de la cola son:\n\n");
	for (i=min ; i<max ; i++) {
		if (prim == i && ult == i)
			printf("p->\t|\t%d\t|\t<- u\n",cola[i].dato);
		else
			if (prim == i)
				printf("p->\t|\t%d\t|\n",cola[i].dato);
			else
				if (ult == i)
					printf("\t|\t%d\t|\t<- u\n",cola[i].dato);
				else
					printf("\t|\t%d\t|\n",cola[i].dato);
	}
	printf("\n");
	return 3;
}
