
public class Wolf extends Enemy{

	public static final int MAX_HP = 300;
	private int GET_EXP = 50;
	private String name = "Wolf";


	public Wolf(){
		super.setHp(this.MAX_HP);
		super.setName(this.name);
	}

	public String getName() {
		return super.getName();
	}

	public int getHp() {
		return super.getHp();
	}

	public void setHp(int hp) {
		super.setHp(hp);
	}

	@Override
	public void attack(Human h) {
		System.out.println("Wolfは噛み付いた！");
		takeDamage = new java.util.Random().nextInt(20)+30;
		h.setHp(h.getHp()-takeDamage);
		System.out.println(takeDamage+"のダメージ");
	}

	public int getExp() {
		return GET_EXP;
	}

	@Override
	public int gold() {
		int getGold = new java.util.Random().nextInt(100)+100;
		return getGold;
	}

	@Override
	public void run() {
		System.out.println("負け犬の遠吠えをしながら逃げて行きました。");
	}

}
