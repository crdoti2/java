public class list {
	public static void main(String[] args) {
		int m[] = {1, 2, 3};
		int n[] = {7, 8, 9};

		n = m;						// ƒAƒhƒŒƒX‚ğó‚¯“n‚µ‚Ä‚é
		m[0] = 10;
		m[1] = 11;
		m[2] = 12;

		System.out.println("m:" + m[0] + "." + m[1] + "." + m[2]);
		System.out.println("n:" + n[0] + "." + n[1] + "." + n[2]);
	}
}
