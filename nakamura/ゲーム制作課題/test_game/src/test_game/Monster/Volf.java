package test_game.Monster;

public class Volf extends Monster {

	// コンストラクタ
	public Volf() {
		super(500, 150, 20 + new java.util.Random().nextInt(30), 3, "オオカミ", 3);
	}

	public void attack() {
		System.out.println("噛みつき攻撃！");
	}

	@Override
	public void run() {
		System.out.println("負け犬の遠吠えをしながら逃げていきました");
	}

	@Override
	public int getAttack() {
		return (20 + new java.util.Random().nextInt(30));
	}
	
}