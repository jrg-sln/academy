# -*- coding: utf-8 -*-


print("read()")
with open("read.py", "r", encoding='utf-8') as file:
	print(file.read())

print("\nread(-111)")
with open("read.py", "r", encoding='utf-8') as file:
	print(file.read(-111))

print("\nread(10)")
with open("read.py", "r", encoding='utf-8') as file:
	print(file.read(10))

print("\nread(10) binary")
with open("read.py", "rb") as file:
	print(file.read(10))

with open("read.py", "r") as file:
	while True:
		line = file.readline()
		if not line:
			break
		print (line)
