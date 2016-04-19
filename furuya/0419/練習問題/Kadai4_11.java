import java.util.Scanner;
public class Kadai4_11{
	
	public  static void main(String args[]){
		
		int count = 0;
		int th = 0;
		
		Scanner scan = new Scanner(System.in);
		count = scan.nextInt();
		
		for(int i = 0; i < count ; i++){
			System.out.print(th);
			th++;
			if(th==10){
				th = 0;
			}
		
		}
			
		
		
		
		
	
	}
}


