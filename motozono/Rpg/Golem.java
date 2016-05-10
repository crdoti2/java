public class Golem extends Monster{

	Golem() {
		super("ゴーレム",500, 600, 800);
	}


	@Override
	public void attack(Hero h) {
		System.out.println("ぶん殴り！！:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}

	@Override
	public int getAttack() {
		return (50 + new java.util.Random().nextInt(300));
	}
	@Override
	public void run() {
		System.out.println("ゴーレムはどすどす逃げた");
		
	}

}