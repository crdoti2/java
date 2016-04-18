//------------------------------------------
//
//　1から1,000の整数素数を列挙する
//　総当りのベタな計算方法で構いません
//　※但し、表示は10件単位で改行すること
//
//------------------------------------------

public class kadai3 {

	public static final int FROM_NUMBER = 2; //開始する値
	public static final int TO_NUMBER = 1000; //終了する値
	public static final int LINE_MAX = 10; //1行に表示する個数
	public static final String SEPARATE = ","; //区切り文字


	public static void main (String[] args) {
		// カウント変数の宣言
		int i, j, cnt;
		boolean isPrimeNumber;

		cnt = 0;

		// ループ
		for(i = FROM_NUMBER; i <= TO_NUMBER; i++) {
			isPrimeNumber = true;
			for(j = FROM_NUMBER; j <= (i / 2); j++) {
				if(i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if(isPrimeNumber) {
				System.out.printf("%4d", i);
				cnt++;
				if(cnt % LINE_MAX == 0) {
					System.out.println("");
				}
			}
		}
	}
}
