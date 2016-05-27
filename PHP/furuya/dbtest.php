<?php
$link = mysql_connect('localhost:3306', 'root', '');
if (!$link) {
    print(mysql_error());
}
echo "¬Œ÷‚µ‚Ü‚µ‚½!\n";
// MySQL‚É‘Î‚·‚éˆ—

mysql_close($link);


?>