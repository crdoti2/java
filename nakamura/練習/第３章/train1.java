//------------------------------------------------------------------------------
//P.131
//�@���̓��{��ŋL�ڂ��ꂽ��������java�ŋL�q���Ă݂܂��傤
//�@�@�ϐ�weight�̒l��60�ɓ������B
//�@�A�ϐ�age1��age2�̍��v��2�{�������̂�60�𒴂��Ă���B
//�@�B�ϐ�age����ł���B
//�@�C�ϐ�name�̒��g�̕����񂪁u���v�������B
//
//------------------------------------------------------------------------------

public class train1 {

	public static void main(String[] args){

		int weight = 60;
		int age1 = 15;
		int age2 = 23;
		int age = 59;
		String name = "minato";

		// �@
		if(weight == 60){
			System.out.println("�@true");
		}

		// �A
		if((age1 + age2) * 2 >= 60){
			System.out.println("�Atrue");
		}

		// �B
		if(age % 2 != 0){
			System.out.println("�Btrue");
		}

		// �C
		if(name == "minato"){
			System.out.println("�Ctrue");
		}
	}
}
