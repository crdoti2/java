import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class Date {
	public void data() throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;

		//sqlの情報やつ
		String path = "jdbc:mysql://localhost:3306/save_point?useSSL=false&requireSSL=false"; // 接続パス
		String id = "root"; // ログインID
		String pw = "aho"; // ログインパスワード

		//書き換えるやつ
		String sql = "UPDATE savepoint SET name = ?, level = ?, hp = ?, Gold= ?";

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(path, id, pw);
			conn.setAutoCommit(false);

			Hero h = new Hero();

			ps = conn.prepareStatement(sql);

			//なんか違う
			for(int q = 0; q <= 10; q++){
			ps.setString(1, h.getName() + q );
			}
			ps.setInt(2, h.getLevel());
			ps.setInt(3, h.getMaxHp());
			ps.setInt(4, h.getGold());

			int i = ps.executeUpdate();

			conn.commit();

		} catch (Exception ex) {
			conn.rollback();
			ex.printStackTrace();

		} finally {
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		}
	}
}
