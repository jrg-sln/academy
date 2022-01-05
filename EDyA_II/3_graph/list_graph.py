import numpy as np

MAXV = 0

class Node:
    to = 0
    cost = 0
    nxt = None


class Graph:
    # edge adjacent
    edges = []
    # Extern grade from each node
    grade = []

    num_nodes = 0
    num_edges = 0
    directed = False


def start_graph (objGraph):
    objGraph.num_nodes = 0
    objGraph.num_edges = 0
    i = 0
    while i<=MAXV:
        objGraph.grade.append(0)
        i += 1
    i = 0
    while i<=MAXV:
        objGraph.edges.append(None)
        i += 1


def insert_edge(objGraph, intU, intV, cost, isDirected):
    item = Node()

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
    i = 0;
    u = v = cost = 0
    number_edges = objGraph.num_edges

    while i < number_edges:
        print("Insert edge (u, v)")
        u = int(input('u: '))
        v = int(input('v: '))

        if hasCost == True :
            print("Insert cost or weight from edge:")
            cost = int(input('Cost / weight: '))
        else:
            cost = 1

        # insert edge on the adjacent matrix
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
            string += str(item.to) + ": " + str(item.cost) +"\t"
            item = item.nxt;
        string += "\n"
        i += 1
    print(string)
    print("ADJACENT MATRIX:")
    print (intMatrix)
    print()


def main():
    global matrix, MAXV
    op = directed = cost = i = j = 0
    print("\n####### GRAPH STRUCTURE #######\n")
    print("\nWhat kind of graph is it?\n")
    print("\t1) Directed.\n")
    print("\t2) No directed.\n")
    directed = int(input())

    print("\nAre the edges cost / weight?\n")
    print("\t1) YES.\n")
    print("\t2) NO.\n")
    cost = int(input())
    hasCost = True if cost == 1 else False

    print("Number of nodes.\n")
    num_nodes = int(input())

    MAXV = num_nodes
    start_graph(obj_graph)
    obj_graph.num_nodes = num_nodes
    obj_graph.directed = True if directed == 1 else False
    matrix = np.zeros((obj_graph.num_nodes, obj_graph.num_nodes))

    print("Number of edges.\n")
    obj_graph.num_edges = int(input())
    
    create_graph(obj_graph, hasCost, matrix)
    print_graph(obj_graph, matrix)


obj_graph = Graph()
matrix = None
main()
