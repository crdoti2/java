public class java21{
	public static void main(String args[]){
		String s="X";
		int max = 0;
		int min = 1;
		int input = new java.util.Scanner(System.in).nextInt();
		max = input;
		int i,j,k;
		
		for(i=1;i<=input;i++){
			for(j=1;j<=input;j++){
				if(j==min||j==max){
					System.out.print(s);
				}else{
					System.out.print(" ");
				}
				max--;
				min++;
				System.out.println("");
			}
		}
	}
}	
