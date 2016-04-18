//------------------------------------------------------------------------------
//
//　試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu3_7 {

	public static void main(String[] args){
		// 変数の宣言
		int n;

		// 入力
		System.out.print("試験の点数を入力 ＞ ");
		n = new java.util.Scanner(System.in).nextInt();

		if(n >= 60){
			System.out.printf("合格\n");
		} else {
			System.out.printf("不合格\n");
		}

		if(n >= 80){
			System.out.printf("たいへんよくできました。\n");
		} else if(n >= 60) {
			System.out.printf("よくできました。\n");
		} else {
			System.out.printf("ざんねんでした。\n");
		}

		if(n >= 80){
			System.out.printf("優\n");
		} else if(n >= 70) {
			System.out.printf("良\n");
		} else if(n >= 60) {
			System.out.printf("可\n");
		} else {
			System.out.printf("不可\n");
		}
	}
}
