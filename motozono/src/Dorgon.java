
public class Dorgon extends Monster{
	Dorgon() {
		super("ドラゴン",0, 0, 100000);
	}
	@Override
	public void attack(Hero h) {
		System.out.println("滅びのバーストストリーム！！！！:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}

	@Override
	public int getAttack() {
		return (10000 + new java.util.Random().nextInt(50000));
	}
	@Override
	public void run() {
		System.out.println( "ドラゴンは(´・ω・｀)としながら逃げていった。");
		
	}
}
