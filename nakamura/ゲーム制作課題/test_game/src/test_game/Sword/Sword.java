package test_game.Sword;

public abstract class Sword {

	private String name;
	private int forLevel;
	private int attack;

	Sword(String name, int forLevel, int attack) {
		this.name = name;
		this.forLevel = forLevel;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}

	public int getForLevel() {
		return forLevel;
	}

	public int getAttack() {
		return attack;
	}
}
