public class Main {
	public static void main(String[] arg) {

		// 主人公インスタンス
		Hero h = new Hero();

		// 敵インスタンス
		Vish s = new Vish();
		Volf a = new Volf();
		Vird o = new Vird();

		// 多態性でモンスターを同一化
		Monster[] monsters = new Monster[3];
		monsters[0] = new Vish();
		monsters[1] = new Volf();
		monsters[2] = new Vird();
		// 戦闘時再度敵と戦うループ
		while (true) {

			// ステータス情報
			System.out.println("------------------------------------");
			System.out.println("＠＠＠＠＠");
			System.out.println("ステータス");
			System.out.println("＠＠＠＠＠");
			System.out.println(h.name);
			System.out.println("LEVEL" + h.getLevel());
			System.out.println("HP:" + h.getHp());
			System.out.println("EXP:" + h.getExp());
			System.out.println("------------------------------------");
			System.out.println("[コマンド]1.戦う 2.宿屋♂マッスル♂");

			// 最初の分岐
			int sen = new java.util.Scanner(System.in).nextInt();
			if (sen == 1) {
				System.out.println("どっちかの数字うってみそ");
				System.out.println("[1]" + s.name + "が寝ている");
				System.out.println("[2]" + a.name + "ファイティングポーズだ");
				System.out.println("[3]" + o.name + "壁に寄りかかってこちらを見ている");

			} else if (sen == 2) {
				System.out.println(h.yado(h));
			}

			// 戦闘開始
			int kyara = new java.util.Scanner(System.in).nextInt();
			if (kyara == 1) {
				// 戦闘で0になるまで戦う

				while (true) {
					System.out.println("------------------------------------");
					System.out.println("[どうする]1.戦ってみる 2.戦ってみる");
					int tatakai = new java.util.Scanner(System.in).nextInt();
					System.out.println(h.attak(s));
					System.out.println("------------------------------------");
					System.out.println(s.attak(h));
					// 敵を倒した場合次へ
					if (s.hp <= 0) {
						System.out.println(s.name + "を退治したおめでとう");
						System.out.println(s.exp(h));
						break;
					}
					// 負けた場合終わり
					if (h.getHp() <= 0) {
						System.out.println("相手のjavaの質問攻めに死んだ");
						break;
					}
				}
			}
			// 敵との戦闘

			if (kyara == 2) {
				System.out.println(a.name + "が強制的に勝負を仕掛けてきた");
				// 戦闘で0になるまで戦う
				while (true) {
					int kyara2 = new java.util.Scanner(System.in).nextInt();
					if (kyara2 == 1) { // 戦闘で0になるまで戦う while (true) {
						System.out.println("[どうする]1.戦ってみる 2.やばい。逃げよう");
						int tatakai = new java.util.Scanner(System.in)
								.nextInt();
						System.out.println("貴様に選択権はなかったバトル開始ぃぃぃぃぃ！！");
						System.out.println(h.attak(a));
						System.out.println(a.attak(h)); // 敵を倒した場合次へ
						if (a.hp <= 0) {
							System.out.println(a.name + "を木っ端微塵にしたおめでとう");
							break;
						} // 負けた場合終わり
						if (h.getHp() <= 0) {
							System.out.println("相手のjavaの質問攻めに死んだ");
							break;
						}
					}
				}
			}


			if (kyara == 3) {
				// 戦闘で0になるまで戦う

				while (true) {
					System.out.println("------------------------------------");
					System.out.println("[どうする]1.いけすかねえ。殺すか 2.殺す");
					int tatakai = new java.util.Scanner(System.in).nextInt();
					System.out.println(h.attak(o));
					System.out.println("------------------------------------");
					System.out.println(o.attak(h));
					// 敵を倒した場合次へ
					if (s.hp <= 0) {
						System.out.println(o.name + "を退治したおめでとう");
						System.out.println(s.exp(h));
						break;
					}
					// 負けた場合終わり
					if (h.getHp() <= 0) {
						System.out.println("相手のjavaの質問攻めに死んだ");
						break;
					}
				}
			}
			// レベルが上がった時の処理
			if (h.getExp() < 250) {
				System.out.println(h.getLevel());
			} else if (h.getExp() < 500) {
				System.out.println(h.getLevel());
			} else if (h.getExp() < 700) {
				System.out.println(h.getLevel());
			} else if (h.getExp() < 1000) {
				System.out.println(h.getLevel());
			} else if (h.getExp() < 1500) {
				System.out.println(h.getLevel());
			}

		}
	}
}
