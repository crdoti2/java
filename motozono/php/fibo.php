<html ...>
  <head>
  <meta char set="utf-8">
  </head>
  <body>
  <form method="post" action="./fibo.php">
  数値を入力してください：<input type="number" name="num" size="10"/><br/>  
  <input type="submit" value="送信" /><br />
  </form>
  </body>
</html>
<?php
     $_n1 = 0;
     $_n2 = 1;
	 $_n3 = $_n1 + $_n2;
	 
	 
	if(isset($_POST["num"])){
		while( $_n1 <= $_POST["num"] ){
	    	echo $_n1.",";

	    	$_n1 = $_n2;
	    	$_n2 = $_n3;
	    	$_n3 = $_n1 + $_n2;
		}
	}
?>