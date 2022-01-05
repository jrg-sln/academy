def print_graph(array_bi):
    print("ARRAY TREE:")
    print (array_bi)
    print()


def left(val):
    return val*2


def right(val):
    return val*2+1


def inorder_print_tree(start_pos):
    global printer
    if start_pos <= len(array_bi) and nodes_values[start_pos-1] != '':
        inorder_print_tree(left(start_pos))
        printer += nodes_values[start_pos-1]
        inorder_print_tree(right(start_pos))


def preorder_print_tree(start_pos):
    global printer
    if start_pos <= len(array_bi) and nodes_values[start_pos-1] != '':
        printer += nodes_values[start_pos-1]
        preorder_print_tree(left(start_pos))
        preorder_print_tree(right(start_pos))


def posorder_print_tree(start_pos):
    global printer
    if start_pos <= len(array_bi) and nodes_values[start_pos-1] != '':
        posorder_print_tree(left(start_pos))
        posorder_print_tree(right(start_pos))
        printer += nodes_values[start_pos-1]


def main():
    global array_bi, root, printer
    op = directed = cost = i = j = 0
    print("\n####### BINARY TREE STRUCTURE #######\n")
    # V = A + 1
    num_nodes = 9
    height = 4
    i = 0
    while i <= 2**height-1:
    	array_bi.append('')
    	i += 1

    num_edges = num_nodes - 1
    print("INORDER")
    printer = ""
    inorder_print_tree(root)
    print(printer)

    print("\nPREORDER")
    printer = ""
    preorder_print_tree(root)
    print(printer)

    print("\nPOSORDER")
    printer = ""
    posorder_print_tree(root)
    print(printer)


printer = ""
array_bi = []
nodes_edges = [1, 2, 0, 1, 3, 1, 2, 4, 0, 2, 5, 1, 3, 6, 0, 3, 7, 1, 6, 8, 0, 6, 9, 1]
nodes_values = ['+','*', '^', 'A', 'B', '/', '3', '', '', '', '', 'C', 'D', '', '']
root = 1
main()
