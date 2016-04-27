
public class Main {
	public static void main(String[] args){
		
		
		Hero h = new Hero();
		Monster m[] = new Monster[7];
		int teki = 0;
		

		
		
		h.name = "しんよう君";	
		System.out.println("ヒーローの名前は" + h.name + "！！！");
		while(true){
			m[0] = new Dog();
			m[1] = new Zomb();
			m[2] = new Golem();
			m[3] = new Golira();
			m[4] = new Fish();
			m[5] = new Vird();
			m[6] = new Dorgon();
			System.out.println("");
			System.out.println(h.name + "の情報");
			System.out.println("現在のLv:" + h.getLevel());
			System.out.println("HP:" + h.getHp());
			System.out.println("攻撃力:" + h.attack);
			System.out.println("経験値:" + h.getExp());
			System.out.println("所持金:" + h.getGold());
			System.out.println("1:を入力すると戦うモンスターを選べる。 2:を入力するとアイテムを買う。 3:を入力すると回復できる。");
			int input =new java.util.Scanner(System.in).nextInt();
			if(input == 1){
				System.out.println("入力した数字のモンスターと戦います");
				System.out.println("1:狂犬と戦う");
				System.out.println("2:ゾンビと戦う");
				System.out.println("3:ゴーレムと戦う");
				System.out.println("4:ゴリラと戦う");
				System.out.println("5:リヴァイアサンと戦う");
				System.out.println("6:フェニックスと戦う");
				System.out.println("7:ドラゴンと戦う");
				
				teki =new java.util.Scanner(System.in).nextInt();
				if(teki >= 1 && teki <= 7 ){
					if(teki == 4){
						int random = new java.util.Random().nextInt(20);
						if(random == 0){
							m[3] = new Reagolira();
						}
					}
					System.out.println(m[teki - 1].getName() + "との戦いが始まった！");
					while(true){
						int turn = new java.util.Random().nextInt(5) + 1;
						switch(turn){
							case 1:h.attack(m[teki - 1]);
							break;
							case 2:h.attack(m[teki - 1]);
							break;
							case 3:h.attack(m[teki - 1]);
							break;
							case 4:h.attack(m[teki - 1]);
							break;
							case 5:m[teki - 1].attack(h);
							break;
						}
					
						if(h.hp <= 0){
							System.out.println("GAME OVRE");
							break;
						}else if(m[teki - 1].getHp() <= 0){
							System.out.println(m[teki - 1].getName() +  "を倒した！");
							m[teki -1].run();
							m[teki - 1].exp(h);
							m[teki - 1].gold(h);
							System.out.println("");
							System.out.println("経験値を" + m[teki - 1].getExp() + "所得した！");
							h.Level();
							System.out.println("お金を" + m[teki - 1].getGold() + "所得した！");
							break;
						}
					}
				}else{
					System.out.println("GAME OVER");
					break;
				}
			} else if(input == 2){
				System.out.println("アイテムを買う");
				System.out.println("1:アイテムを買う 2:所持金が足りないが借金して買う");
				int kau =new java.util.Scanner(System.in).nextInt();
				if(kau == 1){
					System.out.println("GAME OVRE");
					break;
				}else if(kau == 2){
					System.out.println("所持金が足りません。借金してでも買いますか？");
					System.out.println("1:借金してでも買う 2:借金してまでは買わない");
					int nai =new java.util.Scanner(System.in).nextInt();
					if(nai == 1){
						System.out.println("GAME OVRE");
						break;
					}else if(nai == 2){
						System.out.println("GAME OVRE");
						break;
					}else{
						System.out.println("GAME OVRE");
						break;
					}
				}else{
					System.out.println("GAME OVRE");
					break;
				}
			}else if(input == 3){
				h.Kaihuku();
			}else if(input == 2525){
				System.out.println("GAME CLEAR");
				break;
			}else{
				System.out.println("GAME OVER");
				break;
			}
			if(h.getHp() <= 0){
				break;
			}if(teki == 7 && h.getHp() >= 0){
				System.out.println("GAME CLEAR");
				break;
			
			}
		}
	}
}