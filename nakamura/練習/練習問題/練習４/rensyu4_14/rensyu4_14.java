//------------------------------------------------------------------------------
//
//�@�O�̖��Ɏ��̏C���������Ȃ����B
//
//�@�E�P�����ƂɃX�g���C�N�A�{�[���A�t�@�E���̉��ꂩ����͂���B
//�@�@�i�c�O�Ȃ���q�b�g�ɂ͂Ȃ�܂���j
//
//�@�E�t�@�E���̏ꍇ�A
//�@�@�Q�X�g���C�N�܂ł̓X�g���C�N�ɃJ�E���g���邪�A�R�X�g���C�N�ɂ͂Ȃ�Ȃ��B
//
//�@�E�R�X�g���C�N�܂��͂S�{�[���ɂȂ�������͂��~�߁A
//�@�@�X�g���C�N�ƃ{�[���̃J�E���g��\������B
//
//------------------------------------------------------------------------------

public class rensyu4_14 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int pitch = 0;
		int strike = 0;
		int ball = 0;
		int foul = 0;

		while(strike <= 2 && ball <= 3) {
			System.out.printf("�X�g���C�N=1 or �{�[��=2 or �t�@�E��=3 �H ");
			pitch = new java.util.Scanner(System.in).nextInt();
			if(pitch == 1) {
				strike++;
			} else if (pitch == 2) {
				ball++;
			} else if (pitch == 3) {
				if(strike < 2) {
					strike++;
				}
			} else {
				System.out.printf("�s���Ȓl�����͂���Ă��܂��B\n");
			}
		}
		System.out.printf("%d�{�[��, %d�X�g���C�N\n", ball, strike);
	}
}
