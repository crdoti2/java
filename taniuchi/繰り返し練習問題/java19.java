public class java19{
	public static void main(String args[]){
		
		int input,i,j,k;
		input=1;
		i=0;
		j=0;
		k=0;
		while(input > 0){
			input = new java.util.Scanner(System.in).nextInt();
			i+=input;
			j++;
		}
		System.out.println(j);
		k = i/(j-1);
		System.out.println("Avg:"+k);
	}
}