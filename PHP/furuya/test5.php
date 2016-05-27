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




   
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');
			
			
			//$stmt = $dbh -> prepare("insert into t_test(name, author, buy) values('$titleB', '$authorB', '$buyB')");
			//$stmt->bindParam(':name', $name, PDO::PARAM_STR);
			//$stmt->bindParam(':author', $author, PDO::PARAM_STR);
			//$stmt->bindParam(':buy', $buy, PDO::PARAM_STR);
			//$stmt->execute();
			$name="sss";
			
			$array = array("1", "2", "3", "4");
			foreach ($array as &$value) {
    			echo $value ;
			}

			//$name = "test";
			//$stmt = $dbh -> prepare("insert into t_book(name,time) values(:name,now())");
			//$stmt->bindParam(':name', $name, PDO::PARAM_STR);
			
			//$stmt->execute();
			
			$sql = "SELECT * FROM t_book WHERE name= 'test'";


foreach ($dbh->query($sql) as $row) {
//echo $row['id'];
echo $row['name'];
echo $row['time'];

}
			
		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;
   
?>


</body>
</html>








