public class java7{
	public static void main(String args[]){
	
		int TiScore,TgScore;
		TiScore=0;
		TgScore=0;
		
		for(int i=1;i<10;i++){
			System.out.print(i+"回表、巨人の得点は？");
			int input = new java.util.Scanner(System.in).nextInt();
			TiScore++;
			System.out.print(i+"回裏、阪神の得点は？");
			input = new java.util.Scanner(System.in).nextInt();
			TgScore++;
		}
		System.out.println("巨人：" +TiScore+", 阪神："+TgScore);
	}
}