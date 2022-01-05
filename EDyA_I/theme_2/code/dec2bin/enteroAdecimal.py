# -*- coding: utf-8 -*-
#import matplotlib.pyplot as plt
#from mpl_toolkits.mplot3d import Axes3D


def dec2bin(entNumero):
    if entNumero > 0:
        dec2bin(entNumero // 2)
        print(entNumero % 2)


#Datos de entrada, se generan 10 puntos entre 0 y 5
x = linspace(0, 5, 20)
fig, ax = plt.subplots(facecolor='w', edgecolor='k')
ax.plot(x, dec2bin(x), marker="o", color="r", linestyle='None')

ax.grid(True)
#Etiqueta del eje x
ax.set_xlabel('X')
#Etiqueta del eje y
ax.set_ylabel('Y')
ax.grid(True)
ax.legend(["y = x**2"])

plt.title('Puntos')
plt.show()

fig.savefig("gráfica.png")
