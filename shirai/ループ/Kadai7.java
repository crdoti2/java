public class Kadai7{
	public static void main(String[] arg){
		
		
		int kyo = 0;
		int han = 0;
		
		for(int i = 1; i <= 9; i++){
				int kati = new java.util.Scanner(System.in).nextInt();
			System.out.println(i + "��̕\���l�̓��_��" + (kyo += kati));
				int kati1 = new java.util.Scanner(System.in).nextInt();
			System.out.println(i + "��̗���_�̓��_��" + (han += kati1));	
		}
			System.out.println("���l���_"+ kyo);
			System.out.println("��_���_"+ han);
		if(kyo > han){
			System.out.println("���l����");
		}else if(kyo < han){
			System.out.println("��_����");
		}else{
			System.out.println("��������");
		}
	}
}
