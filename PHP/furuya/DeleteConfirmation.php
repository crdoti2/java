<html>
<head>
<mata charset"utf-8">
<LINK href="table3.css" rel="stylesheet" type="text/css">
<style type="text/css">
div.centerForm {
 width: 50%;
 margin-left: auto;
 margin-right: auto;
 }
</style>

</head>
<body>

<?php

echo <<< EOM1
削除しますか？
<form method="POST" action="./delete.php">
<input type="hidden" name="id" value={$_POST["id"]}>
<input type="submit" value="はい"  >
</form>

<FORM>
 <INPUT type="button" value="いいえ" onClick="history.back()">
 </FORM>
EOM1;




if (isset($_POST["id"])) {
   
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');
						
			$sql = "select * from t_test where id = ".$_POST["id"];
			foreach ($dbh->query($sql) as $row) {
			
echo <<< EOM2


<div class="centerForm ">
<table class="type05">
	<tr>
		<th scope="row">タイトル</th>
		<td>{$row['name']}</td>
	</tr>
	<tr>
		<th scope="row">著者名</th>
		<td>{$row['author']}</td>
	</tr>
	<tr>
		<th scope="row">購入</th>
		<td>{$row['buy']}</td>
	</tr>
</table>
</div>


EOM2;
				
    		}
		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;
   }
?>



</body>
</html>








