package test_game;

public class Vird extends Monster {

	// コンストラクタ
	Vird() {
		super(800, 250, 40 + new java.util.Random().nextInt(110), 5, "バード  ", 5);
	}

	public void attack() {
		System.out.println("羽ばたき攻撃！");
	}

	@Override
	public void run() {
		System.out.println("山奥の巣に逃げていきました");
	}

	@Override
	public int getAttack() {
		return (50 + new java.util.Random().nextInt(250));
	}
}