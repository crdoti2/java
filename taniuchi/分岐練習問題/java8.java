public class java8{
	public static void main(String args[]){
		/*文字の入力*/
		System.out.println("中間試験の点数を入力してください。");
		int input1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("期末試験の点数を入力してください。");
		int input2 = new java.util.Scanner(System.in).nextInt();
		/*条件分岐*/
		if(input1 >=60 && input2>=60){				//両方とも 60 点以上の場合、合格
			System.out.println("合格");
		}else if((input1+input2) >= 130){			//合計が 130 点以上の場合、合格
			System.out.println("合格");
		}else if((input1+input2) >= 100){			//合計が 100 点以上で、
			if(input1 >= 90 || input2 >= 90){		//どちらかの試験が 90 点以上であれば合格
				System.out.println("合格");
			}
		}else{										//上記以外は不合格
			System.out.println("不合格");
		}
	}
}