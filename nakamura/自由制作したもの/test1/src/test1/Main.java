//------------------------------------------------------------------------------------------------------------------
// 
// プレイヤと敵がターン制で戦闘を行うプログラム
// どちらかのＨＰが０になったら終了
// 
//------------------------------------------------------------------------------------------------------------------


package test1;

// キーボード入力受け付け用
// import java.awt.event.KeyEvent;

public class Main {

	// メインメソッド
	public static void main(String[] args) {

		// ターンカウント変数
		int i = 1;
		int pCnt = 0;
		int eCnt = 0;

		// PlayerとEnemyをインスタンス
		Player play = new Player(100, 100, 30, 5, 10, 10, 0);
		Enemy ene = new Enemy(75, 75, 15, 30, 5, 10, 0);

		// （デバッグ用）パラメータ確認
		System.out.println("PlayerのHPは、" + play.getHp());
		System.out.println("PlayerのMPは、" + play.getMp());
		System.out.println("Playerの攻撃力は、" + play.getAttack());
		System.out.println("Playerの守備力は、" + play.getDefence());
		System.out.println("");
		System.out.println("EnemyのHPは、" + ene.getHp());
		System.out.println("EnemyのMPは、" + ene.getMp());
		System.out.println("Enemyの攻撃力は、" + ene.getAttack());
		System.out.println("Enemyの守備力は、" + ene.getDefence());
		System.out.println("");

		// ターン制の戦闘ループ
		while(play.getHp() > 0 && ene.getHp() > 0) {

			// ターンの始まり
			System.out.printf("%dターン目\n\n", i);

			// プレイヤーの攻撃
			if(play.getStatus() == Character.DIE) {
				// 何もしない
			} else if(play.getStatus() == Character.NORMAL){
				System.out.printf("プレイヤーの攻撃！\n");
				play.attack(ene);
				System.out.printf("敵のHPは残り%d！\n", ene.getHp());
			} else if(play.getStatus() == Character.STUN) {
				if(pCnt >= 3){
					System.out.println("プレイヤーのスタンが解けた！\n");
					play.setStatus(0);
					pCnt = 0;
				} else {
					System.out.printf("プレイヤーはスタンしていて動けない！\n");
					pCnt++;
				}
			}

			System.out.printf("\n");

			// 敵の攻撃
			if(ene.getStatus() == Character.DIE) {
				// 何もしない
			} else if(ene.getStatus() == Character.NORMAL) {
				System.out.printf("敵の攻撃！\n");
				ene.attack(play);
				System.out.printf("プレイヤーのHPは残り%d！\n", play.getHp());
			} else if(ene.getStatus() == Character.STUN) {
				if(eCnt >= 3){
					System.out.println("敵のスタンが解けた！\n");
					ene.setStatus(0);
					eCnt = 0;
				} else {
					System.out.printf("敵はスタンしていて動けない！\n");
					eCnt++;
				}
			}

			System.out.printf("\n");

			// ステータスチェック
			if(play.getStatus() == Character.DIE) {
				System.out.printf("プレイヤーは倒れた！\n");
			}
			if(ene.getStatus() == Character.DIE) {
				System.out.printf("敵は倒れた！\n");
			}

			System.out.printf("\n");

			// ターンをカウント
			i++;
		}
	}
}
