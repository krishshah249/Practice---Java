import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise2 {


	public static void main(String args[]) throws IOException {
		
		
		System.out.println("Enter the file path from which the lines are to be read:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String path= br.readLine();
		int linecount=1;
		File file = new File(path);
		if(file.exists()) {
			String line;
			br= new BufferedReader(new FileReader(file));
			while((line=br.readLine())!=null) {
				
				System.out.println(linecount+":"+line);
				linecount++;
			
			}
			
		}
		else
			System.out.println("Entered File Path Does Not Exists");
		
		
	}
}
