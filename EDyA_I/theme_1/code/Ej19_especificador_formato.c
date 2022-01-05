#include<stdio.h>

int main(){
    long a = 1234567890;
    double be = 8.123456789;
    char ce = 'c';
    char de[] = "Hola";
    printf("\a%d\t%i\t%o\t%x\n", a,a,a,a);
    getchar();
    printf("\a%f\t%lf\t%e\t%g\n", be,be,be,be);
    getchar();
    printf("\a%c\t%d\t%i\t%o\t%x\n", ce,ce,ce,ce,ce);
    getchar();
    printf("\a%s", de);
}
