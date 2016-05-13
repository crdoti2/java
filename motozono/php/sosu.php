<html ...>
  <head>
  <meta char set="utf-8">
  </head>
  <body>
  <form method="post" action="./sosu.php">
  数値を入力してください：<input type="number" name="num" size="10"/><br/>  
  <input type="submit" value="送信" /><br />
  </form>
  </body>
</html>
<?php
	if(isset($_POST["num"])){
	
		for( $_n = 2; $_n <= ( $_POST["num"] / 2 ) ; $_n++ ){
	    if( ( $_POST["num"] % $_n ) == 0 ){
	        break;
	        }
		}

	if( $_n > ( $_POST["num"] / 2 ) ){
	    echo $_POST["num"]."は素数です";
	}else{
	    echo $_POST["num"]."は素数ではありません" ;
		}
	}
?>