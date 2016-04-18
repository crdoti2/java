public class java13{	
	
	public static final Month JANUARY;
	public static final int FEB = 28;
	public static final int MAR = 31;
	public static final int APR = 30;
	public static final int MAY = 31;
	public static final int JUN = 30;
	public static final int JUL = 31;
	public static final int AUG = 31;
	public static final int SEP = 30;
	public static final int OCT = 31;
	public static final int NOV = 30;
	public static final int DEC = 31;
	
	public static void main(String args[]){
		System.out.println("Œ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		int input = new java.util.Scanner(System.in).nextInt();
		switch(input){
			case 1:
			System.out.println(JANUARY);
			break;
		case 2:
			System.out.println(FEB);
			break;
		case 3:
			System.out.println(MAR);
			break;
		case 4:
			System.out.println(APR);
			break;
		case 5:
			System.out.println(MAY);
			break;
		case 6:
			System.out.println(JUN);
			break;
		case 7:
			System.out.println(JUL);
			break;
		case 8:
			System.out.println(AUG);
			break;
		case 9:
			System.out.println(SEP);
			break;
		case 10:
			System.out.println(OCT);
			break;
		case 11:
			System.out.println(NOV);
			break;
		case 12:
			System.out.println(DEC);
			break;
		default:
			System.out.println("‚â‚è’¼‚µ‚Ä‚­‚¾‚³‚¢B");
		}
	}
}