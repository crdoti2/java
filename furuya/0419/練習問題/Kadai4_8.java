import java.util.Scanner;
public class Kadai4_8 {
	
	public  static void main(String args[]){
		
		int a = 0;
		int save = 0;
		
		
		
		
		for(int i = 0; i < 10 ; i++){
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			
			if(save<a){
				save = a;
			}
		}
		
		System.out.println(save);
		
		
	
	}
}


