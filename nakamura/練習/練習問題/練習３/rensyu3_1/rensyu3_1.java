//------------------------------------------------------------------------------
//
//�@int �^�̕ϐ� x�Ay �ɂ��ꂼ�ꐔ�l����͂��Ax �� y ���傫���ꍇ�ɁA
//�@�gx��y���傫���B�h�Ƃ�������\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu3_1 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int x, y;

		// ����
		System.out.print("�C�ӂ̐�������� x �� ");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.print("�C�ӂ̐�������� y �� ");
		y = new java.util.Scanner(System.in).nextInt();

		if(x > y){
			System.out.printf("x��y���傫���B\n");
		} else {
			System.out.printf("x��y��菬�����B\n");
		}
	}
}
