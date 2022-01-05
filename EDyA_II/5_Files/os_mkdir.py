# -*- coding: utf-8 -*-
import os

def make_dir(path):
	try:
		os.mkdir(path)
	except:
		print("Error al crear el archivo", path)
	os.chdir(path)
	with open("file.txt", "w") as file:
		print(file.write("Created!"))


print("os.mkdir")
make_dir("test1")