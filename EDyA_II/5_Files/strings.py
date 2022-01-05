# -*- coding: utf-8 -*-

# ------------- Búsquedas en cadenas -------------

# Cadena original
cadena = "Amor y deseo son dos cosas diferentes; que no todo lo que se ama se desea, ni todo lo que se desea se ama. (Don Quijote)"

# Busca la cadena "ama"
print (cadena.find("ama"))

#Imprimie  la subcadena
print (cadena[cadena.find("ama"):])
# Busca la siguiente coincidencia de "ama"
print (cadena[cadena.find("ama") + 1:].find("ama"))

# Imprime la cadena a partir de la segunda coincidencia
print (cadena[61 + 1 + 40:])

# Busca "corazon" en la cadena
print (cadena.find("corazon"))

# Busca a partir de un indice
print (cadena.find("todo", 62))

# Imprime a partir de un índice y hasta el final
print (cadena[78:])
