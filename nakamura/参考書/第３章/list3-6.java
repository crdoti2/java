//------------------------------------------
//
//　あえてbreak文を書かない
//
//------------------------------------------

public class list3-6 {
	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		
		// ランダムの数値を入れる（１〜５）
		// ランダムは０から生成されるので、ランダム（０〜４）に１を足して（１〜５）にする
		int fortune = new java.util.Random().nextInt(5) + 1;
		switch (fortune) {
			case 1:		// １と２の場合
			case 2:
				System.out.println("いいね！");
				break;
			case 3:		// ３の場合
				System.out.println("普通です");
				break;
			case 4:		// ４と５の場合
			case 5:
				System.out.println("うーん…");
		}
	}
}
