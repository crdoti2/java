public class Test { 
public static final int START = 0;
public static final int FINAL = 10;	
	
public static void main(String[] arg){
		for (int i = START; i < FINAL; i++){//0����10�܂�
		for (int k = START; k < (i + 1); k++){//����������X�^�[�g��
			System.out.print("*");//�\������
		}
			System.out.print("\n");//���s
			
		}
		for (int n = START; n < FINAL; n++){//0����10�܂�
			for (int o = START; o < FINAL-(n + 1); o++){//10������������
				System.out.print("*");
			}
				System.out.print("\n");
		}	
	}
}