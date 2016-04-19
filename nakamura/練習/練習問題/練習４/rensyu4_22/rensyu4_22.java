//------------------------------------------------------------------------------
//
//　フィボナッチ数列を表示するプログラムを作成しなさい。
//　最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
//
//------------------------------------------------------------------------------

public class rensyu4_22 {

	public static void main(String[] args){
		// 変数の宣言
		int i = 0;
		int j = 1;
		int k = 0;
		int cnt = 2;

		System.out.printf("%5d", i);
		System.out.printf("%5d", j);

		while(k < 1000) {
			k = i + j;
			if(k >= 1000) {
				break;
			}
			System.out.printf("%5d", k);
			i = j;
			j = k;
			cnt++;
			if(cnt % 10 == 0) {
				System.out.println("");
			}
		}
	}
}
