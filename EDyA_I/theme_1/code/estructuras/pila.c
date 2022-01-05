#include<stdio.h>

int mostrar();
enum bool push();
int pop();

#define max 4
#define min 0
enum bool {false, true};

struct nodo {
	int num;
}pila[max];

int TOPE = -1;

int main(){
	int op = 0;
	system("clear");
	while (1){
		printf("\n##########################################\n");
		printf("################## PILA ##################\n");
		printf("##########################################\n");
		printf("Ingresa el nUmero de la acciOn a realizar:\n");
		printf("1) Pop\n");
		printf("2) Push\n");
		printf("3) Salir\n");
		scanf("%d",&op);
		switch (op){
			case 1:
				system("clear");
				int pos = pop();
				if (pos != -1)
					printf("El valor obtenido de la pila es: %d\n",pila[pos].num);
				mostrar();
				break;
			case 2:
				system("clear");
				enum bool res = push();
				if (res == true) {
					printf("Elmento insertado\n");
				} else {
					printf("Pila llena\n");
				}
				mostrar();
				break;
			case 3:
				system("clear");
				printf("AdiOs!\n");
				return 0;
			default:
				system("clear");
				printf("OpciOn no vAlida!\n");
		}
	}
}

int pop(){
	if (TOPE == -1){
		printf("La pila estA vacIa\n");
		return NULL;
	} else {
		TOPE -= 1;
		return TOPE+1;
	}
}

enum bool push(){
	if (TOPE == -1){
		TOPE = min;
		printf("Ingrese el id:");
		scanf("%d",&pila[TOPE].num);
		return true;
	} else {
		if (TOPE == max-1) {
			return false;
		} else {
			TOPE++;
			printf("Ingrese el id:");
			scanf("%d",&pila[TOPE].num);
			return true;
		}
	}
	return false;
}

int mostrar(){
	int cont;
	printf("\n\tLos elementos de la pila son:\n\n");
	for (cont=max-1 ; cont>=0 ; cont--){
		if (cont <= TOPE){
			printf("\t|X|%d\n",pila[cont].num);
		} else {
			printf("\t| |\n");
		}
	}
	return 0;
}
