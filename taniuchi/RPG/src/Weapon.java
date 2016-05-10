public abstract class Weapon implements item {

	private int attackPower;
	private int buyGold;
	private int sellGold;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getBuyGold() {
		return buyGold;
	}

	public void setBuyGold(int buyGold) {
		this.buyGold = buyGold;
	}

	public int getSellGold() {
		return sellGold;
	}

	public void setSellGold(int sellGold) {
		this.sellGold = sellGold;
	}

}
