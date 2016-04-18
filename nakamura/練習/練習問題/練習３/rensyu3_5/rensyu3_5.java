//------------------------------------------------------------------------------
//
//　正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
//　※奇数、偶数の判定には除算の余りを利用する。
//
//------------------------------------------------------------------------------

public class rensyu3_5 {

	public static void main(String[] args){
		// 変数の宣言
		int n;

		// 入力
		System.out.print("任意の数字を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();

		if(n % 2 == 0){
			System.out.printf("偶数です\n");
		} else {
			System.out.printf("奇数です\n");
		}		
	}
}
