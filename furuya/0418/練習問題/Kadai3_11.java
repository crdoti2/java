import java.util.Scanner;
public class Kadai3_11 {
	
	public  static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		
		switch(x){
			case 1: System.out.println("元日、成人の日");
					break;
			case 2: System.out.println("建国記念の日");
					break;
			case 3: System.out.println("春分の日");
					break;
			case 4: System.out.println("昭和の日");
					break;
			case 5: System.out.println("憲法記念日、みどりの日、こどもの日");
					break;
			case 6: System.out.println("祝日なし");
					break;
			case 7: System.out.println("海の日");
					break;
			case 8: System.out.println("祝日なし");
					break;
			case 9: System.out.println("敬老の日、秋分の日");
					break;
			case 10: System.out.println("体育の日");
					break;
			case 11: System.out.println("文化の日、勤労感謝の日");
					break;
			case 12: System.out.println("天皇誕生日");
					break;
			default: System.out.println("入力が間違っています");
		}
			
		
	}
}


