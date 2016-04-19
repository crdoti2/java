//------------------------------------------------------------------------------
//P.131
//　次の日本語で記載された条件式をjavaで記述してみましょう
//　�@変数weightの値が60に等しい。
//　�A変数age1とage2の合計を2倍したものが60を超えている。
//　�B変数ageが奇数である。
//　�C変数nameの中身の文字列が「湊」等しい。
//
//------------------------------------------------------------------------------

public class train1 {

	public static void main(String[] args){

		int weight = 60;
		int age1 = 15;
		int age2 = 23;
		int age = 59;
		String name = "minato";

		// �@
		if(weight == 60){
			System.out.println("�@true");
		}

		// �A
		if((age1 + age2) * 2 >= 60){
			System.out.println("�Atrue");
		}

		// �B
		if(age % 2 != 0){
			System.out.println("�Btrue");
		}

		// �C
		if(name == "minato"){
			System.out.println("�Ctrue");
		}
	}
}
