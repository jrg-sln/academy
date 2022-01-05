import random

class Node:
	def __init__(self, d):
		self.sons = list()
		self.keys = list()
		self.leaf = 1
		self.n = 0
		for k in range(2*d+1):
			self.keys.append([None])
		for k in range(2*d + 2):
			self.sons.append([None])


class b_tree:
	def __init__(self, min_grade):
		self.d = min_grade
		self.root = None

	def create_b_tree(self):
		if self.root == None:
			self.root = Node(self.d)
		return self.root

	def split_b_tree(self, x, i):
		z = Node(self.d)
		y = x.sons[i]
		z.leaf = y.leaf
		z.n = self.d-1

		for j in range(1, self.d):
			z.keys[j] = y.keys[j+self.d]
			y.keys[j+self.d] = None

		if y.leaf == 0:
			for j in range(1, self.d + 1):
				z.sons[j] = y.sons[j + self.d]
				y.sons[j + self.d] = None

		y.n = self.d - 1

		for j in range(x.n + 1, i, -1):
			x.sons[j+1] = x.sons[j]

		x.sons[i+1] = z

		for j in range (x.n, i-1, -1):
			x.keys[j+1] = x.keys[j]

		x.keys[i] = y.keys[self.d]
		y.keys[self.d] = None
		x.n = x.n + 1


	def insert_non_full_b_tree(self, x, k):
		i = x.n
		if x.leaf == 1:
			while i >= 1 and k < x.keys[i]:
				x.keys[i+1] = x.keys[i]
				i -= 1
			x.keys[i+1] = k
			x.n = x.n + 1
		else:
			# Not a leaf
			while i >= 1 and k < x.keys[i]:
				i -= 1
			i += 1
			#if x.sons[i].n == 2*self.d - 1:
			if x.sons[i].n == 2*self.d:
				self.split_b_tree(x, i)
				if k > x.keys[i]:
					i += 1
			self.insert_non_full_b_tree(x.sons[i], k)


	def insert_b_tree(self, k):
		r = self.root
		# Full node
		#if r.n == 2*self.d - 1:
		if r.n == 2*self.d:
			s = Node(self.d)
			self.root = s
			s.leaf = 0
			s.n = 0
			s.sons[1] = r
			self.split_b_tree(s, 1)
			self.insert_non_full_b_tree(s, k)
		else:
			self.insert_non_full_b_tree(r, k)


	def print_node(self, node, nivel):
		string = ""
		# add position into the list to print results per level
		if len(list_print) < nivel:
			pos = len(list_print)
			while pos < nivel:
				list_print.append("")
				pos += 1

		for i in range(1, 2*self.d+1, 1):
			if node.keys[i] != None:
				if type(node.keys[i]) is int:
					string += str(chr(node.keys[i])) + "  "
				else:
					string += str(node.keys[i]) + "  "

		#print(nivel, "->", string)
		list_print[nivel-1] += "[" + string + "]\t"


	def print_tree(self, root, level):
		queue = []
		level += 1
		self.print_node(root, level)
		i = 1
		while i < len(root.sons):
			if type(root.sons[i]) is Node:
				self.print_tree(root.sons[i], level)
				#self.print_node(root.sons[i], level)
			i+=1




bt = b_tree(2)
actual = bt.create_b_tree()

abc = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T']
l = []
i = 0
while i < len(abc):
	num_rand = random.randint(0, len(abc)-1)
	if num_rand not in l:
		l.append(num_rand)
		print("Insert ", abc[num_rand])
		bt.insert_b_tree(ord(abc[num_rand]))
		#bt.print_tree(bt.root, 0)
		i += 1


level = 0
list_print = []
bt.print_tree(bt.root, level)
for i in range(len(list_print)):
	print(list_print[i])

#bt.print_node(bt.root)
#bt.print_node(bt.root.sons[1])
#bt.print_node(bt.root.sons[2])

