public class Reagolira extends Golira{
	Reagolira(){
		super("マッスルゴリラ",10000, 50000, 8000);
	}
	
	@Override
	public void attack(Hero h) {
		System.out.println("マッスルラリアット！:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}
	@Override
	public int getAttack() {
		return (400 + new java.util.Random().nextInt(600));
	}
}