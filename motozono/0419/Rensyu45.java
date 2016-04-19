public class Rensyu45{
	public static void main(String[] args){
		int[] score = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int i = 0;
		for(int j = 0; j < score.length; j++){
		System.out.println((j + 1)+ "人目 :" + score[j] + "点");
		i += score[j];
		}
		System.out.println("平均得点は" + (i / score.length) + "点です");
	}
}