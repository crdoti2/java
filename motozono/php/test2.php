<html>
<head><title>PHP TEST</title></head>
<body>

<?php

$dsn = 'mysql:dbname=test;host=localhost';
$user = 'root';
$password = '';

try{

	$dbh = new PDO($dsn,$user,$password);

	print('接続に成功しました。<br>');

	$dbh->query('SET NAMES sjis');

	$sql = 'select * from test2';
	foreach ($dbh->query($sql) as $row) {
		

		print($row['id']);
		print($row['name']);
		print($row['age']);
		print($row['section'].'<br>');
	}
}catch (PDOException $e){
	print('Erro:'.$e->getMessage());
	die();
}
$dbh = null;

?>

</body>
</html>