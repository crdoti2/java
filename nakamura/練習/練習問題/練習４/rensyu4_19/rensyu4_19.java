//------------------------------------------------------------------------------
//
//�@���l���J��Ԃ��ē��͂��A0 �����͂��ꂽ����͂��~�߁A
//�@���ϒl��\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_19 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int n = 1;
		int sum = 0;
		float ave = 0.0f;

		int i = 0;

		while(true) {
			System.out.print("��������� �� ");
			n = new java.util.Scanner(System.in).nextInt();
			if(n == 0) {
				break;
			} else if(n < 0) {
				// �������Ȃ�
			} else {
				sum += n;
				i++;
			}
		}
		ave = (float)sum / i;
		System.out.printf("���ς�%.2f�ł�\n", ave);
	}
}
