# -*- coding: utf-8 -*-

def fibonacci(ene):
    a = 0
    b = 1
    contador = 1
    fibo = 0
    while contador < ene:
        fibo = b + a
        a = b
        b = fibo
        contador += 1
    return fibo


print('fibonacci(50) = ' + str(fibonacci(50)))
