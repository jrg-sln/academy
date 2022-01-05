#!/bin/sh

clear


echo "################################"


echo "#     PROGRAMA DE EJEMPLO      #"

echo "#  DE LA SENTENCIA DE CONTROL  #"

echo "#       DE FLUJO WHILE         #"

echo "################################"


# -eq = true si iguales

# -ne = true si distintos

# -gt = true dato1 mayor que dato2

# -ge = true dato1 mayor o igual que dato2

# -lt = true dato1 menor que dato2

# -le = true dato1 menor o igual que dato2


a=42

while [ $a -le 53 ]

do

	echo "Contador = $a"

	a=`expr $a + 1`

done
