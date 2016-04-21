package test1;

// Characterクラスを継承したPlayer
public class Player extends Character {

	// HP、MPの最大値を設定
	final int MAX_HP = 100;
	final int MAX_MP = 100;

	// コンストラクタ起動
	Player(int hp, int mp, int attack, int defence, int posX, int posY, int status) {
		super(hp, mp, attack, defence, posX, posY, status);
		move = 5;
	}

	// attackメソッドを再定義
	public void attack(Enemy e) {

		// 攻撃力、守備力に補正（ランダム）をかける
		int attackRandom = new java.util.Random().nextInt(this.getAttack());
		int defenceRamdom = new java.util.Random().nextInt(e.getDefence());

		// 補正適応前を一時保存
		int beforeEnemyHp = e.getHp();
		int afterEnemyHp = beforeEnemyHp - attackRandom + defenceRamdom;

		// 補正適応前と適応後を比べ、適応後が大きい場合は適応前に戻す
		if(beforeEnemyHp <= afterEnemyHp) {
			e.setHp(beforeEnemyHp);
			System.out.printf("しかし、ダメージは与えられなかった！\n");
		} else {

			// 15以上の与ダメージならかいしんの一撃
			if(beforeEnemyHp - afterEnemyHp >= 15) {
				System.out.printf("かいしんの一撃！\n");
			}
			System.out.printf("%dのダメージを与えた！\n", beforeEnemyHp - afterEnemyHp);

			// 相手のＨＰは０なのかチェック
			if(afterEnemyHp <= 0) {
				afterEnemyHp = 0;
				e.setStatus(1);
			}

			e.setHp(afterEnemyHp);

			// 攻撃した相手をスタンさせる
			if(e.getStatus() == 0 && beforeEnemyHp - afterEnemyHp >= 15) {
				e.stun();
			}
		}
	}

	// 特定の攻撃を受けたときスタンする
	public void stun() {
		this.setStatus(2);
		System.out.printf("プレイヤーはスタンした！\n");
	}

	// 前へダッシュ
	public void dash() {
		this.setPosX(this.getPosX() + move);
	}

	// 後ろへバック
	public void back() {
		this.setPosX(this.getPosX() - move);
	}

}
