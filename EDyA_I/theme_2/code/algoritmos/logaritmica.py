##Pérez Elizondo, García Ruiz
#Complejidad logaritmica
def configuracion(atomico):
    numeros = [2,2,6,2,6,2,10,6,2,10,6,2,14,10,6,2,14,10,6]
    res=[]
    cont=0   
    while (atomico > 0):
        if (atomico >= numeros[cont]):            
            atomico = atomico-numeros[cont]
            res.append(numeros[cont])
        else: 
            res.append(atomico)
            atomico=0
        cont=cont+1
    return cont