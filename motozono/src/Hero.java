
public class Hero {
	String name;
	int hp;
	int exp;
	int level;
	int gold;
	int attack;
	int kaihuku;

	
	private final int MAX_HP[] = {100, 300, 400, 500, 600, 700, 800, 
			900, 1000, 1100, 1200, 1400, 1600, 2000, 2500, 3000, 5000, 7000};
	private final int MAX_ATTACK[] = {30, 40, 70, 100, 300, 500, 800, 
			1000, 1300, 1600, 2000, 2500, 3000, 4000, 5000, 6000, 7000, 8000};
	private final int MAX_EXP[] = {100, 200, 300, 500, 700, 1000, 1500,
			2000, 3000, 4500, 7000, 10000, 14000, 20000, 30000, 40000, 60000, 80000};
	private final int MAX_GOLD[] ={0, 100, 200, 300, 400, 500, 600,
			700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600, 1700};
	Hero() {
		this.hp = MAX_HP[0];
		this.exp = MAX_EXP[0];
		this.attack = MAX_ATTACK[0];
		this.level = 0;
		this.gold = MAX_GOLD[0];
		this.kaihuku = 1000;
		}
	
	
	public void attack(Monster m) {
		System.out.println("神威零式・不知火斬月:" + this.attack + "のダメージ！！！");
		m.setHp(m.getHp() - this.attack) ;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getExp() {
		return exp;
	}
	
	public void setExp(int exp){
		this.exp = exp;
	}
	
	public int getGold(){
		return gold;
	}
	
	public void setGold(int gold){
		this.gold = gold;
	}
	
	public int getLevel(){
		return level;
	}
	public void Level(){
		while(true){
			if(level == 18){
				break;
			}
			if(exp >= MAX_EXP[level + 1]){
				level++;
				this.attack = MAX_ATTACK[level];
				this.hp = MAX_HP[level];
				System.out.println("LvUp！");
			}else{
				break;
			}
		}
	}
	public void Kaihuku(){
		if(gold >= 300) {
			System.out.println("300ゴールド消費して1000回復します");
			this.hp += this.kaihuku;
			if(this.hp >= MAX_HP[level]) {
				this.hp = MAX_HP[level];
			}
			this.gold -= 300;
		}else{
			System.out.println("初期金が足りません(´・ω・｀)");
		}
	}
}


