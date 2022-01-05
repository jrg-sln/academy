#include<stdio.h>
#include<omp.h>

int main(){
	int id;
	#pragma omp parallel
	{
		#pragma omp single
		{
			id = omp_get_thread_num();
			printf("Single block thread %d.\n", id);
		}

		id = omp_get_thread_num();
		printf("Parallel block thread %d.\n", id);
		
	}
}
