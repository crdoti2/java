//------------------------------------------------------------------------------
//
//　整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
//　“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
//
//------------------------------------------------------------------------------

public class rensyu3_6 {

	public static void main(String[] args){
		// 変数の宣言
		int n;

		// 入力
		System.out.print("任意の数字を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();

		if(n >= 0) {
			if(n % 2 == 0) {
				System.out.printf("正の偶数\n");
			} else {
				System.out.printf("正の奇数\n");
			}
		} else {
			if(n % 2 == 0) {
				System.out.printf("負の偶数\n");
			} else {
				System.out.printf("負の奇数\n");
			}
		}		
	}
}
