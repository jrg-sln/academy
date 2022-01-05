
# coding: utf-8

# In[1]:

#Algoritmo que dado un rango de posibles caracteres o números, genera la cantidad de combinaciones que se pueden formar. 

def cantidadCombinaciones (intEntero):
    cont=0
    for elemento in range(1,intEntero+1):
        for elemento2 in range(1,intEntero+1):
            cont=cont+1
    return cont


print(cantidadCombinaciones (10))

