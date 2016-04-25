package test_game;

public abstract class Monster {

	// 変数の宣言
	private int hp;
	private int exp;
	private int gold;
	private String name;
	private int recLevel;

	// コンストラクタ
	Monster(int hp, int exp, int gold, int recLevel, String name) {
		this.hp   = hp;
		this.exp  = exp;
		this.gold = gold;
		this.recLevel = recLevel;
		this.name = name;
	}
	Monster(int hp, int recLevel, String name) {
		this(hp, 0, 0, recLevel, name);
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
	public int getRecLevel() {
		return recLevel;
	}
	public String getName() {
		return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}