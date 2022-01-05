#include<stdio.h>

main () {
	int a = 5;
	int b = 8;
	int c = 0;
	c = (a<b) ? (b-a) : (a-b);
	printf("El valor de la cadena es: %d", c);
}
