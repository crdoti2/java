<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript; charset=utf-8"/>

	<HEAD>
		<TITLE>本 - 通販 オンライン書店</TITLE>
		<link rel="stylesheet" type="text/css" href="colorchange.css">
			<TABLE>
				<TD>
					<a href="./booklist.php">
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

		</br>
		<font size="4" face="HGPｺﾞｼｯｸE">◇いま売れている 本 </font>
			<a href="./bookgrid.php"><font size="2">表示切替</font></a>
		</br>
		</br>

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

			$i=1;

			echo "<table>";

				$sql = sprintf( 'SELECT * FROM books WHERE id = %d', $i );
				$result = mysql_query( $sql );

				while($data = mysql_fetch_array($result)) {

				print <<< EOT
					<td>
						<img src="./view.php?id={$i}" height=75 hspace=10 vspace=10>
					</td>

					<td>
						<form action='./bookmore.php' method='post'>
							<a href="./bookmore.php?id={$i}"><b><font size="3" face="HGPｺﾞｼｯｸM">{$data['title']}</font></b></a></br>
						</form>
						<font size="1"></br>著者：{$data['author']}</br></br></font>
						<font size="1"><b>新品  </font><font size="2" color="#cc3333">\ {$data['price']}</font></b></br>
						</font>
					</td>

					<tr>
EOT;
					$i++;
					$sql = sprintf( 'SELECT * FROM books WHERE id = %d', $i );
					$result = mysql_query( $sql );
				}

			echo "</table>";

			$con = mysql_close($con);
			if (!$con) {
			  exit('データベースとの接続を閉じられませんでした。');
			}

		}

		?>

	</BODY>
</html>
