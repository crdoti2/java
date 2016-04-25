package test_game;

public class Hero {

	// 変数の宣言
	private int exp;
	private int hp;
	private int level;
	private int gold;

	// 定数の宣言
	private final int MAX_EXP[]    = {    0,  100,  200,   300,   500,   700,  1000,  1500,  2000,
								   3000, 4500, 7000, 10000, 14000, 20000, 30000, 40000, 60000, 80000};
	private final int MAX_HP[]  = {    0,  200,  300,   400,   500,   600,   700,   800,   900,
								   1000, 1100, 1200,  1400,  1600,  2000,  2500,  3000,  5000,  7000};
	private final int ATTACK[] = {    0,   30,   40,    70,   100,   300,   500,   800,  1000,
								   1300, 1600, 2000,  2500,  3000,  4000,  5000,  6000,  7000,  8000};
	private final int MAX_LEVEL = 18;

	// コンストラクタ
	Hero() {
		this.hp = MAX_HP[1];
		this.exp = MAX_EXP[1];
		this.level = 1;
		this.gold = 1000;
	}

	// attackメソッド
	public boolean attack(Monster m) {
		while(true) {
			// 変数の宣言
			int attack;
			int random;
			int playerHp;
			int enemyHp;

			if(m.getHp() <= 0 || this.hp <= 0 ) {
				break;
			}
			int turn = new java.util.Random().nextInt(10);

			// プレイヤの攻撃
			if(turn % 2 == 0 || turn <= 4) {
				System.out.printf("プレイヤーの攻撃！\n");
				random = new java.util.Random().nextInt((int)((float)this.ATTACK[level] * 0.2f));
				attack = (int) (((float)this.ATTACK[level] * 0.8f) + (float)random);
				System.out.printf("%dダメージ！\n", attack);
				enemyHp = m.getHp() - attack;
				if(enemyHp <= 0) { enemyHp = 0; }
				m.setHp(enemyHp); 
			}
			// 敵の攻撃
			else
			{
				System.out.printf("%sの攻撃！\n", m.getName());
				m.attack();
				attack = m.getAttack();
				System.out.printf("%dダメージ！\n", attack);
				playerHp = this.hp - attack;
				if(playerHp <= 0) { playerHp = 0; }
				this.hp = playerHp; 
			}
		}
		if(this.hp <= 0) { return false; }
		return true;
	}

	// レベル確認メソッド
	public void levelConfirmation() {
		while(true) {
			if(exp >= MAX_EXP[level + 1]) {
				System.out.println("レベルがアップした！");
				this.hp = MAX_HP[level + 1];
				level++;
			} else {
				System.out.printf("現在のレベル:%d\n", level);
				break;
			}
		}
	}

	// ゲッターセッターメソッド
	public int getExp() {
		return this.exp;
	}
	public int getHp() {
		return this.hp;
	}	
	public int getLevel() {
		return this.level;
	}
	public int getAttack() {
		return this.ATTACK[level];
	}
	public int getGold() {
		return this.gold;
	}
	public int maxLevel() {
		return MAX_LEVEL;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
}
