//------------------------------------------------------------------------------
//
//�@���Ԏ����ƁA���������̓_���i���ꂼ�� 0 �` 100 �_�j����͂��A
//�@���̏����ɏ]���č��i�A�s���i�𔻒肷��v���O�������쐬���Ȃ����B
//
//�@�����Ƃ� 60 �_�ȏ�̏ꍇ�A���i
//�@���v�� 130 �_�ȏ�̏ꍇ�A���i
//�@���v�� 100 �_�ȏ�ŁA�ǂ��炩�̎����� 90 �_�ȏ�ł���΍��i
//�@��L�ȊO�͕s���i
//
//------------------------------------------------------------------------------

public class rensyu3_8 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int x, y;

		// ����
		System.out.print("���Ԏ����̓_������� x �� ");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.print("���������̓_������� y �� ");
		y = new java.util.Scanner(System.in).nextInt();

		if(x >= 60 && y >= 60) {
			System.out.printf("���i\n");
		} else if(x + y >= 130) {
			System.out.printf("���i\n");
		} else if(x + y >= 100 && (x | y) >= 90) {
			System.out.printf("���i\n");
		} else {
			System.out.printf("�s���i\n");
		}
	}
}
