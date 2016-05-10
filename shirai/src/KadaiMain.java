import java.util.Random;
import java.util.Scanner;

public class KadaiMain {
	static int select1 = 0;

	public static void main(String[] args) throws Exception {

		Random rnd = new Random();
		Hero h = new Hero();
		Monster m = null;
		Date d = new Date();

		while (true) {
			System.out.print("\r\n現在の" + h.getName() + "のステータス\r\nLevel:"
					+ h.getLevel() + "\r\nHP:" + h.getHp() + "/" + h.getMaxHp()
					+ "\r\n攻撃力:" + h.getAttackPower() + "\r\nゴールド:"
					+ h.getGold() + "\r\n経験値:" + h.getExp() + "\r\n"
					+ "\r\nお守りの数:" + h.getOmamori() + "\r\n");
			System.out.print("どうする？ 1:戦う 2:調べる 3:買う 4:セーブ 5:ロード 6:終了");
			Scanner scan = new Scanner(System.in);
			select1 = scan.nextInt();

			if (select1 == 1) {
				System.out.println("\r\nどの敵と戦いますか？");
				System.out
						.print(" 1:Vish\r\n 2:Volf\r\n 3:Vird\r\n 4:Veetle\r\n 5:VasVoss\r\n");
				Scanner scan2 = new Scanner(System.in);

				switch (scan2.nextInt()) {
				case 1:
					m = new Vish();
					break;
				case 2:
					m = new Volf();
					break;
				case 3:
					m = new Vird();
					break;
				case 4:
					m = new Veetle();
					break;
				case 5:
					m = new VasVoss();
					break;
				}

				System.out.println(m.getName() + "が現れた。\r\n");

				while (m.getHp() > 0 && h.getHp() > 0) {
					int ran = rnd.nextInt(100);

					if (ran > m.getAttackRate()) {
						m.attack(h);
						System.out.print(m.getName() + "の攻撃！");
						System.out.println(h.getName() + "は" + m.getDamage()
								+ "のダメージを受けた");
						System.out.println(h.getName() + "のHPは" + h.getHp()
								+ "となった\r\n");
					} else {
						h.attack(m);
						System.out.print(h.getName() + "の攻撃！");
						System.out.println(m.getName() + "は"
								+ h.getAttackPower() + "のダメージを受けた");
						System.out.println(m.getName() + "のHPは" + m.getHp()
								+ "となった\r\n");
					}
				}

				if (h.getHp() <= 0) {
					if (h.getOmamori() > 0) {
						h.setHp(h.getMaxHp());
						System.out.println("お守りの効果で復活しました。");
						h.setOmamori(h.getOmamori() - 1);

					} else {
						System.out.println("GAME OVER");
						break;
					}

				} else {
					System.out.println(h.getName() + "は勝利した！");
					m.run();
					h.addExp(m);
					System.out.println(h.getName() + "は経験値" + m.getExp()
							+ "を得た！");
					levelUp(h);
					m.dropGold();// モンスターが落とすゴールドを計算
					h.addGold(m);// モンスターが落としたゴールドをヒーローのゴールドへ追加
					System.out.println(m.getName() + "はゴールド" + m.getGold()
							+ "枚を落とし、" + h.getName() + "のゴールドは" + h.getGold()
							+ "枚となった！");

				}

			} else if (select1 == 2) {

			} else if (select1 == 3) {
				System.out
						.print("どれを買いますか？ 1:ポーション(10G) 2:エリクサー(50G) 3:お守り(100G)");
				Scanner scan3 = new Scanner(System.in);

				switch (scan3.nextInt()) {
				case 1:
					if (h.getGold() >= 10) {
						if (h.getHp() + 200 < h.getMaxHp())
							h.setHp(h.getHp() + 200);
						else
							h.setHp(h.getMaxHp());
						System.out.println("HPが200回復しました");
						h.setGold(h.getGold() - 10);
					} else {
						System.out.println("ゴールドが足りません");
					}
					break;
				case 2:
					if (h.getGold() >= 50) {
						h.setHp(h.getMaxHp());
						System.out.println("HPが全て回復しました");
						h.setGold(h.getGold() - 50);
					} else {
						System.out.println("ゴールドが足りません");
					}
					break;
				case 3:
					if (h.getGold() >= 50) {
						h.setOmamori(h.getOmamori() + 1);
						System.out.println("お守りを一個購入しました");
						h.setGold(h.getGold() - 100);
					} else {
						System.out.println("ゴールドが足りません");
					}
					break;
				}

			} else if (select1 == 4) {

				System.out.println("ぶちころされてえのか");
				Scanner scan1 = new Scanner(System.in);
				// select = scan1.nextInt();

				System.out.println("えらべよ");
				switch (scan1.nextInt()) {
				case 1:
					d.data();
					break;
				case 2:
					d.data();
					break;
				case 3:
					d.data();
					break;
				case 4:
					d.data();
					break;
				case 5:
					d.data();
					break;
				default:
					System.out.println("殺すぞ");
				}
			} else if (select1 == 5) {
				System.out.println("ロード？殺すぞ");


			} else if (select1 == 6) {
				break;

			}
		}
	}

	static public void levelUp(Hero h) {
		if (h.getExp() >= 250 && h.getLevel() == 1) {
			h.setLevel(2);
			h.setMaxHp(300);
			h.setAttackPower(40);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 300 && h.getLevel() == 2) {
			h.setLevel(3);
			h.setMaxHp(400);
			h.setAttackPower(70);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 500 && h.getLevel() == 3) {
			h.setLevel(4);
			h.setMaxHp(500);
			h.setAttackPower(100);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 700 && h.getLevel() == 4) {
			h.setLevel(5);
			h.setMaxHp(600);
			h.setAttackPower(300);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 1000 && h.getLevel() == 5) {
			h.setLevel(6);
			h.setMaxHp(700);
			h.setAttackPower(500);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 1500 && h.getLevel() == 6) {
			h.setLevel(7);
			h.setMaxHp(800);
			h.setAttackPower(800);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 2000 && h.getLevel() == 7) {
			h.setLevel(8);
			h.setMaxHp(900);
			h.setAttackPower(1000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 3000 && h.getLevel() == 8) {
			h.setLevel(9);
			h.setMaxHp(1000);
			h.setAttackPower(1300);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 4500 && h.getLevel() == 9) {
			h.setLevel(10);
			h.setMaxHp(1100);
			h.setAttackPower(1600);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 7000 && h.getLevel() == 10) {
			h.setLevel(11);
			h.setMaxHp(1200);
			h.setAttackPower(2000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 10000 && h.getLevel() == 11) {
			h.setLevel(12);
			h.setMaxHp(1400);
			h.setAttackPower(2500);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 14000 && h.getLevel() == 12) {
			h.setLevel(13);
			h.setMaxHp(1600);
			h.setAttackPower(3000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 20000 && h.getLevel() == 13) {
			h.setLevel(14);
			h.setMaxHp(2000);
			h.setAttackPower(4000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 30000 && h.getLevel() == 14) {
			h.setLevel(15);
			h.setMaxHp(2500);
			h.setAttackPower(5000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 40000 && h.getLevel() == 15) {
			h.setLevel(16);
			h.setMaxHp(3000);
			h.setAttackPower(6000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 60000 && h.getLevel() == 16) {
			h.setLevel(17);
			h.setMaxHp(5000);
			h.setAttackPower(7000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		} else if (h.getExp() >= 80000 && h.getLevel() == 17) {
			h.setLevel(18);
			h.setMaxHp(7000);
			h.setAttackPower(8000);
			System.out.println("おめでとう！" + h.getName() + "はLevel" + h.getLevel()
					+ "になった！！");
		}

	}

}
