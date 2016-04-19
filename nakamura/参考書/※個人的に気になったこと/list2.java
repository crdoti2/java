public class list2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		
		// Ｃ言語みたいなポインタの扱い方はできない
//		*a = *b;				エラーになる
		
		b = 10;

		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
}
