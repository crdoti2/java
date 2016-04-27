package kadai0425;

public abstract class Monster {

	public abstract String getName();

	public abstract int getHp();

	public abstract void setHp(int hp);

	public abstract int getAttackRate();

	public abstract int getMinAttackPower();

	public abstract void attack(Hero h);
	
	public abstract int getDamage();
	
	public abstract int getExp();
	
	public abstract int getGold();
	
	public abstract void dropGold();

	public abstract void run();
}
