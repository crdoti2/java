public class Abc { 
public static void main(String[] arg){
		for (int i = 0; i < 10; i++){//0から10まで
		for (int k = 0; k < (i + 1); k++){//※が何個からスタートか
			System.out.print("*");
		}
			System.out.print("\n");//改行
			
		}
		for (int n = 0; n < 10; n++){//0から10まで
			for (int o = 0; o < 10-(n + 1); o++){//10から一つずつ下がる
				System.out.print("*");
			}
				System.out.print("\n");
		}	
	}
}