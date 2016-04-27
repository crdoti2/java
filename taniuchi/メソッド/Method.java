public class Method{
	public static void main(String[] args){
		
		final int input = new java.util.Scanner(System.in).nextInt();
		
		if(isEven(input) == 0 ){
			System.out.println("even");
		}else{
			System.out.println("odd");
		}
	}
	
	public static int isEven(int x){
		/*if(x%2==0){
			return true;
		}else{
			return false;
		}*/
		return x%2;
		//return x%2==0; //—]‚è‚ª0‚È‚çtrue‚»‚¤‚Å‚È‚¢‚È‚çfalse
	}
}