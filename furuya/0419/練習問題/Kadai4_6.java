import java.util.Scanner;
public class Kadai4_6 {
	
	public  static void main(String args[]){
		int a =0;
		int count1 = 0;
		int count0 = 0;
		
			for(int i = 0; i < 10 ; i++){
				Scanner scan = new Scanner(System.in);
				 a = scan.nextInt();
				if(a==1){
					count1++;
				}else if(a==0){
					count0++;
				}
			}
			System.out.println("Ÿ‚¿ "+count1);
			System.out.println("•‰‚¯ "+count0);
		
	
	}
}


