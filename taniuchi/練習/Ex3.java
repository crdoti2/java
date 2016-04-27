public class Ex3{
	public static void main (String args[]){
		int points[] = new int[4];
		double weight[] = new double[5];
		boolean answers[] = new boolean[3];
		String names[] = new String[3];
		
		int [] moneyList = {121902,8302,5510};
		for(int i=0;i<moneyList.length;i++){
			System.out.println(moneyList[i]);
		}
		for(int num:moneyList){
			System.out.println(num);
		}
		
		
		System.out.println("【数あてゲーム】");
		
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		
		for(int i:numbers){
			if(i == input){
				System.out.println("アタリ！");
				break;
			}else{
				System.out.println("ハズレ");
				break;
			}
		}
		
		System.out.println("ゲームを終了します。");

	}
}