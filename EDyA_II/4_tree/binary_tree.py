def create_graph (num_nodes, num_edges, array_bi):
    global nodes_edges, nodes_values
    i = 0
    u = v = cost = 0
    count_nodes_numbers = 0
    root = 1
    array_bi[root-1] = nodes_values[root-1]
    while i < num_edges:
        u = nodes_edges[count_nodes_numbers]
        count_nodes_numbers += 1
        v = nodes_edges[count_nodes_numbers]
        count_nodes_numbers += 1
        son = nodes_edges[count_nodes_numbers]
        count_nodes_numbers += 1
        # left son
        if son == 0:
            array_bi[u*2-1] = nodes_values[i]
        # right son
        else :
            array_bi[u*2] = nodes_values[i]
        i += 1


def print_graph(array_bi):
    print("ARRAY TREE:")
    print (array_bi)
    print()


def main():
    global array_bi
    op = directed = cost = i = j = 0
    print("\n####### BINARY TREE STRUCTURE #######\n")
    # V = A + 1
    num_nodes = 9
    height = 4
    i = 0
    while i < 2**height-1:
    	array_bi.append('')
    	i += 1

    num_edges = num_nodes - 1
    create_graph(num_nodes, num_edges, array_bi)
    print_graph(array_bi)



array_bi = []
nodes_edges = [1, 2, 0, 1, 3, 1, 2, 4, 0, 2, 5, 1, 3, 6, 0, 3, 7, 1, 6, 8, 0, 6, 9, 1]
nodes_values = ['+','*', '^', 'A', 'B', '/', '3', 'C', 'D']
main()