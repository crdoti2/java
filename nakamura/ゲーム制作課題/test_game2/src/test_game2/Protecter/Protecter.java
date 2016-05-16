package test_game2.Protecter;

public class Protecter {

	private String name;
	private int defense;
	private int forLevel;

	Protecter(String name, int defense, int forLevel) {
		this.name = name;
		this.defense = defense;
		this.forLevel = forLevel;
	}

	public String getName() {
		return name;
	}

	public int getDefense() {
		return defense;
	}
	public int getForLevel(){
		return forLevel;
	}

}