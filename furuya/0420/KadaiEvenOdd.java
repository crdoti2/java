import java.util.Scanner;

public class KadaiEvenOdd {
	
	public static final String PROMPT_MESSAGE = "please input number>"; 
 	 
  	 public static void main(String[] args) { 
      
   	//���l�̓��� 
     System.out.print(PROMPT_MESSAGE); 
 	final int number = new java.util.Scanner(System.in).nextInt(); 
   	//���� or � 
     if (isEven(number)==0) { 
       System.out.println("����"); 
     } else { 
       System.out.println("�"); 
     } 
   } 
    
   public static int isEven(int in) { 
   	return in % 2 ; 
   	//retrun in%2==0; ��boolean�ŕԂ��Ƃ�
   } 

	
}


