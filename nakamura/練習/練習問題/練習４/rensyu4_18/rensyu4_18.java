//------------------------------------------------------------------------------
//
//�@���l���J��Ԃ��ē��͂��A0 �����͂��ꂽ����͂��~�߁A
//�@����܂ł̍��v��\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_18 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int n = 1;
		int sum = 0;

		while(true) {
			System.out.print("��������� �� ");
			n = new java.util.Scanner(System.in).nextInt();
			if(n == 0) {
				break;
			} else if(n < 0) {
				// �������Ȃ�
			} else {
				sum += n;
			}
		}
		System.out.printf("���v��%d�ł�\n", sum);
	}
}
