#lienal
i=0
tam=100
iteraciones=[]

def mayor(numeros):
    may=numeros[0]
    repet=1
    global iteciones
    global i
    global tam
    while i < tam:
        if numeros[i]==may:
            repet=repet+1
        if numeros[i]>may:
            may=numeros[i]
            repet=1
        i=i+1
        iteraciones.append(i)
    print("\nel mayor fue: "+str(may))
    print("repeticiones :"+str(repet))

            
num=[]
cantNum=[]
import random
n=0
while n<tam:
    num.append(random.randrange(50))
    n=n+1
    cantNum.append(n)
    
print(num)

mayor(num)
