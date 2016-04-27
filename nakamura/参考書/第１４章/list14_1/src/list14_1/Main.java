package list14_1;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		// ここで何らかの時間がかかる処理
		int n[][] = new int[100][100];
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				n[i][j] = i * j;
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…"
				+ (end - start) + "ミリ秒でした");
	}
}
