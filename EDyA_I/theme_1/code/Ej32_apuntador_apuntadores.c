#include <stdio.h>

char *nombre_mes(int);

int main(void){
    char *mes = NULL;
    int n; puts("Introduzca el n�mero del mes deseado");
    if (scanf("%d", &n) != 1){
        printf("Car�cter inv�lido\n");
        return 0;
    }
    mes = nombre_mes(n);
    printf("El mes seleccionado es:\n%s\n", mes);
    return 0;
}

/* M�todo que genera un arreglo de caracteres (apuntador de apuntadores */
char *nombre_mes(int numero){
    static char *mes[] = {
        "Mes invAlido",
        "Enero", "Febrero", "Marzo",
        "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre" };

    return (numero < 1 || numero > 12) ? mes[0] : mes[numero];
}
