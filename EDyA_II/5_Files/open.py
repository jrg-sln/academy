# -*- coding: utf-8 -*-
import locale

############## Manejo de archivos ##############

try:
	file = open("open.py", "r", encoding='utf-8')
	print(locale.getpreferredencoding())

except:
	print('No fue posible abrir el archivo.')

finally:
	if file:
		file.close