<html>
<head><title>PHP TEST</title></head>
<body>

<?php
$dsn='mysql:dbname=dbtest;host=localhost';
$user='root';
$password='';
$name="����";
try{
	$pdo=new PDO($dsn,$user,$password);
	print('�ڑ��ɐ������܂����B</br>');
	$sql=$pdo->prepare("insert into dbtest (id,name) values(:id,:name));
	$sql->bindParam(':id',2,PDO::PARAM_INT);
	$sql->bindValue(':name',$name,PDO::PARAM_STR);
	
	$sql->execute();
	
}catch(PDOException $e){
	print('Error:'.$e->getMessage());
	die();
}

$pdo = null;

?>
</body>
</html>