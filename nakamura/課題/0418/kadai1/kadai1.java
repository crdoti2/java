//------------------------------------------
//
//�@�s���~�b�h����ʂɕ\������
//
//------------------------------------------

public class kadai1 {

	public static final int FROM_NUMBER =  1; //�J�n����l
	public static final int TO_NUMBER   = 20; //�I������l
	public static final int DIST_NUMBER = 10; //�r���̒l


	public static void main (String[] args) {
		// �J�E���g�ϐ��̐錾
		int i, j;

		// ���[�v
		for(i = FROM_NUMBER; i < TO_NUMBER; i++) {
			if(i < DIST_NUMBER) {		// i��1�`10�܂ł͈ȉ��̏���
				for(j = FROM_NUMBER; j <= i; j++) {
					System.out.print("*");
				}
			} else {			// ����ȊO�͈ȉ��̏���
				for(j = TO_NUMBER; j > i; j--) {
					System.out.print("*");
				}
			}
			// ���s���o��
			System.out.println("");
		}
	}
}
