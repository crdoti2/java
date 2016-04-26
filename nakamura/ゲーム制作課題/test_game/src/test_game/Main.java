package test_game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// カウント変数
		int i;
		int input;

		final int WEAPON_TYPE = 3;

		// モンスターの種類
		final int MONSTER_TYPE = 5;
		Monster monster[] = new Monster[MONSTER_TYPE];

		// インスタンス
		Hero h = new Hero();

		while(true) {

			// プレイヤーの状態確認
			System.out.printf("プレイヤーの現在の状態\n");
			System.out.printf("LEVEL:%d HP:%d MP:%d EXP:%d ATTACK:%d GOLD:%d\n\n",
					h.getLevel(), h.getHp(), h.getMp(), h.getExp(), h.getAttack(), h.getGold());

			// 入力を促すメッセージを出力
			System.out.print("どうする？ 1:戦う 2:魔法 3:装備 4:終了 > ");
			input = new Scanner(System.in).nextInt();

			// 入力した値の判別
			if(input == 4) {			// デバッグ用
				break;
			} else if(input == 2) {		// 回復する
				System.out.printf("\nHPが200前後回復します\n");
				System.out.printf("MPを50消費して回復魔法を唱えますか？ 1:Yes 2:No > \n");
				input = new Scanner(System.in).nextInt();
				if(h.getMp() < 50) {
					System.out.println("MPが足りません");
				} else if(input == 1) {
					h.aid();
				}


			// 装備は今後修正します
			} else if(input == 3) {		// 装備
				System.out.printf("何に変えますか？\n");
				System.out.printf("1:エクスカリバー ATTACK:%4d  必要レベル10以上\n", Weapon.Excalibur());
				System.out.printf("2:アロンダイト　 ATTACK:%4d  必要レベル 8以上\n", Weapon.Aroundight());
				System.out.printf("3:ガラティーン　 ATTACK:%4d  必要レベル 7以上\n", Weapon.Gallatin());
				System.out.printf("4:ゲイ・ボルグ　 ATTACK:%4d  必要レベル 6以上\n", Weapon.GaeBolg());
				System.out.printf("5:フラガラッハ　 ATTACK:%4d  必要レベル 5以上\n", Weapon.Fragarach());
				input = new Scanner(System.in).nextInt();

				if(input == 1){
					h.setSword(Weapon.Excalibur());
					System.out.printf("エクスカリバーを装備しました\n");
				} else if(input == 2) {
					h.setSword(Weapon.Aroundight());
					System.out.printf("アロンダイトを装備しました\n");
				} else if(input == 3) {
					h.setSword(Weapon.Gallatin());
					System.out.printf("ガラティーンを装備しました\n");
				} else if(input == 4) {
					h.setSword(Weapon.GaeBolg());
					System.out.printf("ゲイ・ボルグを装備しました\n");
				} else if(input == 5) {
					h.setSword(Weapon.Fragarach());
					System.out.printf("フラガラッハを装備しました\n");
				}
				
			} else if(input == 1) {	// 戦う
				
				monster[0] = new Vish();		// サカナ
				monster[1] = new Volf();		// オオカミ
				monster[2] = new Vird();		// バード
				monster[3] = new Veetle();		// ビートル
				monster[4] = new VasVoss();		// ボス

				// 入力を促すメッセージを出力
				System.out.printf("\n何と戦う？\n");
				for(i = 0; i < MONSTER_TYPE; i++) {
					System.out.printf("%d:%s HP:%5d  推奨レベル%d以上\n", i + 1, monster[i].getName(), monster[i].getHp(), monster[i].getRecLevel());
				}
				
				input = new Scanner(System.in).nextInt();

				if(0 < input && input <= MONSTER_TYPE) {
					int dExp;
					int dGold;
					boolean combat = true;
	
					System.out.printf("%sと戦います！\n", monster[input - 1].getName());
	
					// 戦闘
					combat = h.attack(monster[input - 1]);
	
					// 戦闘終了
					if(combat) {
						System.out.printf("\n%sを倒した！\n\n", monster[input - 1].getName());
						dExp = monster[input - 1].getExp();
						dGold = monster[input - 1].getGold();
						System.out.printf("経験値%dを手に入れた！\n", dExp);
						h.setExp(dExp + h.getExp());
						System.out.printf("%dGoldを手に入れた！\n", dGold);
						h.setGold(dGold + h.getGold());
						h.levelConfirmation();
						if(input == 5){
							System.out.println("世界に平和が訪れた！");
							break;
						}
					}
	
					if(!combat) {
						System.out.printf("プレイヤーは倒れた！\n\n");
						break;
					}
				} else {
					System.out.println("不正な値が入力されています");
				}
				
			} else {
				System.out.println("不正な値が入力されています");
			}
			System.out.println("");
}
		System.out.printf("\nゲーム終了、お疲れ様でした！\n");
	}
}
