//------------------------------------------------------------------------------
//
//　int 型の変数 x、y にそれぞれ数値を入力し、
//　x が ｙ より大きい場合には“xはyより大きい”、
//　x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu3_3 {

	public static void main(String[] args){
		// 変数の宣言
		int x, y;

		// 入力
		System.out.print("任意の数字を入力 x ＞ ");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.print("任意の数字を入力 y ＞ ");
		y = new java.util.Scanner(System.in).nextInt();

		if(x > y){
			System.out.printf("xはyより大きい\n");
		} else {
			System.out.printf("xはyより小さい\n");
		}
	}
}
