<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript; charset=utf-8"/>

	<HEAD>
		<TITLE>本 - 通販 オンライン書店</TITLE>
		<link rel="stylesheet" type="text/css" href="colorchange.css">
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

		</br>
			<font size="4" face="HGPｺﾞｼｯｸE">◇いま売れている 本 </font>
			<a href="./booklist.php"><font size="2">表示切替</font></a>
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

			if(!(isset($_GET['id']))) {
				$id = 1;
			} else {
				$id = $_GET['id'];
			}
			if(!(isset($_GET['cnt']))) {
				$cnt = 1;
			} else {
				$cnt = $_GET['cnt'] + 1;
			}

			$i = $id;
			$sql = sprintf( 'SELECT * FROM books WHERE id = %d', $i );
			$result = mysql_query( $sql );

			echo "<table width='1000' height='700'>";

				while($data = mysql_fetch_array($result)) {
					echo "<td>";

print <<< EOT
						<img src="./view.php?id={$i}" height=125 hspace=5 vspace=5>
						</br>

						<form action="./bookmore.php" method="post">
							<b><a href="./bookmore.php?id={$i}"><font size="2" face="HGPｺﾞｼｯｸM">{$data['title']}</font></a></b><br>
						</form>

						<b><font size="1" face="HGPｺﾞｼｯｸE"></br>新品  </font></b>
						<b><font size="2" color="#cc3333" face="HGPｺﾞｼｯｸM">\ {$data['price']}</font></b>
					</td>
EOT;
					if($i % 3 == 0) {
						echo "<tr>";
					}
					$i++;
					if($i >= $id + 9){
						break;
					}
					$sql = sprintf( 'SELECT * FROM books WHERE id = %d', $i );
					$result = mysql_query( $sql );
				}
print <<< EOT
			</table>
			</br>
EOT;

			if($cnt * 9 < $i) {
				echo "<a href='./bookgrid.php?id=".$i."&cnt=".$cnt."'><font size='2'>次の9件へ</font></a>";
			}

print <<< EOT
			</br>
			</br>
			</br>
			</br>
			</br>
			</br>
			</br>
			</br>
			</br>
EOT;
			$con = mysql_close($con);
			if (!$con) {
			  exit('データベースとの接続を閉じられませんでした。');
			}

		}
		?>

	</BODY>
</html>