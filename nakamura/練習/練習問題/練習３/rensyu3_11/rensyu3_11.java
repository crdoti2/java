//------------------------------------------------------------------------------
//
//　月を表す数値を入力し、
//　その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。
//
//------------------------------------------------------------------------------

public class rensyu3_11 {

	public static void main(String[] args){
		// 変数の宣言
		int month;

		// 入力
		System.out.print("月を入力 ＞ ");
		month = new java.util.Scanner(System.in).nextInt();

		switch(month){
			case 1:
				System.out.println("　１月：元日、成人の日");
				break;

			case 2:
				System.out.println("　２月：建国記念の日");
				break;

			case 3:
				System.out.println("　３月：春分の日");
				break;

			case 4:
				System.out.println("　４月：昭和の日");
				break;

			case 5:
				System.out.println("　５月：憲法記念日、みどりの日、こどもの日");
				break;

			case 6:
				System.out.println("　６月：なし");
				break;

			case 7:
				System.out.println("　７月：海の日");
				break;

			case 8:
				System.out.println("　８月：なし");
				break;

			case 9:
				System.out.println("　９月：敬老の日、秋分の日");
				break;

			case 10:
				System.out.println("１０月：体育の日");
				break;

			case 11:
				System.out.println("１１月：文化の日、勤労感謝の日");
				break;

			case 12:
				System.out.println("１２月：天皇誕生日");
				break;

			default:
				System.out.println("入力が間違っています。");
		}
	}
}
