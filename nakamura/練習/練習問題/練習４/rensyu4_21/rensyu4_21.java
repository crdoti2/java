//------------------------------------------------------------------------------
//
//�@�T�C�Y���������l����͂��A
//�@���̃T�C�Y�́~����������̕����ŕ\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_21 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i, j;
		int n;
		int inc, dec;

		System.out.printf("��������� �� ");
		n = new java.util.Scanner(System.in).nextInt();
		inc = 1;
		dec = n;

		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n; j++) {
				if(j == inc || j == dec) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			inc++;
			dec--;
			System.out.println("");
		}
	}
}
