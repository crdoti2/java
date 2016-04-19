//------------------------------------------------------------------------------
//
//　サイズを示す数値を入力し、
//　そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_21 {

	public static void main(String[] args){
		// 変数の宣言
		int i, j;
		int n;
		int inc, dec;

		System.out.printf("整数を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();
		inc = 1;
		dec = n;

		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n; j++) {
				if(j == inc || j == dec) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			inc++;
			dec--;
			System.out.println("");
		}
	}
}
