package test1;

// キャラクタの基礎となるクラス
public class Character {

	// ステータス用
	public static final int NORMAL = 0;			// ０、異常なし
	public static final int DIE    = 1;			// １、やられた
	public static final int STUN   = 2;			// ２、スタン

	// パラメータ追加
	private int hp;
	private int mp;
	private int attack;
	private int defence;
	private int posX;							// 今のところ使ってない
	private int posY;							// 今のところ使ってない
	private int status;
	int move;

	// コンストラクタ
	Character(int hp, int mp, int attack, int defence, int posX, int posY, int status) {
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.defence = defence;
		this.posX = posX;
		this.posY = posY;
		this.status = status;
	}

	// HPゲッター
	public int getHp() {
		return this.hp;
	}

	// MPゲッター
	public int getMp() {
		return this.mp;
	}

	// attackゲッター
	public int getAttack() {
		return this.attack;
	}

	// defenceゲッター
	public int getDefence() {
		return this.defence;
	}

	// statusゲッター
	public int getStatus() {
		return this.status;
	}

	// posXゲッター
	public int getPosX() {
		return this.posX;
	}

	// posYゲッター
	public int getPosY() {
		return this.posY;
	}

	// HPセッター
	public void setHp(int hp) {
		this.hp = hp;
	}

	// MPセッター
	public void setMp(int mp) {
		this.mp = mp;
	}

	// attackセッター
	public void setAttack(int attack) {
		this.attack = attack;
	}

	// difenceセッター
	public void setDefence(int defence) {
		this.defence = defence;
	}

	// statusセッター
	public void setStatus(int status) {
		this.status = status;
	}

	// posXセッター
	public void setPosX(int posX) {
		this.posX = posX;
	}

	// posYセッター
	public void setPosY(int posY) {
		this.posY = posY;
	}

	// 前へダッシュ
	public void dash() {
		// 今は何もしない
	}

	// 後ろへバック
	public void back() {
		// 今は何もしない
	}

	// 攻撃する
	public void attack() {
		// 今は何もしない
	}

	// 特定の攻撃を受けたときスタンする
	public void stun() {
		// 今は何もしない
	}
}
