//------------------------------------------------------------------------------
//
//　中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、
//　次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
//
//　両方とも 60 点以上の場合、合格
//　合計が 130 点以上の場合、合格
//　合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
//　上記以外は不合格
//
//------------------------------------------------------------------------------

public class rensyu3_8 {

	public static void main(String[] args){
		// 変数の宣言
		int x, y;

		// 入力
		System.out.print("中間試験の点数を入力 x ＞ ");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.print("期末試験の点数を入力 y ＞ ");
		y = new java.util.Scanner(System.in).nextInt();

		if(x >= 60 && y >= 60) {
			System.out.printf("合格\n");
		} else if(x + y >= 130) {
			System.out.printf("合格\n");
		} else if(x + y >= 100 && (x | y) >= 90) {
			System.out.printf("合格\n");
		} else {
			System.out.printf("不合格\n");
		}
	}
}
