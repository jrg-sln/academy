#!/bin/bash

clear
echo "##########################"
echo "#                        #"
echo "#  TABLA DE MULTIPLICAR  #"
echo "#                        #"
echo "##########################"

echo "Tabla de multiplicar de $1"
for((i=1;i<=10;i++))
do
echo "$i * $1 = " `expr $i \* $1`
done
