public class java10{
	public static void main(String args[]){
		System.out.println("個数を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<input;i++){
			System.out.print("*");
		}
	}
}