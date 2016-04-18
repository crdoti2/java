//------------------------------------------------------------------------------
//
//　String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu2_1 {

	public static void main(String[] args){
		// 変数の宣言
		String s;

		// 入力
		System.out.print("任意の文字列を入力 ＞ ");
		s = new java.util.Scanner(System.in).nextLine();

		// 出力
		System.out.printf("s = %s\n", s);
	}
}
