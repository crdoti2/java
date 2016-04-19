//------------------------------------------------------------------------------
//
//　次のプログラムを作成しなさい。
//　・巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//　・入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
//　　※試合は巨人の先行とする。
//
//------------------------------------------------------------------------------

public class rensyu4_7 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int kyojin = 0;
		int hanshin = 0;

		for(i = 1; i < 10; i++) {
			System.out.printf("%d回表、巨人の得点は？ ", i);
			kyojin += new java.util.Scanner(System.in).nextInt();
			System.out.printf("%d回表、阪神の得点は？ ", i);
			hanshin += new java.util.Scanner(System.in).nextInt();
		}

		System.out.printf("巨人：%3d, 阪神%3d\n", kyojin, hanshin);
		if(kyojin > hanshin) {
			System.out.printf("巨人の勝ち\n");
		} else if(kyojin < hanshin) {
			System.out.printf("阪神の勝ち\n");
		} else {
			System.out.printf("引き分け\n");
		}

	}
}
