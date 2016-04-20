public class CalcS {

  public static void main(String[] args) {
    System.out.println("長方形の面積は" + calcSquare(20, 30) + "です");
    System.out.println("正方の面積は" + calcSquare(20) + "です");
  
  }
	
  /**
  *
  * 正方形の面積を求める
  *
  */
  public static int calcSquare(int x) {
    return calcSquare(x, x);
  }
  
  /**
  *
  * 長方形の面積を求める
  *
  */
  public static int calcSquare(int x, int y) {
    return x * y;
  }
}
