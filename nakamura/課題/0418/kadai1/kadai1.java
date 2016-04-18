//------------------------------------------
//
//　ピラミッドを画面に表示する
//
//------------------------------------------

public class kadai1 {

	public static final int FROM_NUMBER =  1; //開始する値
	public static final int TO_NUMBER   = 20; //終了する値
	public static final int DIST_NUMBER = 10; //途中の値


	public static void main (String[] args) {
		// カウント変数の宣言
		int i, j;

		// ループ
		for(i = FROM_NUMBER; i < TO_NUMBER; i++) {
			if(i < DIST_NUMBER) {		// iが1～10までは以下の処理
				for(j = FROM_NUMBER; j <= i; j++) {
					System.out.print("*");
				}
			} else {			// それ以外は以下の処理
				for(j = TO_NUMBER; j > i; j--) {
					System.out.print("*");
				}
			}
			// 改行を出力
			System.out.println("");
		}
	}
}
