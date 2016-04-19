import java.util.Scanner;
public class Kadai4_22{
	
	public  static void main(String args[]){
		int x1 = 0, x2 = 1, ans = 0;
		
		System.out.print(x1+" ");
		System.out.print(x2+" ");
		
		while(true){
			ans = x1 + x2;
			if(ans>1000) break;
			System.out.print(ans+" ");
			x1=x2;
			x2=ans;	
		}
		
			
	
		
	}
}


