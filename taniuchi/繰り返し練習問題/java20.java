public class java20{
	public static void main(String args[]){
		String s="$";
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int i=0;i<input;i++){
			for(int j=0;j<=i;j++){
				System.out.print(s);
			}
			System.out.println("");
		}
	}
}