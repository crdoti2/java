package test_game2;

import java.sql.SQLException;
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
		final int MONSTER_TYPE = 5;
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
			System.out.printf("プレイヤーの現在の状態\n");
			System.out.printf("LEVEL:%d HP:%d MP:%d EXP:%d ATTACK:%d GOLD:%d\n\n",
					h.getLevel(), h.getHp(), h.getMp(), h.getExp(), h.getAttack(), h.getGold());

			// 入力を促すメッセージを出力
			System.out.print("どうする？ 1:戦う 2:魔法 3:武器 4:防具 5:セーブ 6:ロード 7:終了 > ");
			input = new Scanner(System.in).nextInt();

			// 入力した値の判別
			if(input == 7) {			// ゲーム終了

				// 終了
				break;

			} else if(input == 5) {		// Save
				try {
					int SaveSize = h.TableCheck();
					if(SaveSize - 1 == 1) {
						System.out.printf("どこにデータを保存しますか？(1:上書き保存 or 0:新規保存) > ");
					} else {
						System.out.printf("どこにデータを保存しますか？(1～%d:上書き保存 or 0:新規保存) > ", SaveSize - 1);
					}
					input = new Scanner(System.in).nextInt();
					if(0 < input && input < SaveSize) {			// 上書き保存
						try {
							h.UpdateSaveData(input);
							System.out.printf("%dに上書き保存しました\n", input);
						} catch (InstantiationException | IllegalAccessException
								| ClassNotFoundException | SQLException e1) {
							// 自動生成された catch ブロック
							e1.printStackTrace();
						}
					} else if(input == 0) {						// 新規保存（実際には上書き保存）
						try {
							h.UpdateSaveData(SaveSize);
							System.out.printf("%dに新規保存しました\n", SaveSize);
						} catch (InstantiationException | IllegalAccessException
								| ClassNotFoundException | SQLException e2) {
							// 自動生成された catch ブロック
							e2.printStackTrace();
						}
					} else {
						System.out.printf("\nセーブをキャンセルしました\n");
					}
				} catch (InstantiationException | IllegalAccessException
						| ClassNotFoundException | SQLException e3) {
					// 自動生成された catch ブロック
					e3.printStackTrace();
				}

			} else if(input == 6) {		// Load

				try {
					int LoadSize = h.TableCheck();
					System.out.println("どのデータを読み込みますか？ > ");
					input = new Scanner(System.in).nextInt();
					if(0 < input && input < LoadSize) {
						try {
							h.LoadData(input);
						} catch (InstantiationException | IllegalAccessException
								| ClassNotFoundException | SQLException e4) {
							// 自動生成された catch ブロック
							e4.printStackTrace();
						}
						System.out.println("ロードしました");
					} else {
						System.out.println("ロードをキャンセルしました");
					}
				} catch (InstantiationException | IllegalAccessException
						| ClassNotFoundException | SQLException e5) {
					// 自動生成された catch ブロック
					e5.printStackTrace();
				}

			} else if(input == 2) {		// 回復する

				// 入力を促すメッセージ
				System.out.printf("\nHPが200前後回復します\n");
				System.out.printf("MPを50消費して回復魔法を唱えますか？ 1:Yes 2:No > \n");

				// 入力受け付け
				input = new Scanner(System.in).nextInt();

				// MPがあるかどうか確認
				if(h.getMp() < 50) {
					System.out.println("MPが足りません");
				} else if(input == 1) {
					h.aid();
				}


			// 装備
			} else if(input == 3) {		// 武器

				// 入力を促すメッセージ
				System.out.printf("何に変えますか？\n");
				for(i = 1; i <= SWORD_TYPE; i++) {
					System.out.printf("%d:%10s  ATTACK:%4d  Required Level%2d\n", i, sword[i - 1].getName(), sword[i - 1].getAttack(), sword[i - 1].getForLevel());
				}

				// 入力受け付け
				input = new Scanner(System.in).nextInt();

				// 範囲指定
				if(1 <= input && input <= SWORD_TYPE){
					h.setSword(sword[input - 1].getAttack());
					System.out.printf("It was equipped with %s\n", sword[input - 1].getName());
				}

			} else if(input == 4) {		// 防具

				// 入力を促すメッセージ
				System.out.printf("何に変えますか？\n");

				for(i = 1; i <= PROTECTER_TYPE; i++) {
					System.out.printf("%d:%s  HP:%d倍  必要レベル%2d以上\n", i, protecter[i - 1].getName(), protecter[i - 1].getDefense(),  protecter[i - 1].getForLevel());
				}

				
				input = new Scanner(System.in).nextInt();

				if(1 <= input && input <= PROTECTER_TYPE){
					h.setProtecter(protecter[input - 1].getDefense());
					System.out.printf("%sに変更しました\n", protecter[input - 1].getName());
				}
				h.hpCheck();

			} else if(input == 1) {		// 戦う

				// インスタンス化
				monster[0] = new Vish();		// サカナ
				monster[1] = new Volf();		// オオカミ
				monster[2] = new Vird();		// バード
				monster[3] = new Veetle();		// ビートル
				monster[4] = new VasVoss();		// ボス

				// 入力を促すメッセージを出力
				System.out.printf("\n何と戦う？\n");
				for(i = 0; i < MONSTER_TYPE; i++) {
					System.out.printf("%d:%-5s HP:%5d  推奨レベル%2d以上\n",i + 1,
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
						System.out.printf("\n%sを倒した！\n\n", monster[input - 1].getName());
						if(input != 5) {
							dExp = monster[input - 1].getExp();
							dGold = monster[input - 1].getGold();
							System.out.printf("経験値%dを手に入れた！\n", dExp);
							h.setExp(dExp + h.getExp());
							System.out.printf("%dGoldを手に入れた！\n", dGold);
							h.setGold(dGold + h.getGold());
							h.levelConfirmation();
						}
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
