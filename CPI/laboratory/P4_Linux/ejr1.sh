#!/bin/bash

clear
echo "#########################################"
echo "#      LABORATORIO DE COMPUTACION       #"
echo "#           PARA INGENIEROS             #"
echo "#########################################"
echo ""
echo "Bienvenido $1"
echo ""
echo "Se ha creado una carpeta con tu nombre en esta ubicaciOn"
mkdir $1
ls -la | grep $1
sleep 1

echo ""
echo "InstrucciOn ls":
ls
sleep 1

echo ""
echo "InstrucciOn whoami:"
whoami
sleep 1

echo ""
echo "InstrucciOn date:"
date
sleep 1

echo ""
echo "InstrucciOn uname:"
uname -a
sleep 1

echo ""
echo "Se ha borrado la carpeta creada con tu nombre."
rm -rf $1
sleep 1

echo ""
echo "InstrucciOn ls":
ls
sleep 1
