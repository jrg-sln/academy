#include <stdio.h>
#include <omp.h>

int counter = 0;
#pragma omp threadprivate(counter)

int increment_counter(){
	return ++counter;
}

int main(){
	#pragma omp parallel
	{
		int id = omp_get_thread_num();
		counter = increment_counter();
	}
	printf("%d\n", counter);
}
