public class java14{
	public static void main(String args[]){
		
		int stk,ball;
		int s=0;
		stk=0;
		ball=0;
		
		for(int i=0;i<50;i++){
			System.out.println("�X�g���C�N=1 or �{�[��=2 or �t�@�E��=3 �H");
			int input = new java.util.Scanner(System.in).nextInt();
			System.out.println("stk"+stk);
			if(input==1){
				stk++;
				s=1;
			}else if(input==2){
				ball++;
			}else if(input==3){
				s=0;
				if(stk<2){
					stk++;
				}else{
					continue;
				}
			}else{
				System.out.println("��蒼���Ă��������B");
				i--;
				continue;
			}
			if(stk>2 && s==1 || ball==4){
				break;
			}
		}
		System.out.println(stk+"�X�g���C�N"+ball+"�{�[��");
	}
}