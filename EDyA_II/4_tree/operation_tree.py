def print_graph(array_bi):
    print("ARRAY TREE:")
    print (array_bi)
    print()


def left(val):
	return val*2


def right(val):
	return val*2+1


def parent(val):
    return val // 2


def tree_search(node, key):
    if array_bi[node] == None:
        return -1
    if key == array_bi[node]:
        return node
    if key < array_bi[node]:
        return tree_search(left(node), key)
    else:
        return tree_search(right(node), key)


def minimum(node):
    while array_bi[left(node)] != None:
        node = left(node)
    return node


def maximum(node):
    while array_bi[right(node)] != None:
        node = right(node)
    return node


def successor(node):
    if array_bi[right(node)] != None:
        return minimum(right(node))
    y = parent(node)
    while array_bi[y] != None and node == right(y):
        node = y
        y = parent(y)
    return y


def predecessor(node):
    if array_bi[left(node)] != None:
        return maximum(left(node))
    y = parent(node)
    while array_bi[y] != None and node == left(y):
        node = y
        y = parent(y)
    return y


def insert(z):
    global root
    y = None
    x = root
    while array_bi[x] != None:
        y = x
        if z < array_bi[x]:
            x = left(x)
        else:
            x = right(x)
    if y == None:
        root = z
        array_bi[root] = z
    else:
        if z < array_bi[y]:
            array_bi[left(y)] = z
        else:
            array_bi[right(y)] = z


def delete(z):
    global root
    print("z:", z)
    if array_bi[left(z)] == None or array_bi[right(z)] == None:
        y = z
    else:
        y = successor(z)
    
    print("y: ",y)
    if array_bi[left(y)] == None:
        x = left(y)
    else:
        x = right(y)
    
    print("x: ",x)
    if array_bi[x] == None:
        array_bi[parent(x)] = array_bi[parent(y)]
    
    if array_bi[parent(y)] == None:
        root = x
        array_bi[root] = x
    else:
        if array_bi[y] == array_bi[left(parent(y))]:
            array_bi[left(parent(y))] = x
        else: 
            array_bi[right(parent(y))] = x
    
    if y == z:
        array_bi[z] = array_bi[y]
    return y


def main():
    global array_bi, root
    op = directed = cost = i = j = 0
    print("\n####### BINARY TREE STRUCTURE #######\n")
    # V = A + 1
    num_nodes = 7
    height = 3

    num_edges = num_nodes - 1
    print_graph(array_bi)
    print("TREE SEARCH")
    res = tree_search(root, 8)
    print ('El valor 8 está en la posición ', res)
    res = tree_search(root, 13)
    print ('El valor 2 está en la posición ', res)
    pos_min = minimum(root)
    pos_max = maximum(root)
    print('El valor mínimo es: ', array_bi[pos_min])
    print('El valor máximo es: ', array_bi[pos_max])
    pos_suc = successor(22)
    print('El sucesor de',array_bi[22],'es',array_bi[pos_suc])
    pos_pred = predecessor(6)
    print('El predecesor de',array_bi[6],'es',array_bi[pos_pred])
    print_graph(array_bi)
    print("Insert 8, 100")
    insert(8)
    insert(100)
    insert(99)
    print_graph(array_bi)
    print(delete (11))
    print_graph(array_bi)



#array_bi = []
#nodes_edges = [1, 2, 0, 1, 3, 1, 2, 4, 0, 2, 5, 1, 3, 6, 0, 3, 7, 1]
#array_bi = [0, 15, 6, 18, 3, 7, 17, 20, 3, 7, 0, 13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0]
array_bi = [ None, 15, 
                6, 18,
                3, 7, 17, 20, 
                2, 4, None, 13, None, None, None, None, 
                None, None, None, None, None, None, 9, None, None, None, None, None, None, None, None, None,
                None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None]
root = 1
main()