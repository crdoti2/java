<html ...>
  <head>
  <meta char set="utf-8">
  </head>
  <body>
  <form method="post" action="./soin.php">
  数値を入力してください：<input type="number" name="num" size="10"/><br/>  
  <input type="submit" value="送信" /><br />
  </form>
  </body>
</html>
<?php
	if(isset($_POST["num"])){
		for( $_x = 2 ; $_POST["num"] > 1; $_x++ ){
			while( ( $_POST["num"] % $_x ) == 0 ){
        	echo $_x."　";
        	$_POST["num"] /= $_x;
    		}
		}	
	}
?>