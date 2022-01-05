# -*- coding: utf-8 -*-

print("readline()")
with open("readline.py", "r", encoding='utf-8') as file:
	print(file.readline())

with open("readline.py", "r", encoding='utf-8') as file:
	for line in file:
		print(line)

with open("readline.py", "r", encoding='utf-8') as file:
	print(list(file))

with open("mop.mp3", "rb") as file:
	print(file.readline())
