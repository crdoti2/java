public class Rensyu20{
  public static void main(String[] args){
  	int i = 0;
  	int input = new java.util.Scanner(System.in).nextInt();
  
  	for(i = 1; i <= input; i++){
  		for(int z = 1; z <= i; z++){
        	System.out.print("$");
  		}
      	System.out.println("");
    }  
  }
}