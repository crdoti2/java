//------------------------------------------------------------------------------
//
//　２つの整数値を入力し、
//　大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu3_2 {

	public static void main(String[] args){
		// 変数の宣言
		int x, y;

		// 入力
		System.out.print("任意の数字を入力 x ＞ ");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.print("任意の数字を入力 y ＞ ");
		y = new java.util.Scanner(System.in).nextInt();

		if(x > y){
			System.out.printf("大きいのは%dです。\n", x);
		} else {
			System.out.printf("大きいのは%dです。\n", y);
		}
	}
}
