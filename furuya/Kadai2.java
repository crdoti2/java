import java.util.Random;
import java.util.ArrayList;


public class Kadai2 {
	public  static void main(String args[]){
		
		final int NUM = 99; //ランダムな整数を生成する個数
		int result[] = new int[NUM];
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> evenArray = new ArrayList<Integer>();
		ArrayList<Integer> oddArray = new ArrayList<Integer>();

		int count=0;
		for (int i = 0; i < NUM; i++){
		    array.add(count);
			count++;
		}
		
		
		
		for (int i = 0; i < result.length; i++){
			Random rnd = new Random();
		    result[i] = rnd.nextInt(NUM);
		}
		
		for (int i = 0; i < result.length; i++){
			if(result[i]%2==0){
				evenArray.add(result[i]);
				array.remove((Integer)result[i]);
				
			}else{
				oddArray.add(result[i]);
				array.remove((Integer)result[i]);
			
			}
			
		}
		
		System.out.print("偶数("+evenArray.size()+"):");
       for(int x : evenArray){
       	   String s = String.valueOf(x);
		   System.out.print(" "+s);

        }
		
		System.out.println("");
		System.out.print("奇数("+oddArray.size()+"):");
		for(int x :oddArray){
       	   String s = String.valueOf(x);
		   System.out.print(" "+s);

        }
		
		System.out.println("");
		System.out.print("使用しなかった値("+array.size()+"):");
		for(int x :array){
       	   String s = String.valueOf(x);
		   System.out.print(" "+s);

        }
		

		
	
	}
}

