import java.util.Scanner;

public class KadaiEvenOdd {
	
	public static final String PROMPT_MESSAGE = "please input number>"; 
 	 
  	 public static void main(String[] args) { 
      
   	//lΜόΝ 
     System.out.print(PROMPT_MESSAGE); 
 	final int number = new java.util.Scanner(System.in).nextInt(); 
   	//τ or ο 
     if (isEven(number)==0) { 
       System.out.println("τ"); 
     } else { 
       System.out.println("ο"); 
     } 
   } 
    
   public static int isEven(int in) { 
   	return in % 2 ; 
   	//retrun in%2==0; ©booleanΕΤ·Ζ«
   } 

	
}


