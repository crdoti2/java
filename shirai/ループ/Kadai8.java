public class Kadai8{
	public static void main(String[] arg){
		int ooi = 0;
		
		for(int i=0; i <= 10 ; i++){
		
		int goke = new java.util.Scanner(System.in).nextInt();
		if (goke > ooi)
			ooi = goke;
		}
		System.out.println("‚í‚Á‚µ‚å‚¢" + ooi);
	}
}
