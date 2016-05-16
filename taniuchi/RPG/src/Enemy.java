import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Enemy implements Monster {

	private final String URL = "jdbc:mysql://localhost:3306/rpg";
	private final String USER = "root";
	private final String PW = "";
	private Connection con = null;
	private PreparedStatement insert = null;
	private ResultSet rs = null;

	private int hp;
	private int exp;
	private String name;
	public static int takeDamage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	protected void writeDamege() {

		String sql = "insert into monster (name,damege,time) values(?,?,now())";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);
			insert = con.prepareStatement(sql);
			insert.setString(1, getName());
			insert.setInt(2, takeDamage);
			int i = insert.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}

	protected void writeKillGold() {
		final String URL = "jdbc:mysql://localhost:3306/rpg";
		final String USER = "root";
		final String PW = "";
		Connection con = null;
		PreparedStatement insert = null;
		ResultSet rs = null;
		String sql = "INSERT INTO `monster`(`name`, `kill`, `gold`) values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);
			insert = con.prepareStatement(sql);
			insert.setString(1, getName());
			insert.setInt(2, 1);
			insert.setInt(3, gold());
			int i = insert.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}

	public void getData() {
		final String URL = "jdbc:mysql://localhost:3306/rpg";
		final String USER = "root";
		final String PW = "";
		Connection con = null;
		PreparedStatement select = null;
		ResultSet rs = null;
		String sql = "SELECT round(AVG(`damege`),0) as avgdame, SUM(`kill`) as sumkill, SUM(`gold`) as sumgold, `name` FROM `monster`  GROUP by name";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PW);
			select = con.prepareStatement(sql);
			rs = select.executeQuery();
			if(rs.next()){
				while (rs.next()) {
					System.out.println("モンスター名:" + rs.getString("name")
							+ " 平均ダメージ:" + rs.getInt("avgdame") + " 討伐合計:"
							+ rs.getInt("sumkill") + " 獲得ゴールド合計:"
							+ rs.getInt("sumgold"));
				}
			}else
				System.out.println("データがありません");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}
}
