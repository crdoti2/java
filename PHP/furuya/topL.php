<html>
<head>
<mata charset"utf-8">
<LINK href="table2.css" rel="stylesheet" type="text/css">
<style type="text/css">
div.centerForm {
 width: 50%;
 margin-left: auto;
 margin-right: auto;
 }
 
 a:link { color:   blue ; text-decoration:none;}
 a:visited { color: mediumvioletred; }
 a:hover { color:  dodgerblue ; text-decoration:underline; }

</style>

</head>
<body>

<form method="POST" action="./topR.php"  target="topR" >

 <input type="text" name="seach">




<select name="select">
<option value="name">タイトル</option>
<option value="author">著者</option>
</select>

 <input type="submit" value="検索">
</form>

<form method="POST" action="./topR.php"  target="topR">
<input type="submit" name="buy" value="購入済み">
<input type="submit" name="buy" value="未購入">
<br>
<input type="submit" formaction="./test2.php" name="new" value="新規登録">
<input type="submit" formaction="./topR.php"  value="トップ">
</form>






</body>
</html>
