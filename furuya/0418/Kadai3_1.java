/*
次の日本語で記載された条件式をjavaで記述してみましょう。
変数weightの値が60に等しい。
変数age1とage2の合計を2倍したものが60を超えている。
変数ageが奇数である。
変数nameの中身の文字が「湊」と等しい。
**/

public class Kadai3_1{
	public static int weight = 60;
	public static int age1 = 30;
	public static int age2 = 31;
	public static int age  = 21;
	public static String name = "湊";
	
	public  static void main(String args[]){
		
		if(weight==60){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		if(age1+age2 >60){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		if(age%2 == 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		if(name == "湊"){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}


