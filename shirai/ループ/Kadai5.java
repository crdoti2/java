public class Kadai5	{
	public static void main(String[] arg){
		int goke = 0;
		
		for (int i = 1; i <= 5; i++){
			
			int kati = new java.util.Scanner(System.in).nextInt();
			if (kati == 1)
			goke += 1;
		}
		System.out.println("Ÿ‚¿"+ goke + "•‰‚¯" + (5 - goke));
		
	}
}