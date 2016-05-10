
public class Hero extends Human implements Cloneable {

	public Hero(String name) {
		super.setGold(0);
		super.setLevel(1);
		super.setName(name);
		super.setHp(super.MAX_HP_TABLE[0]);
	}

	public static int[] getMaxHpTable() {
		return MAX_HP_TABLE;
	}

	public int getLevel() {
		return super.getLevel();
	}

	public void setLevel(int level) {
		super.setLevel(level);
	}

	public int getGold() {
		return super.getGold();
	}

	public void setGold(int gold) {
		super.setGold(gold);
	}

	public int getExp() {
		return super.getExp();
	}

	public void setExp(int exp) {
		super.setExp(exp);
	}

	public int getHp() {
		return super.getHp();
	}

	public void setHp(int hp) {
		super.setHp(hp);
	}

	public  String getName() {
		return super.getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	public void lose() {
		super.setHp(MAX_HP_TABLE[super.getLevel() - 1]);
	}

	@Override
	public void run() {
		System.out.println("ヒーローは逃げ出した");
	}

	@Override
	public void attack(Enemy e) {
		System.out.println(super.getName() + "の攻撃!");
		int rand = new java.util.Random().nextInt(ATTACK_POWER_TABLE[super
				.getLevel() - 1]);
		rand = rand + Main.plusATK;
		e.setHp(e.getHp() - rand);
		if(rand!=0)
			System.out.println("敵に" + rand + "のダメージ");
		else{
			System.out.println("敵に" + rand + "のダメージ");
			System.out.println("攻撃をミスった！");
		}
	}

	public Hero clone(){
		Hero clone = null;
		try {
			clone=(Hero) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return clone;
	}
}
