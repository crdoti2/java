//------------------------------------------------------------------------------
//
//�@�X�g���C�N�E�J�E���g�𐔂���v���O�������쐬���Ȃ����B
//�@�E�P�����ƂɃX�g���C�N���{�[��������͂���B
//�@�E�R�X�g���C�N�܂��͂S�{�[���ɂȂ�������͂��~�߁A
//�@�@�X�g���C�N�ƃ{�[���̃J�E���g��\������B
//
//------------------------------------------------------------------------------

public class rensyu4_13 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int pitch = 0;
		int strike = 0;
		int ball = 0;

		while(strike <= 2 && ball <= 3) {
			System.out.printf("�X�g���C�N=1 or �{�[��=2 �H ");
			pitch = new java.util.Scanner(System.in).nextInt();
			if(pitch == 1) {
				strike++;
			} else if (pitch == 2){
				ball++;
			} else {
				System.out.printf("�s���Ȓl�����͂���Ă��܂��B\n");
			}
		}
		System.out.printf("%d�{�[��, %d�X�g���C�N\n", ball, strike);
	}
}
