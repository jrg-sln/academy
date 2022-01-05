#include<stdio.h>
#include<stdlib.h>

int main(){
	system("clear");
	printf("NUmero mAgico\n");
	printf("Piensa en un nUmero entre 0 y 7...\n");
	sleep(0.5);
	printf("	1	3	5	7\n");
	printf("	7	6	2	3\n");
	printf("	6	5	7	4\n");
	char uno, dos, tres, *concat;
	int num1;
	
	printf("El nUmero que pensaste estA en el renglOn...\n");
	printf("1? [s/n]:");
	scanf("%c",&uno);
	getchar();	
	
	printf("2? [s/n]:");
	scanf("%c",&dos);
	getchar();	

	printf("3? [s/n]:");
	scanf("%c",&tres);
	getchar();	

	if (uno=='n' && dos=='n' && tres=='n')
		printf("El nUmero que pensaste es el 0!");
	else
		if (uno=='s' && dos=='n' && tres=='n')
			printf("El nUmero que pensaste es el 1!\n");
		else
			if (uno=='n' && dos=='s' && tres=='n')
				printf("El nUmero que pensaste es el 2!\n");
			else
				if (uno=='s' && dos=='s' && tres=='n')
					printf("El nUmero que pensaste es el 3!\n");
				else
					if (uno=='n' && dos=='n' && tres=='s')
						printf("El nUmero que pensaste es el 4!\n");
					else
						if (uno=='s' && dos=='n' && tres=='s')
							printf("El nUmero que pensaste es el 5!\n");
						else
							if (uno=='n' && dos=='s' && tres=='s')
								printf("El nUmero que pensaste es el 6!\n");
							else
								if (uno=='s' && dos=='s' && tres=='s')
									printf("El nUmero que pensaste es el 7!\n");
	return 42;
}
