#!/bin/bash

clear
echo " ------ COMANDOS BASICOS ------ "

echo  "Escribe lo que desees ejecutar:"
select opcion in mostrar_contenido_carpeta usuario_actual version fecha salir
do
	case $opcion in
		mostrar_contenido_carpeta)
			ls;;
		usuario_actual)
			whoami;;
		version)
			uname -a;;
		fecha)
			date;;
		salir)
			echo "Hasta pronto...!!!"
			exit;;
		*)
			 echo "Opcion no valida";;
	esac
done
