public abstract class Human implements Character {

	public static final int[] EXP_TABLE = { 100, 250, 300, 500, 700, 1000,
			1500, 2000, 3000, 4500, 7000, 10000, 14000, 25000, 30000, 35000,
			45000, 50000 };
	public static final int[] MAX_HP_TABLE = { 200, 300, 400, 500, 600, 700,
			800, 900, 1000, 1100, 1200, 1400, 1600, 2000, 2500, 3000, 5000,
			7000 };
	public static final int[] ATTACK_POWER_TABLE = { 40, 60, 80, 100, 300, 500,
			800, 1000, 1300, 1600, 2000, 2500, 3000, 4000, 5000, 6000, 7000,
			8000 };

	private int hp;
	private int exp;
	private int gold;
	private int level;

	public void resetLevel(){
		this.level = 0;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level += level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	private String name;

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMaxHpTable(int i) {
		return MAX_HP_TABLE[i];
	}

	public static int getAttackPowerTable(int i) {
		return ATTACK_POWER_TABLE[i];
	}

}
