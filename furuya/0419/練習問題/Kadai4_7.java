import java.util.Scanner;
public class Kadai4_7 {
	
	public  static void main(String args[]){
		int kyozin = 0, hanshin = 0;
		int sumK = 0;
		int sumH = 0;
		
		
		
		
			for(int i = 1; i <= 9 ; i++){
				System.out.print(i+"��\�A���l�̓��_�́H ");
				Scanner scan = new Scanner(System.in);
				kyozin = scan.nextInt();
				sumK += kyozin; 
				
				System.out.print(i+"�񗠁A��_�̓��_�́H ");
				Scanner scan2 = new Scanner(System.in);
				hanshin = scan2.nextInt();
				sumH += hanshin;
				
				
				
			}
		
		
		System.out.println("���l:"+sumK+"�_�A��_:"+sumH+"�_");
				if(sumK>sumH){
					System.out.println("���l�̏���");
				}else if (sumK<sumH){
					System.out.println("��_�̏���");
				}
	
	}
}


