//------------------------------------------------------------------------------
//
//�@�T�C�Y���������l����͂��A
//�@�������̕����ŗ�̂悤�ȎO�p�`��\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_20 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i, j;
		int n;

		System.out.printf("��������� �� ");
		n = new java.util.Scanner(System.in).nextInt();

		for(i = 0; i <= n; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}
}
