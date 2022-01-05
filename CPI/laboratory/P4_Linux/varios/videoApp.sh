#!/bin/bash

clear
echo "		VIDEO"
echo "	======================"
echo "ESCOGER UN CRITERIO DE BUSQUEDA"
echo "1.- Busqueda por director."
echo "2.- Busqueda por productora."
echo "3.- Busqueda por titulo."
echo "4.- Busqueda por fecha."
echo "5.- Salir."
read criterio
case $criterio in
1)
	echo "Cual es el nombre del director?"
	read director
	grep $director /root/lcpi/base.txt
	read pausa
	/root/lcpi/videoApp.sh
	;;
2)
	echo "Cual es el nombre de la productora?"
	read productora
	grep $productora /root/lcpi/base.txt
	read pausa
	/root/lcpi/videoApp.sh
	;;
3)
	echo "Cual es el titulo de la pelicula?"
	read titulo
	grep $titulo /root/lcpi/base.txt
	read pausa
	/root/lcpi/videoApp.sh
	;;
4)
	echo "En que fecha produjo la pelicula?"
	read ano
	grep $ano /root/lcpi/base.txt
	read pausa
	/root/lcpi/videoApp.sh
	;;
5)
	;;
esac
