public class Kadai11{
	public static void main(String[] arg){
		int sora = new java.util.Scanner(System.in).nextInt();	
		for(int i = 0,out = 0; i < sora ; i++){
		System.out.println(out++);
		
			if (out > 9)
			out = 0;
		}
	}
}

