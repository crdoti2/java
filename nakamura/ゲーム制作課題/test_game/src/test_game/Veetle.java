package test_game;

public class Veetle extends Monster {

	// コンストラクタ
	Veetle() {
		super(2000, 100, 120 + new java.util.Random().nextInt(280), "ビートル");
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