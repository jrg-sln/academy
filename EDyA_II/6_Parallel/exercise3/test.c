#include<stdio.h>
#include<omp.h>

static long num_steps = 100000;
double step;

int main(){
	int i;
	double x, sum = 0.0, pi;
	double  init_time, finish_time;
	//double x, sum = 0.0;
	step = 1.0 / (double)num_steps;
	init_time = omp_get_wtime();
	#pragma omp parallel
	{
		int start, end, id_thread;
		id_thread = omp_get_thread_num();
		start = (num_steps / omp_get_num_threads())*id_thread;
		end = start + (num_steps / omp_get_num_threads());
		printf("start=%d\tend=%d\n", start, end);
		for (i=start; i<end; i++){
			x = (i+0.5)*step;
			sum = sum + 4.0/(1.0+x*x);
		}
		#pragma omp critical
		pi += step * sum;
	}
	finish_time = omp_get_wtime()-init_time;
	printf("PI = %f\n", pi);
	printf("Time = %f\n", finish_time);
}
