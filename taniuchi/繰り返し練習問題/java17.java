public class java17{
	public static void main(String args[]){
		int i,j,ans;
		ans = 0;
		for(i=1;i<10;i++){
			for(j=1;j<10;j++){
				ans = i*j;
				System.out.printf(" %2d",ans);
			}
			System.out.println("");
			j = 1;
		}
	}
}