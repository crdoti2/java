//------------------------------------------------------------------------------
//
//　前の問題に次の修正を加えなさい。
//
//　・１球ごとにストライク、ボール、ファウルの何れかを入力する。
//　　（残念ながらヒットにはなりません）
//
//　・ファウルの場合、
//　　２ストライクまではストライクにカウントするが、３ストライクにはならない。
//
//　・３ストライクまたは４ボールになったら入力を止め、
//　　ストライクとボールのカウントを表示する。
//
//------------------------------------------------------------------------------

public class rensyu4_14 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int pitch = 0;
		int strike = 0;
		int ball = 0;
		int foul = 0;

		while(strike <= 2 && ball <= 3) {
			System.out.printf("ストライク=1 or ボール=2 or ファウル=3 ？ ");
			pitch = new java.util.Scanner(System.in).nextInt();
			if(pitch == 1) {
				strike++;
			} else if (pitch == 2) {
				ball++;
			} else if (pitch == 3) {
				if(strike < 2) {
					strike++;
				}
			} else {
				System.out.printf("不正な値が入力されています。\n");
			}
		}
		System.out.printf("%dボール, %dストライク\n", ball, strike);
	}
}
