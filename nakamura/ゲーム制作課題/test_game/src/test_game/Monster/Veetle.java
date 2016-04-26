package test_game.Monster;

public class Veetle extends Monster {

	// コンストラクタ
	public Veetle() {
		super(2000, 400, 120 + new java.util.Random().nextInt(280), 10, "ビートル", 2);
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