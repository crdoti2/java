<html>
<head>
<meta charset="utf-8">
</head>
<body>
<?php
$in=0;
$de=4;

//$s = "ooooo";
$s="";
for($i = 0; $i < 5; $i++){
   $s.="o";
}
//$s = substr_replace($s, '#', 2,1) ;
//echo  "$s";
for ($i = 0; $i < 5; $i++) {
    $s = substr_replace($s, '+',$in ,1) ;
    $s = substr_replace($s, '+',$de ,1) ;
    echo  "$s<br>";
    
    $s="";
   for($j = 0; $j < 5; $j++){
   $s.="o";
}
    $in++;
    $de--;
}

?>
</body>
</html>