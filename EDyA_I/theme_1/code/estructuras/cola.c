#include <stdio.h>

int mostrar();
enum bool insertar();
int obtener();

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
		printf("############## COLA ###############\n");
		printf("1) Insertar elemento.\n");
		printf("2) Obtener elemento.\n");
		printf("3) Salir.\n");
		scanf("%d",&opc);
		switch (opc){
			case 1:
				system("clear");
				enum bool res = insertar();
				if (res == true){
					printf("Elemento insertado.\n");
				} else {
					printf("No se pudo insertar el elemento.\n");
				}
				mostrar();
				break;
			case 2:
				system("clear");
				int pos = obtener();
				if (pos != NULL) {
					printf("Se obtiene el valor %d.\n",pos);
				} else {
					printf("La cola estA vacIa.\n");
				}
				mostrar();
				break;
			case 3:
				system("clear");
				mostrar();
				printf("AdiOs.\n");
				return 98;
		}
	}
	return 55;
}

enum bool insertar(){
	if (prim == -1){
		prim = min;
		ult = min;
		printf("Insertar elemento: \n");
		scanf("%d",&cola[ult].dato);
		return true;
	} else {
		if (prim == max-1 || ult == max-1) {
			return false;
		} else {
			ult+=1;
			printf("Insertar elemento: \n");
			scanf("%d",&cola[ult].dato);
			return true;
		}
	}
}

int obtener (){
	if (prim == -1) {
		return NULL;
	} else {
		if ( prim == ult) {
			int reg = cola[ult].dato;
			prim = -1;
			ult = -1;
			return reg;
		} else {
			int reg = cola[prim].dato;
			prim += 1;
			return reg;
		}
	}
}

int mostrar () {
	int i;
	printf ("\nLos elementos de la cola son:\n\n");
	for (i=min ; i<max ; i++){
		if (prim <= i && i <= ult ){
			if (prim == i && ult == i)
				printf("p->\t| %d |\t<- u\n",cola[i].dato);
			else
				if (prim == i)
					printf("p->\t| %d |\n",cola[i].dato);
				else
					if (ult == i)
						printf("\t| %d |\t<- u\n",cola[i].dato);
					else
						printf("\t| %d |\n",cola[i].dato);
		} else {
			printf("\t|   |\n");
		}
	}
	printf("\n");
	return 3;
}
