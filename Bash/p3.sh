#!/bin/bash

function getSmallestFactor() {
	limit=$(echo "sqrt($1)" | bc -l | awk -F'.' '{print $1}')
	defaultVal=$1
	for i in `seq 2 $limit`; do
		if [ $(($1%i)) -eq 0 ]; then
			defaultVal=$i
			break
		fi
	done
	echo $defaultVal
}

num=600851475143
factor=2
while :
do
	factor=$(getSmallestFactor $num)
	if [ $factor -lt $num ]; then
		num=$((num/factor))
	else
		break
	fi
done
echo $num