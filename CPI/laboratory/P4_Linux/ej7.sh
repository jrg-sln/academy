#!/bin/bash
clear
a=$1
b=$2

echo "Recibiendo variables..."
sleep 2
echo "Variable a = $1"
echo "Variable b = $2"
c=$[$a + $b]
echo "Variable c = a + b = $c"
c=$[$a / $b]
echo "Variable c = a / b = $c"
sleep 1

echo ""
echo "Uniendo las variables a, b y c:"
echo $a$b$c
sleep 1

echo ""
echo "Uniendo la variable b:"
echo $b$b$b
sleep 1
echo ""