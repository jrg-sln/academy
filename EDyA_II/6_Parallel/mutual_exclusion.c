#include<stdio.h>
#include<omp.h>

int big_job(int id){
	printf("Big job(%d)\n", id);
	int i = 0;
	while (i < (id+1)*10000)
		i++;
	return i;
}

float consume(int B){
	printf("consume(%d)\n", B);
	return 2*B;
}

int main(){
	int niters = 10;
	float res;
	#pragma omp parallel
	{
		float B;
		int i, id, nthrds;
		id = omp_get_thread_num();
		nthrds = omp_get_num_threads();
		for (i=id ; i<niters ; i+=nthrds){
			B = big_job(i);
			// mutual exclusion
			#pragma omp critical
			res += consume(B);
		}
		printf("res = %d\n", res);
	}
	return 0;
}
