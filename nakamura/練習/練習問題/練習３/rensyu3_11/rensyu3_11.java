//------------------------------------------------------------------------------
//
//�@����\�����l����͂��A
//�@���̌��̏��߂���N���܂łɂ���j����\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu3_11 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int month;

		// ����
		System.out.print("������� �� ");
		month = new java.util.Scanner(System.in).nextInt();

		switch(month){
			case 1:
				System.out.println("�@�P���F�����A���l�̓�");
				break;

			case 2:
				System.out.println("�@�Q���F�����L�O�̓�");
				break;

			case 3:
				System.out.println("�@�R���F�t���̓�");
				break;

			case 4:
				System.out.println("�@�S���F���a�̓�");
				break;

			case 5:
				System.out.println("�@�T���F���@�L�O���A�݂ǂ�̓��A���ǂ��̓�");
				break;

			case 6:
				System.out.println("�@�U���F�Ȃ�");
				break;

			case 7:
				System.out.println("�@�V���F�C�̓�");
				break;

			case 8:
				System.out.println("�@�W���F�Ȃ�");
				break;

			case 9:
				System.out.println("�@�X���F�h�V�̓��A�H���̓�");
				break;

			case 10:
				System.out.println("�P�O���F�̈�̓�");
				break;

			case 11:
				System.out.println("�P�P���F�����̓��A�ΘJ���ӂ̓�");
				break;

			case 12:
				System.out.println("�P�Q���F�V�c�a����");
				break;

			default:
				System.out.println("���͂��Ԉ���Ă��܂��B");
		}
	}
}
