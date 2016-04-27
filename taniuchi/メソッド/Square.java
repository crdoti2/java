public class Square{
	public static void main(String[] args){
		
		System.out.println(calcSquare(20,30));
		System.out.println(calcSquare(20));
		
	}
	public static int calcSquare(int x,int y){
		return x*y;
	}
	public static int calcSquare(int x){
		return calcSquare(x,x);
	}

}