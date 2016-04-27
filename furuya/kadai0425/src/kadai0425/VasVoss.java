package kadai0425;

import java.util.Random;

public class VasVoss extends Monster{
	
	static final  String NAME = "VasVoss";
	private int hp = 20000;
	static final int ATTACK_RATE = 50;
	static final int MIN_ATTACK_POWER = 1500;
	private int damage = 0;
	
	
	@Override
	public int getHp() {
		return this.hp;
	}
	
	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public int getAttackRate() {
		return ATTACK_RATE;
	}
	
	@Override
	public int getMinAttackPower() {
		return MIN_ATTACK_POWER;
	}
	
	@Override
	public int getDamage() {
		return damage;
	}

	
	
	@Override
	public void attack(Hero h) {
		System.out.println(this.NAME+"の火炎攻撃");
		Random rnd = new Random();
		int ran = rnd.nextInt(1501); 
		//1500～3000のダメージを設定
		damage = ran +  this.MIN_ATTACK_POWER;
		h.setHp(h.getHp() - damage);
		//HPが0未満になったら0に設定する
		if(h.getHp()<0) h.setHp(0);
	}

	@Override
	public void run() {
		System.out.println(this.NAME+"は大きな音をたてて倒れ、逃げ去りました");
		
	}

	@Override
	public int getExp() {
		
		return 0;
	}

	@Override
	public int getGold() {
		
		return 0;
	}

	@Override
	public void dropGold() {
		
		
	}
	

	

}
