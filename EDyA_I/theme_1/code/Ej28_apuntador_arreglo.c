#include<stdio.h>

int main () {
    short arr[5] = {91,28,73,46,55};
    short *apArr;
    apArr = arr;
    printf("%i\n",*apArr);
    printf("%i\n",*(apArr+1));
    printf("%i\n",*(apArr+2));
    return 0;
}
