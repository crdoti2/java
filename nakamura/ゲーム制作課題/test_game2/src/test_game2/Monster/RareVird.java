package test_game2.Monster;

public class RareVird extends Vird {

	// コンストラクタ
	public RareVird() {
		super(2000, 3000, 80 + new java.util.Random().nextInt(110),
				5, "レアバード", 5);
	}
}