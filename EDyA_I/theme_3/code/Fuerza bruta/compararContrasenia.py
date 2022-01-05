# -*- coding: utf-8 -*-

f = open("dico.txt", "r")
contrasenia = "hola"
contador = 0
linea = f.readline()
while linea:
    contador += 1
    if linea.strip() == contrasenia.strip():
        print('Contrasenia encontrada: ' + linea)
        print('en ' + str(contador) + ' intentos')
        break
    linea = f.readline()
f.close()
