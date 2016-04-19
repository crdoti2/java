//------------------------------------------
//
//　従来のfor文での例
//
//------------------------------------------

public class list4-10 {
	public static void main(String[] args) {
		int[] score = { 20, 30, 40, 50, 80 };

		// ループで１つずつ内容を表示
		for (int i = 0; i < score.length; i++) {	// 配列名.lengthで要素数を得る

			System.out.println(score[i]);			// 要素を指定して取り出す必要がある

		}
	}
}
