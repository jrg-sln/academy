from random import randrange #Para generar numeros aleatorios

def BubbleSort(L): 
    for i in range(len(L)):
    	for j in range(len(L)-1):
    	    if L[j]>L[j+1]:
    	        L[j+1],L[j]=L[j],L[j+1] #Asignación paralela
    print (L)

#Instancias pequeñas 
BubbleSort([-4,0,9,0,5,-2,21])
BubbleSort([1,2,3,4,5])

#Generando una instancia grande
#L=[]
#for i in range(10000):
#    L.append(randrange(101)) #Número entero positivo, del 0 al 100

#BubbleSort(L)