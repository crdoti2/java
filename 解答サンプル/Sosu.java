/**
*
*�@�x�^�ȑf���̋��ߕ�
*
*/
class Sosu {
  public static int FROM_NUMBER = 2; //�J�n����l
  public static int TO_NUMBER = 1000; //�I������l
  public static int LINE_MAX = 10; //1�s�ɕ\�������
  public static String SEPARATE = ","; //��؂蕶��


  public static void main(String[] args) {

    int cnt = 0; //���݂�1�s�̕\������0�ɂ���

    for (int i = FROM_NUMBER; i <= TO_NUMBER; i++) {

      boolean isSosu = true; //�f���Ƃ��Ă���
      for (int j = FROM_NUMBER; j <= (i / 2); j++) { //2�Ŋ����Ă��闝�R��2���������Ȑ��l�Ŋ���K�v���Ȃ�����
        if (i % j == 0) { //����؂ꂽ�̂őf���ł͂Ȃ�
          isSosu = false; //�f���ł͂Ȃ�
          break; //����ȏ�͌v�Z����K�v���Ȃ��̂Ŕ�����
        }
      }

      
      if (isSosu) { //�f����������
        if (cnt == LINE_MAX) {  //1�s�ɕ\���������������
          System.out.println(""); //���s����
          cnt = 0; //���݂�1�s�̕\������0�ɂ���
        }
         cnt++; //�\�������C���N�������g
        if (cnt != 1) { //�擪�łȂ����(1�߂łȂ����)
          System.out.print(SEPARATE); //��؂蕶���\��
        }
        System.out.print("" + i); //�f����\��
      }
    }
  }
}