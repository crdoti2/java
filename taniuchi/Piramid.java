public class Piramid{
	
	public static final String block = "*";
	public static final int MAX = 10;
	public static final int MIN = 0;
	
	public static void main(String args[]){
		int i,j,x,y;
		for(i=1;i<MAX;i++){
			for(j=0;j<i;j++){
				System.out.print(block);
			};
			System.out.println("");
		}
		for(x=0;x<i;x++){
			for(y=i-x;y>MIN;y--){
				System.out.print(block);
			}
			System.out.println("");
		}
	}
}