public class Rensyu414{
	public static void main(String[] args){
		int i = 0;
		int y = 0;

		while(i < 3 && y < 4)
		{
			System.out.println("ストライク=1 or ボール=2 ファール=3？");
			int input =new java.util.Scanner(System.in).nextInt();
			if(input == 1){
				i++;
			} else if(input == 2){
				y++;
			} else if(input == 3){
				if(i < 2){
					i++;
				}
			}
		}
			System.out.println("ストライク" + i + "ボール" + y);
	}
}