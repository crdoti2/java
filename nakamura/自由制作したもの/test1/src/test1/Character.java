package test1;

// キャラクタの基礎となるクラス
public class Character {

	// ステータス追加
	private int hp;
	private int mp;
	private int attack;
	private int defence;
	private int posX;
	private int posY;
	private int status;			// ステータス：０、異常なし
								// 　　　　　　１、やられた
								// 　　　　　　２、スタン

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

	// 前へダッシュ
	public void dash() {
		this.posX += 5;
	}

	// 後ろへバック
	public void back() {
		this.posX -= 3;
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
