<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript; charset=utf-8"/>

	<HEAD>
		<TITLE>本 - 通販 オンライン書店</TITLE>
			<TABLE>
				<TD>
					<a href="./bookgrid.php">
						<img src="../src/logo.gif" >
					</a>
				</TD>
				<TD>
					<form action="search.php" method="post">
						<input type="text" name="searchword" size="60" /><input type="submit" value="検索" />
					</form></br>
				</TD>
			</TABLE>
		<hr>
	</HEAD>

	<BODY>
		<font face="HGPｺﾞｼｯｸE">

				<?php
				define( 'DB_HOST', 'localhost' );
				define( 'DB_USER', 'root' );
				define( 'DB_PASS', '' );
				define( 'DB_NAME', 'shop_db' );
				{

					$con = mysql_connect( DB_HOST, DB_USER, DB_PASS );
					if (!$con) {
					  exit('データベースに接続できませんでした。');
					}

					$resultC = mysql_select_db( DB_NAME, $con);
					if (!$resultC) {
					  exit('データベースを選択できませんでした。');
					}

					$resultC = mysql_query('SET NAMES utf8', $con);
					if (!$resultC) {
					  exit('文字コードを指定できませんでした。');
					}

					$resultC = mysql_query('SELECT * FROM client WHERE id = 1', $con);
					$data1 = mysql_fetch_array($resultC);

					$resultB = mysql_select_db( DB_NAME, $con);
					if (!$resultB) {
					  exit('データベースを選択できませんでした。');
					}

					$resultB = mysql_query('SET NAMES utf8', $con);
					if (!$resultB) {
					  exit('文字コードを指定できませんでした。');
					}

					$resultB = mysql_query('SELECT * FROM books WHERE id = '.$_GET['id'], $con);
					$data2 = mysql_fetch_array($resultB);

					echo "</br>";

					if(isset($_POST["quantity"])){


						echo "</br>";
						echo "<font size='4'>";
							echo "<b>カートに".$_POST["quantity"]."件入れました。</b></br>";
						echo "</font>";
						echo "</br>";
						$cart = $data1['cart'] + $_POST["quantity"];
						$amount = $data1['amount'] + $data2['price'] * $_POST["quantity"];
						$resultC = mysql_query('UPDATE client SET cart = '.$cart.' WHERE id = 1', $con);
						$resultC = mysql_query('UPDATE client SET amount = '.$amount.' WHERE id = 1', $con);

						$stock = $data2['stock'] - $_POST["quantity"];
						$data2['stock'] = $stock;
						$resultB = mysql_query('UPDATE books SET stock = '.$stock.' WHERE id = '.$_GET['id'], $con);

						$resultC = mysql_query('SELECT * FROM client WHERE id = 1', $con);
						$data1 = mysql_fetch_array($resultC);

						echo "<font size='2'>現在".$data1['cart']."件入っています。</font></br>";
						echo "<font size='2' color='cc3333'>カート内総額".$data1['amount']."円</font></br>";

						$con = mysql_close($con);
						if (!$con) {
						  exit('データベースとの接続を閉じられませんでした。');
						}

					}else {
						print "個数を選んでください</br>";
					}
print <<< EOT
					</br>
					</br>
					<form action="./bookgrid.php" method="post">
						<b><a href="./bookgrid.php"><font size="2" face="HGPｺﾞｼｯｸM">メニューに戻る</font></a></b><br>
					</form>
					</br>
					</br>
EOT;
				}
				?>

		</font>
	</BODY>
</html>
