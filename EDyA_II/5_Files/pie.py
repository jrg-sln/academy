# -*- coding: utf-8 -*-

import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D

impr = ["Aprobados", "No aprobados", "deserción", "NP"]
vol = [2, 10, 20, 10]
expl =(0.15, 0.05, 0, 0)
fig1, ax1 = plt.subplots()
ax1.pie(vol, explode=expl, labels=impr, autopct='%1.1f%%', shadow=True, startangle=90)
plt.savefig('pie.png')
plt.show()
