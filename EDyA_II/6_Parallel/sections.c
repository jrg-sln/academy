#include<stdio.h>
#include<omp.h>

void section_a(int id){
	printf("Section A %d\n", id);
}

void section_b(int id){
	printf("Section B %d\n", id);
}

void section_c(int id){
	printf("Section C %d\n", id);
}

int main(){
	int id;
	#pragma omp parallel
	{
		#pragma omp sections
		{
			#pragma omp section
			section_a(omp_get_thread_num());
			#pragma omp section
			section_b(omp_get_thread_num());
			#pragma omp section
			section_c(omp_get_thread_num());
		}

		id = omp_get_thread_num();
		printf("Parallel block thread %d.\n", id);
		
	}
}
