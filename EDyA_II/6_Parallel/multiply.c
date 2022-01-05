#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define RA 4
#define CA 2
#define RB 2
#define CB 3

void multiply(int A[RA][CA], int B[RB][CB], int C[RA][CB]) {
        int i, j, k, suma;
        for (i=0; i<CB; i++){
                for (j=0; j<RA; j++){
			suma = 0;
                        for (k=0; k<CA; k++){
                                suma += A[j][k] * B[k][i];
			}
			C[j][i] = suma;
		}
	}
}

void fill_mat(int A[RA][CA], int B[RB][CB], int id){
        int r, c;
	srand (time(NULL));
	switch (id){
		case 1:
        		for (r=0; r<RA; r++)
                		for (c=0; c<CA; c++)
                        		A[r][c] = rand() % 99;
			break;
		case 2:
        		for (r=0; r<RB; r++)
                		for (c=0; c<CB; c++)
                        		B[r][c] = rand() % 99;
			break;
	}
}

void print_mat(int A[RA][CA], int B[RB][CB], int C[RA][CB], int id) {
	int r, c;
	switch(id){
		case 1:
			printf("Matrix A\n");
        		for (r=0; r<RA; r++) {
                		for (c=0; c<CA; c++) {
                        		printf("%d\t ", A[r][c]);
				}
				printf("\n");
			}
			break;
		case 2:
			printf("Matrix B\n");
        		for (r=0; r<RB; r++) {
                		for (c=0; c<CB; c++) {
                        		printf("%d\t ", B[r][c]);
				}
				printf("\n");
			}
			break;
		case 3:
			printf("Matrix C\n");
        		for (r=0; r<RA; r++) {
                		for (c=0; c<CB; c++) {
                        		printf("%d\t ", C[r][c]);
				}
				printf("\n");
			}
			break;
	}
}
int main(){
        int cont=0, r, c;
        int A[RA][CA], B[RB][CB], C[RA][CB];
	fill_mat(A, B, 1);
	fill_mat(A, B, 2);
	print_mat(A, B, C, 1);
	print_mat(A, B, C, 2);

	multiply(A, B, C);
	print_mat(A, B, C, 3);
	return 0;
}
