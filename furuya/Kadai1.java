public class Kadai1 {
	public  static void main(String args[]){
		String s = "";
		for(int i = 1; i <= 10; i++){
		    s+="*";
			System.out.println(s);
		}	
		for(int i = 1; i <= 10; i++){
		    s = s.substring(0,s.length()-1);
			System.out.println(s);
		}
		
	
	}
}

