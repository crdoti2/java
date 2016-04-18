//------------------------------------------------------------------------------
//P.133
//　次の条件に従ってプログラムを記述してください
//
//　�@画面に「【数あてゲーム】」と表示する。
//　�A0から9までの整数の中からランダムな数を1つ生成して変数ansに代入する。
//　�Bfor文を用いた「5回繰り返すループ」を作る。
//　　その際に以下の�C〜�Fは、ループの中に記述する。
//　�C画面に「0〜9の数字を入力してください」と表示する。
//　�D数字を入力し、変数numに代入する。
//　�Eもし変数numが変数ansと等しかったら
//　　「アタリ！」と画面に表示して繰り返しを終了する。
//　�Fもし変数numが変数ansと等しくない場合は「違います。」と表示する。
//　�G繰り返しのブロックの外側で、「ゲームを終了します」と画面に表示する。
//
//------------------------------------------------------------------------------

public class train6 {

	public static void main(String[] args){

		// 変数の宣言
		int ans;
		int num;
		int i;

		// �@
		System.out.println("【数あてゲーム】");

		// �A
		ans = new java.util.Random().nextInt(10);

		// �B
		for(i = 0; i < 5; i++) {
			// �C
			System.out.print("０〜９の数字を入力してください ＞ ");

			// �D
			num = new java.util.Scanner(System.in).nextInt();

			// �E
			if(ans == num) {
				System.out.println("アタリ！\n");
				break;
			}
			// �F
			else
			{
				System.out.println("違います。\n");
			}
		}
		System.out.println("ゲームを終了します。");
	}
}
