//------------------------------------------------------------------------------
//
//　数値を繰り返して入力し、0 が入力されたら入力を止め、
//　それまでの合計を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_18 {

	public static void main(String[] args){
		// 変数の宣言
		int n = 1;
		int sum = 0;

		while(true) {
			System.out.print("整数を入力 ＞ ");
			n = new java.util.Scanner(System.in).nextInt();
			if(n == 0) {
				break;
			} else if(n < 0) {
				// 何もしない
			} else {
				sum += n;
			}
		}
		System.out.printf("合計は%dです\n", sum);
	}
}
