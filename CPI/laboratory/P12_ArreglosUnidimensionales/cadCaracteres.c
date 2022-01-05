#include<stdio.h>


main(){

	char palabra[20];

	int i=0;

	printf("Introduce una palabra: ");

	scanf("%s", palabra);

	printf("La palabra ingresada es: %s\n", palabra);

	for (i = 0 ; i < palabra[i] ; i++){

		printf("%c\n", palabra[i]);

	}

}