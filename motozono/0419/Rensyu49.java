public class Rensyu49{
	public static void main(String[] args){
		int[] i = {1,2,3,4,5,6,7,8,9,10};
		int max = i[0];
		int min = i[0];
		for(int y = 0; y < i.length; y++){
			if(max < i[y]){
				max = i[y];
			}
			if(min > i[y]){
				min = i[y];
			}
		}
		System.out.println("Å‘å’l‚Í" + max);
		System.out.println("Å¬’l‚Í" + min);
	}
}