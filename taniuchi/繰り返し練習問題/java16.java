public class java16{
	public static void main(String args[]){
		
		int input = new java.util.Scanner(System.in).nextInt();
		int x,y;
		x = 2;
		y = input;
		if(input>=4){
			if(input%x==0){
				input=input/x;
				x = 2;
				System.out.println(y+"‘f”‚Å‚Í‚È‚¢");
			}else{
				System.out.println(y+"‘f”‚Å‚·");
			}
		}
	}
}
