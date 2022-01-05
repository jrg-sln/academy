# -*- coding: utf-8 -*-
import os

def make_dirs(path):
	try:
		os.makedirs(path)
	except OSError:
		print("Error al crear el archivo", path)
	os.chdir(path)


print("os.makedirs")
make_dirs("test2/test3/test4")