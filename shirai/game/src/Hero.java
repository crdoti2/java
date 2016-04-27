public class Hero extends Chacter {
	String name = "僕らのミナト君(22歳)"; // 名前の宣言
	private int hp = 100; // HPの宣言
	private int level = 1; // レベルの宣言
	int exp = 0; // 経験値

	public int yado(Hero h){
		System.out.println("なんだよぼろぼろじゃねえか");
		System.out.println("金？金なんかいらねえよ！泊まってけ");
		System.out.println("------------");
		System.out.println("おっさんのやさしさでHPが回復した");
		int yado = new java.util.Random().nextInt(1500);
		return h.setHp(h.getHp() + yado);
}


	public int attak(Monster m) {// ひーろーの攻撃
		System.out.println(this.name + "のぱんつ攻撃!!");
		System.out.println("相手残りHP");
		int attak = new java.util.Random().nextInt(100);
		return m.hp -= attak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	int getHp() {
		return hp;
	}

	public int setHp(int hp) {
		this.hp = hp;
		return hp;
	}

}
