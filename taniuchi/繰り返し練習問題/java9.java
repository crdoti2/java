public class java9{
	public static void main(String args[]){
		
		int max,min;
		max=0;
		min=100;
		System.out.println("������10����͂��Ă��������B");
		for(int i=0;i<10;i++){
			int input = new java.util.Scanner(System.in).nextInt();
			if(input>max){
				max=input;
			}else if(input<min){
				min=input;
			}
		}
		System.out.println("MAX="+max+"MIN="+min);
	}
}