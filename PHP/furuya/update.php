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




		if($_POST['title']==""){
			$titleB = "no title";
		}else{
   			$titleB = $_POST['title'];
		}
		
		$authorB =  $_POST['author'];
		

   
   if (isset($_POST["buyBtn"])) {
		$buyB =  $_POST['buyBtn'];
   }else{
		$buyB = "";
   }

   
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');
			
			
			
			
			
			$stmt = $dbh -> prepare("update t_test set name =:name, author =:author, buy =:buy, updateTime=now() where id = :value");
			
			
			$stmt->bindParam(':name',   $_POST["title"], PDO::PARAM_STR);
			$stmt->bindParam(':author', $_POST["author"], PDO::PARAM_STR);
			$stmt->bindParam(':buy', $_POST["buyBtn"], PDO::PARAM_STR);
			$stmt->bindValue(':value',  $_POST["id"], PDO::PARAM_INT);
			$stmt->execute();
			
			
			
			$sql = "select * from t_test where id = ".$_POST["id"];
			foreach ($dbh->query($sql) as $row) {
			
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
</table>
</div>


EOM;
				
    		}
		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;
   
?>

<form method="POST" action="./edit.php">
<input type="hidden" name="id" value=<?php echo $_POST["id"]; ?>>
<input type="submit" value="編集"  >
</form>

</body>
</html>








