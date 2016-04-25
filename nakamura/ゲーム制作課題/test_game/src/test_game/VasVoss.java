package test_game;

public class VasVoss extends Monster {

	// コンストラクタ
	VasVoss() {
		super(20000);
	}

	public void attack() {
		System.out.println("火炎攻撃！");
	}

	@Override
	public void run() {
		System.out.println("大きな音をたてて倒れ、逃げ去りました");
	}

	@Override
	public int getAttack() {
		return (1500 + new java.util.Random().nextInt(1500));
	}

}