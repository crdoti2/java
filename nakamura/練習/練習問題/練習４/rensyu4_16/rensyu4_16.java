//------------------------------------------------------------------------------
//
//　入力された数が素数かどうかを判定するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_16 {

	public static void main(String[] args){
		// 変数の宣言
		int i = 2;
		int j = 0;
		int n;
		int m;

		System.out.printf("２以上の整数値を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();
		m = n;

		while(m >= 0) {
			if(m == 1) {
				break;
			}
			if(m % i == 0) {
				m = m / i;
				j++;
			}
			if(m % i != 0) {
				i++;
			}
		}
		if(j == 1) {
			System.out.printf("%dは素数\n", n);
		} else {
			System.out.printf("%dは素数ではない\n", n);
		}
	}
}
