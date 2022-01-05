# -*- coding: utf-8 -*-


def factorial(ene):
    if (ene == 0):
        return 1
    if (ene == 1):
        return 1
    return ene * (factorial(ene - 1))

# El factorial de un número está dado por la relación
# n! = n*(n-1)!
# Además, se sabe que 1! y 0! son 1
print('Factorial 5 = ' + str(factorial(100)))