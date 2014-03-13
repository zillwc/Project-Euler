#!/bin/bash

function isPalindromic() {
	if [ $1 == $(echo $1 | rev) ]; then
		return 0
	else
		return 1
	fi
}
largest=0
for i in `seq 100 999`; do
	for j in `seq 100 999`; do
		prod=$((i*j))
		echo -e "${i}\t${j}\t${prod}"
		if [ $prod == $(echo $prod | rev) -a $prod -gt $largest ]; then
			largest=$prod
		fi
	done
done
echo $largest