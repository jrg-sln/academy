#include <stdio.h>
#include <omp.h>

static long num_trials = 10000;
static long MULTIPLIER = 1366;
static long ADDEND = 150889;
static long PMOD = 714025;
long random_last = 0;
#pragma omp threadprivate(random_last)
double random(){
	long random_next;
	/*#pragma omp single
	{
		nthreads = omp_get_num_threads();
		iseed = PMOD/MULTIPLIER;
		pseed[0] = iseed;
		mult_n = MULTIPLIER;
		for (i=1; i<nthreads; ++i){
			iseed = (unsigned long long)((MULTIPLIER*iseed)%PMOD);
			pseed[i] = iseed;
			mult_n = (mult_n * MULTIPLIER) % PMOD;
		}
	}
	random_last = (unsigned long long)pseed[id];*/
	random_next = (MULTIPLIER * random_last + ADDEND)%PMOD;
	random_last = random_next;
	return (double)random_next/(double)PMOD;
}

int main(){
	long i, n_circle = 0;
	double pi, x, y, r=1.0;
	//seed(0, -r, r);
	for (i=0; i<num_trials; i++){
		x = random();
		y = random();
		if ((x*y + y*y) <= r*r)
			n_circle++;
	}

	pi = 4.0 * ((double)n_circle/(double)num_trials);
	printf("PI=%lf with %d trials\n", n_circle, pi, num_trials);
}
