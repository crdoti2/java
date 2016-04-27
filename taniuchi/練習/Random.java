import java.util.*;
public class Random{
	
	public static final int MAX_NUM = 100;
	
	public static void main(String args[]){
		int i,rand,count,num;
		List<Integer> kisu = new ArrayList<Integer>();
		List<Integer> gusu = new ArrayList<Integer>();
		List<Integer> other = new ArrayList<Integer>();
		
		count = 0;
		for(num=0;num<MAX_NUM;num++){
			other.add(count);
			count++;
		}
		for(i=0;i<MAX_NUM;i++){
			rand = new java.util.Random().nextInt(99);
			if(rand%2 == 0){
				gusu.add(rand);
				//other.remove(gusu.indexOf(rand));
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