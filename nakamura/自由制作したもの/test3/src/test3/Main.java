//--------------------------------------------------------------------------------------------------------------
// 
// StringBuilderを使った何か「insert」
// 参考URL:http://www.javadrive.jp/start/stringbuilder/index2.html
// 
//--------------------------------------------------------------------------------------------------------------

package test3;

public class Main{

	// 	メインメソッド
	public static void main(String args[]){

		// StringBuilderクラスのインスタンス
		StringBuilder sb = new StringBuilder();

		// 文字列追加
		sb.append("こんにちは。元気です。");

		// 指定した場所に追加
		sb.insert(5, "鈴木さん");

		System.out.println(new String(sb));
	}

}