import java.util.Scanner;
public class Kadai4_21_2{
	
	public  static void main(String args[]){
		int a = 0;
		String s="";
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		int x=1;
		int y=a;
		
		for(int i = 0; i <= a ; i++){
			s+=" ";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		

		System.out.println(sb.toString());
		
		for(int i = 0; i < a ; i++){
			sb.setCharAt(x, 'x');
			sb.setCharAt(y, 'x');
			System.out.println(sb.toString());
			x++;
			y--;
			sb.setLength(0);
			sb.append(s);
		}
	
		
	}
}


