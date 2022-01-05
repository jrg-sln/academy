#include<stdio.h>
#include<omp.h>

int main() {
	int ID = omp_get_thread_num();
	printf("ID main : %d\n", ID);
	#pragma omp parallel
	{
		ID = omp_get_thread_num();
		printf("Hello(%d)", ID);
		printf("world!!(%d)\n", ID);
	}
	return 0;
}
