public class Volf extends Monster {

	String name = "朝香 あゆみ(24歳)";

	public void run(Monster m) {
		System.out.println("とことこにげた");
	}

	public int attak(Hero h) {// ひーろーに攻撃
		System.out.print(this.name + "攻撃!!");
		System.out.println("やっほ！");
		System.out.println(h.name + "残りHP");
		return h.setHp(h.getHp() - 7777);
	}

}