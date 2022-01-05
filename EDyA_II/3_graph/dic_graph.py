import numpy as np

class Node:
    to = ""
    cost = ""
    nxt = None


class Graph:
    edges = {}
    num_nodes = 0
    num_edges = 0
    directed = False


def insert_edge(objGraph, u, v, cost, isDirected):
    item = Node()

    item.cost = cost
    item.to = v;
    if u in objGraph.edges:
        item.nxt = objGraph.edges[u]
    else:
        item.nxt = None

    objGraph.edges[u] = item
    #objGraph.grade[u] += 1
    if isDirected == False and v != u:
        insert_edge(objGraph, v, u, cost, True)
    #else:
    #    objGraph.num_edges += 1


def create_graph (objGraph, hasCost):
    i = 0;
    u = v = cost = 0
    number_edges = objGraph.num_edges

    while i < objGraph.num_edges:
        print("Insert edge (u, v)")
        u = input('u: ')
        v = input('v: ')

        if hasCost == True :
            print("Insert cost or weight from edge:")
            cost = input('Cost / weight: ')
        else:
            cost = 1

        # insert edge on the adjacent list
        insert_edge(objGraph, u, v, cost, objGraph.directed);
        i += 1


def print_graph(objGraph):
    i = 1
    item = None
    print("\nADJACENT LIST:")
    string = ""
    for key in objGraph.edges.keys():
        string += (key + " -> ")
        item = objGraph.edges[key]
        while item != None:
            string += item.to + ": " + item.cost +"\t"
            item = item.nxt
        string += "\n"
    print(string)
    print()


def main():
    op = directed = cost = i = j = 0
    print("\n####### GRAPH STRUCTURE #######\n")
    print("\nWhat kind of graph is it?\n")
    print("\t1) Directed.")
    print("\t2) No directed.\n")
    directed = int(input())

    print("\nDo the edges have cost / weight?\n")
    print("\t1) YES.")
    print("\t2) NO.\n")
    cost = int(input())
    hasCost = True if cost == 1 else False

    print("Number of nodes.\n")
    num_nodes = int(input())

    obj_graph.num_nodes = num_nodes
    obj_graph.directed = True if directed == 1 else False

    print("Number of edges.\n")
    obj_graph.num_edges = int(input())
    
    create_graph(obj_graph, hasCost)
    print_graph(obj_graph)


obj_graph = Graph()
main()
