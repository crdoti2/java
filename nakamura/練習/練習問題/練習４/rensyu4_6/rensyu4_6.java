//------------------------------------------------------------------------------
//
//�@�����A0 �� 1 �� 10 ����͂���B�����ΐ퐬�тƍl���A0 �𕉂��A1 �������Ƃ��āA
//�@�����̑����A�����̑�����\������v���O�������쐬���Ȃ����B
//
//------------------------------------------------------------------------------

public class rensyu4_6 {

	public static void main(String[] args){
		// �ϐ��̐錾
		int i;
		int battle = 0;
		int win = 0;
		int lose = 0;

		for(i = 0; i < 10; i++) {
			System.out.print("�O���P����� �� ");
			battle = new java.util.Scanner(System.in).nextInt();
			if(battle == 0) {
				win++;
			} else if(battle == 1) {
				lose++;
			} else {
				System.out.printf("\n�s���Ȓl�����͂���Ă��܂�\n");
			}
		}

		System.out.printf("�����F%3d\n", win);
		System.out.printf("�����F%3d\n", lose);

	}
}
