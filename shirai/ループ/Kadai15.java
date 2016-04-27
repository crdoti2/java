public class Kadai15{
	public static void main(String[] arg){
	int a = 2;
	int soin = new java.util.Scanner(System.in).nextInt();	
		while(soin != 1){
			if(soin % a == 0){
				soin  = soin / a;
			
			System.out.println(a);
			}
			else{
				a++;
			}
				
		}
	}
}

