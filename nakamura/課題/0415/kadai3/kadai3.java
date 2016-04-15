//------------------------------------------
//
//　1から1,000の整数素数を列挙する
//　総当りのベタな計算方法で構いません
//　※但し、表示は10件単位で改行すること
//
//------------------------------------------

public class kadai3 {
	public static void main (String[] args) {
		// カウント変数の宣言
		int i, j, k;
		boolean primeNumber;

		k = 0;

		// ループ
		for(i = 2; i <= 1000; i++) {
			primeNumber = true;
			for(j = 2; j < i; j++) {
				if(1000 % i == 0) {
					primeNumber = false;
				}
			}
			if(primeNumber) {
				System.out.print(i + ", ");
				k++;
				if((k + 1) % 10 == 0) {
					System.out.println("");
				}
			}
		}
	}
}
