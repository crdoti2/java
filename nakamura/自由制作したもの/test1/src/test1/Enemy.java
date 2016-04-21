package test1;

// Characterクラスを継承したEnemy
public class Enemy extends Character {

	// HP、MPの最大値を設定
	final int MAX_HP = 75;
	final int MAX_MP = 75;

	// コンストラクタ起動
	Enemy(int hp, int mp, int attack, int defence, int posX, int posY, int status) {
		super(hp, mp, attack, defence, posX, posY, status);
	}

	// attackメソッドを再定義
	public void attack(Player p) {

		// 攻撃力、守備力に補正（ランダム）をかける
		int attackRandom = new java.util.Random().nextInt(this.getAttack());
		int defenceRamdom = new java.util.Random().nextInt(p.getDefence());

		// 補正適応前を一時保存
		int beforePlayerHp = p.getHp();
		int afterPlayerHp = beforePlayerHp - attackRandom + defenceRamdom;

		// 補正適応前と適応後を比べ、適応後が大きい場合は適応前に戻す
		if(beforePlayerHp <= afterPlayerHp) {
			p.setHp(beforePlayerHp);
			System.out.printf("しかし、ダメージは与えられなかった！\n");
		} else {

			// ４以上の与ダメージならかいしんの一撃
			if(beforePlayerHp - afterPlayerHp >= 4) {
				System.out.printf("かいしんの一撃！\n");
			}
			System.out.printf("%dのダメージを与えた！\n", beforePlayerHp - afterPlayerHp);

			// 相手のＨＰは０なのかチェック
			if(afterPlayerHp <= 0) {
				afterPlayerHp = 0;
				p.setStatus(1);
			}

			// 攻撃した相手をスタンさせる
			p.setHp(afterPlayerHp);
			if(p.getStatus() == 0) {
				p.stun();
			}
		}
	}

	// 特定の攻撃を受けたときスタンする
	public void stun() {
		this.setStatus(2);
		System.out.printf("敵はスタンした！\n");
	}

}
