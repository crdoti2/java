public class Abc { 
public static void main(String[] arg){
		for (int i = 0; i < 10; i++){//0����10�܂�
		for (int k = 0; k < (i + 1); k++){//����������X�^�[�g��
			System.out.print("*");
		}
			System.out.print("\n");//���s
			
		}
		for (int n = 0; n < 10; n++){//0����10�܂�
			for (int o = 0; o < 10-(n + 1); o++){//10������������
				System.out.print("*");
			}
				System.out.print("\n");
		}	
	}
}