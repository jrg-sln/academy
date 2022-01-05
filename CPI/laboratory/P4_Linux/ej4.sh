#!/bin/sh

clear
echo "################################"
echo "#     PROGRAMA DE EJEMPLO      #"
echo "#  DE LA SENTENCIA DE CONTROL  #"
echo "#       DE FLUJO WHILE         #"
echo "################################"

a=42
while [ $a -le 53 ]
do
	echo "Contador = $a"
	a=`expr $a + 1`
done
