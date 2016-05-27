<html>
<head>
<mata charset"utf-8">

<LINK href="table.css" rel="stylesheet" type="text/css">
<LINK href="form2.css" rel="stylesheet" type="text/css">
<LINK href="form3.css" rel="stylesheet" type="text/css">
<LINK href="input.css" rel="stylesheet" type="text/css">
<style type="text/css">
input.example2 { width: 300px; }


 

 div.centerForm {
 width: 50%;
 margin-left: auto;
 margin-right: auto;
 }


</style>

</head>
<body>



<?php


if (isset($_POST["id"])) {
  
   
   
    try{
   $dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';
			
			
			$dbh = new PDO($dsn, $user, $password);

			print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');
			
			
			
			
			$sql = "select * from t_test where id=".$_POST["id"];
			foreach ($dbh->query($sql) as $row) {
			
			
			$radio1="";
			$radio2="";
			
			 if($row['buy']=='購入済み'){
			  $radio1="checked";
			  }else if($row['buy']=='未購入'){
			   $radio2="checked";
		       }
			
echo <<< EOM





<div class="centerForm ">




<form method="post" class="cmxform"  action="./update.php"  autocomplete="off" >

<input type="hidden" name="id" value={$row['id']} >

<fieldset>
  <legend>Delivery Details</legend>
  <ol>
  <li>
      <label for="name">タイトル</label>
      <input type="text"  class="example2" id="name" name="title"  value="{$row['name']}" />
     

    </li>
  <li>
  
      <label for="address1">著者</label>
      <input type="text" id="address1" name="author" value="{$row['author']}" />
    </li>
    <li>
      <label >購入</label>
    <label for="radio1" ><input type="radio"  name="buyBtn" value="購入済み" id="radio1" {$radio1} />購入済み</label>
        <label for="radio2"><input type="radio" name="buyBtn" value="未購入" id="radio2" {$radio2}/>未購入</label>
    </li>
   
  </ol>
</fieldset>

<input type="submit" value="送信する"  >



</form>

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