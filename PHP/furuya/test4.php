<html>
<head>
<mata charset"utf-8">
</head>
<body>
<form method="post" action="./test4.php">
数値を入力して下さい:<input type="number" name="num"size="10"/><br />
<input type="submit"value="送信"/>
</form>
<?php


if (isset($_POST["num"])) {
   //echo $_POST['num']*$_POST['num'];
   
   
$in=0;
$de=$_POST['num']-1;


$s="";
//スペースと*が文字化けするため、代わりにoとlを使用

//sの初期化
for($i = 0; $i <= $_POST['num']-1; $i++){
   $s.="o";
}

for ($i = 0; $i <= $_POST['num']-1; $i++) {
    $s = substr_replace($s, 'l',$in ,1) ;
    $s = substr_replace($s, 'l',$de ,1) ;
    echo  "$s<br>";
    
    $s="";
   for($j = 0; $j <=$_POST['num']-1 ; $j++){
   $s.="o";
}
    $in++;
    $de--;
}
}

?>
</form>
</body>
</html>