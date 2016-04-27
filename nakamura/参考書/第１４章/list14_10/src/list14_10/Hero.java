package list14_10;

public class Hero {
	String name;
	int hp;

	// オーバーライドする
	public String toString() {
		return "名前：" + this.name + "／HP：" + this.hp;
	}
}
