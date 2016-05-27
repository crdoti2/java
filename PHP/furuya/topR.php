<html>
<head>
<mata charset"utf-8">
<LINK href="table2.css" rel="stylesheet" type="text/css">
<LINK href="table4.css" rel="stylesheet" type="text/css">
<style type="text/css">
div.centerForm {
 width: 90%;
 margin-left: auto;
 margin-right: auto;
 }
 
 a:link { color:   blue ; text-decoration:none;}
 a:visited { color: mediumvioletred; }
 a:hover { color:  dodgerblue ; text-decoration:underline; }

.header {
    background-color: hsl(60, 50%, 50%);
    color: white;
    padding-left: 5px;
    border-left: 8px groove hsl(60, 50%, 35%);
}


</style>

</head>
<body background="C:\\xampp\htdocs\image\back3.jpg">



<?php

$sql="";


if (isset($_POST["buy"])) {
echo <<< EOM
<h3 class="header">
検索結果
</h3>
EOM;

		$sql = "SELECT * FROM t_test WHERE buy='".$_POST['buy']."'";

  
   }




if (isset($_POST["seach"])) {

			$seach = $_POST["seach"];

			$sql = "SELECT * FROM t_test  WHERE " .$_POST["select"]. " LIKE '%$seach%' order by name";

if($_POST["select"] =="name"){
		$seachEntry="タイトル";
}else if($_POST["select"] =="author"){
		$seachEntry="著者";
}
echo <<< EOM

<h3 class="header">
検索結果
</h3>

<div class="centerForm " >
<table class="sample_03">
<tbody>
<tr>
<th>検索ワード</th>
<td>{$_POST["seach"]}</td>
</tr>
<tr>
<th>検索項目</th>
<td>{$seachEntry}</td>
</tr>

</tbody>
</table>
</div>

<HR size=3 style="border:0; border-bottom:medium double #999;">


EOM;
   }
   
  
	//$sql="SELECT * FROM t_test WHERE buy='購入済み'";

   
   if ($sql != "") {
   try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('<br>');

			$dbh->query('SET NAMES utf-8');
			
			$sum = 0;
			foreach ($dbh->query($sql) as $row) {
			$sum++;
			
			}
			
			if($sum>0){
			
			echo "検索結果: ".$sum."件";
			
echo <<< EOM1

<form method="POST" name="form" action="./check_delete.php">

<div class="centerForm " >
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
      <td width="1500"><p  align="left"><a href="./detail.php?id='{$row['id']}'" >{$row['name']}</a></p></td>
      <td  width="200">{$row['author']}</td>
       <td width="200">{$row['buy']}</td>
       <td><input type="checkbox" name="check[]" value="{$row['id']}"></td>
    </tr>

EOM2;
				
    		}
print('<tbody>');
print('</table>');
print('<br><Div Align="right"><input type="submit" value="削除"></Div>');
print('</form>');

print('</div>');
print('<br><Div Align="right"><input type="submit" value="全てにチェックする" name="aaa" onClick="AllCheckedT();" />');
print('<sapn>				</span>');
print('<input type="submit" value="全てのチェックを外す" name="aaa" onClick="AllCheckedF();" /></Div><br>');

}else{
echo "検索結果が見つかりませんでした";
}


		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;
		}
   
?>

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
