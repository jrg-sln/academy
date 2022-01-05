#include<stdio.h>
#include<omp.h>
#define TAM 1000

int nthrds;

int work1(int id){
	int i, ac=0;
	for (i=0; i<TAM; i++)
		ac += (i+id);
	return ac;
}

int work2(int i,int A[]){
	int cont, res=0;
	for (cont=0; cont<nthrds; cont++){
		res += (i+cont);
		A[cont] = res;
	}
	return res;
}

int work3(int C[],int i){
	int cont, res=0;
	for (cont=0; cont<nthrds; cont++){
		res += (i+cont);
		C[cont] = res;
	}
	return res;
}

int work4(int id){
	int i, ac=0;
	for (i=0; i<TAM; i++)
		ac += (i*2+id);
	return ac;
}

int main(){
	int A[nthrds], B[TAM], C[TAM], id, i;
	nthrds = omp_get_num_threads();
	#pragma omp parallel shared(A, B, C) private(id)
	{
		id = omp_get_thread_num();
		printf("Thread %d executes work1\n", id);
		A[id] = work1(id);
		#pragma omp barrier
		#pragma omp for
		for (i=0; i<TAM; i++){
			C[i]=work2(i,A);
		}
		printf("Thread %d finish work3\n", id);
		#pragma omp for nowait
		for (i=0; i<TAM; i++){
			B[i]=work3(C,i);
		}
		printf("Thread %d finish work2\n", id);
		printf("Thread %d executes work4\n", id);
		A[id] = work4(id);
	}
	return 0;
}
