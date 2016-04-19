import java.util.Scanner;
public class Kadai4_21{
	
	public  static void main(String args[]){
		int a = 0;
		String s="";
		
		
		
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		int x=1;
		int y=a;
	
		
		for(int j = a; j >= 1 ; j--){
			for(int i = 1; i <= a ; i++){
				if(i==x || i==y){
					s += "x";
				}else{
					s += " ";
				}
				
				
			}
			System.out.println(s);
			x++;
			y--;
			s="";
			
		}
		
			
		
			
	
		
	}
}


