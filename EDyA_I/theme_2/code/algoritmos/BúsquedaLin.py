def busquedaexhaustiva():
    print("Se desea recuperar la llave de un candado de combinacion electronica Master\nPara ello se sabe que la combinacion esta conformada por numeros enteros de hasta 4 cifras")

    def candado(llave):
        intentos=0
        for entClave in range(10000):
            intentos=intentos+1
            if entClave==int(llave):
                return intentos 

busquedaexhaustiva()