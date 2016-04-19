public class Rensyu21{
	public static void main(String[] args){
		int i = 0;
		int inc = 1; 												//インクリメント
		int dec = 0;												//デクリメント
		int input = new java.util.Scanner(System.in).nextInt();		//入力
		dec = input;												//入力した値をdecに入れる

		// これから2重ループ
		for(i = 1; i <= input; i++){ 
	  		for(int z = 1; z <= input; z++){
	  			if(z == inc || z == dec){ 							//zがインクの時または、decの時
	        		System.out.print("x");							//xを出力
	  			} else {											//それ以外の時
	      			System.out.print(" ");							//スペースを出力
	  			}
			}
			inc++;													//インクリメント
			dec--;													//デクリメント
			System.out.println("");									//改行
		}
	}
}
