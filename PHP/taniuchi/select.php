<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/select.css"/>
<title>ショップサイト</title>
</head>
<body>
<h1 class="header">ショッピーーーーーーーーーーーーーーーング</h1>

<?php

$dsn='mysql:dbname=shop_data;host=localhost';
$user='root';
$password='';
$length_count=0;
$pluspage=0;
$page=null;
if(isset($_GET['page']))
	$page = $_GET['page'];
try{
	$pdo=new PDO($dsn,$user,$password);
	$pdo->query('SET NAMES utf-8');
	if($page==null || $page==1){
		$setnum=0;
	}else{
		$setnum= $_GET['page']*9/2;
	}
	$offset = " offset ".$setnum;
	$num=9;
	$limit= " limit ".$num;
	$sql=queryrun("select * from book_data");
	$showData=queryrun("select * from book_data".$limit.$offset);
	
print <<<EOT
<table>
	<tr>
EOT;
	foreach($showData as $row){
print <<<EOT
	<td>
		<a href = "itemDetail.php?data='{$row['id']}'"><img src = imgs/{$row['img_src']}></a> </br>
		<a href = "itemDetail.php?data='{$row['id']}'">{$row['書籍名']}</a></br>
		{$row['著者']}</br>
		{$row['出版社']}</br>
	\	{$row['価格']}</br>
	</td>	
EOT;
		$length_count++;
		if($length_count>2){
			print "</tr>";
			$length_count=0;
		}
	}
print "</tr>";
print "</table>";


}catch(PDOException $e){
	print('Error:'.$e->getMessage());
	die();
}


foreach(queryrun("select count(*) from book_data") as $key =>$countsql)
$maxpage=ceil($countsql['count(*)']/9);
$disp=5;
$start =  ($page-floor($disp/2) > 0) ? ($page-floor($disp/2)) : 1;//始点
$end =  ($start > 1) ? ($page+floor($disp/2)) : $disp;//終点	

for($i=$start; $i <= $end ; $i++){//ページリンク表示ループ
	if($i<=$maxpage&& $i>0){
		print '<a href="?page='.$i.'"'.'>'."|".$i.'</a>';
	}
	
}

$dbh = null;

function queryrun($query)
{
	global $pdo;
	$result = $pdo->query($query)->fetchAll();
	return $result;
}

?>
<body>
</html>