#include<stdio.h>
#include<omp.h>

int main(){
	// disable dynamic adjustment of number of threads
	omp_set_dynamic(0);
	int procs = omp_get_num_procs();
	printf("Procs: %d\n", procs);
	printf("Max threads: %d\n", omp_get_max_threads());
	omp_set_num_threads(2);
	printf("In parallel: %d\n", omp_in_parallel());
	#pragma omp parallel
	{
		int threads = omp_get_num_threads();
		printf("Threads: %d\n", threads);
		int id = omp_get_thread_num();
		printf("ID: %d\n", id);
		printf("In paralllel: %d\n", omp_in_parallel());
	}
	return 0;
}
