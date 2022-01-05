#include<stdio.h>

int main(){
	int eme=2, ene=3, ele=4, i, j, k, *ap;
	int arr[eme][ene][ele];
	ap=arr;

	int cont=1;
	for (i=0;i<eme*ene*ele;i++){
		*(ap+i)=cont++;
	}

	printf("Imprime matriz.\n");
	for (k=0;k<ele;k++){
		for (i=0;i<eme;i++){
			for (j=0;j<ene;j++){
				printf("%d\t",arr[i][j][k]);
			}
			printf("\n");
		}
		printf("\n");
		printf("\n");
	}

	printf("\n");
	i=0;
	j=ene-1;
	k=ele-1;
	printf("\nEl elemento en la posiciOn [%d,%d,%d] es: %d\n",i,j,k,*(ap+((i*ene+j)*ele+k)));
}
