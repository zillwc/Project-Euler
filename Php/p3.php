<?php
	$num=600851475143;
	$factor=2;
	while (1) {
		$factor=getSmallestFactor($num);
		if ($factor<$num) $num=$num/$factor;
		else break;
	}
	echo $num."\n";

	function getSmallestFactor($n) {
		$limit = sqrt($n);
		for ($i=2;$i<=$limit;$i++)
			if ($n%$i==0)
				return $i;
		return $n;
	}
?>