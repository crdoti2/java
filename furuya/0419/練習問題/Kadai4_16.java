import java.util.Scanner;
public class Kadai4_16{
	
	public  static void main(String args[]){
		
		int a = 0;
		
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for(int i=2; i<=a ;i++){
			if(i==a){
				System.out.print("�f���ł��B ");
			}
			if(a%i==0 && i!=a){
				System.out.print("�f���ł͂���܂���B ");
				break;
			}
			
		}
	
		
	}
}


