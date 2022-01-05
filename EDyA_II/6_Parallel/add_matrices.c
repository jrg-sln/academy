#include<stdio.h>
#include<omp.h>
#define EME 300
#define ENE 300
#define N EME*ENE

void set_matrix(int *);
void add_matrix(int *, int *);
void print_matrix(int *);

int main(){
	int A[EME][ENE], B[EME][ENE], *a, *b;
	double start = omp_get_wtime();
	set_matrix(A);
	set_matrix(B);
	printf("MATRIX A\n");
	//print_matrix(A);
	printf("MATRIX B\n");
	//print_matrix(B);
	a = &A;
	b = &B;
	add_matrix(a, b);
	printf("MATRIX C = A+B\n");
	//print_matrix(A);
	printf("Execution time: %f\n", omp_get_wtime()-start);
	return 0;
}

void set_matrix(int *M){
	int i;
	#pragma omp parallel for
	for (i=0; i<N; i++){
		M[i] = i+1;
	}
}

void add_matrix(int *a, int *b){
	int i;
	#pragma omp parallel for
	for (i=0; i<N; i++){
		a[i] += b[i];
	}
}

void print_matrix(int *M){
	int i;
	for (i=0; i<N; i++){
		printf("%d\t", *(M+i));
	}
	printf("\n");
}
