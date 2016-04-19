public class Iii { 	
public static void main(String[] arg){

	int x = 3;
	int y = 7;
	
	int z = x;
	x = y;
	y = z;
	
	System.out.println("X=" + x + ",y=" + y);
	
}
}