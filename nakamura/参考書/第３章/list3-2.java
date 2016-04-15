//------------------------------------------
//
//　トイレの空きを待つ繰り返し処理
//
//------------------------------------------

public class list3-2 {
	public static void main(String[] args) {
		boolean doorClose = true;				// ここでtrueかfalseを代入

		// while文
		while (doorClose == true) {
			System.out.println("ノックする");
			System.out.println("1分待つ");
		}
	}
}
