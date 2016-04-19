public class Rensyu416{
	public static void main(String[] args){
		int i = 2;
		int y = 1;
		int count = 0;

		System.out.println(y);
		while(true){
			if(y == 1){
				break;
			}
			if(y % i == 0){
				y = y / i;
				count++;
				
			} else{
				i++;
			}
		}
		if(count == 1){
			System.out.println("‘f”‚Å‚·");
		}else{
			System.out.println("‘f”‚Å‚Í‚È‚¢");
		}
	}
}