package test_game;

public class Main {
	public static void main(String[] args) {

		// インスタンス
		Hero h = new Hero();

		while(true) {

			// プレイヤーの状態確認
			System.out.printf("プレイヤーの現在の状態\n");
			System.out.printf("LEVEL:%d HP:%d EXP:%d ATTACK:%d GOLD:%d\n\n",
					h.getLevel(), h.getHp(), h.getExp(), h.getAttack(), h.getGold());

			// 入力を促すメッセージを出力
			System.out.print("どうする？ 1:戦う 2:買う 3:終了 > ");
			int input = new java.util.Scanner(System.in).nextInt();

			// 入力した値の判別
			if(input == 3) {			// デバッグ用
				break;
			} else if(input == 2) {		// 買う
				
			} else if (input == 1) {	// 戦う

				Vish vish = new Vish();
				Volf volf = new Volf();
				Vird vird = new Vird();
				Veetle veetle = new Veetle();
				VasVoss vasvoss = new VasVoss();

				// 入力を促すメッセージを出力
				System.out.printf("何と戦う？\n");
				System.out.printf("1:魚     HP:%5d ATTACK:(  10-  30)\n", vish.getHp());
				System.out.printf("2:狼     HP:%5d ATTACK:(  20-  50)\n", volf.getHp());
				System.out.printf("3:鳥     HP:%5d ATTACK:(  50- 300)\n", vird.getHp());
				System.out.printf("4:甲殻類 HP:%5d ATTACK:( 250- 500)\n", veetle.getHp());
				System.out.printf("5:ボス   HP:%5d ATTACK:(1500-3000)\n", vasvoss.getHp());

				input = new java.util.Scanner(System.in).nextInt();

				int dExp;
				int dGold;
				boolean combat = true;

				switch(input) {
					case 1:
						System.out.println("魚と戦います！");

						// 戦闘
						combat = h.attack(vish);

						// 戦闘終了
						if(combat) {
							System.out.printf("魚を倒した！\n");
							dExp = vish.getExp();
							dGold = vish.getGold();
							System.out.printf("経験値%dを手に入れた！\n", dExp);
							h.setExp(dExp + h.getExp());
							System.out.printf("%dGoldを手に入れた！\n", dGold);
							h.setGold(dGold + h.getGold());
							h.levelConfirmation();
						}
						break;

					case 2:
						System.out.println("狼と戦います！");

						// 戦闘
						combat = h.attack(volf);

						// 戦闘終了
						if(combat) {
							System.out.printf("狼を倒した！\n");
							dExp = volf.getExp();
							dGold = volf.getGold();
							System.out.printf("経験値%dを手に入れた！\n", dExp);
							h.setExp(dExp + h.getExp());
							System.out.printf("%dGoldを手に入れた！\n", dGold);
							h.setGold(dGold + h.getGold());
							h.levelConfirmation();
						}
						break;

					case 3:
						System.out.println("鳥と戦います！");

						// 戦闘
						combat = h.attack(vird);

						// 戦闘終了
						if(combat) {
							System.out.printf("鳥を倒した！\n");
							dExp = vird.getExp();
							dGold = vird.getGold();
							System.out.printf("経験値%dを手に入れた！\n", dExp);
							h.setExp(dExp + h.getExp());
							System.out.printf("%dGoldを手に入れた！\n", dGold);
							h.setGold(dGold + h.getGold());
							h.levelConfirmation();
						}
						break;

					case 4:
						System.out.println("甲殻類と戦います！");

						// 戦闘
						combat = h.attack(veetle);

						// 戦闘終了
						if(combat) {
							System.out.printf("甲殻類を倒した！\n");
							dExp = veetle.getExp();
							dGold = veetle.getGold();
							System.out.printf("経験値%dを手に入れた！\n", dExp);
							h.setExp(dExp + h.getExp());
							System.out.printf("%dGoldを手に入れた！\n", dGold);
							h.setGold(dGold + h.getGold());
							h.levelConfirmation();
						}
						break;

					case 5:
						System.out.println("ボスと戦います！");

						// 戦闘
						combat = h.attack(vasvoss);

						// 戦闘終了
						if(combat) {
							System.out.printf("ボスを倒した！\n");
						}
						break;

					default :
						System.out.println("不正な値です");
				}
				if(!combat) {
					System.out.printf("プレイヤーは倒れた！\n\n");
					break;
				}
				
			} else {
				System.out.println("不正な値が入力されています");
			}
			System.out.println("");
}
		System.out.printf("\nゲーム終了、お疲れ様でした！\n");
	}
}
