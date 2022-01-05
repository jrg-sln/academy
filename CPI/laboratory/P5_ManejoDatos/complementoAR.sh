#!/bin/bash

read -p "Introduce nUmero " num
read -p "Introduce nUmero de dIgitos del nUmero " dig
read -p "Introduce la base " base

# ar = r^n - |N|
pot=1
for ((i=0;i<$dig;i++))
do
	let pot=$pot*$base
done

echo $pot
if [ $num -lt 0 ]
then
	let num=$num*-1
fi
echo $num
let complemento=$pot-$num
echo $complemento
