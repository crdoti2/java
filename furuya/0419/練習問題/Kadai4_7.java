import java.util.Scanner;
public class Kadai4_7 {
	
	public  static void main(String args[]){
		int kyozin = 0, hanshin = 0;
		int sumK = 0;
		int sumH = 0;
		
		
		
		
			for(int i = 1; i <= 9 ; i++){
				System.out.print(i+"回表、巨人の得点は？ ");
				Scanner scan = new Scanner(System.in);
				kyozin = scan.nextInt();
				sumK += kyozin; 
				
				System.out.print(i+"回裏、阪神の得点は？ ");
				Scanner scan2 = new Scanner(System.in);
				hanshin = scan2.nextInt();
				sumH += hanshin;
				
				
				
			}
		
		
		System.out.println("巨人:"+sumK+"点、阪神:"+sumH+"点");
				if(sumK>sumH){
					System.out.println("巨人の勝ち");
				}else if (sumK<sumH){
					System.out.println("阪神の勝ち");
				}
	
	}
}


