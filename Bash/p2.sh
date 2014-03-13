#!/bin/bash

next=1
while :
do
	fib=$((prev+next))
	prev=$next
	next=$fib
	if [ $fib -gt 4000000 ]; then
		break
	fi
	if [ $((fib % 2)) -eq 0 ]; then
		sum=$((sum+fib))
	fi
done
echo $sum