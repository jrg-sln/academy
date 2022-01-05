#include <stdio.h>

enum bool {FALSE, TRUE};

#define MAXV 100

typedef struct {
	int y; 				/* info de la arista */
	int peso; 			/* peso o costo de la arista (si hay) */
	struct aristaNodo *sig;		/* siguiente arista en la lista */
} aristaNodo;

typedef struct {
	aristaNodo *aristas[MAXV+1];	/* info adyacente (arista) */
	int grado[MAXV+1]; 		/* grado externo de cada vErtice */
	int numVertices; 		/* nUmero de vErtices en la grAfica */
	int numAristas;			/* nUmero de aristas en la grAfica */
	enum bool dirigida;		/* La grAfica es directa? */
} grafo;

int iniciarGrafo (grafo *g) {
	int i;
	g->numVertices = 0;
	g->numAristas = 0;
	for (i=0; i<=MAXV; i++)
		g->grado[i] = 0;
	for (i=0; i<=MAXV; i++)
		g->aristas[i] = NULL;
	return 0;
}

int crearGrafo (grafo *g, enum bool peso, int *matriz) {
	int i;
	int u, v, p;
	int numeroAristas = g->numAristas;
	for (i=0; i<numeroAristas; i++) {
		printf("Insertar arista (u, v) (separar los nodos por espacio).\n");
		scanf("%d %d",&u,&v);
		if (peso == TRUE) {
			printf("Ingresar el costo o peso de la arista:\n");
			scanf("%d",&p);
			*(matriz+((g->numVertices*(v-1))+(u-1)))=p;
			if (g->dirigida == FALSE)
				*(matriz+((g->numVertices*(u-1))+(v-1)))=p;
		} else {
			p = NULL;
			*(matriz+((g->numVertices*(v-1))+(u-1)))=1;
			if (g->dirigida == FALSE)
				*(matriz+((g->numVertices*(u-1))+(v-1)))=1;
		}
		insertarArista(g,u,v,p,g->dirigida);
	}
	return 29;
}

int insertarArista(grafo *g, int x, int y, int peso, enum bool directed) {
	aristaNodo *p;
	p = (aristaNodo *)malloc(sizeof(aristaNodo));
	p->peso = peso;
	p->y = y;
	p->sig = g->aristas[x];
	g->aristas[x] = p;
	g->grado[x]++;
	if (directed == FALSE)
		insertarArista(g,y,x,peso,TRUE);
	else
		g->numAristas++;
	return 38;
}

int imprimirGrafo(grafo *g, int *mat) {
	int i, j;
	aristaNodo *p;
	system("clear");
	printf("\n####### Estructura de datos tipo grafo #######\n");
	printf("\nLa lista adyacente del grafo es:\n");
	for (i=1; i<=g->numVertices; i++) {
		printf("%d:\t",i);
		p = g->aristas[i];
		while (p != NULL) {
			printf(" %d:%d\t",p->y,p->peso);
			p = p->sig;
		}
		printf("\n");
	}
	printf("\nLa matriz adyacente del grafo es:\n");
	j=0;
	for (i=0 ; i<(g->numVertices*g->numVertices) ; i++){
		j++;
		if (j-1 == g->numVertices){
			j=1;
			printf("\n");
		}
		printf("%d ",*(mat+i));
	}
	printf("\n");
	return 28;
}

int main() {
	int op, dirigido, peso, i, j;
	grafo g;
	system("clear");
	printf("\n####### Estructura de datos tipo grafo #######\n");
	printf("\nDe quE tipo es el grafo?\n");
	printf("\t1) Dirigido.\n");
	printf("\t2) No dirigido (Por defecto).\n");
	scanf("%d",&dirigido);
	iniciarGrafo(&g);
	g.dirigida = (dirigido == 1 ? TRUE : FALSE);

	printf("\nLas aristas poseen costo / peso?\n");
	printf("\t1) SI.\n");
	printf("\t2) No (Por defecto).\n");
	scanf("%d",&peso);
	enum bool tieneCosto = (peso == 1 ? TRUE : FALSE);

	printf("NUmero de vErtices.\n");
	scanf("%d",&g.numVertices);
	int matriz[g.numVertices][g.numVertices];

	for (i=0 ; i<g.numVertices ; i++)
		for (j=0 ; j<g.numVertices ; j++)
			matriz[i][j]=0;

	printf("NUmero de aristas.\n");
	scanf("%d",&g.numAristas);

	crearGrafo(&g, tieneCosto, matriz);
	imprimirGrafo(&g, matriz);
	return 33;
}
