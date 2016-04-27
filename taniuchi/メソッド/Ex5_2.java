public class Ex5_2{
	public static void main(String[] args){
		
		System.out.print("メールアドレス:");
		final String address = new java.util.Scanner(System.in).nextLine();
		System.out.print("件名:");
		final String title = new java.util.Scanner(System.in).nextLine();
		System.out.print("本文:");
		final String text = new java.util.Scanner(System.in).nextLine();
		
		email(address,text);
		/*
		if("".equals(title)){
			email(address,text);
		}else{
			email(title,address,text);
		}
		*/
	}
	public static void email(String title,String address,String text){
		System.out.println(address+"に、以下のメールを送信しました。");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
	
	public static void email(String address,String text){
		System.out.println(address+"に、以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println("本文:"+text);
	}
}