//------------------------------------------------------------------------------
//
//�@���R���i���̐����j�� 10 ����͂��A�ő�l�ƍŏ��l�����߂�v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_9 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int n = 0;
		int max;
		int min;

		System.out.printf("���R���i���̐����j����� �� ");
		n = new java.util.Scanner(System.in).nextInt();

		max = n;
		min = n;

		for(i = 2; i < 10; i++) {
			System.out.printf("���R���i���̐����j����� �� ");
			n = new java.util.Scanner(System.in).nextInt();
			if(n > max) {
				max = n;
			} else if(n < min) {
				min = n;
			}
		}
		System.out.printf("�ő�l�F%d\n�ŏ��l�F%d\n", max, min);
	}
}
