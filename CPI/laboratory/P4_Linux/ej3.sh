#!/bin/bash



clear

echo "##########################"

echo "                          "

echo "#       CALCULADORA      #"

echo "                          "

echo "##########################"

echo "Calculadora bAsica"
read -p "Introduce el primer nUmero: " num1
read -p "Introduce el segundo nUmero: " num2

echo  "Escribe la opcion que desees:"
select opcion in suma resta divide multiplica salir
do
	case $opcion in
		suma)
			echo "$num1 + $num2 = " `expr $num1 + $num2`;;
		resta)
			echo "$num1 - $num2 = " `expr $num1 - $num2`;;
		divide)
			echo "$num1 / $num2 = " `expr $num1 / $num2`;;
		multiplica)
			echo "$num1 * $num2 = " `expr $num1 \* $num2`;;
		salir)
			echo "Hasta pronto...!!!"
			exit;;
		*)
			 echo "Opcion no valida";;
	esac
done