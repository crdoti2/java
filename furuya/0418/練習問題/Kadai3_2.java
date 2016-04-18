import java.util.Scanner;

public class Kadai3_2 {
	
	public  static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int y = scan2.nextInt();

		if(x>y){
			System.out.println(x);
		}else if(x<y){
			System.out.println(y);
		}
		
		
	}
}


