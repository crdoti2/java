package test_game2.Monster;

public class RareVeetle extends Veetle {

	// コンストラクタ
	public RareVeetle() {
		super(4000, 4000, 240 + new java.util.Random().nextInt(280),
				10, "レアビートル", 2);
	}
}