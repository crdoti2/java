//------------------------------------------
//
//�@������break���������Ȃ�
//
//------------------------------------------

public class list3-6 {
	public static void main(String[] args) {
		System.out.println("���Ȃ��̉^����肢�܂�");
		
		// �����_���̐��l������i�P�`�T�j
		// �����_���͂O���琶�������̂ŁA�����_���i�O�`�S�j�ɂP�𑫂��āi�P�`�T�j�ɂ���
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
			case 1:		// �P�ƂQ�̏ꍇ
			case 2:
				System.out.println("�����ˁI");
				break;
			case 3:		// �R�̏ꍇ
				System.out.println("���ʂł�");
				break;
			case 4:		// �S�ƂT�̏ꍇ
			case 5:
				System.out.println("���[��c");
		}
	}
}
