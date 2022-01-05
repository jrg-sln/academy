/* Ejemplo 2. Programa que realiza una operaciOn sobre dos nUmeros*/

#include<stdio.h>

int main (void){
	char c;
	int a, b;
	printf("Dame uno de los siguientes carActeres: +, -, * o /\n");
	scanf("%c",&c);
	printf("Dame dos nUmeros enteros separados por comas\n");
	scanf("%d, %d",&a, &b);
	switch(c){
		case '+':
			printf("Resultado de la suma %d\n", a+b);
			break;
		case '-':
			printf("Resultado de la resta %d\n", a-b);
			break;
		case '*':
			printf("Resultado de la multiplicaciOn %d\n", a*b);
			break;
		case '/':
			printf("Resultado de la divisiOn %d\n", a/b);
			break;
		default:
			printf("Error\n");
	}
}		
