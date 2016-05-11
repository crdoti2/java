<html>
<head>
<title>練習</title>
</head>
<body>
<form action="expX.php" method="post">
<p>
	数値:
	<input type="text" name="num">
	<input type="submit" value="実行">
</p>
<?php
	$num = $_POST['num'];
	if(isset($_POST['num'])){
		$max = $num;
		$min = 1;
		for($i=1;$i<=$num;$i++){
			for($j=1;$j<=$num;$j++){
				if($j==$min||$j==$max)
					echo "＊";
				else
					echo "　";
			}
			$max--;
			$min++;
			echo "</br>";
		}
	}
?>
</form>
</body>
</html>