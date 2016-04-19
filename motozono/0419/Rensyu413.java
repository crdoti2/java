public class Rensyu413{
	public static void main(String[] args){
		int i = 0;
		int y = 0;

		while(i < 3 && y < 4)
		{
			System.out.println("ストライク=1 or ボール=2 ？");
			int input =new java.util.Scanner(System.in).nextInt();
			if(input == 1){
				i++;
			} else if(input == 2){
				y++;
			}
		}
			System.out.println("ストライク" + i + "ボール" + y);
	}
}