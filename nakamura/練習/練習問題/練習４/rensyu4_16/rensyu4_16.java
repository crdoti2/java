//------------------------------------------------------------------------------
//
//@“ü—Í‚³‚ê‚½”‚ª‘f”‚©‚Ç‚¤‚©‚ğ”»’è‚·‚éƒvƒƒOƒ‰ƒ€‚ğì¬‚µ‚È‚³‚¢B
//
//------------------------------------------------------------------------------

public class rensyu4_16 {

	public static void main(String[] args){
		// •Ï”‚ÌéŒ¾
		int i = 2;
		int j = 0;
		int n;
		int m;

		System.out.printf("‚QˆÈã‚Ì®”’l‚ğ“ü—Í „ ");
		n = new java.util.Scanner(System.in).nextInt();
		m = n;

		while(m >= 0) {
			if(m == 1) {
				break;
			}
			if(m % i == 0) {
				m = m / i;
				j++;
			}
			if(m % i != 0) {
				i++;
			}
		}
		if(j == 1) {
			System.out.printf("%d‚Í‘f”\n", n);
		} else {
			System.out.printf("%d‚Í‘f”‚Å‚Í‚È‚¢\n", n);
		}
	}
}
