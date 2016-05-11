import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


	class Rode {
	public void rode() throws Exception {
				Connection conn = null;
				PreparedStatement ps = null;

				String path = "jdbc:mysql://localhost:3306/save_point?useSSL=false&requireSSL=false"; // 接続パス
				String id = "root"; // ログインID
				String pw = "aho"; // ログインパスワード

				// SQL文を定義する
				String sql = "SELECT  savepoint SET name = ?, level = ?, hp = ?, Gold= ?";

				try {
					Class.forName("com.mysql.jdbc.Driver");

					conn = DriverManager.getConnection(path, id, pw);
					conn.setAutoCommit(false);

					ps = conn.prepareStatement(sql);


					Hero h = new Hero();
					ps = conn.prepareStatement(sql);
					ps.setString(1, h.getName());
					ps.setInt(2, h.getLevel());
					ps.setInt(3, h.getHp());
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
