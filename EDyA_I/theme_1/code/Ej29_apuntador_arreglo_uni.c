#include<stdio.h>

int main(){
    short nums[] = {55,44,33,22,11}, *ap, cont;
    ap = nums;

    for (cont = 0; cont < 5 ; cont++)
        printf("%x\n",(ap+cont));

    return 0;
}
