public class java7{
	public static void main(String args[]){
	
		int TiScore,TgScore;
		TiScore=0;
		TgScore=0;
		
		for(int i=1;i<10;i++){
			System.out.print(i+"��\�A���l�̓��_�́H");
			int input = new java.util.Scanner(System.in).nextInt();
			TiScore++;
			System.out.print(i+"�񗠁A��_�̓��_�́H");
			input = new java.util.Scanner(System.in).nextInt();
			TgScore++;
		}
		System.out.println("���l�F" +TiScore+", ��_�F"+TgScore);
	}
}