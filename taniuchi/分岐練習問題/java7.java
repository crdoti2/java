public class java7{
	public static void main(String args[]){
		int x=70;
		
		System.out.println(x+"�_��");
		
		if(x>60){
			System.out.println("���i");
		}else {
			System.out.println("�s���i");
		}
		
		if(x>80){
			System.out.println("�����ւ�悭�ł��܂����B");
		}else if(x<80 && x>=60){
			System.out.println("�悭�ł��܂���");
		}else{
			System.out.println("����˂�ł���");
		}
		
		if(x>=80){
			System.out.println("�D");
		}else if(x>=70 && x<80){
			System.out.println("��");
		}else if(x>=60 && x<70){
			System.out.println("��");
		}else{
			System.out.println("�s��");
		}
	}
}