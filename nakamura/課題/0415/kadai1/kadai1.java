//------------------------------------------
//
//�@�s���~�b�h����ʂɕ\������
//
//------------------------------------------

public class kadai1 {
	public static void main (String[] args) {
		// �J�E���g�ϐ��̐錾
		int i, j;

		// �Q�d���[�v
		for(i = 1; i < 20; i++) {
			if(i < 10) {		// i��1�`10�܂ł͈ȉ��̏���
				for(j = 1; j < i; j++) {
					System.out.print("*");
				}
			} else {			// ����ȊO�͈ȉ��̏���
				for(j = 20; j > i; j--) {
					System.out.print("*");
				}
			}
			// ���s���o��
			System.out.println("");
		}
	}
}
