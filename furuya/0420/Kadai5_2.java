import java.util.Scanner;

public class Kadai5_2{ 
  	 public static void main(String[] args) { 
  	 	String title = "�����Ă�������";
  	 	String address = "https://www.hellowork.go.jp";
  	 	String text = "�E���������Ă��܂��B";
  	 	email(title,address,text);
  	 }
    
   public static void email(String title, String address, String text) { 
		
		String seibetu = "�j";
		System.out.println("�u"+address+"�v�ɁA�ȉ��̃��[���𑗐M���܂���"); 
		System.out.println("����:�u"+title+"�v"); 
		System.out.println("�{��:�u"+text+"�v"); 
		
   }

	
}


