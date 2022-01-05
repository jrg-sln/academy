#include <stdio.h>
#include <omp.h>
#include <stdlib.h>

int N = 20000;
double *A;

void fill_rand(){
	int i;
	for (i=0; i<N; i++)
		*(A+i) = drand48();
}

double sum_array(){
	int i;
	double res = 0.0;
	for (i=0; i<N; i++)
		res += *(A+i);
	return res;
}

int main(){
	double sum, runtime;
	int flag = 0, tmp_flag;
	A = (double *) malloc(N*sizeof(double));
	runtime = omp_get_wtime();
	#pragma omp parallel sections num_threads(2)
	{
		#pragma omp section
		{
			fill_rand();
			#pragma omp flush
			#pragma omp atomic write
			flag = 1;
			#pragma omp flush(flag)
		}
		#pragma omp section 
		{
			while (1) {
				#pragma omp flush(flag)
				#pragma omp atomic read
				tmp_flag = flag;
				if (tmp_flag == 1)
					break;
			}
			#pragma omp flush
			sum = sum_array();
		}
	}
	runtime = omp_get_wtime()-runtime;
	printf("Sum = %lf\nRuntime = %lf\n", sum, runtime);
	return 0;
}
