#!/bin/bash

case "$1" in
        saludar)
               echo "El argumento de entrada fue $1"
		echo "Hola..."
                ;;
        despedir)
               echo "El argumento de entrada fue $1"
                echo "Adios..."
		;;
        nombrar)
               echo "El argumento de entrada fue $1"
                echo "mi nombre es Script";;
        *)
                echo "No reconosco la palabra ingresada"
                
esac
