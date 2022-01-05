#include <stdio.h>
#include <omp.h>
#define ITEMS 10000

struct item {
	int id;
	struct item *next;
};

struct item *list = NULL;
void menu();
void add(struct item *);
void print_list();
void print_list_serial();
void process();

int main(){
	menu(list);
	return 0;
}

void menu(){
	int op, cont;
	//printf("How many item do you want to add?\n");
	//scanf("%d", &op);
	op = ITEMS;
	for (cont=0; cont<op; cont++){
		struct item *i = NULL;
		i = (struct item *) malloc(sizeof(struct item));
		i->id = cont+1;
		add(i);
	}
	printf("###### LIST ######\n");
	double init = omp_get_wtime();
	print_list_serial(list);
	printf("Time serial: %f\n", omp_get_wtime()-init);
	init = omp_get_wtime();
	print_list(list);
	printf("Time parallel: %f\n", omp_get_wtime()-init);
	printf("\n");
}

void add(struct item *element){
	if (list == NULL){
		element->next = NULL;
		list = element;
	} else {
		element->next = list;
		list = element;
	}
}

void print_list_serial(){
	int id;
	struct item *p = list;
	while (p!=NULL){
		process();
		p = (*p).next;
	}
}

void print_list(){
	int id;
	#pragma omp parallel 
	{
		#pragma omp single
		{
			struct item *p = list;
			while (p!=NULL){
				#pragma omp task firstprivate(p)
				process();
				p = (*p).next;
			}
		}
	}
}

void process(){
	int i;
	for (i=0; i<ITEMS; i++);
}
				//printf("id: %d ->%d\t", (*p).id, (*p).next);
