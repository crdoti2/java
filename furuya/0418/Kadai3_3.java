import java.util.Scanner;

public class Kadai3_3 {
	
	public  static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int seibetsu = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int age = scan2.nextInt();

		System.out.println("����ɂ��́B");
		if(seibetsu==0){
			System.out.println("���͒j�ł��B");
			System.out.println(age+"�΂ł��B");
			
		}else if(seibetsu==1){
			System.out.println("���͏��ł��B");
		}
		
		System.out.println("��낵�����˂������܂��B");
		
	}
}


