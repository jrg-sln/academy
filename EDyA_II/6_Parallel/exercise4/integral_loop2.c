#include<stdio.h>
#include<omp.h>

static long num_steps = 100000;
double step;

int main(){
	int i;
	double pi, sum = 0.0, init_time, finish_time;
	step = 1.0 / (double)num_steps;
	init_time = omp_get_wtime();
	
	#pragma omp parallel
	{
		double x;
		#pragma omp for reduction(+: sum)
		for (i=0; i<num_steps; i++){
			x = (i+0.5)*step;
			sum = sum + 4.0/(1.0+x*x);
		}
		pi = step * sum;
	}
	finish_time = omp_get_wtime()-init_time;
	printf("PI = %f\n", pi);
	printf("Time = %f\n", finish_time);
}
