package experience;

public class Ex5_4 {
	/*public static void main (String[] args){
		System.out.println("三角形の底辺の長さが10.0cm、高さが5.0cmの場合、面積は"+calcTraiangleArea(10.0,5.0)+"cm2");
		System.out.println("円の半径が5.0cmの場合、面積は"+calcCircleArea(5.0)+"cm2");
	}*/
	public static double calcTraiangleArea(double bottom,double height){
		return bottom*height/2;
	}
	public static double calcCircleArea(double radius){
		return radius*radius*3.14;
	}
}