#include<stdio.h>
#include<omp.h>
#define NUM_THREADS 4
static long num_steps = 100000;
double step;

int main(){
	int i, nthreads;
	double pi = 0.0, init_time, finish_time;
	step = 1.0 / (double)num_steps;
	init_time = omp_get_wtime();
	omp_set_num_threads(NUM_THREADS);
	#pragma omp parallel
	{
		int i, id, nthrds;
		double x, sum = 0.0;
		id = omp_get_thread_num();
		nthrds = omp_get_num_threads();
		if (id == 0)
			nthreads = nthrds;
		for (i=id ; i<num_steps ; i=i+nthrds){
			x = (i+0.5)*step;
			#pragma omp critical
			sum += 4.0/(1.0+x*x);
		}
		pi += sum*step;
	}
	finish_time = omp_get_wtime()-init_time;

	printf("PI = %f\n", pi);
	printf("Time = %f\n", finish_time);
}
