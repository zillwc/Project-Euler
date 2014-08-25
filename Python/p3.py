#!/usr/bin/python
import math

def getSmallestFactor(num):
	limit = int(math.sqrt(num))
	for i in xrange(2, limit):
		if (num%i==0): return i;
	return num

num=600851475143
factor=2
while 1:
	factor=getSmallestFactor(num)
	if (factor<num): num=num/factor
	else: break
print num