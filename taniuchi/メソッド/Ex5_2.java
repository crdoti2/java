public class Ex5_2{
	public static void main(String[] args){
		
		System.out.print("���[���A�h���X:");
		final String address = new java.util.Scanner(System.in).nextLine();
		System.out.print("����:");
		final String title = new java.util.Scanner(System.in).nextLine();
		System.out.print("�{��:");
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
		System.out.println(address+"�ɁA�ȉ��̃��[���𑗐M���܂����B");
		System.out.println("����:"+title);
		System.out.println("�{��:"+text);
	}
	
	public static void email(String address,String text){
		System.out.println(address+"�ɁA�ȉ��̃��[���𑗐M���܂����B");
		System.out.println("����:����");
		System.out.println("�{��:"+text);
	}
}