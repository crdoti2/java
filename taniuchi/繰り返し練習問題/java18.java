public class java18{
	public static void main(String args[]){
		
		int input,i;
		input=1;
		i=0;
		while(input > 0){
			input = new java.util.Scanner(System.in).nextInt();
			i+=input;
		}
		System.out.println("sum:"+i);
	}
}