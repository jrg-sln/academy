def multiplicar(x, y):
    if x == 0:
        return 0
    else:
        print(x)
        if x%2==0:
            return 2*multiplicar(x/2, y)
        else:
            return y+2*multiplicar((x-1)/2, y)

print(multiplicar(1000000000, 40000))

