package test_game;

public class RareVeetle extends Monster {

	// コンストラクタ
	RareVeetle() {
		super(4000, 4000, 240 + new java.util.Random().nextInt(280),
				10, "レアビートル", 2);
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
		return (500 + new java.util.Random().nextInt(250));
	}
}