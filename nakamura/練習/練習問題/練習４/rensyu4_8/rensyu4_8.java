//------------------------------------------------------------------------------
//
//　自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_8 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int n = 0;
		int m = 0;

		for(i = 1; i < 10; i++) {
			System.out.printf("自然数（正の整数）を入力 ＞ ");
			n = new java.util.Scanner(System.in).nextInt();
			if(n < 0) {
				System.out.printf("不正な値です\n");
			} else if(n > m) {
				m = n;
			}
		}
		System.out.printf("最大値%dです\n", m);
	}
}
