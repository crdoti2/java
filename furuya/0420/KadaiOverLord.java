import java.util.Scanner;

public class KadaiOverLord{ 
  	 public static void main(String[] args) { 
      
		System.out.println("正方形の面積は"+calcSquare(5) +"です。");
  	 	System.out.println("長方形の面積は"+calcSquare(5,10) +"です。"); 
  	 }
    
	public static int calcSquare(int x) { 
		return x*x;
	}
	
	public static int calcSquare(int x, int y) { 
		return x*y;
	}

	
}


