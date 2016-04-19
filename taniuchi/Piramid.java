public class Piramid{
	public static void main(String args[]){
		int i,j,x,y;
		String a = "*";
		for(i=1;i<10;i++){
			for(j=0;j<i;j++){
				System.out.print(a);
			};
			System.out.println("");
		}
		for(x=0;x<=i;x++){
			for(y=i-x;y>0;y--){
				System.out.print(a);
			}
			System.out.println("");
		}
	}
}