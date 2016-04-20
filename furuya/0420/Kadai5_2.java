import java.util.Scanner;

public class Kadai5_2{ 
  	 public static void main(String[] args) { 
  	 	String title = "助けてください";
  	 	String address = "https://www.hellowork.go.jp";
  	 	String text = "職をさがしています。";
  	 	email(title,address,text);
  	 }
    
   public static void email(String title, String address, String text) { 
		
		String seibetu = "男";
		System.out.println("「"+address+"」に、以下のメールを送信しました"); 
		System.out.println("件名:「"+title+"」"); 
		System.out.println("本文:「"+text+"」"); 
		
   }

	
}


