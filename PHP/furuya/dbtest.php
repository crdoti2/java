<?php
$link = mysql_connect('localhost:3306', 'root', '');
if (!$link) {
    print(mysql_error());
}
echo "成功しました!\n";
// MySQLに対する処理

mysql_close($link);


?>