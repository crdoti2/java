public class CalcS {

  public static void main(String[] args) {
    System.out.println("’·•ûŒ`‚Ì–ÊÏ‚Í" + calcSquare(20, 30) + "‚Å‚·");
    System.out.println("³•û‚Ì–ÊÏ‚Í" + calcSquare(20) + "‚Å‚·");
  
  }
	
  /**
  *
  * ³•ûŒ`‚Ì–ÊÏ‚ğ‹‚ß‚é
  *
  */
  public static int calcSquare(int x) {
    return calcSquare(x, x);
  }
  
  /**
  *
  * ’·•ûŒ`‚Ì–ÊÏ‚ğ‹‚ß‚é
  *
  */
  public static int calcSquare(int x, int y) {
    return x * y;
  }
}
