//------------------------------------------------------------------------------
//
//�@�����̓_������͂��A�Ή����鐬�т�\������v���O�������R��ލ쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu3_7 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int n;

		// ����
		System.out.print("�����̓_������� �� ");
		n = new java.util.Scanner(System.in).nextInt();

		if(n >= 60){
			System.out.printf("���i\n");
		} else {
			System.out.printf("�s���i\n");
		}

		if(n >= 80){
			System.out.printf("�����ւ�悭�ł��܂����B\n");
		} else if(n >= 60) {
			System.out.printf("�悭�ł��܂����B\n");
		} else {
			System.out.printf("����˂�ł����B\n");
		}

		if(n >= 80){
			System.out.printf("�D\n");
		} else if(n >= 70) {
			System.out.printf("��\n");
		} else if(n >= 60) {
			System.out.printf("��\n");
		} else {
			System.out.printf("�s��\n");
		}
	}
}
