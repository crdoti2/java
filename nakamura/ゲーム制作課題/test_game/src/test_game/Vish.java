package test_game;

public class Vish extends Monster {

	// コンストラクタ
	Vish() {
		super(100, 80, 10 + new java.util.Random().nextInt(10), 1, "人食い魚", 2);
	}

	public void attack() {
		System.out.println("ウロコ投げ攻撃！");
	}

	@Override
	public void run() {
		System.out.println("深海へと逃げていきました");
	}

	@Override
	public int getAttack() {
		return (10 + new java.util.Random().nextInt(20));
	}
}
