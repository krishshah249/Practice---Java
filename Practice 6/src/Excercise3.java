import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise3 {
	
	
	public static void main(String args[]) {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String path = null;
		String line=null;
		int linecount=0;
		int wordcount=0;
		int charcount=0;
		int i=0;
		System.out.println("Enter the path of the file");
		try {
			path = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file = new File(path);
		if(file.exists()) {
		try {
			br= new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while((line=br.readLine())!=null) {
				i=0;
				linecount++;
				String s[]=line.trim().split(" ");
				wordcount+=s.length;
				while(i<s.length) {
					
					charcount+=s[i].length();
					i++;
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("No of Lines are: "+linecount+"No of Words are: "+wordcount+"No of Characters are: "+charcount);
		}
		else
			System.out.println("File Does Not Exists");
	}
	
	

}
