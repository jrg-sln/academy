# -*- coding: utf-8 -*-
import locale

############## Manejo de archivos ##############

with open("open.py", "r", encoding='utf-8') as file:
	print(locale.getpreferredencoding())

print('Ya se cerró el archivo automáticamente.')