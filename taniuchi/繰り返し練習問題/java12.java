public class java12{
	public static void main(String args[]){
		
		System.out.println("数値を入力してください");
		
		int x;
		x=0;
		
		for(int i=0;i<=100;i++){
			int input = new java.util.Scanner(System.in).nextInt();
			x+=input;
			if(x>100){
				break;
			}
		}
		System.out.println("合計は"+x);
	}
}