import java.util.*;
public class Ex2{
	public static void main (String args[]){
		
		System.out.println("【数あてゲーム】");
		int ans,num;
		ans = new java.util.Random().nextInt(10);
		
		for(int i=0;i<5;i++){
			System.out.println("0〜9の数字を入力してください。");
			num = new java.util.Scanner(System.in).nextInt();
			if(ans == num){
				System.out.println("アタリ！");
				break;
			}else{
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します。");
	}
}