#!/usr/bin/ruby
p 999.downto(3).select {
	|x| x % 3 == 0 || x % 5 ==0
}.inject(:+)