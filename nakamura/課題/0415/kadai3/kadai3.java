//------------------------------------------
//
//�@1����1,000�̐����f����񋓂���
//�@������̃x�^�Ȍv�Z���@�ō\���܂���
//�@���A���A�\����10���P�ʂŉ��s���邱��
//
//------------------------------------------

public class kadai3 {
	public static void main (String[] args) {
		// �J�E���g�ϐ��̐錾
		int i, j, k;
		boolean primeNumber;

		k = 0;

		// ���[�v
		for(i = 2; i <= 1000; i++) {
			primeNumber = true;
			for(j = 2; j < i; j++) {
				if(1000 % i == 0) {
					primeNumber = false;
				}
			}
			if(primeNumber) {
				System.out.print(i + ", ");
				k++;
				if((k + 1) % 10 == 0) {
					System.out.println("");
				}
			}
		}
	}
}
