public class Abc { 
public static void main(String[] arg){
		for (int i = 0; i < 10; i++){
		for (int j = 0; j < 10-(i + 1); j++){
		}
		for (int k = 0; k < (i + 1); k++){
			System.out.print("*");
		}
			System.out.print("\n");
			
		}
		for (int n = 0; n < 10; n++){
		for (int m = 0; m < 10+(n + 1); m++){
		}
			for (int o = 0; o < 10-(n + 1); o++){
				System.out.print("*");
			}
				System.out.print("\n");
		}	
	}
}