//------------------------------------------
//
//�@�_���Ǘ��v���O�����i�z��Łj
//
//------------------------------------------

public class list4-8 {
	public static void main(String[] args) {
		int[] score = { 20, 30, 40, 50, 80 };

		// ���v�̎Z�o�i�G���[����j
		int sum =
			score[1] + score[2] + score[3] + score[4] + score[5];

		// ���ς̎Z�o
		int avg = sum / score.length;

		System.out.println("���v�_�F" + sum);
		System.out.println("���ϓ_�F" + avg);

	}
}
