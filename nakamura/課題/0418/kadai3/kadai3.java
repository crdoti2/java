//------------------------------------------
//
//�@1����1,000�̐����f����񋓂���
//�@������̃x�^�Ȍv�Z���@�ō\���܂���
//�@���A���A�\����10���P�ʂŉ��s���邱��
//
//------------------------------------------

public class kadai3 {

	public static final int FROM_NUMBER = 2; //�J�n����l
	public static final int TO_NUMBER = 1000; //�I������l
	public static final int LINE_MAX = 10; //1�s�ɕ\�������
	public static final String SEPARATE = ","; //��؂蕶��


	public static void main (String[] args) {
		// �J�E���g�ϐ��̐錾
		int i, j, cnt;
		boolean isPrimeNumber;

		cnt = 0;

		// ���[�v
		for(i = FROM_NUMBER; i <= TO_NUMBER; i++) {
			isPrimeNumber = true;
			for(j = FROM_NUMBER; j <= (i / 2); j++) {
				if(i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if(isPrimeNumber) {
				System.out.printf("%4d", i);
				cnt++;
				if(cnt % LINE_MAX == 0) {
					System.out.println("");
				}
			}
		}
	}
}
