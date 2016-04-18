//------------------------------------------
//
//　0から99のランダムな整数を100個生成し、
//　結果を下記のフォーマットで表示する。
//
//------------------------------------------

public class kadai2 {

	public static final int TO_NUMBER  = 100;	// 終了する値
	public static final int RANDOM_MAX = 100;	// ランダムの上限値


	public static void main (String[] args) {
		// カウント変数の宣言
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;

		// 配列の宣言
		int[] n1 = new int[TO_NUMBER];
		int[][] n2 = new int[TO_NUMBER][2];

		int[] even   = new int[TO_NUMBER];		// 偶数格納用配列
		int[] odd    = new int[TO_NUMBER];		// 奇数格納用配列

		for(i = 0; i < TO_NUMBER; i++) {
			n2[i][0] = i;
		}

		// 配列にランダム（０～９９まで）の値を代入
		for(i = 0; i < RANDOM_MAX; i++) {
			n1[i] = new java.util.Random().nextInt(100);
			if (n1[i] % 2 == 0) {
				even[j] = n1[i];
				j++;
			} else {
				odd[k] = n1[i];
				k++;
			}
			for(l = 0; l < TO_NUMBER; l++) {
				if(n1[i] == n2[l][0]) {
					n2[l][1] += 1;
					break;
				}
			}
		}
		
		// 使用していない値の個数を数える
		for(i = 0; i < TO_NUMBER; i++) {
			if(n2[i][1] == 0) {
				m++;
			}
		}

		// 偶数の表示
		System.out.print("偶数（" + j + "）");
		for(i = 0; i < j; i++) {
			System.out.print(even[i] + ", ");
		}

		System.out.println("");
		System.out.println("");

		// 奇数の表示
		System.out.print("奇数（" + k + "）");
		for(i = 0; i < k; i++) {
			System.out.print(odd[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("");

		// 使用しなかった値の表示
		System.out.print("使用しなかった値（" + m + "）");
		for(i = 0; i < TO_NUMBER; i++) {
			if(n2[i][1] == 0) {
				System.out.print(n2[i][0] + ", ");
			}
		}
	}
}
