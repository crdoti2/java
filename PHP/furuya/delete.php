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

echo "削除しました";



if (isset($_POST["id"])) {
   
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			
			$dbh = new PDO($dsn, $user, $password);

			$dbh->query('SET NAMES utf-8');
						
			$sql = 'DELETE FROM t_test where id = :delete_id';
			$stmt = $dbh -> prepare($sql);
			$stmt -> bindParam(':delete_id', $_POST["id"], PDO::PARAM_INT);
			$stmt -> execute();

		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;
   }
?>



</body>
</html>








