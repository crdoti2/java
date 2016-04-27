
public class Dog extends Monster{
	Dog() {
		super("狂犬",30, 30, 100);
	}
	@Override
	public void attack(Hero h) {
		System.out.println("狂犬の噛みつく:" + this.getAttack() + "のダメージ！！");
		h.setHp(h.getHp() - this.getAttack()) ;
	}
	@Override
	public int getAttack() {
		return (10 + new java.util.Random().nextInt(30));
	}
	@Override
	public void run(){
		System.out.println("狂犬は犬小屋へと逃げていった");
	}
	
}

