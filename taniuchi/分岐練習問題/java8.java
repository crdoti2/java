public class java8{
	public static void main(String args[]){
		/*�����̓���*/
		System.out.println("���Ԏ����̓_������͂��Ă��������B");
		int input1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("���������̓_������͂��Ă��������B");
		int input2 = new java.util.Scanner(System.in).nextInt();
		/*��������*/
		if(input1 >=60 && input2>=60){				//�����Ƃ� 60 �_�ȏ�̏ꍇ�A���i
			System.out.println("���i");
		}else if((input1+input2) >= 130){			//���v�� 130 �_�ȏ�̏ꍇ�A���i
			System.out.println("���i");
		}else if((input1+input2) >= 100){			//���v�� 100 �_�ȏ�ŁA
			if(input1 >= 90 || input2 >= 90){		//�ǂ��炩�̎����� 90 �_�ȏ�ł���΍��i
				System.out.println("���i");
			}
		}else{										//��L�ȊO�͕s���i
			System.out.println("�s���i");
		}
	}
}