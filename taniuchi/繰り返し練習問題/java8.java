public class java8{
	public static void main(String args[]){
		
		int max;
		max=0;
		System.out.println("整数を10回入力してください。");
		for(int i=0;i<10;i++){
			int input = new java.util.Scanner(System.in).nextInt();
			if(input>max){
				max=input;
			}
		}
		System.out.println("MAX="+max);
	}
}