# -*- coding: utf-8 -*-

file     = open("attributes.py", 'r')
name	 = file.name
mode 	 = file.mode
encoding = file.encoding
file.close()

print("Name", name)
print("Mode", mode)
print("Encoding", encoding)
print("Closed file?", file.closed)