<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Script-Type" content="text/javascript; charset=utf-8"/>

	<HEAD>
		<TITLE>本 - 通販 オンライン書店</TITLE>
		<link rel="stylesheet" type="text/css" href="inputchange.css">
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

				<table>

					<?php
					define( 'DB_HOST', 'localhost' );
					define( 'DB_USER', 'root' );
					define( 'DB_PASS', '' );
					define( 'DB_NAME', 'shop_db' );
					define( 'TB_NAME_1', 'books' );
					define( 'TB_NAME_2', 'client' );
					{

						$con = mysql_connect( DB_HOST, DB_USER, DB_PASS );
						if (!$con) {
						  exit('データベースに接続できませんでした。');
						}

						$result1 = mysql_select_db( DB_NAME, $con);
						if (!$result1) {
						  exit('データベースを選択できませんでした。');
						}

						$result1 = mysql_query('SET NAMES utf8', $con);
						if (!$result1) {
						  exit('文字コードを指定できませんでした。');
						}

						$result1 = mysql_query('SELECT * FROM '.TB_NAME_1.' WHERE id = '.$_GET['id'], $con);
						$data1 = mysql_fetch_array($result1);

						$result2 = mysql_select_db( DB_NAME, $con);
						if (!$result2) {
						  exit('データベースを選択できませんでした。');
						}

						$result2 = mysql_query('SET NAMES utf8', $con);
						if (!$result2) {
						  exit('文字コードを指定できませんでした。');
						}

						$result2 = mysql_query('SELECT * FROM '.TB_NAME_2.' WHERE id = 1', $con);
						$data2 = mysql_fetch_array($result2);

print <<< EOT
						<td width="275">
							<a href="./view.php?id={$_GET['id']}" target="_blank">
								<img src="./view.php?id={$_GET['id']}" height=300 hspace=10 vspace=10 align=top>
							</a>
						</td>

						<td width="60%" valign="top">
							</br>
							<b><font size="4">{$data1['title']}</font></b></br>
							<font face="HGPｺﾞｼｯｸM">単行本 - {$data1['relesedate']}</font></br>
							<font size="2">
								</br>
								著者：{$data1['author']}</br>
								</br>
								<hr>
								</br>
								<b>新品</b>  <font size="4" color="#cc3333">\ {$data1['price']}</font></br>
								</br>
								</br>
EOT;
								if($data1['stock'] > 0) {
									echo "<font size='4' color='#339955'>残り<b>".$data1['stock']."点</b></font>";
								} else {
									echo "<font size='4' color='#cc3333'><b>現在、在庫切れです。</b></font>";
								}
print <<< EOT
								</br>
								</br>
								</br>
EOT;
							if($data1['stock'] > 0) {
print <<< EOT
								数量：
							</font>
								<form name= "form1" method="post" action="./bookCartIn.php?id={$_GET['id']}">

									<select name="quantity">

EOT;
										for($i=1; $i<=$data1['stock']; $i++) {

											echo "<option value='".$i."'>".$i."</option>";

										}
print <<< EOT

									</select>
									</br>
									</br>
									</br>

									<input type="submit" onclick="location.href='./bookCartIn.php'" name="btn_submit" value="" class="btn_submit" width="240">
								</form>
								</br>

EOT;
							}

print <<< EOT
						</td>
						
EOT;
					}
					?>

						<td align="center" valign='top'>

							</br>
							</br>
							</br>

							<?php
							{


								echo "現在、カートに".$data2['cart']."件入ってます</br></br>";
								echo "カート内総額 <font color='cc3333'>\ ".$data2['amount']."</font></br>";

								echo "</br>";
								echo "</br>";

								$con = mysql_close($con);
								if (!$con) {
								  exit('データベースとの接続を閉じられませんでした。');
								}

							}
							?>
							<span type='button' onclick='location.href="./bookCartBuy.php"' value='buy'>
								<img src="../src/Buy.jpg" width=150
									onmouseover="this.src='../src/BuyOut.jpg'"
									onmouseout="this.src='../src/Buy.jpg'"
								>
							</span>

							</br>

						</td>

				</table>
				<?php
					echo "<form action='./bookgrid.php' method='post'>";
						echo "<b><a href='./bookgrid.php'><font size='2' face='HGPｺﾞｼｯｸM'>メニューに戻る</font></a></b><br>";
					echo "</form>";
				?>
		</font>
	</BODY>
</html>
