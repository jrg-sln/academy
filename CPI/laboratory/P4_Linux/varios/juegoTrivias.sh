#!/bin/bash/

clear
echo "		Juego de preguntas"
echo "		Bienvenidos"
sleep 1
echo "Soy el tipico juego de preguntas y respuestas."
sleep 2

echo "Si aciertas todas las preguntas, te concedere el titulo de Magister del Universo."
echo ""
echo "1. Como se llamaba el ultimo emperador Romano de occidente: claudio, teodosio
o romulo?"
read respuesta1
if test $respuesta1 = romulo
then
	echo "Respuesta correcta."
else
	echo "Lo siento, la respuesta correcta es: Romulo."
fi
sleep 2

echo ""
echo "2. Que celebre filosofo Griego tuvo por discipulo
a Alejandro Magno: platon, aristoteles o zenon?"
read respuesta2
if test $respuesta2 = aristoteles
then
	echo "Respuesta correcta."
else
	echo "Lo siento, la respuesta correcta es: Aristoteles."
fi

if test $respuesta1 = romulo && test $respuesta2 = aristoteles
then
	echo "		Eres un MAGISTER DEL UNIVERSO."
else
	echo "Siguelo intentando... Adios!"
fi
