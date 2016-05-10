public class Golira extends Monster{
	Golira() {
		super("ゴリラ",500, 5000, 2000);
	}
	Golira(String name, int gold, int exp, int attack)
	{
		super(name, gold, exp, attack);
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println("ラリアット！:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}
	@Override
	public int getAttack() {
		return (250 + new java.util.Random().nextInt(500));
	}
	@Override
	public void run(){
		System.out.println("ゴリラはウホウホいって森へ帰った");
	}

}