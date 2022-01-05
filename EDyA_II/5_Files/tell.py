# -*- coding: utf-8 -*-

print("tell()")
with open("tell.py", "r") as file:
	print(file.tell())
	print(file.readline())
	print(file.tell())
