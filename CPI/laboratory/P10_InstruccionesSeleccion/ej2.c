/* Ejercicio 2: Ejemplo con switch-case*/

#include<stdio.h>

main (void){
	int x;
	printf("\n1. OpciOn 1");
	printf("\n2. OpciOn 2");
	printf("\n3. OpciOn 3");
	printf("\n4. OpciOn 4");
	printf("\n\nEscribir el nUmero de la opciOn que desees: ");
	scanf("%d",&x);
	switch(x){
		case 1:
			printf("\nOpciOn 1\n");
			break;
		case 2:
			printf("\nOpciOn 2\n");
			break;
		case 3:
			printf("\nOpciOn 3\n");
			break;
		default:
			printf("\nEsa no es una opciOn vAlida\n");
	}
}		
