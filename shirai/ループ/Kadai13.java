public class Kadai13{
	public static void main(String[] arg){
	int st = 0;
	int bo = 0;
		System.out.println("�X�g���C�N=1 or �{�[��=2?");
		System.out.println("--------------------");
		while(st < 3 && bo < 4){
		int yakyu = new java.util.Scanner(System.in).nextInt();
	
		if(yakyu == 1)
		st++;
		else if(yakyu == 2)
			bo++;
		}
		System.out.println(bo +"�{�[��" + st +"�X�g���C�N");
	}
}

