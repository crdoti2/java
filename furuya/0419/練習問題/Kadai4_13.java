import java.util.Scanner;
public class Kadai4_13{
	
	public  static void main(String args[]){
		
		int sumS = 0;
		int sumB = 0;
		int a = 0;
		
			
		while(sumS<3&&sumB<4){
			System.out.print("ストライク=1 or ボール=2 ？");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			if(a==1){
				sumS++;
			}else if(a==2){
				sumB++;
			}
		}
		
		System.out.println(sumB+"ボール,"+sumS+"ストライク");
	
		
	}
}


