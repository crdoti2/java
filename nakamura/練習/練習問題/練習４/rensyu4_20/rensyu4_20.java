//------------------------------------------------------------------------------
//
//　サイズを示す数値を入力し、
//　何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_20 {

	public static void main(String[] args){
		// 変数の宣言
		int i, j;
		int n;

		System.out.printf("整数を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();

		for(i = 0; i <= n; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}
}
