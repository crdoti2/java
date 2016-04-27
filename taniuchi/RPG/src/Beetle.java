
public class Beetle extends Enemy{

	public static final int MAX_HP = 1400;
	private int getExp = 100;
	private String name = "Beetle";

	public String getName() {
		return super.getName();
	}

	public Beetle(){
		super.setHp(this.MAX_HP);
		super.setName(this.name);
	}

	public int getExp() {
		return getExp;
	}

	public int getHp() {
		return super.getHp();
	}

	public void setHp(int hp) {
		super.setHp(hp);
	}

	public void attack(Human h) {
		System.out.println("角攻撃！");
		int takeDamage = new java.util.Random().nextInt(250)+250;
		h.setHp(h.getHp()-takeDamage);
		System.out.println(takeDamage+"のダメージ");
	}

	public int gold() {
		int getGold = new java.util.Random().nextInt(500)+500;
		return getGold;
	}

	@Override
	public void run() {
		System.out.println("樹液の森へ逃げました。");
	}

}
