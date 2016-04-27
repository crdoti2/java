public class java15{
	public static void main(String args[]){
		
		int input = new java.util.Scanner(System.in).nextInt();
		int x;
		x=2;
		if(input>2){
			while(input>1){
				if(input%x==0){
					input=input/x;
					System.out.print(x+" ");
					x = 2;
				}else{
					x++;
				}
			}
		}
	}
}