package kadai0425;

import java.util.Random;

public class Volf extends Monster{

	static final  String NAME = "Volf";
	private int hp = 500;
	static final int ATTACK_RATE = 50;
	static final int MIN_ATTACK_POWER = 20;
	private int damage = 0;
	static final  int exp = 5;
	static final int MIN_GOLD = 20;
	private int gold = 0;
	
	
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
	public int getExp() {
		return exp;
	}
	
	

	@Override
	public int getGold() {
		return gold;
	}
	
	public void dropGold(){
		Random rnd = new Random();
		int ran = rnd.nextInt(11); 
		//10～50のゴールドを設定
		gold = ran +  this.MIN_GOLD;
		
	}

	@Override
	public void attack(Hero h) {
		System.out.println(this.NAME+"の噛みつき攻撃");
		Random rnd = new Random();
		int ran = rnd.nextInt(31); 
		//20～50のダメージを設定
		damage = ran +  this.MIN_ATTACK_POWER;
		h.setHp(h.getHp() - damage);
		//HPが0未満になったら0に設定する
		if(h.getHp()<0) h.setHp(0);
	}

	@Override
	public void run() {
		System.out.println(this.NAME+"山奥の巣に逃げていきました");
		
	}

}
