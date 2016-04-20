public class M {
  public static final String PROMPT_MESSAGE = "please input number>";
	
  public static void main(String[] args) {
    
  	//”’l‚Ì“ü—Í
    System.out.print(PROMPT_MESSAGE);
	final int number = new java.util.Scanner(System.in).nextInt();
  	//‹ô” or Šï”
    if (isEven(number)) {
      System.out.println("‹ô”");
    } else {
      System.out.println("Šï”");
    }
  }
  
  public static boolean isEven(int in) {
  	return in % 2 == 0;
  }
}