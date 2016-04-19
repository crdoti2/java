public class Rensyu415{
	public static void main(String[] args){
		int i = 2;
		int y = 20100;
		System.out.println(y);
		while(true){
			if(y == 1){
				break;
			}
			if(y % i == 0){
				y = y / i;
				System.out.print(i + " ");
			} else{
				i++;
			}
		}
	}
}