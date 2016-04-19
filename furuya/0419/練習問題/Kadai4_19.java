import java.util.Scanner;
public class Kadai4_19{
	
	public  static void main(String args[]){
		int a = 0;
		int sum = 0;
		int count = 0;
		do{
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			sum += a;
			count++;
		}while(a!=0);
		
			System.out.println(sum/(count-1));
		
			
	
		
	}
}


