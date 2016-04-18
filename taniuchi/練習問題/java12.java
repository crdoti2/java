public class java12{
	public static void main(String args[]){
		int x = 10;
		System.out.println(x + "を");
		for(int i=0;i<5;i++){
			x++;
			System.out.println("インクリメントして"+x);
		}
		System.out.println("**********************");
		for(int j=0;j<5;j++){
			x--;
			System.out.println("デクリメントして"+x);
		}
		
	}
}