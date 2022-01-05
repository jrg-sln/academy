#include<stdio.h>

int main () {
    short arr[5], *apArr;
    apArr = &arr[0];
    printf("%x\n",arr);
    printf("%x\n",apArr);
    return 0;
}
