def sumas(n):#Algoritmo de acumulacion de sumas
    cont=0
    i=1
    k=0
    for i in range(int(n)):
        j=n
        for j in range(1):
            k=k+j
            k=k+i
        cont=cont+1 #Cada bucle se ejecuta n veces, y en el interior del segundo hay 2 instrucciones.
    cont=2*cont*cont #Asi la relacion queda: 2×n×n instrucciones
    #print(k)
    return cont
