public class Bunki6{
	public static void main(String[] args){
	int x = 10;
		if(x > 0 && x % 2 == 0){
			System.out.println("正の偶数です");
		}else if(x > 0 && x % 2 == 1){
			System.out.println("正の奇数です");
		}else if(x < 0 && x % 2 == 0){
			System.out.println("負の偶数です");
		}else if((x < 0 && x % 2 == 1){
			System.out.println("負の奇数です");
		}
	}
}