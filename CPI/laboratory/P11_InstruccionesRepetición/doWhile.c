#include<stdio.h>

main(){
	printf("SENTENCIA DE CONTROL\n");
	printf("  DO-WHILE (UNTIL)\n");
	char a;
	do{
		printf("Para ingresar presiona la letra 's'\n");
		scanf("%c",&a);
	}while ( a != 's' );
	printf("Bienvenido\n");
}
