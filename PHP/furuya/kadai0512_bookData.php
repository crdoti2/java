<html>
<head>

<meta charset="UTF-8">
<link href="./title.css" rel="stylesheet" type="text/css" >
<link href="./title2.css" rel="stylesheet" type="text/css" >
<style TYPE="text/css">


.gyo1 {line-height: 320%;}
.gyo2 {line-height: 200%;}

.midasi03{  
    border-top:1px dashed #ccc;
     border-right:1px dashed #ccc; 
     border-left:7px solid #ff1493;   
     border-bottom:1px dashed #ccc;  
     padding:.6em .8em 

}


</style>



</head>
<body>
<BODY background="C:\\xampp\htdocs\image\back.jpg">
<table cellspacing="20">
  <tr>
   
<?php

if (isset($_POST["id"])) {
  
	$dsn = 'mysql:dbname=db_book;host=localhost';
	$user = 'root';
	$password = '';

	try{

	 $dbh = new PDO($dsn, $user, $password);
    
   // print('接続に成功しました。<br>');

    $dbh->query('SET NAMES utf-8');


    $sql = 'select * from t_book where id = '.$_POST["id"];
    foreach ($dbh->query($sql) as $row) {
    //print($row['id']);
		// print($row['url']);
		// print('<br>');
		
		$price= number_format($row['price']);
		
		  //<h1 class="entry-content" style="font-size: 25px;">

echo <<< EOM
			<th>
			<img src="{$row['url']}" width="300px" height="400px" >
			</th>
			
			<th align="center" valign="top">
		
			<h3  style="font-size: 30px;" >
			{$row['name']}
			</h3>
			<Div align="left" class="gyo1"><FONT size="10" color="red">&yen;&nbsp;{$price}</FONT></Div>
			<Div align="left" class="gyo2"><FONT color="blue">発売日:&nbsp;&nbsp;&nbsp;{$row['release']}</FONT></Div>
			<Div align="left"class="gyo2"><FONT color="blue">著者:&nbsp;&nbsp;&nbsp;{$row['author']}</FONT></Div>
			<Div align="left"class="gyo2"><FONT color="blue">出版社:&nbsp;&nbsp;&nbsp;{$row['publisher']}</FONT></Div>
			<p>&nbsp;</p>
			<Div align="left"class="gyo2" style="background-color : #AAEEDD">
			数量
			<select name="tosi"> 
			 <option value="1">1</option> 
			 <option value="2">2</option> 
			 <option value="3">3</option> 
			 <option value="4">4</option>
			 <option value="5">5</option> 
			 <option value="6">6</option> 
			 <option value="7">7</option> 
			 <option value="8">8</option> 
			 <option value="9">9</option> 
			 <option value="10">10</option>  
			 </select>
			 <br>
			 <button class="button button-orange" style="width:200px;height:60px">カートに入れる</button>
			 </Div>



			
			</th>
EOM;
		 
 
		 //align="left" Hspace="30"
		 
		
     
    }
}catch (PDOException $e){
    print('Error:'.$e->getMessage());
    die();
}

$dbh = null;

}
  // print('<h1>見出しのサンプル</h1>');


?>

</tr>
 
</table>







</body>
</html>