import java.util.*;
public class Ex1{
	public static void main(String args[]){
		//���K3-1
		int weight,age,age1,age2;
		String name;
		
		weight = 60;
		age = 0;
		age1 = 30;
		age2 = 30;
		name = "��";
		
		if(weight == 60)//�ϐ�weight�̒l��60�ɓ�����
			System.out.println("weight��" + weight);
		if((age1+age2)*2 > 60)//�ϐ�age1��age2�̍��v��2�{�������̂�60�𒴂��Ă���
			System.out.println("age1 + age2��" + (age1+age2));
		if(age%2 != 0)//�ϐ�age��ł���
			System.out.println("�ϐ�age��" + (age%2));
		if("��".equals(name))//�ϐ�name�̒��g�̕����񂪁u���v�Ɠ�����
			System.out.println("���O��" + name);
		//���K3-2
		//C,D,E
		
		//���K3-3
		int seibetu = 0;
		age = 10;
		System.out.println("����ɂ��́B");
		if(seibetu == 0){
			System.out.println("���͒j�ł��B");
			System.out.println(age + "�΂ł��B");
		}else{
			System.out.println("���͏��ł��B");
		}
		System.out.println("��낵�����˂������܂��B");
		
		//���K3-4
		boolean tenki = true;
		if(tenki){				//boolean�^�ł̏������ł͉��Z�q�͕s�v
			System.out.println("��������܂�");
			System.out.println("�U���ɂ����܂�");
		}else{
				System.out.println("DVD�����܂�");
		}
		
		System.out.println("1:���� 2:�o�^ 3:�폜 4:�ύX");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected){
			case 1:
				System.out.println("�������܂�");
				break;
			
			case 2:
				System.out.println("�o�^���܂�");
				break;
			
			case 3:
				System.out.println("�폜���܂�");
				break;
			
			case 4:
				System.out.println("�ύX���܂�");
				break;
			default:
				System.out.println("��蒼���Ă��������B");
		}
	}
}