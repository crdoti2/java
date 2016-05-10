package test_game2.Monster;

public class Veetle extends Monster {

	// コンストラクタ
	public Veetle() {
		super(2000, 400, 120 + new java.util.Random().nextInt(280), 10, "ビートル", 2);
	}
	public Veetle(int hp, int exp, int gold, int recLevel, String name, int hit) {
		super(hp, exp, gold, recLevel, name, hit);
	}

	public void attack() {
		System.out.println("角攻撃！");
	}

	@Override
	public void run() {
		System.out.println("樹液の森へ逃げました");
	}

	@Override
	public int getAttack() {
		return (250 + new java.util.Random().nextInt(250));
	}
}