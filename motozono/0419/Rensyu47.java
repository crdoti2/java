public class Rensyu47{
	public static void main(String[] args){
		int[] kyo = {1,1,2,6,0,0,0,4,2};
		int[] han = {1,3,4,0,0,1,2,1,0};
		int y = 0;
		int z = 0;
		for(int i = 0; i < kyo.length; i++){
			System.out.println((i + 1)+ "��\�A���l�̓��_�� :" + kyo[i] + "�_");
			System.out.println((i + 1)+ "�񗠁A��_�̓��_�� :" + han[i] + "�_");
		y += kyo[i];
		z += han[i];
		}
		System.out.println("���l��" + (y) + "�_");
		System.out.println("��_��" + (z) + "�_");
		if(y > z){
		System.out.println("���l�̏���");
		}else{
		System.out.println("��_�̏���");
		}
		                                                               
	}
}