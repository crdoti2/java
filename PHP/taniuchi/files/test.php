<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>test</title>
</head>
<body>
<form action="test.php" method="post">

	<p>
		入力された数値の次乗をします:
		<input type="text" name="num">
	</p>
	
	<input type="submit">
	</br></br>
	
	<?php
	if($_POST){
			echo "答えは",number_format($_POST['num']*$_POST['num']);
		}
	?>
</form>
</body>
</html>
