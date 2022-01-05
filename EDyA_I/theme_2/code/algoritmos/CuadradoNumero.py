def Cuadrado_numero (intEntero):
    acumulador=0
    for i in range(intEntero):
        for j in range(intEntero):
            acumulador=acumulador+1
    return acumulador


print(Cuadrado_numero(8))
print(Cuadrado_numero(10))
