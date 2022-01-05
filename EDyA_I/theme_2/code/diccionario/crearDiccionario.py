# -*- coding: utf-8 -*-


def crearCombinaciones(abecedario):
    for d1 in abecedario:
        for d2 in abecedario:
            for d3 in abecedario:
                for d4 in abecedario:
                    #print(d1 + '' + d2 + '' + d3 + '' + d4)
                    f.write(d1 + '' + d2 + '' + d3 + '' + d4)
                    f.write('\n')


abecedario = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
              'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

f = open("dico.txt", "w")
crearCombinaciones(abecedario)
f.close()
