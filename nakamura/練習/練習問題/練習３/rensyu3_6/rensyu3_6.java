//------------------------------------------------------------------------------
//
//@®”’l‚ğ“ü—Í‚µAˆÈ‰º‚Ì‚S‚Â‚Ì•ª—Ş‚©‚çŠY“–‚·‚é‚à‚Ì‚ğ•\¦‚·‚éƒvƒƒOƒ‰ƒ€‚ğì¬‚µ‚È‚³‚¢B
//@g³‚Ì‹ô”hAg³‚ÌŠï”hAg•‰‚Ì‹ô”hAg•‰‚ÌŠï”h
//
//------------------------------------------------------------------------------

public class rensyu3_6 {

	public static void main(String[] args){
		// •Ï”‚ÌéŒ¾
		int n;

		// “ü—Í
		System.out.print("”CˆÓ‚Ì”š‚ğ“ü—Í „ ");
		n = new java.util.Scanner(System.in).nextInt();

		if(n >= 0) {
			if(n % 2 == 0) {
				System.out.printf("³‚Ì‹ô”\n");
			} else {
				System.out.printf("³‚ÌŠï”\n");
			}
		} else {
			if(n % 2 == 0) {
				System.out.printf("•‰‚Ì‹ô”\n");
			} else {
				System.out.printf("•‰‚ÌŠï”\n");
			}
		}		
	}
}
