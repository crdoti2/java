public class java11{
	public static void main(String args[]){
		
		System.out.println("個数を入力してください。");
		
		int input = new java.util.Scanner(System.in).nextInt();
		int i,j;
		j=0;
		for(i=0;i<input;i++){
			if(j>9){
				j=0;
			}
			System.out.print(j);
			j++;
		}
	}
}