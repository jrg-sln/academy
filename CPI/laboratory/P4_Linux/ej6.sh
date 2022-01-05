#!/bin/bash

echo "#################################"
echo "#      PROGRAMA DE EJEMPLO      #"
echo "# DE LA SENTENCIA DE CONTROL DE #"
echo "#          FLUJO UNTIL          #"
echo "#################################"

echo ""
until [ $a = hal9000 ]
do
	echo "Bienvenidos a Programa. Para continuar escribe el password."
	read a
done
	echo "Password correcto."