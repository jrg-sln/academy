import numpy as np

MAXV = 0

def create_graph (num_nodes, num_edges, matrix, array_bi):
    global nodes_edges
    i = 0
    u = v = cost = 0
    count_nodes_numbers = 0
    #print("Which is root node?")
    #root = int(input())
    root = 1
    matrix[root-1][root-1] = -1
    array_bi[0][root-1] = str(root)
    array_bi[1][root-1] = '*'
    while i < num_edges:
        #print("Insert edge (u, v)")
        #u = int(input('u: '))
        #v = int(input('v: '))
        u = nodes_edges[count_nodes_numbers]
        count_nodes_numbers += 1
        v = nodes_edges[count_nodes_numbers]
        count_nodes_numbers += 1
        #print("Insert cost or weight from edge:")
        #cost = int(input('Cost / weight: '))
        cost = 1
        # insert cost on the adjacent matrix
        matrix[(u-1)][(v-1)] = cost;
        array_bi[1][v-1] = str(u)
        array_bi[0][v-1] = str(v)
        i += 1


def print_graph(matrix, array_bi):
    print("ADJACENT MATRIX:")
    print (matrix)
    print()
    print("ARRAY BIDIMENSIONAL:")
    print (array_bi[0])
    print (array_bi[1])
    print()


def main():
    global matrix, array_bi, MAXV
    op = directed = cost = i = j = 0
    print("\n####### TREE STRUCTURE #######\n")
    print("Number of nodes.\n")
    #num_nodes = int(input())
    num_nodes = 6

    MAXV = num_nodes*num_nodes
    matrix = np.zeros((num_nodes, num_nodes))
    i = 0
    while i < num_nodes:
    	array_bi[0].append('')
    	array_bi[1].append('')
    	i += 1

    print("Number of edges.\n")
    #num_edges = int(input())
    num_edges = 5
    
    create_graph(num_nodes, num_edges, matrix, array_bi)
    print_graph(matrix, array_bi)



matrix = None
array_bi = [[],[]]
nodes_edges = [1, 2, 1, 3, 1, 4, 3, 5, 3, 6]
main()