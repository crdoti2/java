public class Kadai14{
	public static void main(String[] arg){
	int st = 0;
	int bo = 0;
		System.out.println("ストライク=1 or ボール=2 or ファウル=3");
		System.out.println("--------------------");
		while(st < 3 && bo < 4){
		int yakyu = new java.util.Scanner(System.in).nextInt();
	
		if(yakyu == 1)
		st++;
		else if(yakyu == 2)
		bo++;
		else if(yakyu == 3 && st < 2)
		st++;
		}
		
		System.out.println(bo +"ボール" + st +"ストライク");
	}
}

