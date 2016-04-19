//------------------------------------------------------------------------------
//
//　整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu4_5 {

	public static void main(String[] args){
		// 変数の宣言
		int i;
		int sum = 0;
		int ave = 0;

		for(i = 0; i < 10; i++) {
			System.out.print("任意の数字を入力 ＞ ");
			sum += new java.util.Scanner(System.in).nextInt();
		}

		ave = sum / 10;
		System.out.printf("平均値：%3d\n", ave);
	}
}
