//------------------------------------------
//
//�@0����99�̃����_���Ȑ�����100�������A
//�@���ʂ����L�̃t�H�[�}�b�g�ŕ\������B
//
//------------------------------------------

public class kadai2 {

	public static final int TO_NUMBER  = 100;	// �I������l
	public static final int RANDOM_MAX = 100;	// �����_���̏���l


	public static void main (String[] args) {
		// �J�E���g�ϐ��̐錾
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int m = 0;

		// �z��̐錾
		int[] n1 = new int[TO_NUMBER];
		int[][] n2 = new int[TO_NUMBER][2];

		int[] even   = new int[TO_NUMBER];		// �����i�[�p�z��
		int[] odd    = new int[TO_NUMBER];		// ��i�[�p�z��

		for(i = 0; i < TO_NUMBER; i++) {
			n2[i][0] = i;
		}

		// �z��Ƀ����_���i�O�`�X�X�܂Łj�̒l����
		for(i = 0; i < RANDOM_MAX; i++) {
			n1[i] = new java.util.Random().nextInt(100);
			if (n1[i] % 2 == 0) {
				even[j] = n1[i];
				j++;
			} else {
				odd[k] = n1[i];
				k++;
			}
			for(l = 0; l < TO_NUMBER; l++) {
				if(n1[i] == n2[l][0]) {
					n2[l][1] += 1;
					break;
				}
			}
		}
		
		// �g�p���Ă��Ȃ��l�̌��𐔂���
		for(i = 0; i < TO_NUMBER; i++) {
			if(n2[i][1] == 0) {
				m++;
			}
		}

		// �����̕\��
		System.out.print("�����i" + j + "�j");
		for(i = 0; i < j; i++) {
			System.out.print(even[i] + ", ");
		}

		System.out.println("");
		System.out.println("");

		// ��̕\��
		System.out.print("��i" + k + "�j");
		for(i = 0; i < k; i++) {
			System.out.print(odd[i] + ", ");
		}
		
		System.out.println("");
		System.out.println("");

		// �g�p���Ȃ������l�̕\��
		System.out.print("�g�p���Ȃ������l�i" + m + "�j");
		for(i = 0; i < TO_NUMBER; i++) {
			if(n2[i][1] == 0) {
				System.out.print(n2[i][0] + ", ");
			}
		}
	}
}
