import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Save {
	PreparedStatement update = null;
	Connection con = null;

	public void save(){
		Human h = new Hero(Main.name);
		Weapon[] w = new Weapon[3];
		w[0] = new Dagger();
		w[1] = new Sowrd();
		w[2] = new Meis();

		//set
		try {
			update= con.prepareStatement("update player set ?=?,?=?,?=?,?=?,?=? where ?=? ?=? ?=? ?=? ?=?");
			update.setString(1,"name");
			update.setString(2, h.getName());
			update.setString(3,"hp");
			update.setInt(4,h.getHp());
			update.setString(5,"gold");
			update.setInt(6,h.getGold());
			update.setString(7,"exp");
			update.setInt(8,h.getExp());
			//where
			update.setString(11, "name");
			update.setString(12,"未使用");
			update.setString(13, "hp");
			update.setInt(14, 0);
			update.setString(15, "gold");
			update.setInt(16,0);
			update.setString(17, "exp");
			update.setInt(18, 0);

			switch(Main.buyWeapon){
			case 0:
				update.setString(9,"weapon");
				update.setString(10,"ダガー");
				update.setString(19, "weapon");
				update.setString(20, "なし");
				break;
			case 1:
				update.setString(9,"weapon");
				update.setString(10,"ソード");
				update.setString(19, "weapon");
				update.setString(20, "なし");
				break;
			case 2:
				update.setString(9,"weapon");
				update.setString(10,"メイス");
				update.setString(19, "weapon");
				update.setString(20, "なし");
			default:
				update.setString(9,"weapon");
				update.setString(10,"なし");
				update.setString(19, "weapon");
				update.setString(20, "なし");
			}


			update.executeUpdate();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
