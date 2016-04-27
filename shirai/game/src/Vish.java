public class Vish extends Monster {

	String name = "菅原 拓真(31歳)";
	int exp = 1000;

	public void run(String run) {
		System.out.println("逃げ出した");
	}

	public int attak(Hero h) {// ひーろーに攻撃
		System.out.println(this.name + "攻撃!!");
		System.out.println(h.name + "残りHP");
		int attak = new java.util.Random().nextInt(10);
		return h.setHp(h.getHp() - attak);
	}

	public int exp(Hero h) {// ひーろーにあげる
		System.out.println("経験値だよ");
		return h.exp += 150;
	}
}
