public class Vird extends Monster {

	String name = "大江 岳人(31歳)";

	public int attak(Hero h) {// ひーろーに攻撃
		System.out.print(this.name + "攻撃!!");
		System.out.println("髪をふぁっさふぁっさした。");
		System.out.println(h.name + "残りHP");
		return h.setHp(h.getHp() - 100);
	}

}