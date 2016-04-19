import java.util.Scanner;
public class Kadai4_5 {
	
	public  static void main(String args[]){
		int sum =0;
		
			for(int i = 0; i < 10 ; i++){
				Scanner scan = new Scanner(System.in);
				 sum =sum + scan.nextInt();
			}
			System.out.println(sum/10);
		
	
	}
}


