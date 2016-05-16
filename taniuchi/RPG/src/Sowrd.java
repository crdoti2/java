public class Sowrd extends Weapon {
	private int attackPower = 50;
	private int buyGold = 500;
	private int sellGold = 250;
	private String name = "ソード";

	public Sowrd() {
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
