//------------------------------------------
//
//　実行結果は？
//
//------------------------------------------

public class list4-12 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };			// a[0]は1
		int[] a;

		// アドレスを代入
		b = a;

		b[0] = 100;

		System.out.println(a[0]);

	}
}
