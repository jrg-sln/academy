#include<stdio.h>

void imp_rev(char s[]) {
	int t;
	for( t=strlen(s)-1; t>=0; t--)
		printf("%c",s[t]);
	printf("\n");
}

main() {
	char nombre[]="Facultad";
	imp_rev(nombre);
} 

