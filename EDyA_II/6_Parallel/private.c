#include<stdio.h>
#include<omp.h>

void func(){
	int tmp = 0;
	#pragma omp parallel for firstprivate(tmp)
	for (int j = 0; j<10; ++j){
		printf("%d\t", tmp);
		tmp += j;
	}
	printf("\n%d\n", tmp);
}

int main(){
	func();
	return 0;
}
