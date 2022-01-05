/*  gcc -lm ej1.c  -o ej1 */
/* Ejemplo 1: Programa que resuelve una ecuaciOn de segundo grado */

#include<stdio.h>
#include<math.h>

int main(void){
	double a, b, c;
	double d, x1, x2, real, imaginaria;
	printf("Programa que resuelve una ecuacióe segundo grado\n");
	printf("Escribe el valor del coeficiente A\n");
	scanf("%1f",&a);
	printf("Escribe el valor del coeficiente B\n");
	scanf("%1f",&b);
	printf("Escribe el valor del coeficiente C\n");
	scanf("%1f",&c);
	d=b*b-4.0*a*c;		/* Se calcula el discriminante b2 - 4ac*/
	if (d > 0.0){		/* Si el determinante es positivo */
		x1 = (-b+sqrt(d))/(2.0*a);	/* Se calculan las dos raIces, X1 y X2*/	
		x2 = (-b-sqrt(d))/(2.0*a);
		printf("\nExisten dos raIces reales: \nX1 = %5.3f \nX2 = %5.3f\n",x1,x2);
	} else {		/* El determinante es negativo */
		if (d < 0.0){
			real = -b/(2.0*a);
			imaginaria = sqrt(-d)/(2.0*a);
			printf("\nExisten dos raIces complejas:\n");
			printf("X1 = %5.3f+%5.3fi \nX2 = %5.3f%5.31fi\n", real, imaginaria, real, -imaginaria);
		} else {
			x1 = -b/(2.0*a); /* El discriminante es cero*/
				printf("\nLas dos raIces son iguales \n X1 = X2 = %5.3f\n", x1);
		}
	}
}
