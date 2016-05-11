<html>
<head><title>PHP TEST</title></head>
<body>

<?php
$dsn='mysql:dbname=dbtest;host=localhost';
$user='root';
$password='';

try{
	$dbh=new PDO($dsn,$user,$password);
	print('接続に成功しました。</br>');
	$dbh->query('SET NAMES utf-8');
	$sql='select * from dbtest';

print <<<EOT
<table border='1'>
<tr>
<th>id</th><th>名前</th>
</tr>
EOT;
	
	foreach($dbh->query($sql) as $row){
print <<<EOT
<tr>
	<td>{$row['id']}</td>
	<td>{$row['name']}</td>
</tr>
EOT;
		}
	print "</table>";
}catch(PDOException $e){
	print('Error:'.$e->getMessage());
	die();
}

$dbh = null;

?>
</body>
</html>