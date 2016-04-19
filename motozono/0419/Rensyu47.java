public class Rensyu47{
	public static void main(String[] args){
		int[] kyo = {1,1,2,6,0,0,0,4,2};
		int[] han = {1,3,4,0,0,1,2,1,0};
		int y = 0;
		int z = 0;
		for(int i = 0; i < kyo.length; i++){
			System.out.println((i + 1)+ "回表、巨人の得点は :" + kyo[i] + "点");
			System.out.println((i + 1)+ "回裏、阪神の得点は :" + han[i] + "点");
		y += kyo[i];
		z += han[i];
		}
		System.out.println("巨人は" + (y) + "点");
		System.out.println("阪神は" + (z) + "点");
		if(y > z){
		System.out.println("巨人の勝ち");
		}else{
		System.out.println("阪神の勝ち");
		}
		                                                               
	}
}