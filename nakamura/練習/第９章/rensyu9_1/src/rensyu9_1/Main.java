package rensyu9_1;

public class Main {
	public static void main(String[] args) {

		// インスタンス化
		Cleric cleric1 = new Cleric("アサカ");
		Cleric cleric2 = new Cleric("アサカ", 35);
		Cleric cleric3 = new Cleric("アサカ", 40, 5);

		// selfAidメソッド呼び出し
//		cleric.selfAid();

		// prayメソッド呼び出し
//		System.out.printf("ＭＰ%d回復した\n", cleric.pray(3));
	}
}
