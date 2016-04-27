public class Kadai19{
	public static void main(String[] arg){
		
	int goke = 0;
	int count = 0;
	
		for ( ; ; ){
		int tasu = new java.util.Scanner(System.in).nextInt();	
			if( tasu == 0)
			break;
			
			goke += tasu;
			count++;
		}
		System.out.println("‡Œv" + (goke /= count));
	}
}
