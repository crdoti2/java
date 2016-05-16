package test_game2.Monster;

public class Vragon extends Monster{

	// コンストラクタ
	public Vragon() {
		super(10000, 7500, 1200 + new java.util.Random().nextInt(500), 15, "ドラゴン", 3);
	}
	public Vragon(int hp, int exp, int gold, int recLevel, String name, int hit) {
		super(hp, exp, gold, recLevel, name, hit);
	}

	public void attack() {
		System.out.println("ブレス攻撃！");
	}

	@Override
	public void run() {
		System.out.println("天高く飛び上がって逃げました");
	}

	@Override
	public int getAttack() {
		return (4000 + new java.util.Random().nextInt(1000));
	}
}