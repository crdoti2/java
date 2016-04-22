package rensyu10_1;

public class Wizard {

	// 宣言
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	// healメソッド
	void heal(Hero h) {

		// 宣言
		int basePoint = 10;											// 基本回復ポイント
		int recovPoint = (int) (basePoint * this.wand.power);		// 杖による増幅

		h.setHp(h.getHp() + recovPoint);							// 勇者のHPを回復させる
		System.out.println
				(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return this.hp;
	}
}
