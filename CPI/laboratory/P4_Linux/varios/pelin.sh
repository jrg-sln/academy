#!/bin/sh

clear
echo " 		VIDEO BASE "
echo "	 ========================"
echo "Nuevo registro en curso"
sleep 2
echo "- Director:"
read director
sleep 1
echo "- Pelicula:"
read pelicula
sleep 1
echo "- Fecha de Produccion:"
read fecha
sleep 1
echo "- Productora:"
read productora
echo "$director $pelicula $fecha $productora >> /root/lcpi/base.txt
