#Hanoi
def hanoi(intn):
    intcont=0
    if intn > 0:
        intcont=hanoi(intn-1)
        intcont+=1
        intcont+=hanoi(intn-1)
    return intcont

print(hanoi(30))