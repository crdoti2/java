<html>
<head>
<title>練習</title>
</head>
<body>
<form action="soinsubunkai.php" method="post">
<p>
	数値:
	<input type="text" name="num">
	<input type="submit" value="実行">
</p>
<?php
if(isset($_POST['num'])){
	$s=1;
	$num=$_POST['num'];
	for($i=2;$i<=$num;$i++){
		if($num%$i==0){
			$num=$num/$i;
			echo $i,"</br>";
			$i=2;
			if($num==$i){
				break;
			}
			continue;
		}
	}
}
?>
</form>
</body>
</html>