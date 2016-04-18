import java.util.*;
public class Ex2{
	public static void main (String args[]){
		
		System.out.println("y”‚ ‚ÄƒQ[ƒ€z");
		int ans,num;
		ans = new java.util.Random().nextInt(10);
		
		for(int i=0;i<5;i++){
			System.out.println("0`9‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
			num = new java.util.Scanner(System.in).nextInt();
			if(ans == num){
				System.out.println("ƒAƒ^ƒŠI");
				break;
			}else{
				System.out.println("ˆá‚¢‚Ü‚·B");
			}
		}
		System.out.println("ƒQ[ƒ€‚ğI—¹‚µ‚Ü‚·B");
	}
}