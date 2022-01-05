#exponencial
bact=[0,0] #cosecha 
tiempos=[1,2,3,4,5,6]
ciclos=[]
numBact=2

print("representacion de la multiplicacion de una cosecha de bacterias. \n\n")

def rep (intTime):
    global numBact
    ciclos.append(numBact)
    sumar=intTime*numBact
    numBact=numBact+sumar
    return sumar

for a in tiempos:
    n=0
    suma=rep(a)
    #print(bact)
    while n<suma:
        bact.append(0)
        n=n+1
    print("despues de "+str(a)+" segundos ya hay "+str(numBact)+" bacterias")
