public class Kadai6	{
	public static void main(String[] arg){
		int kati = new java.util.Scanner(System.in).nextInt();
		int katta = 0;
			for( int i = 0 ; i < 10 ; i++ ){
    int kekka = Integer.parseInt( kati.readLine() );

    if(kekka == 1)
        katta += 1;
	}

System.out.println( "����" + katta + "��A����" + ( 10 - katta ) + "��" );
	}
}
