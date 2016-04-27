public class java6{
	public static void main(String args[]){
		
		int w,l;
		w=0;
		l=0;
		
		System.out.println("勝ったら1、負ければ0を入力してください。");
		for(int i=0;i<10;i++){
			int input = new java.util.Scanner(System.in).nextInt();
			if(input == 0){
				w++;
			}else if(input == 1){
				l++;
			}else{
				System.out.println("正しくありません。やり直してください。");
				i--;
				continue;
			}
		}	
		System.out.println("勝数：" +w);
		System.out.println("負数："+l);
	}
}