//------------------------------------------------------------------------------
//
//　整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、
//　勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_6 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int battle = 0;
		int win = 0;
		int lose = 0;

		for(i = 0; i < 10; i++) {
			System.out.print("０か１を入力 ＞ ");
			battle = new java.util.Scanner(System.in).nextInt();
			if(battle == 0) {
				win++;
			} else if(battle == 1) {
				lose++;
			} else {
				System.out.printf("\n不正な値が入力されています\n");
			}
		}

		System.out.printf("勝ち：%3d\n", win);
		System.out.printf("負け：%3d\n", lose);

	}
}
