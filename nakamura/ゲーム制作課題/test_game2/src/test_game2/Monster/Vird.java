package test_game2.Monster;

public class Vird extends Monster {

	// コンストラクタ
	public Vird() {
		super(800, 250, 40 + new java.util.Random().nextInt(110), 5, "バード  ", 5);
	}
	public Vird(int hp, int exp, int gold, int recLevel, String name, int hit) {
		super(hp, exp, gold, recLevel, name, hit);
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