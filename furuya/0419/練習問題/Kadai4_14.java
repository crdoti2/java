import java.util.Scanner;
public class Kadai4_14{
	
	public  static void main(String args[]){
		
		int sumS = 0;
		int sumB = 0;
		int a = 0;
		
			
		while(sumS<3&&sumB<4){
			System.out.print("�X�g���C�N=1 or �{�[��=2 or �t�@�E��=3 �H");
			Scanner scan = new Scanner(System.in);
			a = scan.nextInt();
			if(a==1){
				sumS++;
			}else if(a==2){
				sumB++;
			}else if(a==3){
				if(sumS<2){
					sumS++;
				}
			}
		}
		
		System.out.println(sumB+"�{�[��,"+sumS+"�X�g���C�N");
	
		
	}
}


