//------------------------------------------------------------------------------
//
//�@������ 10 ����͂��A���ϒl�����߂�v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_5 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int sum = 0;
		int ave = 0;

		for(i = 0; i < 10; i++) {
			System.out.print("�C�ӂ̐�������� �� ");
			sum += new java.util.Scanner(System.in).nextInt();
		}

		ave = sum / 10;
		System.out.printf("���ϒl�F%3d\n", ave);
	}
}
