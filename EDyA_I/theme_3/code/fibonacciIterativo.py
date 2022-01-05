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


print('fibonacci(5) = ' + str(fibonacci(5)))
print('fibonacci(10) = ' + str(fibonacci(10)))
print('fibonacci(20) = ' + str(fibonacci(20)))
print('fibonacci(30) = ' + str(fibonacci(30)))
print('fibonacci(123456789) = ' + str(fibonacci(123456789)))
