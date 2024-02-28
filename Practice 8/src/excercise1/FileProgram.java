package excercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileProgram {
	
	
	public static void main(String args[]) {
		
		System.out.println("Enter the path of the source file");
		File source=file();
		if(source!=null) {
		System.out.println("Enter the path of the target file");
		File target=file();
		if(target!=null)
		{
			CopyDataThread c = new CopyDataThread(source,target);
			c.start();
		}
		else
			System.out.println("The file does not exists");
		}
		else
		System.out.println("The file does not exists");
	}
	
	public static File file() {
		
		String path=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			path=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File f = new File(path);
		if(f.exists())
		 return f;
		else
		 return null;
		
	}
	
}
