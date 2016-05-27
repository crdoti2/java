<html>
<head>
<mata charset"utf-8">

<LINK href="table.css" rel="stylesheet" type="text/css">
<LINK href="form2.css" rel="stylesheet" type="text/css">
<LINK href="form3.css" rel="stylesheet" type="text/css">
<LINK href="input.css" rel="stylesheet" type="text/css">
<style type="text/css">
input.example2 { width: 300px; }


 

 div.centerForm {
 width: 50%;
 margin-left: auto;
 margin-right: auto;
 }


</style>

</head>
<body>



<div class="centerForm ">


<form method="post" class="cmxform"  action="./re-entering.php"  autocomplete="off" >



<fieldset>
  <legend>Delivery Details</legend>
  <ol>
  <li>
      <label for="name">タイトル</label>
      <input type="text"  class="example2" id="name" name="title" list="word"     />
      <datalist id="word">
 <option value="AAA">
 <option value="BBB">
 <option value="CCC">
</datalist>

    </li>
  <li>
  
      <label for="address1">著者</label>
      <input type="text" id="address1" name="author" />
    </li>
    <li>
      <label >購入</label>
    <label for="radio1" ><input type="radio"  name="buyBtn" value="購入済み" id="radio1" />購入済み</label>
        <label for="radio2"><input type="radio" name="buyBtn" value="未購入" id="radio2"/>未購入</label>
    </li>
   
  </ol>
</fieldset>

<input type="submit" value="送信する"  >



</form>

</div>




<?php


if (isset($_POST["num"])) {
   echo $_POST['num'];
   }
   

   
?>










</body>
</html>