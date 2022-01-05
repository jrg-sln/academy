#logaritmica
#No. de digitos de un numero
def digitos(i):
    cont=0
    if i == 0:
        return '0'
    while i > 0:
        cont=cont+1
        i = i//10
    return cont


numeros=list(range(1,1000))
print(numeros)
ite=[]
for a in numeros:
    ite.append(digitos(a))
    print(digitos(a))
