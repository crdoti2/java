import java.util.Scanner;

public class Kadai3_3 {
	
	public  static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		int seibetsu = scan.nextInt();
		
		Scanner scan2 = new Scanner(System.in);
		int age = scan2.nextInt();

		System.out.println("こんにちは。");
		if(seibetsu==0){
			System.out.println("私は男です。");
			System.out.println(age+"歳です。");
			
		}else if(seibetsu==1){
			System.out.println("私は女です。");
		}
		
		System.out.println("よろしくおねがいします。");
		
	}
}


