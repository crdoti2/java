/*
���̓��{��ŋL�ڂ��ꂽ��������java�ŋL�q���Ă݂܂��傤�B
�ϐ�weight�̒l��60�ɓ������B
�ϐ�age1��age2�̍��v��2�{�������̂�60�𒴂��Ă���B
�ϐ�age����ł���B
�ϐ�name�̒��g�̕������u���v�Ɠ������B
**/

public class Kadai3_1{
	public static int weight = 60;
	public static int age1 = 30;
	public static int age2 = 31;
	public static int age  = 21;
	public static String name = "��";
	
	public  static void main(String args[]){
		
		if(weight==60){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		if(age1+age2 >60){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		if(age%2 == 1){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		if(name == "��"){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}


