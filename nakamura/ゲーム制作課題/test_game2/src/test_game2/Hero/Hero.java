package test_game2.Hero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	}

	// attackメソッド
	public boolean attack(Monster m) {
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

			// プレイヤ：敵が７：３の確率で攻撃
			int turn = new java.util.Random().nextInt(10);

			// プレイヤの攻撃
			if(turn >= m.getHit()) {
				System.out.printf("プレイヤーの攻撃！\n");

				random = new java.util.Random().nextInt
						((int)((float)(this.ATTACK[level] + this.sword) * 0.2f));

				attack = (int) (((float)
						(this.ATTACK[level] + this.sword) * 0.8f) + (float)random);

				System.out.printf("%dダメージ！\n", attack);
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
				playerHp = this.hp - attack;
				if(playerHp <= 0) { playerHp = 0; }
				this.hp = playerHp; 
			}
			if(this.mp < MAX_MP[level]) {
				this.mp += 5;
			}
		}
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

	// 回復メソッド
	public void aid() {
		System.out.println("回復魔法を唱えた！");
		int aid = new java.util.Random().nextInt(150);
		aid += 150;
		System.out.printf("HPが%d回復した！\n", aid);
		if(hp + aid >= MAX_HP[level] * protecter) {
			hp = MAX_HP[level] * protecter;
		} else {
			hp += aid;
		}
		mp -= 50;
	}

	// HPチェックメソッド
	public void hpCheck() {
		if(this.hp >= MAX_HP[level] * protecter ) {
			this.hp = MAX_HP[level] * protecter;
		}
	}

	// MySQLでデータをロード
	public void LoadData(int input) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		String sql = "SELECT * FROM hero_table2";
		int i = 1;

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Game_db?useUnicode=true&characterEncoding=EUC_JP&useSSL=false&requireSSL=false", "root", "1234");
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(sql);

		while(result.next()) {

			if(i == input) {
				this.setExp(result.getInt(2));
				this.setHp(result.getInt(3));
				this.setMp(result.getInt(4));
				this.setLevel(result.getInt(5));
				this.setGold(result.getInt(6));
				this.setSword(result.getInt(7));
				this.setProtecter(result.getInt(8));

				System.out.printf("ID        : %6d\n", result.getInt(1));
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

		con.close();
		stmt.close();
		result.close();
	}

	// MySQLでデータをロード
	public int TableCheck() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		String sql = "SELECT * FROM hero_table2";
		int i = 1;

		Class.forName("com.mysql.jdbc.Driver").newInstance();

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Game_db?useUnicode=true&characterEncoding=EUC_JP&useSSL=false&requireSSL=false", "root", "1234");
		Statement stmt = con.createStatement();
		ResultSet result = stmt.executeQuery(sql);

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

		con.close();
		stmt.close();
		result.close();

		return i;
	}

	// MySQLでデータをセーブ
	public void UpdateSaveData(int input) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

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

		} catch (Exception e) {

			con.rollback();
			e.printStackTrace();

		} finally {
			if(con != null) {
				con.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(rs != null) {
				rs.close();
			}
		}
	}
/*
 * 新規フィールド追加する予定だったもの
 * 
 * 元々フィールド作成しておき、値が入っていないものは
 * 表示させず変更も出来ないように修正したため、
 * UPDATE文のみで十分になった
 * 
	// MySQLでデータをセーブ
	public void NewSaveData() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		String sql = "INSERT INTO hero_table2 (exp, hp, mp, level, gold, sword, protecter) value (?, ?, ?, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement ps = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Game_db?useUnicode=true&characterEncoding=EUC_JP&useSSL=false&requireSSL=false", "root", "1234");
			con.setAutoCommit(false);
	
			ps = con.prepareStatement(sql);
			ps.setInt(2, exp);
			ps.setInt(3, hp);
			ps.setInt(4, mp);
			ps.setInt(5, level);
			ps.setInt(6, gold);
			ps.setInt(7, sword);
			ps.setInt(8, protecter);
	
			int i = ps.executeUpdate();

			//処理件数を表示する
            System.out.println("処理件数：" + i);

			con.commit();

		} catch (Exception e) {

			con.rollback();
			e.printStackTrace();

		} finally {
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
		}
	}
*/
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
}
