//------------------------------------------------------------------------------
//P.165
//�@���Ɏ����S�̏����ɉ����āu�����ăN�C�Y�v�̃v���O�������쐬���Ă��������B
//
//�@�@int�^�ŗv�f���R�̔z��̔z��numbers���������܂��B
//�@�@���̂Ƃ������l�͂��ꂼ��u�R�v�u�S�v�u�X�v�Ƃ��܂��B
//�@�A��ʂɁu�P���̐�������͂��Ă��������v�ƕ\�����܂��B
//�@�B���̃R�[�h��p���ăL�[�{�[�h���琔���̓��͂��󂯕t���A
//�@�@�ϐ�input�ɑ�����܂��B
//		int input = new java.util.Scanner(System.in).nextInt();
//�@�C�z������[�v�ŉ񂵂Ȃ���A�����ꂩ�̗v�f�Ɠ��������𒲂ׂ܂��B
//�@�@������������΁u�A�^���I�v�ƕ\�����܂��B
//
//------------------------------------------------------------------------------

public class train4 {

	public static void main(String[] args){

		// �J�E���g�ϐ��̐錾
		int i;

		// �@
		int numbers[] = { 3, 4, 9 };

		// �A
		System.out.print("�P���̐�������͂��Ă������� �� ");

		// �B
		int input = new java.util.Scanner(System.in).nextInt();

		for(i = 0; i < 3; i++) {
			if(numbers[i] == input) {
				System.out.print("�A�^���I\n");
			}
		}
	}
}
