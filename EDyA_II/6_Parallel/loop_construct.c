#include<stdio.h>
#include<omp.h>
//#define ENE 10

int do_it(int id){
	printf("%d\t", id);
}

int main(){
	#pragma omp parallel
	{
		int i, id, ENE=10;
		id = omp_get_thread_num();
		#pragma omp for
		for (i=0; i<ENE ; i++){
			do_it(id);
		}
	}
	printf("\n");
	return 0;
}
