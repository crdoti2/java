

public class Fish extends Monster{
	Fish() {
		super("リヴァイアサン",30000, 3000, 20000);
	}
	@Override
	public void attack(Hero h){
		System.out.println("締め付ける攻撃:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}
	@Override
	public void run(){
		System.out.println("リヴァイアサンは深海へと逃げていった");
	}
	
	@Override
	public int getAttack() {
		return (1500 + new java.util.Random().nextInt(3000));
	}

}
