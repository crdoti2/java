public class Fish extends Enemy{

	private final int MAX_HP = 100;
	private int getExp = 25;
	private String name = "Fish";

	public String getName() {
		return super.getName();
	}

	public Fish(){
		super.setHp(this.MAX_HP);
		super.setName(this.name);;
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
		System.out.println("Fishはウロコを投げた！");
		int takeDamage = new java.util.Random().nextInt(20)+10;
		h.setHp(h.getHp()-takeDamage);
		System.out.println(takeDamage+"のダメージ");
	}

	public int gold() {
		int getGold = new java.util.Random().nextInt(50)+50;
		return getGold;
	}

	@Override
	public void run() {
		System.out.println("深海へと逃げて行きました。");
	}
}
