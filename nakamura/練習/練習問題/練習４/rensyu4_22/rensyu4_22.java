//------------------------------------------------------------------------------
//
//�@�t�B�{�i�b�`�����\������v���O�������쐬���Ȃ����B
//�@�ŏ��̂Q�̍��� 0�A1 �Ƃ��A1000 �܂Łi 1000 �ȉ��̍��j��\��������̂Ƃ��܂��B
//
//------------------------------------------------------------------------------

public class rensyu4_22 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i = 0;
		int j = 1;
		int k = 0;
		int cnt = 2;

		System.out.printf("%5d", i);
		System.out.printf("%5d", j);

		while(k < 1000) {
			k = i + j;
			if(k >= 1000) {
				break;
			}
			System.out.printf("%5d", k);
			i = j;
			j = k;
			cnt++;
			if(cnt % 10 == 0) {
				System.out.println("");
			}
		}
	}
}
