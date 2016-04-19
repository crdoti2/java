//------------------------------------------------------------------------------
//
//　数値を繰り返し入力し、
//　合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_12 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int sum = 0;

		for(i = 1; sum < 100; i++) {
			System.out.printf("%2d回目：整数を入力 ＞ ", i);
			sum += new java.util.Scanner(System.in).nextInt();
			if(sum >= 100) {
				System.out.printf("合計が100を超えました\n");
			} else {
				System.out.printf("現在：%2d\n", sum);
			}
		}
	}
}
