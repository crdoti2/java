public class Bird extends Enemy {

	public static final int MAX_HP = 700;
	private int getExp = 80;
	private String name = "Bird";


	public String getName() {
		return super.getName();
	}

	public Bird() {
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

	public int gold() {
		int getGold = new java.util.Random().nextInt(150) + 150;
		return getGold;
	}

	@Override
	public void attack(Human h) {
		System.out.println("Birdの羽ばたき攻撃！");
		takeDamage = new java.util.Random().nextInt(80) + 70;
		h.setHp(h.getHp() - takeDamage);
		System.out.println(takeDamage + "のダメージ");
	}

	@Override
	public void run() {
		System.out.println("山奥の巣に逃げ込んだ。");

	}

}
