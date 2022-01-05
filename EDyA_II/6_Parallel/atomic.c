#include<stdio.h>
#include<omp.h>

int big_ugly(int B){
	return 2*B;
}

double doit(){
	return 2.24;
}

int main(){
	double X = 0;
	#pragma omp parallel
	{
		int id = omp_get_thread_num();
		printf("%d\n", id);
		double tmp, B;
		B = doit();
		tmp = big_ugly(B);
		// atomic
		#pragma omp atomic
		X += tmp;
	}
	printf("X = %f\n", X);
	return 0;
}
