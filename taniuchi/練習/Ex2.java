import java.util.*;
public class Ex2{
	public static void main (String args[]){
		
		System.out.println("�y�����ăQ�[���z");
		int ans,num;
		ans = new java.util.Random().nextInt(10);
		
		for(int i=0;i<5;i++){
			System.out.println("0�`9�̐�������͂��Ă��������B");
			num = new java.util.Scanner(System.in).nextInt();
			if(ans == num){
				System.out.println("�A�^���I");
				break;
			}else{
				System.out.println("�Ⴂ�܂��B");
			}
		}
		System.out.println("�Q�[�����I�����܂��B");
	}
}