//------------------------------------------
//
//　ピラミッドを画面に表示する
//
//------------------------------------------

public class kadai1 {
	public static void main (String[] args) {
		// カウント変数の宣言
		int i, j;

		// ２重ループ
		for(i = 1; i < 20; i++) {
			if(i < 10) {		// iが1～10までは以下の処理
				for(j = 1; j < i; j++) {
					System.out.print("*");
				}
			} else {			// それ以外は以下の処理
				for(j = 20; j > i; j--) {
					System.out.print("*");
				}
			}
			// 改行を出力
			System.out.println("");
		}
	}
}
