//---------------------------------------------------------------------------------------
//
//　以下の仕様を参考にメソッド「email」を定義
//　・戻り値の型	なし
//　・引数リスト	メールのタイトル		（String title）
//					メールの宛先アドレス	（String address）
//					メールの本文			（String text）
//　・処理内容		以下の形式で表示を行う
//					「（メールの宛先アドレス）」に、以下のメールを送信しました
//					件名：「メールのタイトル」
//					本文：「メールの本文」
//
//---------------------------------------------------------------------------------------

import java.util.Scanner;

public class rensyu5_2 {
	public static void main(String[] args) {
		// 変数の宣言
		String title;
		String address;
		String text;

		System.out.print("メールのタイトルを入力 > ");
		title = new Scanner(System.in).nextLine();

		System.out.print("メールアドレスを入力 > ");
		address = new Scanner(System.in).nextLine();

		System.out.print("本文を入力 > ");
		text = new Scanner(System.in).nextLine();

		email(title, address, text);
	}

	public static void email(String title, String address, String text) {
		System.out.printf("「%s」に、以下のメールを送信しました\n", address);
		System.out.printf("件名：「%s」\n", title);
		System.out.printf("本文：「%s」\n", text);
	}
}
