#include<stdio.h>
#include<omp.h>

static long num_steps = 100000;
double step;

int main(){
	int i;
	double x, pi, sum = 0.0, init_time, finish_time;
	step = 1.0 / (double)num_steps;
	init_time = omp_get_wtime();
	for (i=0; i<num_steps; i++){
		x = (i+0.5)*step;
		sum = sum + 4.0/(1.0+x*x);
	}
	finish_time = omp_get_wtime()-init_time;
	pi = step * sum;
	printf("PI = %f\n", pi);
	printf("Time = %f\n", finish_time);
}
