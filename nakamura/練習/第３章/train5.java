//------------------------------------------------------------------------------
//P.132
//�@switch����p���Ď��̏����𖞂����v���O�������쐬���Ă�������
//
//�@�@��ʂɁu[���j���[] 1:���� 2:�o�^ 3:�폜 4:�ύX�@�� �v�ƕ\������B
//�@�A��������͂��A�ϐ�selected�ɑ������B
//�@�B�����ϐ�selected��1�Ȃ�u�������܂��v�A2�Ȃ�u�o�^���܂��v�A
//�@�@3�Ȃ�u�폜���܂��v�A4�Ȃ�u�ύX���܂��v�ƕ\������B
//�@�Cselected��1����4�̂�����ł��Ȃ��ꍇ�͉������Ȃ��B
//
//------------------------------------------------------------------------------

public class train5 {

	public static void main(String[] args){

		// �ϐ��̐錾
		int selected;

		// �@
		System.out.print("[���j���[] 1:���� 2:�o�^ 3:�폜 4:�ύX�@�� ");

		// �A
		selected = new java.util.Scanner(System.in).nextInt();

		// �B
		switch (selected) {
			case 1:
				System.out.println("�������܂�");
				break;

			case 2:
				System.out.println("�o�^���܂�");
				break;

			case 3:
				System.out.println("�폜���܂�");
				break;

			case 4:
				System.out.println("�ύX���܂�");
				break;

			default:
			// �C
			// �������Ȃ�
		}
	}
}
