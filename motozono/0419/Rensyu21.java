public class Rensyu21{
	public static void main(String[] args){
		int i = 0;
		int inc = 1; 												//�C���N�������g
		int dec = 0;												//�f�N�������g
		int input = new java.util.Scanner(System.in).nextInt();		//����
		dec = input;												//���͂����l��dec�ɓ����

		// ���ꂩ��2�d���[�v
		for(i = 1; i <= input; i++){ 
	  		for(int z = 1; z <= input; z++){
	  			if(z == inc || z == dec){ 							//z���C���N�̎��܂��́Adec�̎�
	        		System.out.print("x");							//x���o��
	  			} else {											//����ȊO�̎�
	      			System.out.print(" ");							//�X�y�[�X���o��
	  			}
			}
			inc++;													//�C���N�������g
			dec--;													//�f�N�������g
			System.out.println("");									//���s
		}
	}
}
