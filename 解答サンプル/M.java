public class M {
  public static final String PROMPT_MESSAGE = "please input number>";
	
  public static void main(String[] args) {
    
  	//���l�̓���
    System.out.print(PROMPT_MESSAGE);
	final int number = new java.util.Scanner(System.in).nextInt();
  	//���� or �
    if (isEven(number)) {
      System.out.println("����");
    } else {
      System.out.println("�");
    }
  }
  
  public static boolean isEven(int in) {
  	return in % 2 == 0;
  }
}