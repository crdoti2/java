public class java7{
	public static void main(String args[]){
		int x=70;
		
		System.out.println(x+"点は");
		
		if(x>60){
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		if(x>80){
			System.out.println("たいへんよくできました。");
		}else if(x<80 && x>=60){
			System.out.println("よくできました");
		}else{
			System.out.println("ざんねんでした");
		}
		
		if(x>=80){
			System.out.println("優");
		}else if(x>=70 && x<80){
			System.out.println("良");
		}else if(x>=60 && x<70){
			System.out.println("可");
		}else{
			System.out.println("不可");
		}
	}
}