public class java6{
	public static void main(String args[]){
		
		int w,l;
		w=0;
		l=0;
		
		System.out.println("��������1�A�������0����͂��Ă��������B");
		for(int i=0;i<10;i++){
			int input = new java.util.Scanner(System.in).nextInt();
			if(input == 0){
				w++;
			}else if(input == 1){
				l++;
			}else{
				System.out.println("����������܂���B��蒼���Ă��������B");
				i--;
				continue;
			}
		}	
		System.out.println("�����F" +w);
		System.out.println("�����F"+l);
	}
}