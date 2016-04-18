public class Kadai1 {
	public static final int FROM_NUMBER  = 1;
    public static final int TO_NUMBER  = 10;
	public  static void main(String args[]){
		
		String s = "";
		for(int i = FROM_NUMBER; i <= TO_NUMBER ; i++){
		    s+="*";
			System.out.println(s);
		}	
		for(int i = FROM_NUMBER; i <= TO_NUMBER ; i++){
		    s = s.substring(0,s.length()-1);
			System.out.println(s);
		}
		
	
	}
}


