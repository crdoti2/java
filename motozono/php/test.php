<?php
class MyException1 extends Exception {
}

class MyException2 extends Exception {
}

try {
    throw new MyException2("MyException2");
} catch (MyException1 $e) {
    echo "MyException1\n";             // 実行されない
} catch (MyException2 $e) {
    echo "MyException2\n";             // 実行される
} catch (Exception $e) { // 親クラス例外はサブクラスより後ろに記述する
    echo "Exception\n";                // 実行されない
}
?>