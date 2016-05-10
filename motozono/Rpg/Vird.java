public class Vird extends Monster{
	Vird() {
		super("フェニックス",10000,1000000, 50000);
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println("聖なる炎！！:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}
	@Override
	public int getAttack() {
		return (3000 + new java.util.Random().nextInt(5000));
	}
	@Override
	public void run() {
		System.out.print("フェニックスはヽ(`Д´)ﾉﾌﾟﾝﾌﾟﾝしながら逃げた");
	}
}