//------------------------------------------------------------------------------
//
//�@int �^�̕ϐ� x�Ay �ɂ��ꂼ�ꐔ�l����͂��A
//�@x �� �� ���傫���ꍇ�ɂ́gx��y���傫���h�A
//�@x �� y ��菬�����ꍇ�ɂ́gx��y��菬�����h�ƕ\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu3_3 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int x, y;

		// ����
		System.out.print("�C�ӂ̐�������� x �� ");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.print("�C�ӂ̐�������� y �� ");
		y = new java.util.Scanner(System.in).nextInt();

		if(x > y){
			System.out.printf("x��y���傫��\n");
		} else {
			System.out.printf("x��y��菬����\n");
		}
	}
}
