package rensyu11_3;

public class Hero {

	int hp;

	Hero() {
		hp = 100;
	}

	// フィールド変数
	private String name;

	// ゲッターメソッド
	public String getName() {
		return this.name;
	}

	// セッターメソッド
	public void setName(String name) {
		this.name = name;
	}

	// HPゲッター
	public int getHp() {
		return this.hp;
	}

	// HPセッター
	public void setHp(int hp) {
		this.hp = hp;
	}
}
