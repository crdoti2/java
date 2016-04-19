public class Rensyu419{
	public static void main(String[] args){
		int sum = 0;
		int count = 0;
		while(true){
			int input =new java.util.Scanner(System.in).nextInt();
			if(input == 0){
				break;
			}else{
				sum += input;
				count++;
			}
		}
			System.out.println(sum / count);
	}
}