import java.util.*;
public class Random{
	public static void main(String args[]){
		int i,rand;
		ArrayList<Integer> kisu = new ArrayList<Integer>();
		ArrayList<Integer> gusu = new ArrayList<Integer>();
		ArrayList<Integer> other = new ArrayList<Integer>();
		for(int num =0;num<120;num++){
			other.add(num);
		}
		for(i=0;i<100;i++){
			rand = new java.util.Random().nextInt(99);
			if(rand%2 == 0){
				gusu.add(rand);
				other.remove(gusu.indexOf(rand));
			}else{
				kisu.add(rand);
				other.remove(kisu.indexOf(rand));
			}
		}
		System.out.println("‹ô”: " + gusu);
		System.out.println("Šï”: " + kisu);
		System.out.println("Žc‚è: " + other);
		
	}
}