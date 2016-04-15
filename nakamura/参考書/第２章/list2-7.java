//------------------------------------------
//
//　強制的な型変換
//
//------------------------------------------

public class list2-7 {
	public static void main(String[] args) {
		int age = (int) 3.2;				// キャストして無理やり変数に入れている
		System.out.println(age);			//					少数は消えてしまう
	}
}
