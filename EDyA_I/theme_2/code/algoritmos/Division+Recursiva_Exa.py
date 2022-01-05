
# coding: utf-8

# In[ ]:

#Algoritmo que divide cualquier número entre 7 sin usar /

def divisionRecursivo (intNumeroDividir):
    if intNumeroDividir < 7:
        return 0
    if intNumeroDividir >= 7:
        intNumeroDividir = intNumeroDividir-7
        res = divisionRecursivo(intNumeroDividir)+1
        return res 

print(divisionRecursivo(1000))