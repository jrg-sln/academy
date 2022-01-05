#!/bin/bash
clear
echo "###Conversor de sistema decimal a binario###"
echo "##### (Solo calcula numeros enteros) #####"
echo ""
echo ""
echo "Ingresar el numero en sistema decimal"
read a
echo "Calculando..."
sleep 1
if [ $a -eq 0 ]
then
num=0
else
for((n=0;(2**n)<=$a;n++))
do
c=0
d=1
done
until [ $n = 0 ]
do
n=$[ $n - 1 ]
i=$[ 2**$n ]
if [ $a -ge $i ]
then a=$[ $a - $i ]
num=($num$d)
else
num=($num$c)
fi
done
fi
echo "Binario = $num"
