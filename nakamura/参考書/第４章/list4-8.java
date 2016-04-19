//------------------------------------------
//
//　点数管理プログラム（配列版）
//
//------------------------------------------

public class list4-8 {
	public static void main(String[] args) {
		int[] score = { 20, 30, 40, 50, 80 };

		// 合計の算出（エラーあり）
		int sum =
			score[1] + score[2] + score[3] + score[4] + score[5];

		// 平均の算出
		int avg = sum / score.length;

		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);

	}
}
