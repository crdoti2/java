public class Bunki8{
	public static void main(String[] args){
	int x = 0;
	int y = 0;
		 x = new java.util.Scanner(System.in).nextInt();
		 y = new java.util.Scanner(System.in).nextInt();
		if(x >= 60 && y >= 60){
			System.out.println("合格おめでとう");
		}else if((x + y) >= 130){
			System.out.println("合格おめでとう");
		}else if((x + y) >= 100 && (x | y) >= 90){
			System.out.println("合格おめでとう");
		}else{
			System.out.println("営業ざまぁ");
		}
	}
}