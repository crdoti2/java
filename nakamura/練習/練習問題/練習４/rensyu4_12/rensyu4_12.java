//------------------------------------------------------------------------------
//
//�@���l���J��Ԃ����͂��A
//�@���v�� 100 �𒴂�������͂��~�߂č��v��\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_12 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int sum = 0;

		for(i = 1; sum < 100; i++) {
			System.out.printf("%2d��ځF��������� �� ", i);
			sum += new java.util.Scanner(System.in).nextInt();
			if(sum >= 100) {
				System.out.printf("���v��100�𒴂��܂���\n");
			} else {
				System.out.printf("���݁F%2d\n", sum);
			}
		}
	}
}
