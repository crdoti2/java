import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hero {
	String name;
	int hp;
	int exp;
	int level;
	int gold;
	int attack;
	int kaihuku;

	
	private final int MAX_HP[] = {100, 300, 400, 500, 600, 700, 800, 
			900, 1000, 1100, 1200, 1400, 1600, 2000, 2500, 3000, 5000, 7000};
	private final int MAX_ATTACK[] = {30, 40, 70, 100, 300, 500, 800, 
			1000, 1300, 1600, 2000, 2500, 3000, 4000, 5000, 6000, 7000, 8000};
	private final int MAX_EXP[] = {100, 200, 300, 500, 700, 1000, 1500,
			2000, 3000, 4500, 7000, 10000, 14000, 20000, 30000, 40000, 60000, 80000};
	private final int MAX_GOLD[] ={0, 100, 200, 300, 400, 500, 600,
			700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700};
	Hero() {
		this.hp = MAX_HP[0];
		this.exp = MAX_EXP[0];
		this.attack = MAX_ATTACK[0];
		this.level = 0;
		this.gold = MAX_GOLD[0];
		this.kaihuku = 1000;
		}
	
	
	public void attack(Monster m) {
		System.out.println("神威零式・不知火斬月:" + this.attack + "のダメージ！！！");
		m.setHp(m.getHp() - this.attack) ;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp){
		this.exp = exp;
	}
	
	public int getGold(){
		return gold;
	}

	// MySQLでロードするメソッド
	public void LoadData(int input) {
		String sql = "SELECT * FROM sl";
		String path = "jdbc:mysql://localhost:3306/rpg?useSSL=false&requireSSL=false";
		String id = "root";
		String pw = "shinyo0331";
		int i = 1;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(path,id,pw);
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()){
				if(input == i){
					this.name = rs.getString(2);
					this.hp = rs.getInt(3);
					this.exp = rs.getInt(4);
					this.gold = rs.getInt(5);
					this.attack = rs.getInt(6);
				}
				i++;
			}
			
			conn.commit();
		}catch(Exception ex){
			try {
				conn.rollback();
			} catch (SQLException e) {
				// 自動生成された catch ブロック
				e.printStackTrace();
			}
			ex.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					//  自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					//  自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}


	// MySQLで確認するメソッド
	public void CheckData() {
		String sql = "SELECT * FROM sl";
		String path = "jdbc:mysql://localhost:3306/rpg?useSSL=false&requireSSL=false";
		String id = "root";
		String pw = "shinyo0331";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(path,id,pw);
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()){
				int no = rs.getInt(1);
				String name = rs.getString(2);
				int hp = rs.getInt(3);
				int exp = rs.getInt(4);
				int gold = rs.getInt(5);
				int attack = rs.getInt(6);
				System.out.printf("%d, %s, hp:%d, exp:%d, gold:%d, attack:%d\n", no, name,  hp, exp, gold, attack);
			}
			
			conn.commit();
		}catch(Exception ex){
			try {
				conn.rollback();
			} catch (SQLException e) {
				// 自動生成された catch ブロック
				e.printStackTrace();
			}
			ex.printStackTrace();
		}finally{
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					// 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					//  自動生成された catch ブロック
					e.printStackTrace();
				}
			}
			if(rs != null){
				try {
					rs.close();
				} catch (SQLException e) {
					//  自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}

	// MySQLでセーブするメソッド
	public void SaveData(int i) {
		String sql = "UPDATE sl SET name = ?,  hp = ?, exp = ?, gold = ?, attack = ? WHERE no = ?";
		String path = "jdbc:mysql://localhost:3306/rpg?useSSL=false&requireSSL=false";
		String id = "root";
		String pw = "shinyo0331";

		Connection conn = null;
		PreparedStatement ps = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(path,id,pw);
			conn.setAutoCommit(false);

			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, hp);
			ps.setInt(3, exp);
			ps.setInt(4, gold);
			ps.setInt(5, attack);
			ps.setInt(6, i);
		
			int o = ps.executeUpdate();
			
			conn.commit();
		}catch(Exception ex){
			try {
				conn.rollback();
			} catch (SQLException e) {
				// 自動生成された catch ブロック
				e.printStackTrace();
			}
			ex.printStackTrace();
		}finally{
			if(ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
					// 自動生成された catch ブロック
					e.printStackTrace();
				}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// 自動生成された catch ブロック
					e.printStackTrace();
				}
		}
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public int getLevel(){
		return level;
	}
	public void Level(){
		while(true){
			if(level == 18){
				break;
			}
			if(exp >= MAX_EXP[level + 1]){
				level++;
				this.attack = MAX_ATTACK[level];
				this.hp = MAX_HP[level];
				System.out.println("LvUp！");
			}else{
				break;
			}
		}
	}
	public void Kaihuku(){
		if(gold >= 300) {
			System.out.println("300ゴールド消費して1000回復します");
			this.hp += this.kaihuku;
			if(this.hp >= MAX_HP[level]) {
				this.hp = MAX_HP[level];
			}
			this.gold -= 300;
		}else{
			System.out.println("初期金が足りません(´・ω・｀)");
		}
	}
}