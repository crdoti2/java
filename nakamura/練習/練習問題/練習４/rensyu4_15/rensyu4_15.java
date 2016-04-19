//------------------------------------------------------------------------------
//
//　2 以上の数値を入力し、素因数分解した結果を表示しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_15 {

	public static void main(String[] args){
		// 変数の宣言
		int i = 2;
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
				System.out.printf("%2d, ", i);
			}
			if(m % i != 0) {
				i++;
			}
		}
	}
}
