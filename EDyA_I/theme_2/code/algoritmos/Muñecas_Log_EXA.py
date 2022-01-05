
# coding: utf-8

# In[1]:

#Una matrioska consiste en una muñeca que contiene en su interior otras de igual forma pero cada vez más pequeñas. 
#El volumen de cada muñeca es 2/3 de la anterior. Suponiendo que la muñeca más pequeña tiene un volumen de 31.6 cm^3
#Este es un algoritmo que dice cuántas muñecas caben dentro de otra de un determinado volumen.

def cantidadMuñecas (ReaVolumen):
    if ReaVolumen < 31.6:
        return 0
    else:
        comp = 1 + cantidadMuñecas((ReaVolumen*2)/3)
        return comp

print(cantidadMuñecas(100))


# In[ ]:



