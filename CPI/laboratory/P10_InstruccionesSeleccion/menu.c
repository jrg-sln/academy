/* Ejemplo 3. Programa que muestra un menU y, segUn la opciOn seleccionada, realiza el cAlculo correspondiente*/

#include<stdio.h>
#include<math.h>

int main (void){
	int x;
	double num;
	printf("\n 1. El triple");
	printf("\n 2. El cuadrado");
	printf("\n 3. Logaritmo Natural");
	printf("\n 4. Logaritmo decimal");
	printf("\n 5. Seno");
	printf("\n 6. Coseno");
	printf("\n\nEscribir el nUmero de la opciOn que desee: ");
	scanf("%d",&x);
	printf("\n\nEscribir el nUmero: ");
	scanf("%lf", &num);
	switch(x){
		case 1:
			printf("\nEl triple de %lf es %lf\n",num, 3*num );
			break;
		case 2:
			printf("\nEl cuadrado de %lf es %lf\n",num, num*num);
			break;
		case 3:
			printf("\nEl logaritmo natural de %lf es %lf\n",num, log(num));
			break;
		case 4:
			printf("\nEl logaritmo decimal de %lf es %lf\n",num, log10(num));
			break;
		case 5:
			printf("\nEl seno de %lf es %lf\n",num, sin(num));
			break;
		case 6:
			printf("\nEl coseno de %lf es %lf\n",num, cos(num));
			break;
		default:
			printf("\nEsto no es opciOn\n");
	}
}		
