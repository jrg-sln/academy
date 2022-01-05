
# coding: utf-8

# In[2]:

#Algoritmo que determina el log de 2 (entero) de un número.

def logBase2(intEntero):
    if intEntero==1:
        return 0
    if (intEntero%2 == 0):
        log = 1 + logBase2(intEntero/2)
        return log
    else:
        log = logBase2((intEntero -1)/2) + 1
        return log
    
logBase2(8)    


# In[ ]:



