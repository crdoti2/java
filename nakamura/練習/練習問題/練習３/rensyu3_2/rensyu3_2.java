//------------------------------------------------------------------------------
//
//�@�Q�̐����l����͂��A
//�@�傫�����i�������Ȃ����j�̐���\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu3_2 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int x, y;

		// ����
		System.out.print("�C�ӂ̐�������� x �� ");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.print("�C�ӂ̐�������� y �� ");
		y = new java.util.Scanner(System.in).nextInt();

		if(x > y){
			System.out.printf("�傫���̂�%d�ł��B\n", x);
		} else {
			System.out.printf("�傫���̂�%d�ł��B\n", y);
		}
	}
}
