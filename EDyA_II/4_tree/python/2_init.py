# -*- coding: utf-8 -*-

class Human(object):
	def __init__(self, age, heigth, weight):
		self.age = age
		self.heigth = heigth
		self.weight = weight


h1 = Human(12, 1.60, 50)
print ("Human:\nEdad = %i, Altura = %.2f, Peso = %i " % (h1.age, h1.heigth, h1.weight))
