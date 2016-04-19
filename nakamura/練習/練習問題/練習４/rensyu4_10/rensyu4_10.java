//------------------------------------------------------------------------------
//
//　個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_10 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int n = 0;

		System.out.printf("整数を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();

		for(i = 0; i < n; i++) {
			System.out.print("*");
		}
	}
}
