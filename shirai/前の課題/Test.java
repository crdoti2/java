public class Test { 
public static final int START = 0;
public static final int FINAL = 10;	
	
public static void main(String[] arg){
		for (int i = START; i < FINAL; i++){//0から10まで
		for (int k = START; k < (i + 1); k++){//※が何個からスタートか
			System.out.print("*");//表示文字
		}
			System.out.print("\n");//改行
			
		}
		for (int n = START; n < FINAL; n++){//0から10まで
			for (int o = START; o < FINAL-(n + 1); o++){//10から一つずつ下がる
				System.out.print("*");
			}
				System.out.print("\n");
		}	
	}
}