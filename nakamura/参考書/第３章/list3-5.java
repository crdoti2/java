//------------------------------------------
//
//@break•¶‚ğ–Y‚ê‚é‚Æc
//
//------------------------------------------

public class list3-5 {
	public static void main(String[] args) {
		System.out.println("‚ ‚È‚½‚Ì‰^¨‚ğè‚¢‚Ü‚·");
		int fortune = 1;						// í‚É1

		// switch•¶
		switch (fortune) {
			case 1:
				System.out.println("‘å‹g");
												// ‚±‚±‚Ébreak;‚ğ“ü‚ê–Y‚ê‚Ä‚¢‚é
			case 2:
				System.out.println("’†‹g");
				break;
			case 3:
				System.out.println("‹g");
				break;
			default:
				System.out.println("‹¥");
		}
	}
}
