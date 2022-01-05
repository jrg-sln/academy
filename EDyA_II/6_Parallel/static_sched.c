#include <stdio.h>
#include <omp.h>

#define THREADS 4
#define N 8

int main ( ) {
	int i;
	#pragma omp parallel for schedule(static) num_threads(THREADS)
	for (i = 0; i < N; i++) {
    		sleep(i);
    		printf("Thread %d iteration %d.\n", omp_get_thread_num(), i);
  	}
	return 0;
}
