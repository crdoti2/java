public class Meis extends Weapon{

	private int attackPower = 30;
	private int buyGold = 200;
	private int sellGold = 100;
	private String name = "メイス";


	public Meis(){
		super.setName(this.name);
		super.setAttackPower(this.attackPower);
		super.setBuyGold(this.buyGold);
	}

	public String getName() {
		return super.getName();
	}

	public int getAttackPower() {
		return super.getAttackPower();
	}

	public int getBuyGold() {
		return super.getBuyGold();
	}

	public int getSellGold() {
		return super.getSellGold();
	}
}
