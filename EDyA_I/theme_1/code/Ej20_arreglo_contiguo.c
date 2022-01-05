#include<stdio.h>

int main(){
    short nums[] = {5,4,3,2,1}, cont;

    for (cont = 0; cont < 5 ; cont++)
        printf("%x\n",&nums[cont]);

    return 0;
}
