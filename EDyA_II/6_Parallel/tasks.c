#include <stdio.h>
#include <omp.h>
#define NUM 10

void do_it(){
	int id = omp_get_thread_num();
	int cont = 0;
	printf("%d\n",id);
	while (cont < NUM){
		cont++;
	}
}

void end_it(){
	int id = omp_get_thread_num();
	int cont = 0;
	printf("Single: %d\n",id);
	while (cont < NUM){
		printf("%d\t", cont++);
	}
	printf("\n");
}

int main(){
	#pragma omp parallel
	{
		#pragma omp task
		do_it();
		#pragma omp barrier
		#pragma omp single
		{
			#pragma omp task
			end_it();
		}
	}
	return 0;
}
