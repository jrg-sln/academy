#!/bin/bash

clear
echo "#######################################"
echo "CONVERTIR UN NUMERO BASE OCHO A BINARIO"
read -p "De cuAntos dIgitos consta el nUmero octal? " dig
i=0
a=0
b=1
for ((i=1;i<=$dig;i++))
do
	read -p "Ingresa el nUmero $i de izquierda a derecha " num
	case $num in
		0)
			c=$c$num
			bin=$bin$a$a$a;;
		1)
			c=$c$num
			bin=$bin$a$a$b;;
		2)
			c=$c$num
			bin=$bin$a$b$a;;
		3)
			c=$c$num
			bin=$bin$a$b$b;;
		4)
			c=$c$num
			bin=$bin$b$a$a;;
		5)
			c=$c$num
			bin=$bin$b$a$b;;
		6)
			c=$c$num
			bin=$bin$b$b$a;;
		7)
			c=$c$num
			bin=$bin$b$b$b;;
	esac
done
echo "El nUmero $c base 8 en binario es: $bin"