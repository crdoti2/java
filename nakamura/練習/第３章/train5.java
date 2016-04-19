//------------------------------------------------------------------------------
//P.132
//　switch文を用いて次の条件を満たすプログラムを作成してください
//
//　�@画面に「[メニュー] 1:検索 2:登録 3:削除 4:変更　＞ 」と表示する。
//　�A数字を入力し、変数selectedに代入する。
//　�Bもし変数selectedが1なら「検索します」、2なら「登録します」、
//　　3なら「削除します」、4なら「変更します」と表示する。
//　�Cselectedが1から4のいずれでもない場合は何もしない。
//
//------------------------------------------------------------------------------

public class train5 {

	public static void main(String[] args){

		// 変数の宣言
		int selected;

		// �@
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更　＞ ");

		// �A
		selected = new java.util.Scanner(System.in).nextInt();

		// �B
		switch (selected) {
			case 1:
				System.out.println("検索します");
				break;

			case 2:
				System.out.println("登録します");
				break;

			case 3:
				System.out.println("削除します");
				break;

			case 4:
				System.out.println("変更します");
				break;

			default:
			// �C
			// 何もしない
		}
	}
}
