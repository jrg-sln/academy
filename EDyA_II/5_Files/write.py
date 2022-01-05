# -*- coding: utf-8 -*-

numbers = ['hello', 'world']
print("write()")
with open("file.txt", "w") as file:
	print(file.write("Hello world!"))
	print(file.writelines(numbers))

with open("file.txt", "r") as file:
	print(file.readlines())