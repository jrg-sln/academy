# -*- coding: utf-8 -*-

class Saucer(object):
    """
    Representa un plato de comida.
    """
    def __init__(self, cadNombre, realPrecio, cadDescription=None,
                    cadImagen=None, boolVegetariano=False, entCoccion=1):
        self.nombre = cadNombre
        self.precio = realPrecio
        self.descripcion = cadDescription
        self.imagen = cadImagen
        self.esVegetariano = boolVegetariano
        self.coccion = entCoccion

    def __str__(self):
        return "{nombre}{esVeg}: {precio:.2f}{desc}".format(
            nombre=self.nombre,
            desc=' (' + self.descripcion + ')' if self.descripcion else '',
            precio=self.precio,
            esVeg='*' if self.esVegetariano else '')


burgerPython = Saucer("Hamburguesa de Python", 0.13,
                                cadDescription="Barely an eigth of a byte")
print(burgerPython)