public class Pira{
 public static final int FROM_NUMBER = 0; //開始する位置
 public static final int TO_NUMBER = 10; //終了する位置
 public static final int A_NUMBER = 9; //開始する位置

 public static void main(String[] args){
  int cnt = 0;
  
   for(int i=FROM_NUMBER; i<TO_NUMBER; i++){
      for(int j=FROM_NUMBER; j<i+1; j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
 	{
 		for(int i=FROM_NUMBER; i<A_NUMBER; i++){
 				for(int j=FROM_NUMBER; j<A_NUMBER-i; j++){
 				System.out.print("*");
 				}
 				System.out.print("\n");
 				}		
 	}
 }
}
 
 