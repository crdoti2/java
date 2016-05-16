<HTML>
<HEAD>
<TITLE>VERSION TEST</TITLE>
</HEAD>

<BODY>

	<form action="./org5.php" method="post">
		<font size="3">数値を入力して下さい：</font>
		<input type="number" name="num" size=10 />
		<input type="submit" value="送信" />
	</form>

	<?php
		if(isset($_POST['num'])) {

			$inc = 1;
			$dec = $_POST['num'];

			for( $i=1; $i<=$_POST['num']; $i++ ) {
				for( $j=1; $j<=$_POST['num']; $j++ ) {
					if($inc == $j || $dec == $j) {
						echo "＊";
					} else {
						echo "　";
					}
				}
				$inc++;
				$dec--;
				echo "<br/>";
			}

		}
	?>

</BODY>
</HTML>
