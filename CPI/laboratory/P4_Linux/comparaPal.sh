#!/bin/bash

while read j
do
	for i in `cat archivo.txt`
	do
		a=$i
		#echo $j
		comp=`echo $j | grep $a | cut -d ':' -f 1`
		if [ "$a" = "$comp" ]
		then
			echo $j
		fi
	done
done < muro.txt
