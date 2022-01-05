#include<stdio.h>
#include<omp.h>
#define RA 4
#define CA 2
#define RB 2
#define CB 3

void init_matrix(int *M, int init, int reng, int col){
	int i;
	#pragma omp parallel for
	for (i=0; i<reng*col; i++){
		if (init == 0){
			*(M+i) = 0;
		} else {
			*(M+i) = i+1;
		}
	}
}

void print_matrix(int *M, int reng, int col){
	int i;
	for (i=0; i<reng*col; i++){
		if (i%col == 0)
			printf("\n");
		printf("%d\t", *(M+i));
	}
	printf("\n");
}

void multiply(int a[RA][CA], int b[RB][CB], int c[RA][CB]) {
    int i, j, k, suma;
	#pragma omp parallel for private(i, j, k) collapse(3)
    for (i=0; i<CB; i++){
        for (j=0; j<RA; j++){
            suma = 0;
            for (k=0; k<CA; k++){
                suma += A[j][k] * B[k][i];
        }
        C[j][i] = suma;
    }
}

int main(){
	int A[RA][CA], B[RB][CB], C[RA][CB], *a, *b, *c, i;
	double start = omp_get_wtime();
	init_matrix(A, 1, RA, CA);
	init_matrix(B, 1, RB, CB);
	init_matrix(C, 0, RA, CB);
	a = &A;
	b = &B;
	c = &C;
	if (CA==RB)
		multiply(A, B, C);
	printf("Execution time: %f\n", omp_get_wtime()-start);
	printf("MATRIX A\n");
	print_matrix(A, RA, CA);
	printf("MATRIX B\n");
	print_matrix(B, RB, CB);
	printf("MATRIX C = A*B\n");
	print_matrix(C, RA, CB);
	return 0;
}

