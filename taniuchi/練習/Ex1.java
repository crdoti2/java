import java.util.*;
public class Ex1{
	public static void main(String args[]){
		//練習3-1
		int weight,age,age1,age2;
		String name;
		
		weight = 60;
		age = 0;
		age1 = 30;
		age2 = 30;
		name = "湊";
		
		if(weight == 60)//変数weightの値が60に等しい
			System.out.println("weightは" + weight);
		if((age1+age2)*2 > 60)//変数age1とage2の合計を2倍したものが60を超えている
			System.out.println("age1 + age2は" + (age1+age2));
		if(age%2 != 0)//変数age奇数である
			System.out.println("変数ageは" + (age%2));
		if("湊".equals(name))//変数nameの中身の文字列が「湊」と等しい
			System.out.println("名前は" + name);
		//練習3-2
		//C,D,E
		
		//練習3-3
		int seibetu = 0;
		age = 10;
		System.out.println("こんにちは。");
		if(seibetu == 0){
			System.out.println("私は男です。");
			System.out.println(age + "歳です。");
		}else{
			System.out.println("私は女です。");
		}
		System.out.println("よろしくおねがいします。");
		
		//練習3-4
		boolean tenki = true;
		if(tenki){				//boolean型での条件式では演算子は不要
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		}else{
				System.out.println("DVDを見ます");
		}
		
		System.out.println("1:検索 2:登録 3:削除 4:変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected){
			case 1:
				System.out.println("検索します");
				break;
			
			case 2:
				System.out.println("登録します");
				break;
			
			case 3:
				System.out.println("削除します");
				break;
			
			case 4:
				System.out.println("変更します");
				break;
			default:
				System.out.println("やり直してください。");
		}
	}
}