//------------------------------------------------------------------------------
//
//　ストライク・カウントを数えるプログラムを作成しなさい。
//　・１球ごとにストライクかボールかを入力する。
//　・３ストライクまたは４ボールになったら入力を止め、
//　　ストライクとボールのカウントを表示する。
//
//------------------------------------------------------------------------------

public class rensyu4_13 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int pitch = 0;
		int strike = 0;
		int ball = 0;

		while(strike <= 2 && ball <= 3) {
			System.out.printf("ストライク=1 or ボール=2 ？ ");
			pitch = new java.util.Scanner(System.in).nextInt();
			if(pitch == 1) {
				strike++;
			} else if (pitch == 2){
				ball++;
			} else {
				System.out.printf("不正な値が入力されています。\n");
			}
		}
		System.out.printf("%dボール, %dストライク\n", ball, strike);
	}
}
