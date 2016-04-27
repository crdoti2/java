public class Kadai9{
	public static void main(String[] arg){
		int ooi = 0;
		int suku = 0;
		
		for(int i=0; i <= 10 ; i++){
		
		int goke = new java.util.Scanner(System.in).nextInt();
			if (i == 0){
				ooi = goke;
				suku = goke;
		}else if(goke > ooi){
			ooi = goke;
			}else if(goke < suku){
				suku = goke;
			}
		}
			System.out.println("Å‘å"+ ooi + "Å¬" + suku);
	}
}
