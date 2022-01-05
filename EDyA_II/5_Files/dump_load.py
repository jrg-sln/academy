# -*- coding: utf-8 -*-
import pickle

print("pickle")
#memory = ['Hello','world','!!']
memory = 5
#memory = 'My string'
file = open('list.txt', 'wb')
pickle.dump(memory, file)
file.close()

file = open('list.txt', 'rb')
file_memory = pickle.load(file)
file.close()

print(type(file_memory))
print(file_memory)