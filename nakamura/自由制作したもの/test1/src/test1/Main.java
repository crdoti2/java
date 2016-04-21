//------------------------------------------------------------------------------------------------------------------
// 
// プレイヤと敵がターン制で戦闘を行うプログラム
// どちらかのＨＰが０になったら終了
// 
//------------------------------------------------------------------------------------------------------------------


package test1;

// import java.awt.event.KeyEvent;

public class Main {

	// メインメソッド
	public static void main(String[] args) {

		// ターンカウント変数
		int i = 1;

		// PlayerとEnemyをインスタンス
		Player play = new Player(100, 100, 5, 5, 10, 10, 0);
		Enemy ene = new Enemy(75, 75, 5, 3, 25, 10, 0);

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

		// ターンの始まり
		while(play.getHp() > 0 && ene.getHp() > 0) {

			// ターンの始まり
			System.out.printf("%dターン目\n\n", i);

			// プレイヤーの攻撃
			if(play.getStatus() == 1) {
				// 何もしない
			} else if(play.getStatus() == 0){
				System.out.printf("プレイヤーの攻撃！\n");
				play.attack(ene);
				System.out.printf("敵のHPは残り%d！\n", ene.getHp());
			} else if(play.getStatus() == 2) {
				System.out.printf("プレイヤーはスタンしていて動けない！\n");
			}

			System.out.printf("\n");

			// 敵の攻撃
			if(ene.getStatus() == 1) {
				// 何もしない
			} else if(ene.getStatus() == 0) {
				System.out.printf("敵の攻撃！\n");
				ene.attack(play);
				System.out.printf("プレイヤーのHPは残り%d！\n", play.getHp());
			} else if(ene.getStatus() == 2) {
				System.out.printf("敵はスタンしていて動けない！\n");
			}

			System.out.printf("\n");

			// ステータスチェック
			if(play.getStatus() == 1) {
				System.out.printf("プレイヤーは倒れた！\n");
			}
			if(ene.getStatus() == 1) {
				System.out.printf("敵は倒れた！\n");
			}

			System.out.printf("\n");

			// ターンをカウント
			i++;
		}
	}
}
