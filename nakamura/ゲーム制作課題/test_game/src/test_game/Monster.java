package test_game;

public abstract class Monster {

	// 変数の宣言
	private int hp;
	private int exp;
	private int gold;

	// コンストラクタ
	Monster(int hp, int exp, int gold) {
		this.hp   = hp;
		this.exp  = exp;
		this.gold = gold;
	}
	Monster(int hp) {
		this(hp, 0, 0);
	}

	// メソッドの宣言
	public abstract void attack();
	public abstract int getAttack();
	public abstract void run();

	// ゲッターセッターメソッド
	public int getHp() {
		return hp;
	}
	public int getExp() {
		return exp;
	}
	public int getGold() {
		return gold;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}