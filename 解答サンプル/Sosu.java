/**
*
*　ベタな素数の求め方
*
*/
class Sosu {
  public static int FROM_NUMBER = 2; //開始する値
  public static int TO_NUMBER = 1000; //終了する値
  public static int LINE_MAX = 10; //1行に表示する個数
  public static String SEPARATE = ","; //区切り文字


  public static void main(String[] args) {

    int cnt = 0; //現在の1行の表示個数を0にする

    for (int i = FROM_NUMBER; i <= TO_NUMBER; i++) {

      boolean isSosu = true; //素数としておく
      for (int j = FROM_NUMBER; j <= (i / 2); j++) { //2で割っている理由は2よりも小さな数値で割る必要がないため
        if (i % j == 0) { //割り切れたので素数ではない
          isSosu = false; //素数ではない
          break; //これ以上は計算する必要がないので抜ける
        }
      }

      
      if (isSosu) { //素数だったら
        if (cnt == LINE_MAX) {  //1行に表示する個数だったら
          System.out.println(""); //改行する
          cnt = 0; //現在の1行の表示個数を0にする
        }
         cnt++; //表示個数をインクリメント
        if (cnt != 1) { //先頭でなければ(1個めでなければ)
          System.out.print(SEPARATE); //区切り文字表示
        }
        System.out.print("" + i); //素数を表示
      }
    }
  }
}