import java.util.Scanner;
public class Kadai1_7 {
	
	public  static void main(String args[]){
		
		Scanner scan1 = new Scanner(System.in);
		int x = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();
		
		int a=x;
		x=y;
		y=a;
		System.out.println( "x=" + x + ",y=" + y );
		
	
	}
}


