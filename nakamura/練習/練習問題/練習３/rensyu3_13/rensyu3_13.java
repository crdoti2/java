//------------------------------------------------------------------------------
//
//�@����\�����l����͂��A���̌��̓�����\������v���O�������쐬���Ȃ����B
//�@2 ���� 28 ���Ƃ��܂��B�܂��A1 �` 12 �ȊO�̐��l�����͂��ꂽ�ꍇ�ɁA
//�@�g���͂��Ԉ���Ă��܂��h�ƕ\�����Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu3_13 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int month;

		// ����
		System.out.print("������� �� ");
		month = new java.util.Scanner(System.in).nextInt();

		switch(month){
			case 1:
				System.out.println("�R�P��");
				break;

			case 2:
				System.out.println("�Q�W��");
				break;

			case 3:
				System.out.println("�R�P��");
				break;

			case 4:
				System.out.println("�R�O��");
				break;

			case 5:
				System.out.println("�R�P��");
				break;

			case 6:
				System.out.println("�R�O��");
				break;

			case 7:
				System.out.println("�R�P��");
				break;

			case 8:
				System.out.println("�R�P��");
				break;

			case 9:
				System.out.println("�R�O��");
				break;

			case 10:
				System.out.println("�R�P��");
				break;

			case 11:
				System.out.println("�R�O��");
				break;

			case 12:
				System.out.println("�R�P��");
				break;

			default:
				System.out.println("���͂��Ԉ���Ă��܂��B");
		}
	}
}
