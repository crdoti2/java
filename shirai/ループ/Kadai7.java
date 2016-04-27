public class Kadai7{
	public static void main(String[] arg){
		
		
		int kyo = 0;
		int han = 0;
		
		for(int i = 1; i <= 9; i++){
				int kati = new java.util.Scanner(System.in).nextInt();
			System.out.println(i + "回の表巨人の得点は" + (kyo += kati));
				int kati1 = new java.util.Scanner(System.in).nextInt();
			System.out.println(i + "回の裏阪神の得点は" + (han += kati1));	
		}
			System.out.println("巨人得点"+ kyo);
			System.out.println("阪神得点"+ han);
		if(kyo > han){
			System.out.println("巨人勝ち");
		}else if(kyo < han){
			System.out.println("阪神勝ち");
		}else{
			System.out.println("引き分け");
		}
	}
}
