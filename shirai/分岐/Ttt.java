public class Ttt { 	
public static void main(String[] arg){
	int go = new java.util.Scanner(System.in).nextInt();
	int tyu = new java.util.Scanner(System.in).nextInt();
	if(go >= 60 && tyu >= 60){
	System.out.println("‡Ši");
	}else if((go+tyu) >= 130){
		System.out.println("‡Ši");
		}else if((go+tyu) >= 100 && (go >= 90 || tyu >= 90)){
		System.out.println("‡Ši");
	}else {
		System.out.println("•s‡Ši");
	}
	
	
	}
}