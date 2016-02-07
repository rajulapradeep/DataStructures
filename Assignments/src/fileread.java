import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileread extends Calculation{

	public static void main(String[] args) {
		fileread fr = new fileread();
		try (BufferedReader br = new BufferedReader(new FileReader("/Users/Pradeep/gitrep/Assignments/src/test.txt")))
		{
			if(br.readLine() == null){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter input");
				int no;
				while((no = s.nextInt()) != 0){
					fr.oddeven(no);
				}
			}
			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				fr.oddeven(Integer.parseInt(sCurrentLine));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

	

}
