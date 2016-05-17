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

					$result = mysql_select_db( DB_NAME, $con);
					if (!$result) {
					  exit('データベースを選択できませんでした。');
					}

					$result = mysql_query('SET NAMES utf8', $con);
					if (!$result) {
					  exit('文字コードを指定できませんでした。');
					}

					$result = mysql_query('SELECT * FROM client WHERE id = 1', $con);
					$data = mysql_fetch_array($result);

					if($data['cart'] > 0) {

print <<< EOT
						</br>
						<font size="4">
							<b>カート内の商品{$data['cart']}件を購入しました。</b></br>
							<b>カート内総額 <font color="#cc3333">\ {$data['amount']}</font></b></br>
						</font>
						</br>
						<font size="2">{$data['address']}に配送します。</font></br>

						</br>
						</br>
						<form action="./bookgrid.php" method="post">
EOT;

							$cart = 0;
							$amount = 0;
							$result = mysql_query('UPDATE client SET cart = '.$cart.', amount = '.$amount.' WHERE id = 1', $con);

					} else {
						echo "<font size='4'><b>カート内に商品がありません。</b></br></br></font>";
					}

print <<< EOT
						<b><a href="./bookgrid.php"><font size="2" face="HGPｺﾞｼｯｸM">メニューに戻る</font></a></b><br>
					</form>
					</br>
					</br>
EOT;

					$con = mysql_close($con);
					if (!$con) {
					  exit('データベースとの接続を閉じられませんでした。');
					}

				}
				?>

		</font>
	</BODY>
</html>
