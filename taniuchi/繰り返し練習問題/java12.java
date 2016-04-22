public class java12{
	public static void main(String args[]){
		
		System.out.println("”’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		
		int x;
		x=0;
		
		for(int i=0;i<=100;i++){
			int input = new java.util.Scanner(System.in).nextInt();
			x+=input;
			if(x>100){
				break;
			}
		}
		System.out.println("‡Œv‚Í"+x);
	}
}