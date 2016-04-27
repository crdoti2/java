import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(new File("c:\\edu\\A.java")));

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			
			
		} finally {
			
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}
	}

	public void listTest() {

	}

}
