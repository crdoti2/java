//------------------------------------------
//
//�@break����Y���Ɓc
//
//------------------------------------------

public class list3-5 {
	public static void main(String[] args) {
		System.out.println("���Ȃ��̉^����肢�܂�");
		int fortune = 1;						// ���1

		// switch��
		switch (fortune) {
			case 1:
				System.out.println("��g");
												// ������break;�����Y��Ă���
			case 2:
				System.out.println("���g");
				break;
			case 3:
				System.out.println("�g");
				break;
			default:
				System.out.println("��");
		}
	}
}
