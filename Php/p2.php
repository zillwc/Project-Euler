<?php
	$fib=$sum=$prev=0;
	$next=1;
	$limit=4000000;
	while (1) {
		$fib=$prev+$next;
		$prev=$next;
		$next=$fib;
		if ($fib>$limit) break;
		if ($fib%2==0) $sum+=$fib;
	}
	echo $sum."\n";
?>