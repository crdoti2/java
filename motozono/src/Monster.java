
public abstract class Monster {
	private String name;
	private int gold;
	private int exp;
	private int hp;
	
	Monster(String name, int gold, int exp, int hp){
		this.name = name;
		this.gold = gold;
		this.exp = exp;
		this.hp = hp;
	}
	/*Monster(String name, int hp) {
		this(name,0, 0, hp);
	}*/
	
	public abstract void run();
	public abstract void attack(Hero h);
	public abstract int getAttack();
	
	public int getHp() {
		return hp;
	}
	public int getExp() {
		return exp;
	}
	public int getGold() {
		return gold;
	}
	public String getName() {
		return name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setExp(int exp){
		this.exp = exp;
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public void exp(Hero h){
		h.setExp(this.exp + h.getExp());
	}
	
	public void gold(Hero h){
		h.setGold(this.gold + h.getGold());
	}
}
