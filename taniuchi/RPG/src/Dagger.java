public class Dagger extends Weapon {
	private int attackPower = 15;
	private int buyGold = 100;
	private int sellGold = 50;
	private String name = "ダガー";


	public Dagger(){
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
