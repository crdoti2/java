public class Kadai18{
	public static void main(String[] arg){
		
	int goke = 0;
		for ( ; ; ){
		
		int tasu = new java.util.Scanner(System.in).nextInt();	
			if( tasu == 0)
			break;
		
			goke += tasu;
		}
		System.out.println(goke);
	}
}
