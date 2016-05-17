<html>

<head>

<meta charset="UTF-8">

<LINK href="table.css" rel="stylesheet" type="text/css">
<LINK href="page.css" rel="stylesheet" type="text/css">

<style TYPE="text/css">
	#rp1 { position: relative; z-index: 1; left:0 top:0;}
	#rp2 { position: relative; z-index: 2;  left:0 top:0;}
	p.newline {width:150px; word-break: break-all;}
	.cp{cursor: pointer;}
	table.example8 td { vertical-align:  middle; }
</style>

</head>

<body>
<BODY background="C:\\xampp\htdocs\image\back2.jpg">

<form action="./kadai0512.php" method="POST">
	<select name="order">
		<option value=1>リリースが新しい順</option>
		<option value=2>書籍名順</option>
		<option value=3>価格が低い順</option>
	</select>
	<input type="submit" value="更新"/>
</form>



<form method="post" action="./kadai0512_bookData.php">
	<table align="center">
		<?php
			$dsn = 'mysql:dbname=db_book;host=localhost';
			$user = 'root';
			$password = '';

	try{
			$arrayURL = array();
			$arrayID = array();
			$arrayNAME = array();
			$arrayRELEASE = array();
			$arrayAUTHOR = array();
			$arrayPUBLISHER = array();
			$arrayPRICE = array();
	
			$dbh = new PDO($dsn, $user, $password);

			//print('接続に成功しました。<br>');

			$dbh->query('SET NAMES utf-8');

			if( isset( $_POST[ 'order' ] ) ){
				if($_POST[ 'order' ] == 1){
					$sql = 'select * from t_book order by releaseNum DESC';
				}else if($_POST[ 'order' ] == 2){
					$sql = 'select * from t_book order by name';
				}else if($_POST[ 'order' ] == 3){
 					$sql = 'select * from t_book order by price';
				}
			}else{
				$sql = 'select * from t_book ';
			}

			foreach ($dbh->query($sql) as $row) {
				$s=$row['url'];
				array_push($arrayURL, $row['url']);
				array_push($arrayID,  $row['id']);
				array_push($arrayNAME,  $row['name']);
				array_push($arrayRELEASE,  $row['release']);
				array_push($arrayAUTHOR,  $row['author']);
				array_push($arrayPUBLISHER,  $row['publisher']);
				array_push($arrayPRICE,  $row['price']);
    		}
		}catch (PDOException $e){
			print('Error:'.$e->getMessage());
			die();
		}

		$dbh = null;

		if( isset( $_GET[ 'id' ] ) ){
			if($_GET[ 'id' ] == 1){
				$startBookNumber = 0;
			}else if($_GET[ 'id' ] == 2){
				$startBookNumber = 9;
			}else if($_GET[ 'id' ] == 3){
				$startBookNumber = 18;
			}
		}else{
			$startBookNumber = 0;
		}

		// $s = "C:\\xampp\htdocs\image\icon2.jpg";

		for ($i = 0; $i < 3; $i++) {
    		$bookNumber = 3*$i + $startBookNumber;
     		print('<tr>');
 
			if( isset( $arrayID[$bookNumber] ) ){
				print('<td><button type="submit" name="id" value="'.$arrayID[$bookNumber].'" style="border:none;background-color:transparent;" class="cp">');
				print('<img src="'.$arrayURL[$bookNumber].'" width="100px" height="150px" >');
				print('<br><p class="newline">'.$arrayNAME[$bookNumber].'</p>');
				print('</button>');
				print('</td>');
 			}
 
 			if( isset( $arrayID[$bookNumber] ) ){
 				print('<td><button type="submit" name="id" value="'.$arrayID[$bookNumber+1].'" style="border:none;background-color:transparent;" class="cp">');
 				print('<img src="'.$arrayURL[$bookNumber+1].'" width="100px"height="150px" >');
 				print('<br><p class="newline">'.$arrayNAME[$bookNumber+1].'</p>');
 				print('</button>');
 				print('</td>');
 			}
 
 			if( isset( $arrayID[$bookNumber] ) ){
				print('<td><button type="submit" name="id" value="'.$arrayID[$bookNumber+2].'" style="border:none;background-color:transparent;" class="cp"> ');
				print('<img src="'.$arrayURL[$bookNumber+2].'" width="100px"height="150px" >');
				print('<br><p class="newline">'.$arrayNAME[$bookNumber+2].'</p>');
				print('</button>');
				print('</td>');
			 }
     		print('</tr>');
		}

		print('</table>');

echo <<< EOM
			<table class="type11 example8" align="center">
				<tbody>
					<tr>
						<th>No</th>
						<th>タイトル</th>
						<th>リリース日</th>
						<th>著者</th>
						<th>出版社</th>
						<th>価格</th>
					</tr>
EOM;
		
 		for ($i = 0; $i < 20; $i++) {
			
			$listNum = $i+1;
			
			$price= number_format($arrayPRICE[$i]);
			
			print('<tr >');
			
			//print('<td><button type="submit" name="id" value="'.$arrayID[$i].'" style="border:none;background-color:transparent;" class="cp">'.$arrayID[$i].'</button></td>');
			
			print('<td>'.$listNum.'</td>');
			print('<td><button type="submit" name="id" value="'.$arrayID[$i].'" style="border:none;background-color:transparent;" class="cp">'.$arrayNAME[$i].'</button></td>');
 			print('<td><button type="submit" name="id" value="'.$arrayID[$i].'" style="border:none;background-color:transparent;" class="cp">'.$arrayRELEASE[$i].'</button></td>');
 			print('<td><button type="submit" name="id" value="'.$arrayID[$i].'" style="border:none;background-color:transparent;" class="cp">'.$arrayAUTHOR[$i].'</button></td>');
			print('<td><button type="submit" name="id" value="'.$arrayID[$i].'" style="border:none;background-color:transparent;" class="cp">'.$arrayPUBLISHER[$i].'</button></td>');
 			print('<td><button type="submit" name="id" value="'.$arrayID[$i].'" style="border:none;background-color:transparent;" class="cp">&yen;'.$price.'</button></td>');
			print('</tr>');
		
		}

		?>
	
			</tbody>
		</table>
</form>


<div class="pager">
	<ul>
		<li><a href="#">prev</a></li>
		<li><a href="./kadai0512.php?id=1">1</a></li>
		<li><a href="./kadai0512.php?id=2">2</a></li>
		<li><a href="./kadai0512.php?id=3">3</a></li>
		<li><a href="#">next</a></li>
	</ul>
</div>

</body>
</html>