public class CalcS {

  public static void main(String[] args) {
    System.out.println("�����`�̖ʐς�" + calcSquare(20, 30) + "�ł�");
    System.out.println("�����̖ʐς�" + calcSquare(20) + "�ł�");
  
  }
	
  /**
  *
  * �����`�̖ʐς����߂�
  *
  */
  public static int calcSquare(int x) {
    return calcSquare(x, x);
  }
  
  /**
  *
  * �����`�̖ʐς����߂�
  *
  */
  public static int calcSquare(int x, int y) {
    return x * y;
  }
}
