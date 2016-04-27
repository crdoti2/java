
public class Zomb extends Monster{

	Zomb() {
		super("ゾンビ",300, 100, 500);
	}
	@Override
	public void attack(Hero h) {
		System.out.println("ゾンビの食いちぎる:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}

	@Override
	public int getAttack() {
		return (20 + new java.util.Random().nextInt(50));
	}
	
	@Override
	public void run() {
		System.out.println("はいつくばって逃げていった");
		
	}
	
}
