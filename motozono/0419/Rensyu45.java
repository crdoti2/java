public class Rensyu45{
	public static void main(String[] args){
		int[] score = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i = 0;
		for(int j = 0; j < score.length; j++){
		System.out.println((j + 1)+ "�l�� :" + score[j] + "�_");
		i += score[j];
		}
		System.out.println("���ϓ��_��" + (i / score.length) + "�_�ł�");
	}
}