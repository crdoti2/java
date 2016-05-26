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

<form method="POST" action="./top.php">
 <input type="text" name="seach">
 <input type="submit" value="送信">
</form>

<?php



if (isset($_POST["seach"])) {

   $seach = $_POST["seach"];
   
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');
			
			
			
			$sql = "SELECT * FROM t_test WHERE name LIKE '%$seach%'";
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


</body>
</html>
