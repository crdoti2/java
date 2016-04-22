package rensyu8_3;

public class Cleric {

	// パラメータ追加
	static String name;
	static int hp = 40;
	static int mp = 10;
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;

	// セルフエイドメソッド
	public void selfAid() {

		// デバッグ用出力
		System.out.println("現在のＨＰは" + hp);
		System.out.println("現在のＭＰは" + mp);

		// ＭＰ消費
		mp-=5;

		// ＨＰ完全回復なのでMAX_HPをＨＰに入れる
		if(hp != MAX_HP) {
			hp = MAX_HP;
		}

		// デバッグ用出力
		System.out.println("回復後のＨＰは" + hp);
		System.out.println("回復後のＭＰは" + mp);
	}
}
