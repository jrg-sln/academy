import numpy as np

MAXV = 0

class node:
    # edge v
    to = 0
    # weight or cost from the edge (if it exists)
    cost = 0
    # Next edge-node
    nxt = None
    # BFS
    # previus edge-node
    prev = None
    # color: 0-white, 1-gray, 2-black
    color = 0
    # distance
    distance = -1


class graph:
    # edge adjacent
    edges = []
    # Extern grade from each node
    grade = []
    # nodes number
    num_nodes = 0
    # edges number
    num_edges = 0
    # directed or not
    directed = False


def start_graph (objGraph):
    i = 0
    objGraph.num_nodes = 0
    objGraph.num_edges = 0
    while i<=MAXV:
        objGraph.grade.append(0)
        i += 1
    i = 0
    while i<=MAXV:
        objGraph.edges.append(None)
        i += 1


def insert_edge(objGraph, intU, intV, cost, isDirected):
    item = node()
    item.cost = cost
    item.to = intV;
    item.nxt = objGraph.edges[intU]
    objGraph.edges[intU] = item
    objGraph.grade[intU] += 1
    if isDirected == False and intV != intU:
        insert_edge(objGraph, intV, intU, cost, True)
    else:
        objGraph.num_edges += 1


def create_graph (objGraph, hasCost, intMatrix):
    global nodes_numbers
    i = 0;
    u = v = cost = 0
    number_edges = objGraph.num_edges
    count_nodes_numbers = 0
    while i < number_edges:
        #print("Insert edge (u, v)")
        #u = int(input('u: '))
        u = nodes_numbers[count_nodes_numbers]
        count_nodes_numbers += 1
        #v = int(input('v: '))
        v = nodes_numbers[count_nodes_numbers]
        count_nodes_numbers += 1
        if hasCost == True :
            print("Insert cost or weight from edge:")
            cost = int(input('Cost / weight: '))
        else:
            cost = 1
        # insert cost on the adjacent matrix
        intMatrix[(v-1)][(u-1)] = cost;
        if objGraph.directed == False:
            intMatrix[(u-1)][v-1] = cost;
        # insert edge on the adjacent list
        insert_edge(objGraph, u, v, cost, objGraph.directed);
        i += 1


def print_graph(objGraph, intMatrix):
    i = 1
    item = None
    print("\nADJACENT LIST:")
    string = ""
    while i <= objGraph.num_nodes:
        string += str(i) + "\t"
        item = objGraph.edges[i]
        while item != None:
            string += str(item.to) + ": " + str(item.cost) + "\t"
            item = item.nxt;
        string += "\n"
        i += 1
    print(string)
    #print("ADJACENT MATRIX:")
    #print (intMatrix)
    print()


# color: 0-white, 1-gray, 2-black
def breadth_first_search(objGraph, intNodeS):
    objGraph.edges[intNodeS].color = 1
    objGraph.edges[intNodeS].distance = 0
    objGraph.edges[intNodeS].prev = None
    queue = []
    queue.append(intNodeS)
    print("QUEUE")
    while len(queue) != 0:
        print(queue)
        u = queue.pop(0)
        v = objGraph.edges[u]
        while v != None:
            if objGraph.edges[v.to] != None:
                if objGraph.edges[v.to].color == 0:
                    objGraph.edges[v.to].color = 1
                    objGraph.edges[v.to].distance = objGraph.edges[u].distance + 1
                    objGraph.edges[v.to].prev = u
                    queue.append(v.to)
            v = v.nxt
        objGraph.edges[u].color = 2


def print_graph_color(objGraph):
    i = 1
    item = None
    print("\nBREADTH FIRST SEARCH:")
    string = ""
    while i <= objGraph.num_nodes:
        color = "blank" if objGraph.edges[i].color == 0 else "gray" if objGraph.edges[i].color == 1 else "black"
        cont = 0
        tabs = ""
        while cont<objGraph.edges[i].distance:
            tabs+="\t"
            cont += 1
        string += tabs + str(i) + ": " + color + "-" +  str(objGraph.edges[i].distance) + "\t"
        string += "\n"
        i += 1
    print(string)


def main():
    global matrix, MAXV, n_n, n_e, g_c, g_d
    op = directed = cost = i = j = 0
    print("\n####### GRAPH STRUCTURE #######\n")
    directed = g_d
    cost = g_c
    hasCost = True if cost == 1 else False
    num_nodes = n_n
    MAXV = num_nodes*num_nodes
    start_graph(obj_graph)
    obj_graph.num_nodes = num_nodes
    obj_graph.directed = True if directed == 1 else False
    matrix = np.zeros((obj_graph.num_nodes, obj_graph.num_nodes))
    obj_graph.num_edges = n_e
    
    create_graph(obj_graph, hasCost, matrix)
    print_graph(obj_graph, matrix)
    breadth_first_search(obj_graph, 3)
    print_graph_color(obj_graph)



obj_graph = graph()
matrix = None
# graph directed (1) no directed (2)
g_d = 2
# graph with cost (1) without cost (2)
g_c = 2
# number of nodes
n_n = 8
# number of edges
n_e = 10
# edges (u, v)
nodes_numbers = [1, 2, 2, 3, 3, 4, 4, 6, 4, 5, 6, 5, 6, 7, 5, 7, 7, 8, 5, 8]
main()
