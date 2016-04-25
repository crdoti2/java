package test_game;

public abstract class Monster {

	// 変数の宣言
	private int hp;
	private int exp;
	private int gold;
	private String name;

	// コンストラクタ
	Monster(int hp, int exp, int gold, String name) {
		this.hp   = hp;
		this.exp  = exp;
		this.gold = gold;
		this.name = name;
	}
	Monster(int hp, String name) {
		this(hp, 0, 0, name);
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
	public String getName() {
		return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}