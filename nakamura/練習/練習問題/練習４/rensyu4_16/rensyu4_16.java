//------------------------------------------------------------------------------
//
//�@���͂��ꂽ�����f�����ǂ����𔻒肷��v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_16 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i = 2;
		int j = 0;
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
				j++;
			}
			if(m % i != 0) {
				i++;
			}
		}
		if(j == 1) {
			System.out.printf("%d�͑f��\n", n);
		} else {
			System.out.printf("%d�͑f���ł͂Ȃ�\n", n);
		}
	}
}
