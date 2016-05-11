<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>フォームから GET で送信されたデータを表示 - サンプル1 - PHP入門 - Webkaru</title>
</head>
<body>
<form method="GET" action="test2.php">
<p>
  <label>年齢：</label>
  <input type="text" name="age" />
</p>
<p>
  <label>性別：</label>
  <input type="radio" name="seibetsu" value="男性" checked>男性
  <input type="radio" name="seibetsu" value="女性">女性
</p>
<?php
if(isset($_GET["age"])){
  echo "<p>年齢：" . $_GET["age"] ."</p>";
  echo "<p>性別：" . $_GET["seibetsu"] ."</p>";
 }
?>

<input type="submit" value="送信" />
</form>
</body>
</html>
