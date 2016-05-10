package kadai0425;

public class Hero {

	static final  String NAME = "ヒーロー";
	


	private int level = 1;
	private int hp = 200;
	private int maxHp = 200;
	private int attackPower = 30;
	private int gold = 0;
	private int omamori = 0;
	
	private int exp = 100;
	
	
	public static String getName() {
		return NAME;
	}

	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
	 this.hp = hp;
		
	}

	

	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public void addExp(Monster m){
		this.exp += m.getExp(); 
	}
	
	
	public int getGold() {
		return gold;
	}
	
	


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getOmamori() {
		return omamori;
	}


	public void setOmamori(int omamori) {
		this.omamori = omamori;
	}


	public void addGold(Monster m){
		this.gold += m.getGold(); 
	}

	public void attack(Monster m) {
		m.setHp(m.getHp() - this.attackPower);
		//HPが0未満になったら0に設定する
				if(m.getHp()<0) m.setHp(0);

	}

}
