#include<stdio.h>

void moverMatriz(int mat[3][3], int nMat[3][3]){
	int j = 0, i = 0, a = 2, b = 0;
	for (i = 0 ; i < 3 ; i++){
		b=2;
		for (j = 0 ; j < 3; j++){
			nMat[a][b] = mat[i][j];
			b = b - 1;
		}
		a = a - 1;
	}
}

int main(){
	int matriz[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
	int nuevaMatriz[3][3], i, j;
	moverMatriz(matriz, nuevaMatriz);
	for (i=0 ; i<3 ; i++){
		for (j=0 ; j<3 ; j++){
			printf("%d, ",nuevaMatriz[i][j]);
		}
		printf("\n");
	}
	return 42;
}
