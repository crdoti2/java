<html>
<head>
<mata charset"utf-8">
<LINK href="table2.css" rel="stylesheet" type="text/css">
<style type="text/css">
div.centerForm {
 width: 50%;
 margin-left: auto;
 margin-right: auto;
 }
 
 a:link { color:   blue ; text-decoration:none;}
 a:visited { color: mediumvioletred; }
 a:hover { color:  dodgerblue ; text-decoration:underline; }

</style>

</head>
<body>

<form method="POST" action="./top.php">

 <input type="text" name="seach">


<?php
 //POST(submit)された値を$selectに取得
 $select="";
 if(isset($_POST['select']))$select=$_POST['select'];
 ?>

<select name="select">
<option value="name"<?php if($select=='name') echo 'selected';?>>タイトル</option>
<option value="author"<?php if($select=='author') echo 'selected';?>>著者</option>
</select>

 <input type="submit" value="検索">
</form>

<form method="POST" action="./top.php">
<input type="submit" name="buy" value="購入済み">
<input type="submit" name="buy" value="未購入">
</form>





<?php

$sql="";


if (isset($_POST["buy"])) {

		$sql = "SELECT * FROM t_test WHERE buy='".$_POST['buy']."'";

  
   }




if (isset($_POST["seach"])) {

			$seach = $_POST["seach"];

			$sql = "SELECT * FROM t_test  WHERE " .$_POST["select"]. " LIKE '%$seach%' order by name";

  
   }
   
  
	//$sql="SELECT * FROM t_test WHERE buy='購入済み'";

   
   if ($sql != "") {
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');
			
			
			
			
			
echo <<< EOM1
<form method="POST" name="form" action="./check_delete.php">

<div class="centerForm ">
<table class="aaa" >
  <tbody>
    <tr>
      <th>ID</th>
      <th><p  align="left">タイトル</p></th>
      <th>著者</th>
       <th>購入</th>
       <th>チェック</th>
    </tr>
			
EOM1;
			foreach ($dbh->query($sql) as $row) {
			
echo <<< EOM2

 <tr height="50p">
      <td>{$row['id']}</td>
      <td width="500"><p  align="left"><a href="./detail.php?id='{$row['id']}'" >{$row['name']}</a></p></td>
      <td  width="200">{$row['author']}</td>
       <td width="200">{$row['buy']}</td>
       <td><input type="checkbox" name="check[]" value="{$row['id']}"></td>
    </tr>

EOM2;
				
    		}
print('<tbody>');
print('</table>');
print('</div>');
print('<input type="submit" value="削除">');
print('</form>');


		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;
		}
   
?>

<input type="submit" value="全てにチェック" name="aaa" onClick="AllCheckedT();" />
<input type="submit" value="全てのチェックを外す" name="aaa" onClick="AllCheckedF();" />

<script language="JavaScript" type="text/javascript">
<!--

function AllCheckedT(){

 for (var i=0; i<document.form.elements['check[]'].length; i++){
  document.form.elements['check[]'][i].checked = true;
  }
}
function AllCheckedF(){

  for (var i=0; i<document.form.elements['check[]'].length; i++){
  document.form.elements['check[]'][i].checked = false;

  }
}
//-->
</script>


</body>
</html>
