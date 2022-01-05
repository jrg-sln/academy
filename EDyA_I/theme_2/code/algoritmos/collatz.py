def collatz(entNum):
    cont=0
    while entNum!=1:
        if entNum%2==0:
            cont+=1
            entNum=entNum/2
        else:
            cont+=1
            entNum=3*entNum+1
    return cont