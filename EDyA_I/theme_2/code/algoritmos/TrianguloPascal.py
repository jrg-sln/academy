def trianguloPascal(k):
    n = 0
    cont=0
    while n<k:
        lista = [[1],[1,1]]
        for i in range(1,k):
            linea = [1]
            cont+=1
            for j in range(0,len(lista[i])-1):
                linea.extend([lista[i][j] + lista[i][j+1] ])
            linea +=[1]
            lista.append(linea)

        n += 1
    return cont
#res = trianguloPascal(n)
#for i in res:
print (trianguloPascal(7))
