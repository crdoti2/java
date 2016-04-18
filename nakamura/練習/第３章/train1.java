//------------------------------------------------------------------------------
//P.131
//@ŽŸ‚Ì“ú–{Œê‚Å‹LÚ‚³‚ê‚½ðŒŽ®‚ðjava‚Å‹Lq‚µ‚Ä‚Ý‚Ü‚µ‚å‚¤
//@‡@•Ï”weight‚Ì’l‚ª60‚É“™‚µ‚¢B
//@‡A•Ï”age1‚Æage2‚Ì‡Œv‚ð2”{‚µ‚½‚à‚Ì‚ª60‚ð’´‚¦‚Ä‚¢‚éB
//@‡B•Ï”age‚ªŠï”‚Å‚ ‚éB
//@‡C•Ï”name‚Ì’†g‚Ì•¶Žš—ñ‚ªu–©v“™‚µ‚¢B
//
//------------------------------------------------------------------------------

public class train1 {

	public static void main(String[] args){

		int weight = 60;
		int age1 = 15;
		int age2 = 23;
		int age = 59;
		String name = "minato";

		// ‡@
		if(weight == 60){
			System.out.println("‡@true");
		}

		// ‡A
		if((age1 + age2) * 2 >= 60){
			System.out.println("‡Atrue");
		}

		// ‡B
		if(age % 2 != 0){
			System.out.println("‡Btrue");
		}

		// ‡C
		if(name == "minato"){
			System.out.println("‡Ctrue");
		}
	}
}
