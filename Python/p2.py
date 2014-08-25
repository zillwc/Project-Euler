#!/usr/bin/python
LIMIT=4000000
prev=fib=sum=0
next=1
while 1:
	fib=prev+next
	prev=next
	next=fib
	if (fib>LIMIT): break
	if (fib%2==0): sum+=fib
print sum