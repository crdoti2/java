<html ...>
  <head>
  <meta char set="utf-8">
  </head>
  <body>
  <form method="post" action="./asuta.php">
  数値を入力してください：<input type="number" name="num" size="10"/><br/>  
  <input type="submit" value="送信" /><br />
  </form>
  </body>
</html>
<?php

	
	if(isset($_POST["num"])){
		for( $_i= 0; $_i < $_POST["num"]; $_i++ ){
    		for( $_j = 0; $_j < $_POST["num"]; $_j++ ){
        		if( $_i == $_j || ( $_POST["num"] - $_i - 1 ) == $_j ){
            		echo "X";
        		}else{
            		echo "　";
    			}
    		} echo "<br/>" ;
    	} 
	}
?>