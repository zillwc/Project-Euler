#!/usr/bin/perl

$fib=$sum=$prev=0, $next=1, $limit=4000000;
while (true) {
	$fib=$prev+$next, $prev=$next, $next=$fib;
	if ($fib>$limit) {last;}
	if (($fib%2)==0) {$sum+=$fib;}
}
print $sum."\n";