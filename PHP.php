<?php

$num1 = readline();
$num2 = (float)readline();
$num3 = (float)readline();

$mul = $num2 + (0.15 * $num3);

echo "TOTAL = R$ ".number_format($mul,2,'.','')."\n";

?>
