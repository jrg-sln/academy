#!/bin/bash

clear
echo "#################################"
echo "#                               #"
echo "#  CONVERTIR UN NUMERO DECIMAL  #"
echo "#           A BINARIO           #"
echo "#                               #"
echo "#################################"

echo ""
a=$1
b=""
until [ $a = 0 ]
do
	b=$[$a % 2]$b
	a=$[$a / 2]
done
echo "La conversiOn a binario de $1"
echo "es: $b"