public class java5{
	public static void main(String args[]){
		
		int x,y,i;
		x=0;
		System.out.println("整数を10個入力してください。");
		for(i=0;i<10;i++){
			int input = new java.util.Scanner(System.in).nextInt();
			x+=input;
		}
		y=x/i;
		System.out.println("平均は"+y);
	}
}