package list14_2;

// importしておくと便利
import java.util.Date;

public class Main {
	public static void main(String[] args) {

		// 現在の日時を取得
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1316622225935L);
		System.out.println(past);
	}
}
