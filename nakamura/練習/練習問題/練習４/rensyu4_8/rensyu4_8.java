//------------------------------------------------------------------------------
//
//�@���R���i���̐����j�� 10 ����͂��A�ő�l�����߂�v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_8 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int n = 0;
		int m = 0;

		for(i = 1; i < 10; i++) {
			System.out.printf("���R���i���̐����j����� �� ");
			n = new java.util.Scanner(System.in).nextInt();
			if(n < 0) {
				System.out.printf("�s���Ȓl�ł�\n");
			} else if(n > m) {
				m = n;
			}
		}
		System.out.printf("�ő�l%d�ł�\n", m);
	}
}
