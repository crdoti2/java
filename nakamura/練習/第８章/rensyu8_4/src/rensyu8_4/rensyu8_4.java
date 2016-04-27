package rensyu8_4;

public class rensyu8_4 {
	public static void main(String[] args) {

		// インスタンス化
		Cleric cleric = new Cleric();

		// selfAidメソッド呼び出し
		cleric.selfAid();

		// prayメソッド呼び出し
		System.out.printf("ＭＰ%d回復した\n", cleric.pray(3));
	}
}
