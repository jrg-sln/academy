# -*- coding: utf-8 -*-

print("seek()")
with open("seek.py", "r") as file:
	print(file.tell())
	print(file.readline())
	print(file.tell())
	print(file.seek(30))
	print(file.readline())
