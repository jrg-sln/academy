# -*- coding: utf-8 -*-
import os

def dir_walk(root_dir):
	for dir_path, dir_names, file_names in os.walk(root_dir):
		print("Carpeta,", dir_path)
		print("Subcarpetas,", dir_names)
		print("Archivos,", file_names)


print("os.walk")
dir_walk(".")