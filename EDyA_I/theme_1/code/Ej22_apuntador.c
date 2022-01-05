#include <stdio.h>

int main(){
    char c = 'x';
    char *ap;
    ap = &c;
    printf("&c = %x\n", &c);
    printf("ap -> %x\n", ap);
    printf("&ap = %x\n", &ap);
    return 0;
}
