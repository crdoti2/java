import java.util.Scanner;
public class Kadai4_16{
	
	public  static void main(String args[]){
		
		int a = 0;
		
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		for(int i=2; i<=a ;i++){
			if(i==a){
				System.out.print("‘f”‚Å‚·B ");
			}
			if(a%i==0 && i!=a){
				System.out.print("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB ");
				break;
			}
			
		}
	
		
	}
}


