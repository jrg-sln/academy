# -*- coding: utf-8 -*-

class Node:
    # vértice v
    to = 0
    # costo, peso
    cost = 0
    # siguiente
    nxt = None

class Graph:
    # aristas
    edges = []
    # grado externo
    grade = []
    # num nodos
    numNodes = 0
    # num aristas
    numEdges = 0
    # dirigida o no?
    directed = False

def start_graph(objGraph):
    i = 0
    while i<= objGraph.numNodes:
        objGraph.grade.append(0)
        objGraph.edges.append(None)
        i += 1


def insert_edge(objGraph, intU, intV, intCost, isDirected):
    item = Node()
    item.cost = intCost
    item.to = intV
    item.nxt = objGraph.edges[intU]
    objGraph.edges[intU] = item
    objGraph.grade[intU] += 1
    if isDirected == False and intV != intU:
        insert_edge(objGraph, intV, intU, intCost, True)


def create_graph(objGraph, hasCost):
    i = 1
    while i <= objGraph.numEdges:
        u = int(input('u: '))
        v = int(input('v: '))
        if hasCost == True:
            cost = input('Cost / weight: ')
        else:
            cost = 1
        insert_edge(objGraph, u, v, cost, objGraph.directed)
        i += 1


def print_graph(objGraph):
    i = 1
    item = None
    string = ""
    while i <= objGraph.numNodes:
        string += str(i) + "\t"
        item = objGraph.edges[i]
        while item != None:
            string += str(item.to) + ": " + str(item.cost) + "\t"
            item = item.nxt
        string += "\n"
        i += 1
    print(string)


def main():
    directed = int(input("¿Es dirigida? 1)SÍ, 2)NO: "))
    cost = int(input("¿Peso en las aristas? 1)SÍ, 2)NO: "))
    objGraph.numNodes = int(input("Número de nodos: "))
    objGraph.directed = True if directed == 1 else False
    objGraph.numEdges = int(input("Número de aristas: "))
    
    start_graph(objGraph)
    create_graph(objGraph, cost)
    print_graph(objGraph)


objGraph = Graph()
main()
