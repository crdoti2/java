public class Kadai21{
	public static void main(String[] arg){
		
		int kai = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < kai; i++){
		for (int k = 0; k < (i + 1); k++){
			System.out.print("š");
		}
			System.out.print("\n");
			
		}
		for (int n = 0; n < kai; n++){
	
			for (int o = 0; o < kai-(n + 1); o++){
				System.out.print("š");
			}
				System.out.print("\n");
		}	
	}
}
