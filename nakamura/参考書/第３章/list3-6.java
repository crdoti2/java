//------------------------------------------
//
//@‚ ‚¦‚Äbreak•¶‚ğ‘‚©‚È‚¢
//
//------------------------------------------

public class list3-6 {
	public static void main(String[] args) {
		System.out.println("‚ ‚È‚½‚Ì‰^¨‚ğè‚¢‚Ü‚·");
		
		// ƒ‰ƒ“ƒ_ƒ€‚Ì”’l‚ğ“ü‚ê‚éi‚P`‚Tj
		// ƒ‰ƒ“ƒ_ƒ€‚Í‚O‚©‚ç¶¬‚³‚ê‚é‚Ì‚ÅAƒ‰ƒ“ƒ_ƒ€i‚O`‚Sj‚É‚P‚ğ‘«‚µ‚Äi‚P`‚Tj‚É‚·‚é
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
			case 1:		// ‚P‚Æ‚Q‚Ìê‡
			case 2:
				System.out.println("‚¢‚¢‚ËI");
				break;
			case 3:		// ‚R‚Ìê‡
				System.out.println("•’Ê‚Å‚·");
				break;
			case 4:		// ‚S‚Æ‚T‚Ìê‡
			case 5:
				System.out.println("‚¤[‚ñc");
		}
	}
}
