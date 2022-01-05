#include <stdio.h>
#include <omp.h>
#define NUM 10

int fibonacci(int n){
	int x, y;
	printf("%d\n", omp_get_thread_num());
	if (n<2)
		return n;
	#pragma omp task shared(x)
	x = fibonacci(n-1);
	#pragma omp task shared(y)
	y = fibonacci(n-2);
	
	#pragma omp taskwait
	return x + y;
}

int main(){
	int res;
	#pragma omp parallel
	res = fibonacci(5);

	printf("Fibonacci = %d\n", res);
	return 0;
}
