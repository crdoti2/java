//------------------------------------------------------------------------------
//
//�@�����l����͂��A�ȉ��̂S�̕��ނ���Y��������̂�\������v���O�������쐬���Ȃ����B
//�@�g���̋����h�A�g���̊�h�A�g���̋����h�A�g���̊�h
//
//------------------------------------------------------------------------------

public class rensyu3_6 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int n;

		// ����
		System.out.print("�C�ӂ̐�������� �� ");
		n = new java.util.Scanner(System.in).nextInt();

		if(n >= 0) {
			if(n % 2 == 0) {
				System.out.printf("���̋���\n");
			} else {
				System.out.printf("���̊\n");
			}
		} else {
			if(n % 2 == 0) {
				System.out.printf("���̋���\n");
			} else {
				System.out.printf("���̊\n");
			}
		}		
	}
}
