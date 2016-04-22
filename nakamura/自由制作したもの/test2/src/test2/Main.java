//--------------------------------------------------------------------------------------------------------------
// 
// StringBuilderを使った何か「append」
// 参考URL:http://www.javadrive.jp/start/stringbuilder/index1.html
// 
//--------------------------------------------------------------------------------------------------------------

package test2;

public class Main {

	// メインメソッド
	public static void main(String args[]){

		// メソッド呼び出し
		dispHantei("山田", 89);
		dispHantei("鈴木", 45);
		dispHantei("伊藤", 67);
		dispHantei("加藤", 92);

	}

	private static void dispHantei(String name, int tokuten){

		// StringBuilderクラスをインクリメント
		StringBuilder sb = new StringBuilder();

		// 文字をappend
		sb.append(name);
		sb.append("さんの成績は");
		sb.append(tokuten);
		sb.append("点です。結果は");

		// 得点が75より上か
		if (tokuten > 75){
			sb.append("合格");
		}else{
			sb.append("不合格");
		}
		sb.append("です。");

		System.out.println(new String(sb));
	}
}
