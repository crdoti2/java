
public class Boss extends Enemy{

	public static final int MAX_HP = 3000;
	private int getExp = 8000;
	private String name = "Boss";

	public String getName() {
		return super.getName();
	}

	public Boss(){
		super.setHp(this.MAX_HP);
		super.setName(name);
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
		System.out.println("火炎攻撃！");
		int takeDamage = new java.util.Random().nextInt(400)+300;
		h.setHp(h.getHp()-takeDamage);
		System.out.println(takeDamage+"のダメージ");
	}

	public int gold() {
		int getGold = new java.util.Random().nextInt(1000)+1000;
		return getGold;
	}

	@Override
	public void run() {
		System.out.println("大きな音を立てて倒れ、逃げ去りました。");
	}
}
