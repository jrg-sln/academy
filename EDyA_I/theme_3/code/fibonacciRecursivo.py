# -*- coding: utf-8 -*-


def fibonacci(ene):
    if (ene == 0):
        return 0
    if (ene == 1):
        return 1
    return fibonacci(ene - 1) + fibonacci(ene - 2)


print('fibonacci = ' + str(fibonacci(10)))
