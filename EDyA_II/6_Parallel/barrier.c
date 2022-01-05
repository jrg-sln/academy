#include<stdio.h>
#include<omp.h>
#define NUM_THREADS 4

int big_cal1(int id){
	printf("Big cal 1, id=%d\n", id);
	int i = 0;
	while (i < (id+1)*10000)
		i++;
	return i;
}

int big_cal2(int id){
	printf("Big cal 2, id=%d\n", id);
	int i = 0;
	while (i < (id+1)*10000)
		i++;
	return i;
}

int main(){
	omp_set_num_threads(NUM_THREADS);
	int A[NUM_THREADS], B[NUM_THREADS], id;
	#pragma omp parallel
	{
		id = omp_get_thread_num();
		A[id] = big_cal1(id);
		#pragma omp barrier
		B[id] = big_cal2(id);
	}
	return 0;
}
