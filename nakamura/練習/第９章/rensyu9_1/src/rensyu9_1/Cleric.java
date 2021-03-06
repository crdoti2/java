package rensyu9_1;

public class Cleric {

	// パラメータ追加
	String name;
	int hp = 40;
	int mp = 10;
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;

	public Cleric(String name, int hp, int mp){
		this.name = name; 
		this.hp = hp;
		this.mp = mp;
	}

	public Cleric(String name, int hp) {
		this(name, hp, MAX_MP);
	}

	public Cleric(String name) {
		this(name, MAX_HP);
	}

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

	// 祈るメソッド
	public int pray (int time) {

		// ランダムで補正値を追加
		time += new java.util.Random().nextInt(3);

		// 一時的にmpを変数mに保存する
		int m = mp;
		m += time;

		// MAX_MPを超える場合はMAX_MPにする
		if(m > MAX_MP) {
			m = MAX_MP;
		}

		// 回復した差分を求める
		m -= mp;

		// 回復した量を返す
		return m;
	}
}
