#include <stdio.h>

void ver(void *, int);

int main() {
    char a='b';
    int x=3;
    double y=4.5;
    char *cad="hola";
    ver(&a, 0);
    ver(&x, 2);
    ver(&y, 1);
    ver(cad, 3);
    getchar();
    return 0;
}

void ver( void *p, int d) {
    switch(d) {
        case 0:
            printf("%c\n",*(char *)p);
            break;
        case 1:
            printf("%d\n",*(double *)p);
            break;
        case 2:
            printf("%ld\n",*(int *)p);
            break;
        case 3:
            printf("%s\n",(char *)p);
            break;
        default:
            printf("Error ");
    }
}
