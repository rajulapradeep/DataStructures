import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class week11{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			if(args.length != 1) {
				  System.err.println("Invalid command line, exactly one argument required");
				  System.exit(1);
				}
				FileInputStream fstream = null;
				try {
					fstream = new FileInputStream(args[0]);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            
            //Read File Line By Line
            try {
				while ((strLine = br.readLine()) != null)   {
				  // Print the content on the console
					//System.out.println("test");
				  //System.out.println (strLine);
				  if(Integer.parseInt(strLine) % 2 ==0){
					  System.out.println("even");
				  }else{
					  System.out.println("odd");
				  }
				//  od.evaluatenumber(Integer.parseInt(strLine));
				  //week11(Integer.parseInt(strLine));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
	}

}
