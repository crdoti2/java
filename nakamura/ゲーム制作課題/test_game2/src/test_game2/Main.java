package test_game2;

import java.util.Scanner;

import test_game2.Hero.Hero;
import test_game2.Monster.Monster;
import test_game2.Monster.RareVeetle;
import test_game2.Monster.RareVird;
import test_game2.Monster.VasVoss;
import test_game2.Monster.Veetle;
import test_game2.Monster.Vird;
import test_game2.Monster.Vish;
import test_game2.Monster.Volf;
import test_game2.Monster.Vragon;
import test_game2.Protecter.Brigandine;
import test_game2.Protecter.ChainMail;
import test_game2.Protecter.Normal;
import test_game2.Protecter.Protecter;
import test_game2.Sword.Aroundight;
import test_game2.Sword.Excalibur;
import test_game2.Sword.Fragarach;
import test_game2.Sword.GaeBolg;
import test_game2.Sword.Gallatin;
import test_game2.Sword.Sword;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args){

		// カウント変数
		int i;

		// 入力受け付け用変数
		int input;

		// モンスターの種類、インスタンス
		final int MONSTER_TYPE = 6;
		Monster monster[] = new Monster[MONSTER_TYPE];

		// 武器の種類、インスタンス
		final int SWORD_TYPE = 5;
		Sword sword[] = new Sword[SWORD_TYPE];

		// インスタンス化
		sword[0] = new Excalibur();		// エクスカリバー
		sword[1] = new Aroundight();	// アロンダイト
		sword[2] = new Gallatin();		// ガラティーン
		sword[3] = new GaeBolg();		// ゲイ・ボルグ
		sword[4] = new Fragarach();		// フラガラッハ

		// 防具の種類、インスタンス
		final int PROTECTER_TYPE = 3;
		Protecter protecter[] = new Protecter[PROTECTER_TYPE];

		// インスタンス化
		protecter[0] = new Normal();		// ノーマル
		protecter[1] = new ChainMail();		// チェインメイル
		protecter[2] = new Brigandine();	// ブリガンダイン

		// 主人公インスタンス
		Hero h = new Hero();

		while(true) {

			// プレイヤーの状態確認
			System.out.printf("現在の状態\n\n");
			h.HeroStatus();

			// 入力を促すメッセージを出力
			System.out.print("どうする？ 1:戦う 2:回復魔法 3:宿泊 4:武器 5:防具 6:セーブ 7:ロード 8:終了 > ");
			input = new Scanner(System.in).nextInt();

			// 入力した値の判別
			if(input == 8) {			// ゲーム終了

				// 終了
				break;

			} else if(input == 6) {		// Save
				int SaveSize = h.TableCheck();
				if(SaveSize - 1 == 1) {
					System.out.printf("どこにデータを保存しますか？(1:上書き保存 or 0:新規保存) > ");
				} else if(SaveSize < 10) {
					System.out.printf("どこにデータを保存しますか？(1～%d:上書き保存 or 0:新規保存) > ", SaveSize - 1);
				} else {
					System.out.printf("どこにデータを保存しますか？(1～%d:上書き保存) > ", SaveSize - 1);
				}
				input = new Scanner(System.in).nextInt();
				if(0 < input && input < SaveSize) {			// 上書き保存
					h.UpdateSaveData(input);
					System.out.printf("%dに上書き保存しました\n", input);
				} else if(input == 0 && SaveSize < 10) {	// 新規保存（実際には上書き保存）
					h.UpdateSaveData(SaveSize);
					System.out.printf("%dに新規保存しました\n", SaveSize);
				} else {
					System.out.printf("\nセーブをキャンセルしました\n");
				}

			} else if(input == 7) {		// Load

				int LoadSize = h.TableCheck();
				System.out.println("どのデータを読み込みますか？ > ");
				input = new Scanner(System.in).nextInt();
				if(0 < input && input < LoadSize) {
					h.LoadData(input);
					System.out.println("ロードしました");
				} else {
					System.out.println("ロードをキャンセルしました");
				}

			} else if(input == 2) {		// 魔法で4回復する

				// 入力を促すメッセージ
				System.out.printf("\nHPが500前後回復します\n");
				System.out.printf("MPを50消費して回復魔法を唱えますか？ 1:Yes 2:No > \n");

				// 入力受け付け
				input = new Scanner(System.in).nextInt();

				// MPがあるかどうか確認
				if(h.getMp() < 50) {
					System.out.println("MPが足りません");
				} else if(input == 1) {
					h.aid();
				}

			} else if(input == 3) {		// 宿で回復する

					// 入力を促すメッセージ
					System.out.printf("\nHPが全回復します\n");
					System.out.printf("Goldを1000消費して宿に泊まりますか？ 1:Yes 2:No > \n");

					// 入力受け付け
					input = new Scanner(System.in).nextInt();

					// MPがあるかどうか確認
					if(h.getGold() < 1000) {
						System.out.println("Goldが足りません");
					} else if(input == 1) {
						h.InnAid();
					}


			// 装備
			} else if(input == 4) {		// 武器

				// 入力を促すメッセージ
				System.out.printf("何に変えますか？\n");
				for(i = 1; i <= SWORD_TYPE; i++) {
					System.out.printf("%d:%7s  ATTACK:%4d  必要レベル%2d以上\n", i, sword[i - 1].getName(), sword[i - 1].getAttack(), sword[i - 1].getForLevel());
				}

				// 入力受け付け
				input = new Scanner(System.in).nextInt();

				// 範囲指定
				if(1 <= input && input <= SWORD_TYPE){
					if(h.getLevel() >= sword[input - 1].getForLevel()) {
						h.setSword(sword[input - 1].getAttack());
						System.out.printf("%sに変更しました\n", sword[input - 1].getName());
//						h.setLog("武器を" + sword[input - 1].getName() + "に変更しました");
					} else {
						System.out.printf("レベルが足りません\n");
						System.out.printf("あと%dレベルあげる必要があります\n", sword[input - 1].getForLevel() - h.getLevel());
					}
				}

			} else if(input == 5) {		// 防具

				// 入力を促すメッセージ
				System.out.printf("何に変えますか？\n");

				for(i = 1; i <= PROTECTER_TYPE; i++) {
					System.out.printf("%d:%s  HP:%d倍  必要レベル%2d以上\n", i, protecter[i - 1].getName(), protecter[i - 1].getDefense(),  protecter[i - 1].getForLevel());
				}

				
				input = new Scanner(System.in).nextInt();

				if(1 <= input && input <= PROTECTER_TYPE){
					if(h.getLevel() >= protecter[input - 1].getForLevel()) {
						h.setProtecter(protecter[input - 1].getDefense());
						System.out.printf("%sに変更しました\n", protecter[input - 1].getName());
//						h.setLog("防具を" + protecter[input - 1].getName() + "に変更しました");
					} else {
						System.out.printf("レベルが足りません\n");
						System.out.printf("あと%dレベルあげる必要があります\n", protecter[input - 1].getForLevel() - h.getLevel());
					}
				}
				h.hpCheck();

			} else if(input == 1) {		// 戦う

				// インスタンス化
				monster[0] = new Vish();		// サカナ
				monster[1] = new Volf();		// オオカミ
				monster[2] = new Vird();		// バード
				monster[3] = new Veetle();		// ビートル
				monster[4] = new Vragon();		// ドラゴン
				monster[5] = new VasVoss();		// ボス

				// 入力を促すメッセージを出力
				System.out.printf("\n何と戦う？\n");
				for(i = 0; i < MONSTER_TYPE; i++) {
					System.out.printf("%d:%s HP:%6d  推奨レベル%2d以上\n",i + 1,
							monster[i].getName(), monster[i].getHp(), monster[i].getRecLevel());
				}

				// 入力受け付け
				input = new Scanner(System.in).nextInt();

				// 入力した値が1～5なのかチェック
				if(1 <= input && input <= MONSTER_TYPE) {
					int dExp;
					int dGold;
					int rare = new java.util.Random().nextInt(10);
					boolean combat = true;

					if(rare == 0) {
						if(input == 3) {
							monster[2] = new RareVird();		// レアバード
						}
						if(input == 4) {
							monster[3] = new RareVeetle();		// レアビートル
						}
					}
					System.out.printf("%sと戦います！\n", monster[input - 1].getName());
	
					// 戦闘
					combat = h.attack(monster[input - 1]);
	
					// 戦闘終了
					if(combat) {
						System.out.printf("\n%sを倒した！\n", monster[input - 1].getName());
						monster[input - 1].run();
						System.out.println("");
//						h.setLog(monster[input -1].getName() + "を倒した");

						if(input != 6) {
							dExp = monster[input - 1].getExp();
							dGold = monster[input - 1].getGold();
							System.out.printf("経験値%dを手に入れた！\n", dExp);
//							h.setLog(dExp + "経験値を手に入れた");
							h.setExp(dExp + h.getExp());
							System.out.printf("%dGoldを手に入れた！\n", dGold);
//							h.setLog(dGold + "Goldを手に入れた");
							h.setGold(dGold + h.getGold());
							h.levelConfirmation();
						}
						if(input == 6){
							// プレイヤーの状態確認
							System.out.printf("\n最終プレイヤー状態\n\n");
							h.HeroStatus();
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
