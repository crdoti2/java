<html>
<head>
<mata charset"utf-8">
<LINK href="table3.css" rel="stylesheet" type="text/css">
<LINK href="table2.css" rel="stylesheet" type="text/css">
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



  if (isset($_POST["check"])) {
  
  foreach ($_POST["check"] as &$value) {
    			echo $value ;
			}
   
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('以下を削除しました。<br>');

			$dbh->query('SET NAMES utf-8');

			$sql = 'SELECT * FROM t_test WHERE id in ('.implode(',',$_POST["check"]).');';

echo <<< EOM1
<form method="POST" action="./check_delete.php">

<div class="centerForm ">
<table class="aaa">
  <tbody>
    <tr>
      <th>ID</th>
      <th>タイトル</th>
      <th>著者</th>
       <th>購入</th>
    </tr>
			
EOM1;



foreach ($dbh->query($sql) as $row) {
echo <<< EOM2

 <tr>
      <td>{$row['id']}</td>
      <td>{$row['name']}</td>
      <td>{$row['author']}</td>
       <td>{$row['buy']}</td>
        </tr>

EOM2;
}
print('<tbody>');
print('</table>');
print('</div>');

$delete_id = implode(',',$_POST["check"]);
echo $delete_id;

			//$sql = 'DELETE FROM t_test where id in ( :delete_id )';
			$sql = 'DELETE FROM t_test where id in ('.$delete_id.')';
			$stmt = $dbh -> prepare($sql);
			//$stmt -> bindParam(':delete_id', $delete_id, PDO::PARAM_STR);
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








