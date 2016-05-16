package test_game2.Hero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import test_game2.Monster.Monster;
import test_game2.Protecter.Normal;
import test_game2.Sword.Fragarach;

public class Hero {

	// 変数の宣言
	private int exp;
	private int hp;
	private int mp;
	private int level;
	private int gold;
	private int sword;
	private int protecter;

	private ArrayList<String> log;

	// 定数の宣言
	private final int MAX_EXP[] = {    0,  100,   200,   300,   500,   700,  1000,  1500,  2000,   3000, 
									4500, 7000, 10000, 14000, 20000, 30000, 40000, 60000, 80000, 100000, 1000000000};
	private final int MAX_HP[]  = {    0,  200,   300,   400,   500,   600,   700,   800,   900,   1000,
									1100, 1200,  1400,  1600,  2000,  2500,  3000,  5000,  7000,   9000};
	private final int MAX_MP[]  = {    0,   50,    75,   100,   125,   150,   175,   200,   230,    250,
									 300,  350,   400,   450,   500,   600,   750,   900,  1200,   1500};
	private final int ATTACK[]  = {    0,   30,    40,    70,   100,   300,   500,   800,  1000,   1300,
									1600, 2000,  2500,  3000,  4000,  5000,  6000,  7000,  8000,   9000};
	private final int MAX_LEVEL = 19;

	// コンストラクタ
	public Hero() {
		this.hp = MAX_HP[1];
		this.mp = MAX_MP[1];
		this.exp = MAX_EXP[1];
		this.level = 1;
		this.gold = 1000;
		this.sword = new Fragarach().getAttack();
		this.protecter = new Normal().getDefense();
		this.log = new ArrayList<String>(); 
	}

	// attackメソッド
	public boolean attack(Monster m) {
		int totalHeroAttack = 0;
		int totalEnemyAttack = 0;
		while(true) {
			// 変数の宣言
			int attack;
			int random;
			int playerHp;
			int enemyHp;

			// どちらかのHPが0以下
			if(m.getHp() <= 0 || this.hp <= 0 ) {
				break;
			}

			// プレイヤー：敵の確率で攻撃（確率は敵が所持  例 7:3, 5:5）
			int turn = new java.util.Random().nextInt(10);

			// プレイヤーの攻撃
			if(turn >= m.getHit()) {
				System.out.printf("プレイヤーの攻撃！\n");

				random = new java.util.Random().nextInt
						((int)((float)(this.ATTACK[level] + this.sword) * 0.2f));

				attack = (int) (((float)
						(this.ATTACK[level] + this.sword) * 0.8f) + (float)random);

				System.out.printf("%dダメージ！\n", attack);
				totalHeroAttack += attack;
				enemyHp = m.getHp() - attack;
				if(enemyHp <= 0) { enemyHp = 0; }
				m.setHp(enemyHp); 
			}
			// 敵の攻撃
			else
			{
				System.out.printf("%sの攻撃！\n", m.getName());
				m.attack();
				attack = m.getAttack();
				System.out.printf("%dダメージ！\n", attack);
				totalEnemyAttack += attack;
				playerHp = this.hp - attack;
				if(playerHp <= 0) { playerHp = 0; }
				this.hp = playerHp; 
			}
			if(this.mp < MAX_MP[level]) {
				this.mp += 10;
			}
		}
		System.out.printf("\n総与ダメージ：%d\n", totalHeroAttack);
		System.out.printf("総被ダメージ：%d\n\n", totalEnemyAttack);
		if(this.hp <= 0) { return false; }
		return true;
	}

	// レベル確認メソッド
	public void levelConfirmation() {
		while(true) {
			if(level == MAX_LEVEL) {
				break;
			}
			if(exp >= MAX_EXP[level + 1]) {
				level++;
				System.out.println("レベルがアップした！");
				this.hp = MAX_HP[level] * protecter;
				this.mp = MAX_MP[level];
			} else {
				System.out.printf("現在のレベル:%d\n", level);
				break;
			}
		}
	}

	// プレイヤー状態確認メソッド
	public void HeroStatus() {
		int i;

		// レベル
		System.out.printf("Lv.%d\n", this.level);

		// HPゲージ
		int maxHp = this.getMaxHp(); 
		System.out.printf("HP:%5d/%5d", this.hp, this.getMaxHp());
		for(i = 0; i < maxHp; i++) {
			if(i % 500 == 0){
				if(this.hp >= i) {
					System.out.printf("■");
				} else {
					System.out.printf("□");
				}
			}
		}
		System.out.printf("\n");

		// MPゲージ
		int maxMp = this.getMaxMp(); 
		System.out.printf("MP:%5d/%5d", this.mp, this.getMaxMp());
		for(i = 0; i < maxMp; i++) {
			if(i % 50 == 0){
				if(this.mp >= i) {
					System.out.printf("■");
				} else {
					System.out.printf("□");
				}
			}
		}
		System.out.printf("\n");

		System.out.printf("EXP:%d ATTACK:%d GOLD:%d\n", this.exp, this.getAttack(), gold);
		System.out.printf("\n");

	}

	// 魔法での回復メソッド
	public void aid() {
		System.out.println("回復魔法を唱えた！");
		int aid = new java.util.Random().nextInt(200);
		aid += 400;
		System.out.printf("HPが%d回復した！\n", aid);
//		setLog("MP50消費してHPを" + aid + "回復しました");
		if(hp + aid >= MAX_HP[level] * protecter) {
			hp = MAX_HP[level] * protecter;
		} else {
			hp += aid;
		}
		mp -= 50;
	}
	// 宿での回復メソッド
	public void InnAid() {
		System.out.println("宿に泊まった！");
		int aid = MAX_HP[level] * protecter - this.hp;
		this.hp = MAX_HP[level] * protecter;
		System.out.printf("HPが%d回復した！\n", aid);
//		setLog("1000Gold消費してHPを" + aid + "回復しました");
		this.gold -= 1000;
	}

	// HPチェックメソッド
	public void hpCheck() {
		if(this.hp >= MAX_HP[level] * protecter ) {
			this.hp = MAX_HP[level] * protecter;
		}
	}

	// MySQLでデータをロード
	public void LoadData(int input) {

		String sql = "SELECT * FROM hero_table2";
		int i = 1;
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Game_db?useUnicode=true&characterEncoding=EUC_JP&useSSL=false&requireSSL=false", "root", "1234");
			stmt = con.createStatement();
			result = stmt.executeQuery(sql);

			while(result.next()) {

				if(i == input) {
					this.setExp(result.getInt(2));
					this.setHp(result.getInt(3));
					this.setMp(result.getInt(4));
					this.setLevel(result.getInt(5));
					this.setGold(result.getInt(6));
					this.setSword(result.getInt(7));
					this.setProtecter(result.getInt(8));

					System.out.printf("%2d番目\n", result.getInt(1));
					System.out.printf("EXP       : %6d\n", this.exp);
					System.out.printf("HP        : %6d\n", this.hp);
					System.out.printf("MP        : %6d\n", this.mp);
					System.out.printf("Level     : %6d\n", this.level);
					System.out.printf("Gold      : %6d\n", this.gold);
					System.out.printf("Sword     : %6d\n", this.sword);
					System.out.printf("Protecter : %6d\n", this.protecter);

					System.out.println("");
				}
				i++;
			}
		} catch (InstantiationException | IllegalAccessException
											| ClassNotFoundException e1) {
			// 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (SQLException e2) {
			//  自動生成された catch ブロック
			e2.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e3) {
					// 自動生成された catch ブロック
					e3.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e4) {
					// 自動生成された catch ブロック
					e4.printStackTrace();
				}
			}
			if(result != null) {
				try {
					result.close();
				} catch (SQLException e5) {
					// 自動生成された catch ブロック
					e5.printStackTrace();
				}
			}
		}
	}

	// MySQLで現在のデータを確認する
	public int TableCheck() {

		String sql = "SELECT * FROM hero_table2";
		int i = 1;
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Game_db?useUnicode=true&characterEncoding=EUC_JP&useSSL=false&requireSSL=false", "root", "1234");
			stmt = con.createStatement();
			result = stmt.executeQuery(sql);

			while(result.next()) {

				// 経験値が0の場合は表示しない
				// だが実際には1～10まで存在している
				if(result.getInt(2) != 0){
					System.out.printf("%2d, ", result.getInt(1));
					System.out.printf("Exp : %6d, ", result.getInt(2));
					System.out.printf("HP : %5d, ", result.getInt(3));
					System.out.printf("MP : %4d, ", result.getInt(4));
					System.out.printf("Level : %2d, ", result.getInt(5));
					System.out.printf("Gold : %6d, ", result.getInt(6));
					System.out.printf("Sword : %3d, ", result.getInt(7));
					System.out.printf("Protecter : %d\n", result.getInt(8));

					i++;
				}
			}

		} catch (InstantiationException | IllegalAccessException
											| ClassNotFoundException e1) {
			// 自動生成された catch ブロック
			e1.printStackTrace();
		} catch (SQLException e2) {
			//  自動生成された catch ブロック
			e2.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e3) {
					// 自動生成された catch ブロック
					e3.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e4) {
					// 自動生成された catch ブロック
					e4.printStackTrace();
				}
			}
			if(result != null) {
				try {
					result.close();
				} catch (SQLException e5) {
					// 自動生成された catch ブロック
					e5.printStackTrace();
				}
			}
		}
		return i;
	}

	// MySQLでデータをセーブ
	public void UpdateSaveData(int input){

		String sql = "UPDATE hero_table2 SET exp = " + exp + ", hp = " + hp + ", mp = " + mp + ", level = " + level +
								", gold = " + gold + ", sword = " + sword + ", protecter = " + protecter + " WHERE id = " + input;

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Game_db?useUnicode=true&characterEncoding=EUC_JP&useSSL=false&requireSSL=false", "root", "1234");
			con.setAutoCommit(false);

			stmt = con.createStatement();
			int j = stmt.executeUpdate(sql);

			//処理件数を表示する
            System.out.printf("\n処理件数：%d\n", j);

			con.commit();

		} catch (Exception e1) {

			try {
				con.rollback();
				System.out.println("コミット出来ませんでした、ロールバックします");
			} catch (SQLException e2) {
				// 自動生成された catch ブロック
				e2.printStackTrace();
			}
			e1.printStackTrace();

		} finally {
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e3) {
					// 自動生成された catch ブロック
					e3.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e4) {
					// 自動生成された catch ブロック
					e4.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e5) {
					// 自動生成された catch ブロック
					e5.printStackTrace();
				}
			}
		}
	}

	// ゲッターセッターメソッド
	public int getExp() {
		return this.exp;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}	
	public int getLevel() {
		return this.level;
	}
	public int getAttack() {
		return this.ATTACK[level];
	}
	public int getGold() {
		return this.gold;
	}
	public int maxLevel() {
		return MAX_LEVEL;
	}
	public int getMaxHp() {
		return MAX_HP[level] * protecter;
	}
	public int getMaxMp() {
		return MAX_MP[level];
	}
	public ArrayList<String> getLog() {
		return log;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setSword(int sword) {
		this.sword = sword;
	}
	public void setProtecter(int protecter) {
		this.protecter = protecter;
	}
	public void setLog(String move) {
		log.add(move);
	}
}
