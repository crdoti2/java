//------------------------------------------------------------------------------
//
//�@2 �ȏ�̐��l����͂��A�f���������������ʂ�\�����Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_15 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i = 2;
		int n;
		int m;

		System.out.printf("�Q�ȏ�̐����l����� �� ");
		n = new java.util.Scanner(System.in).nextInt();
		m = n;

		while(m >= 0) {
			if(m == 1) {
				break;
			}
			if(m % i == 0) {
				m = m / i;
				System.out.printf("%2d, ", i);
			}
			if(m % i != 0) {
				i++;
			}
		}
	}
}
