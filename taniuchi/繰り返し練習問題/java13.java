public class java13{
	public static void main(String args[]){
		
		int stk,ball;
		stk=0;
		ball=0;
		
		for(int i=0;i<8;i++){
			System.out.println("�X�g���C�N=1 or �{�[��=2�@�H");
			int input = new java.util.Scanner(System.in).nextInt();
			if(input==1){
				stk++;
			}else if(input==2){
				ball++;
			}else{
				System.out.println("��蒼���Ă��������B");
				i--;
				continue;
			}
			if(stk==3 || ball==4){
				break;
			}
		}
		System.out.println(stk+"�X�g���C�N"+ball+"�{�[��");
	}
}