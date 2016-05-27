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




		

   
   if (isset($_GET["id"])) {
   
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');
			
			
			
			
			$sql = "select * from t_test where id=".$_GET["id"];
			foreach ($dbh->query($sql) as $row) {
			
			$bookId = $row['id'];
			
echo <<< EOM


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
	<tr>
		<th scope="row">登録日</th>
		<td>{$row['time']}</td>
	</tr>
	<tr>
		<th scope="row">最終更新日</th>
		<td>{$row['updateTime']}</td>
	</tr>
</table>
</div>


EOM;
				
    		}
		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;
   }
?>



<form method="POST" action="./edit.php">
<input type="hidden" name="id" value=<?php echo $bookId; ?> >
<input type="submit" name="edit" value="編集">
</form>

<form method="POST" action="./change_new.php">
<input type="hidden" name="id" value=<?php echo $bookId; ?> >
<input type="submit" name="edit" value="編集して新規で登録">
</form>

<form method="POST" action="./DeleteConfirmation.php">
<input type="hidden" name="id" value=<?php echo $bookId; ?> >
<input type="submit"  value="削除">
</form>

</body>
</html>








