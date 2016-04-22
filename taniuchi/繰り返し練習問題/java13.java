public class java13{
	public static void main(String args[]){
		
		int stk,ball;
		stk=0;
		ball=0;
		
		for(int i=0;i<8;i++){
			System.out.println("ストライク=1 or ボール=2　？");
			int input = new java.util.Scanner(System.in).nextInt();
			if(input==1){
				stk++;
			}else if(input==2){
				ball++;
			}else{
				System.out.println("やり直してください。");
				i--;
				continue;
			}
			if(stk==3 || ball==4){
				break;
			}
		}
		System.out.println(stk+"ストライク"+ball+"ボール");
	}
}