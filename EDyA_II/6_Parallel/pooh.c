#include<stdio.h>
#include<omp.h>


void pooh(int id, double A[]){
}

int main() {
	double A[1000];
	omp_set_num_threads(4);
	#pragma omp parallel
	{
		int ID = omp_get_thread_num();
		printf("%d\n", ID);
		pooh(ID, A);
	}
	printf("All done!\n");
	return 0;
}
