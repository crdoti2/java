//------------------------------------------
//
//　拡張のfor文の例
//
//------------------------------------------

public class list4-11 {
	public static void main(String[] args) {
		int[] score = { 20, 30, 40, 50, 80 };

		// ループで１つずつ内容を表示
		for (int value : score) {			// ループが１周するたびに次の要素がvalueに入る

			System.out.println(value);		// valueをそのまま使える

		}
	}
}
