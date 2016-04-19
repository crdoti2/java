public class Rensyu419{
	public static void main(String[] args){
		int sum = 0;
		while(true){
			int input =new java.util.Scanner(System.in).nextInt();
			if(input == 0){
				break;
			}else{
				sum += input;
			}
		}
			System.out.println(sum / sum.length);
	}
}