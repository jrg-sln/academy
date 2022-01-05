import math
from math import pow
from math import sqrt
def Suma_raiz(n):#Recibe el rango de 1 a n
    lista1=[]
    lista2=[]
    lista3=[]
    for entElemento in range(1,n+1):
        lista1.append(entElemento)
    for entElemento in range(1,n+1):
        lista2.append(entElemento)
    for i in lista1:
        for j in lista2:
            entSuma=pow(i,2)+pow(j,2)
            if entSuma%pow(entSuma,1/2)==0:
                lista3.append([i,j])
    return lista3

       
print(Suma_raiz(5))
print(Suma_raiz(15))
