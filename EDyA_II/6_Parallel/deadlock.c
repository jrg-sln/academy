#include <stdio.h>
#include <omp.h>
#define N 100

int main(){
	int a[N], b[N], i, nthreads;
	omp_lock_t locka, lockb;
	#pragma omp parallel shared(a, b, nthreads, locka, lockb)
	{
  		#pragma omp sections nowait
    		{
			printf("Section one\n");
    			#pragma omp section
      			{
      				omp_set_lock(&locka);
				printf("Init a\n");
      				for (i=0; i<N; i++)
        				a[i] = i;
     				omp_set_lock(&lockb);
				printf("Init b\n");
      				for (i=0; i<N; i++)
        				b[i] = N - a[i];
      				omp_unset_lock(&lockb);
      				omp_unset_lock(&locka);
      			}

    			#pragma omp section
      			{
			printf("Section two\n");
      				omp_set_lock(&lockb);
				printf("Modify b\n");
      				for (i=0; i<N; i++)
        				b[i] = N-i;
      				omp_set_lock(&locka);
				printf("Modify a\n");
      				for (i=0; i<N; i++)
        				a[i] = b[i] + i;
      				omp_unset_lock(&locka);
      				omp_unset_lock(&lockb);
      			}
    		}
  	}
	return 0;
}
