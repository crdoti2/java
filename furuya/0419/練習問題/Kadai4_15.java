import java.util.Scanner;
public class Kadai4_15{
	
	public  static void main(String args[]){
		
		int a = 0;
		int i = 2;
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
			
		while(a!=1){
			
			if(a%i==0){
				a=a/i;
				System.out.print(i+" ");
			}else{
				i++;
			}
		}
		
		
	
		
	}
}


