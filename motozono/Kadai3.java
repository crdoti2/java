public class Kadai3 {

	public static void main(String[] args) {
		int i, n;
				
		for(n = 2; n<=1000; n++) {
			for(i=2; i<n; i++) {
				if(n % i == 0)
					break;
			}
			if(n == i)
			System.out.println(n);
				
				
		}

	}

}