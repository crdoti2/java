//------------------------------------------------------------------------------
//
//　自然数（正の整数）を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_9 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int n = 0;
		int max;
		int min;

		System.out.printf("自然数（正の整数）を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();

		max = n;
		min = n;

		for(i = 2; i < 10; i++) {
			System.out.printf("自然数（正の整数）を入力 ＞ ");
			n = new java.util.Scanner(System.in).nextInt();
			if(n > max) {
				max = n;
			} else if(n < min) {
				min = n;
			}
		}
		System.out.printf("最大値：%d\n最小値：%d\n", max, min);
	}
}
