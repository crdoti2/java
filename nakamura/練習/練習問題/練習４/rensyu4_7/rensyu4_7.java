//------------------------------------------------------------------------------
//
//�@���̃v���O�������쐬���Ȃ����B
//�@�E���l�A��_��Ŗ���̓��_����͂���B�i�P��`�X��j
//�@�E���͂��I�������A���ꂼ��̓��_�Ƃǂ��炪����������\������B
//�@�@�������͋��l�̐�s�Ƃ���B
//
//------------------------------------------------------------------------------

public class rensyu4_7 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int kyojin = 0;
		int hanshin = 0;

		for(i = 1; i < 10; i++) {
			System.out.printf("%d��\�A���l�̓��_�́H ", i);
			kyojin += new java.util.Scanner(System.in).nextInt();
			System.out.printf("%d��\�A��_�̓��_�́H ", i);
			hanshin += new java.util.Scanner(System.in).nextInt();
		}

		System.out.printf("���l�F%3d, ��_%3d\n", kyojin, hanshin);
		if(kyojin > hanshin) {
			System.out.printf("���l�̏���\n");
		} else if(kyojin < hanshin) {
			System.out.printf("��_�̏���\n");
		} else {
			System.out.printf("��������\n");
		}

	}
}
