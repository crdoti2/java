package test_game;

public class Vish extends Monster {

	// コンストラクタ
	Vish() {
		super(100, 5, 10 + new java.util.Random().nextInt(10));
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
