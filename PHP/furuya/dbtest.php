<?php
$link = mysql_connect('localhost:3306', 'root', '');
if (!$link) {
    print(mysql_error());
}
echo "�������܂���!\n";
// MySQL�ɑ΂��鏈��

mysql_close($link);


?>