# -*- coding: utf-8 -*-

class Restaurant(object):
    """
    Representa un lugar que sirve comida.
    """
    def __init__(self, cad_nombre, cad_propietario, cad_chef):
        self.nombre = cad_nombre
        self.propietario = cad_propietario
        self.chef = cad_chef
        self.__dishes = 15

    def __str__(self):
        return (self.nombre + " (Propietario: " + self.propietario
            + ", Chef: " + self.chef + ")")


# Se crea un objeto del tipo restaurant
mcAlgo = Restaurant("Hamburguesas McAlgo", "Josue", "Alison")

print (mcAlgo)
print()

# dir muestra la lista de métodos que posee el objeto
print (dir(mcAlgo))
