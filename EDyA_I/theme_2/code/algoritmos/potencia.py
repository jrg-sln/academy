def potencia(b,n):
    if n<=0:
        return 1
    if n % 2 == 0:
        pot = potencia(b,n/2)
        return pot*pot
    else:
        pot = potencia(b,(n-1)/2)
        return pot * pot * b


print(potencia(2,3))
print(potencia(2,32))
