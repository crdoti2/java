import java.util.Scanner;
public class Kadai4_9 {
	
	public  static void main(String args[]){
		
		int a = 0;
		int save = 0;
		
		Scanner scan = new Scanner(System.in);
			save = scan.nextInt();
		
		for(int i = 0; i < 9 ; i++){
			Scanner scan2 = new Scanner(System.in);
			a = scan2.nextInt();
			
			if(save<a){
				save = a;
			}
		}
		
		System.out.println(save);
		
		
	
	}
}


