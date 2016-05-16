import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	private static final String URL = "jdbc:mysql://localhost:3306/rpg";
	private static final String USER = "root";
	private static final String PW = "";

	public static int buyWeapon;
	public static int plusATK = 0;
	public static String name;

	private static Connection con = null;
	private static PreparedStatement pstmt = null;
	private static PreparedStatement update = null;
	private static ResultSet rs = null;
	private static int enemySelect;
	private static String weaponName = "無し";
	private static boolean haveElicser = false;
	private static int gold;

	public static void main(String[] args) {

		System.out.println("ようこそ！");
		System.out.println("名前を入力してください");
		name = new java.util.Scanner(System.in).nextLine();
		Human h = new Hero(name);
		int x = 1;
		Weapon[] w = new Weapon[3];
		w[0] = new Dagger();
		w[1] = new Sowrd();
		w[2] = new Meis();
		/*-----------------------------ゲームスタート---------------------------------------------------*/
		while (x > 0) {
			Enemy[] e = new Enemy[5];
			e[0] = new Fish();
			e[1] = new Wolf();
			e[2] = new Bird();
			e[3] = new Beetle();
			e[4] = new Boss();

			System.out.println("何をする？ 1:戦う 2:調べる 3:買い物 4:セーブ 5:ロード 6:終了 7:アーカイブ");
			int select = new java.util.Scanner(System.in).nextInt();
			if (select == 4) {
				try {
					String sql = "select * from player";
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(URL, USER, PW);
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						if ("未使用".equals(rs.getString("name"))) {
							update = con
									.prepareStatement("update player set name=?,hp=?,exp=?,gold=?,weapon=?,level=? where id=?");
							update.setString(1, h.getName());
							update.setInt(2, h.getHp());
							update.setInt(3, h.getGold());
							update.setInt(4, h.getExp());
							switch (buyWeapon) {
							case 0:
								update.setString(5, "dagger");

								break;
							case 1:
								update.setString(5, "sowrd");
								break;
							case 2:
								update.setString(5, "meis");
							default:
								update.setString(5, "haven't");
							}
							update.setInt(6, h.getLevel());
							// where
							update.setInt(7, rs.getInt("ID"));
							update.executeUpdate();
							System.out.println("セーブ完了");
							break;
						} else if (rs.getInt("ID") == 10
								&& !("未使用".equals(rs.getString("name")))) {
							System.out.println("セーブデータがいっぱいです。");
							System.out.println("消去するデータを選んでください。");

						}
					}
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				} finally {
					if (con != null) {
						try {
							con.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				}
			} else if (select == 5) {
				System.out.println("どのセーブデータをロードしますか。？");
				String sql = "select * from player";

				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection(URL, USER, PW);
					pstmt = con.prepareStatement(sql);
					rs = pstmt.executeQuery();
					List<Map<String, Object>> heros = new ArrayList<Map<String, Object>>();
					Map<String, Object> hero;
					while (rs.next()) {
						System.out.println("[" + rs.getInt("ID") + "]" + "名前:"
								+ rs.getString("name") + " HP:"
								+ rs.getInt("hp") + " EXP:" + rs.getInt("exp")
								+ " 所持ゴールド:" + rs.getInt("gold") + " 所持武器:"
								+ rs.getString("weapon") + " レベル:"
								+ rs.getInt("level"));
						hero = new HashMap<String, Object>();
						hero.put("id", rs.getInt("id"));
						hero.put("name", rs.getString("name"));
						hero.put("hp", rs.getInt("hp"));
						hero.put("exp", rs.getInt("exp"));
						hero.put("gold", rs.getInt("gold"));
						hero.put("weapon", rs.getString("weapon"));
						hero.put("level", rs.getInt("level"));
						heros.add(hero);
					}
					int input = new java.util.Scanner(System.in).nextInt() - 1;
					Map<String, Object> setHero = heros.get(input);
					if ("未使用".equals(setHero.get("name"))) {
						System.out.println("データがありません");
					} else {
						h.setHp(0);	h.setExp(0);h.setGold(0);	h.resetLevel();	weaponName = "haven't";	plusATK = 0;
						h.setName(setHero.get("name").toString());
						h.setHp((int) setHero.get("hp"));
						h.setExp((int) setHero.get("exp"));
						h.setGold((int) setHero.get("gold"));
						h.setLevel((int) setHero.get("level"));
						if (!("haven't".equals(setHero.get("weapon")))) {
							if ("dagger".equals(setHero.get("weapon"))) {
								buyWeapon = 0;
							} else if ("sowrd".equals(setHero.get("weapon"))) {
								buyWeapon = 1;
							} else if ("meis".equals(setHero.get("weapon"))) {
								buyWeapon = 2;
							}
							weaponName = w[buyWeapon].getName();
							plusATK = w[buyWeapon].getAttackPower();
						} else {
							weaponName = "無し";
							plusATK = 0;
						}
						System.out.println("ロードが完了しました。");
					}
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}finally{
					if(con !=null){
						try {
							con.close();
						} catch (SQLException e1) {
							// TODO 自動生成された catch ブロック
							e1.printStackTrace();
						}
					}
				}
			} else if (select == 6) {
				break;
			}
			if(select == 7){
				System.out.println("---戦闘記録---");
				e[enemySelect].getData();
				System.out.println("---戦闘記録---");
			}
			if (select == 1) {
				System.out.println("敵を選択してください");
				System.out.println("1:Fish 2:Wolf 3:Bird 4:Beetle 5:Boss");
				enemySelect = new java.util.Scanner(System.in).nextInt();

				System.out.println(e[enemySelect - 1].getName());

				System.out.println("が現れた！");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ee) {

				}
				/*-------------------------バトル-------------------------------------------------------------*/
				while (x > 0) {
					int rand = (int) (Math.random() * 10);

					System.out.println("");
					System.out.println("自分の現在HP:" + h.getHp());
					System.out.println("敵の現在HP:" + e[enemySelect - 1].getHp());

					try {
						Thread.sleep(2000);
					} catch (InterruptedException ee) {

					}
					System.out.println("");

					if (rand > 2) {
						h.attack(e[enemySelect - 1]);
					} else {
						e[enemySelect - 1].attack(h);
						e[enemySelect-1].writeDamege();
					}
					try {
						Thread.sleep(2000);
					} catch (InterruptedException ee) {

					}
					if (h.getHp() <= 0) {
						if (haveElicser) {
							System.out.println(h.getName() + "は生き返った");
							h.setHp(h.getMaxHpTable(h.getLevel() - 1));
							haveElicser = false;
							continue;
						} else
							break;
					} else if (e[enemySelect - 1].getHp() <= 0) {
						System.out.println("自分の現在HP:" + h.getHp());
						System.out.println("敵の現在HP:0");
						e[enemySelect - 1].run();
						System.out.println("");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException ee) {

						}
						break;
					}
				}
				/*----------------------------バトルwhile文ここまで------------------------------------*/
				if (h.getHp() > 0) {
					System.out.println("勝利しました！");
					System.out.print(h.getName() + "は");
					gold = e[enemySelect - 1].gold();
					h.setGold(h.getGold() + gold);
					System.out.println(gold + "G獲得");
					e[enemySelect-1].writeKillGold();
				} else {
					h.run();
					System.out.println("ゴールドは取得できませんでした。");
				}
				/*------------------------ゴールド取得--------------------------------------------------------*/

				/*-------------------------経験値取得-------------------------------------------------------*/
				if (h.getHp() > 0) {
					int exp = e[enemySelect - 1].getExp();
					System.out.println(exp + "経験値獲得");
					h.setExp(h.getExp() + exp);
					if (e[4].getHp() <= 0) {
						System.out.println("ゲームクリア！");
						System.out.println("この世界であなたは英雄になりました！");
						System.out.println("以上でゲームは終了です。");
						break;
					}
				} else {
					System.out.println("経験値は取得できませんでした。");
					h.lose();
				}
				/*-------------------------現在のステータス表示-------------------------------------------------*/
				if (h.getExp() >= Human.EXP_TABLE[h.getLevel() - 1]) {
					System.out.println(h.getName() + "のレベルが上がった!");
					h.setLevel(1);
					h.setHp(h.getMaxHpTable(h.getLevel() - 1));
				}
				System.out.println("GOLD:" + h.getGold());
				System.out.println("EXP:" + h.getExp());
				System.out.println("LEVEL:" + h.getLevel());
				/*---------------1:戦うここまで----------------*/
			} else if (select == 2) {
				while (x > 0) {
					System.out
							.println("0:自身のステータス 1:Fish 2:Wolf 3:Bird 4:Beetle 5:ボス 6:閉じる");
					int in = new java.util.Scanner(System.in).nextInt();
					switch (in) {
					case 0:
						System.out.println("あなたのステータス");
						System.out.println("所持武器:" + weaponName + "　ATK+"
								+ plusATK);
						System.out.println("最大HP:"
								+ h.getMaxHpTable(h.getLevel() - 1));
						System.out.println("最大攻撃力:"
								+ (h.getAttackPowerTable(h.getLevel() - 1))
								+ "(+" + plusATK + ")");
						System.out.println("現在HP:" + h.getHp());
						System.out.println("現在EXP:" + h.getExp());
						System.out.println("所持ゴールド :" + h.getGold());
						System.out.println("現在LEVEL:" + h.getLevel());
						try {
							Thread.sleep(1500);
						} catch (InterruptedException ee) {

						}
						System.out.println("");
						continue;
					case 1:
						System.out.println("Fishのステータス");
						System.out.println("最大HP:" + e[in].getHp());
						System.out.println("最大攻撃力:30");
						System.out.println("獲得ゴールド:10～20");
						System.out.println("獲得経験値:25");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException ee) {

						}
						System.out.println("");
						continue;
					case 2:
						System.out.println("Wolfのステータス");
						System.out.println("最大HP:" + e[in].getHp());
						System.out.println("最大攻撃力:50");
						System.out.println("獲得ゴールド:20～40");
						System.out.println("獲得経験値:50");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException ee) {

						}
						System.out.println("");
						continue;
					case 3:
						System.out.println("Birdのステータス");
						System.out.println("最大HP:" + e[in].getHp());
						System.out.println("最大攻撃力:200");
						System.out.println("獲得ゴールド:70～150");
						System.out.println("獲得経験値:80");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException ee) {

						}
						System.out.println("");
						continue;
					case 4:
						System.out.println("Beetleのステータス");
						System.out.println("最大HP:" + e[in].getHp());
						System.out.println("獲得ゴールド:100～200");
						System.out.println("獲得経験値:100");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException ee) {

						}
						System.out.println("");
						continue;
					case 5:
						System.out.println("ボスのステータス");
						System.out.println("最大HP:??????");
						System.out.println("獲得ゴールド:?????");
						System.out.println("獲得経験値:??????");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException ee) {

						}
						System.out.println("");
						continue;
					default:
						break;
					}
					break;
				}
			} else if (select == 3) {
				while (x > 0) {
					System.out.println("無印良品へようこそ！");
					System.out.println("何をお買い求めですか？");
					System.out.println("所持金:" + h.getGold() + "G");
					System.out.println("1:ポーション　2:エリクサー　3:武器　4:店を出る");
					// h.setGold(1000);
					int shop = new java.util.Scanner(System.in).nextInt();
					switch (shop) {
					case 1:
						System.out.println("いくつ買いますか？(1G=1HP) 0:やめる");
						int heal = new java.util.Scanner(System.in).nextInt();
						if (heal == 0)
							continue;
						/*
						 * else if("m".equals(strHeal)){
						 * System.out.println("HPを全回復しました。");
						 * h.setHp(h.getMaxHpTable(h.getLevel()-1)-h.getHp());
						 * continue; }
						 */

						if (h.getHp() == h.getMaxHpTable(h.getLevel() - 1)) {
							System.out.println("すでにHPは満タンのようですね！");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ee) {

							}
							continue;
						}
						if (heal <= h.getGold()) {
							int recover = Math.min(
									h.getMaxHpTable(h.getLevel() - 1)
											- h.getHp(), heal);
							h.setHp(h.getHp() + recover);
							h.setGold(h.getGold() - heal);
							System.out.println(h.getName() + "は" + heal
									+ "回復した");
							System.out.println("またお越しくださいませ！");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ee) {

							}
							continue;
						} else if (heal > h.getGold()) {
							System.out.println("金足んねえぞ");
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ee) {

							}
							continue;
						}
					case 2:
						System.out.println("エリクサーは5000Gになります 1:購入 2:やめる");
						int stop = new java.util.Scanner(System.in).nextInt();
						if (stop >= 2)
							continue;
						else {
							int elicser = 5000;
							try {
								Thread.sleep(1000);
							} catch (InterruptedException ee) {

							}
							if (h.getGold() - elicser >= 0) {

								if (haveElicser) {
									System.out
											.println("既にお持ちのようですのでお売りすることはできません！");
									continue;
								} else {
									System.out.println(h.getName()
											+ "はエリクサーを購入した");
									haveElicser = true;
									System.out.println("またお越しくださいませ！");
								}
								try {
									Thread.sleep(2000);
								} catch (InterruptedException ee) {

								}
								continue;
							} else if (h.getGold() - elicser < 0) {
								System.out.println("金足りねえぞ茶化しに来たのか我こら");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException ee) {

								}
								continue;
							}
						}
					case 3:
						System.out.println("0:購入 1:売却 2:やめる");
						int selectShop = new java.util.Scanner(System.in)
								.nextInt();
						if (selectShop >= 2)
							continue;
						if (selectShop == 0) {
							System.out.println("どの武器にしますか？");
							for (Weapon item : w) {
								System.out.print(item.getName() + ":");
								System.out.println("攻撃力"
										+ item.getAttackPower());
								System.out.println("売値 ---- "
										+ item.getBuyGold() + "G");
								System.out.println("");
							}
							System.out.println("0:ダガー 1:ソード 2:メイス 4:やめる");
							buyWeapon = new java.util.Scanner(System.in)
									.nextInt();
							if (buyWeapon >= 4)
								continue;
							if (h.getGold() >= w[buyWeapon].getBuyGold()) {
								weaponName = w[buyWeapon].getName();
								plusATK = w[buyWeapon].getAttackPower();
								h.setGold(h.getGold()
										- w[buyWeapon].getBuyGold());
								System.out.println("お買い上げありがとうございます！");
								System.out.println("");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException ee) {

								}
							} else {
								System.out.println("おい金足りねえぞ");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException ee) {

								}
								continue;
							}
						} else if (selectShop == 1) {
							if ("無し".equals(weaponName)) {
								System.out.println("武器を所持していません");
								continue;
							} else {
								System.out.println("所持中：" + weaponName);
								System.out.println("0:所持中の武器を売却 1:閉じる");
								int selectNum = new java.util.Scanner(System.in)
										.nextInt();
								if (selectNum == 0) {
									h.setGold(h.getGold()
											+ w[buyWeapon].getSellGold());
									plusATK = 0;
								}
								System.out.println(weaponName + "を売却しました");
								weaponName = "無し";
							}
						}
						continue;
					default:
						System.out.println("またのご来店お待ちしております。！");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException ee) {

						}
						System.out.println("");
						break;
					}
					break;
				}
			}
		}
		/*------------------------------ゲームエンド---------------------------------------------------*/
		System.out.println("ゲームを終了します。");
	}
}
