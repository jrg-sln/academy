def shellSort(arreglo):
     espacio = len(arreglo) // 2
     while espacio > 0:
         for i in range(espacio, len(arreglo)):
             val = arreglo[i]
             j = i
             while j >= espacio and arreglo[j - espacio] > val:
                 arreglo[j] = arreglo[j - espacio]
                 j -= espacio
             arreglo[j] = val
         espacio //= 2

lista = []
for i in range(-1000, 1, 1):
    lista.append(i)

print (shellSort(lista))