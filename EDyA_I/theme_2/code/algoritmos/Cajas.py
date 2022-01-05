def BuscarCaja(p,q):
    global L
    mitad=(p+q)//2
    if q==p+1 or q==p:
        if L[p]==1: return p
        else: return q
    elif 1 in L[mitad:q+1]:
        return BuscarCaja(mitad,q)
    else:
        return BuscarCaja(p,mitad-1)


L=[0,0,0,0,1,0]
print("Indice: "+str(BuscarCaja(0,len(L)-1)))
L=[0,1,0,0,0,0,0,0,0]
print("Indice: "+str(BuscarCaja(0,len(L)-1)))
