#include<stdio.h>
#include<omp.h>
float balance = 1000.0;

float big_job(int id){
	int i, res=0;
	for (i=0; i<10;i++){
		res +=i;
	}
	return 500+id;
}

float consume(float B){
	balance-=B;
	return balance;
}

int main(){
        int niters = 10;
        float res;
        #pragma omp parallel
        {
                float B;
                int i, id, nthrds;
                id = omp_get_thread_num();
                nthrds = omp_get_num_threads();
                for (i=id ; i<niters ; i+=nthrds){
                        B = big_job(id);
                        // mutual exclusion
                        #pragma omp critical
                        res += consume(B);
                }
                printf("res = %f\n", res);
        }
        return 0;
}
