package excercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FileProgram {
	
	
	public static void main(String args[]) {
		
		System.out.println("Enter the path of the source file");
		File source=file();
		if(source!=null) {
		System.out.println("Enter the path of the target file");
		File target=file();
		if(target!=null)
		{
			Runnable r=()->{
				int num=0;
				int ch=0;
				BufferedReader br=null;;
				try {
					br = new BufferedReader(new FileReader(source));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				BufferedWriter bw=null;
				try {
					bw = new BufferedWriter(new FileWriter(target));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
						while(num<10&&(ch=br.read())!=-1) {
							bw.write(ch);
							num++;
							if(num==10) {
								num=0;
								bw.flush();
								System.out.println("10 Characters Are Copied");
								try {
									Thread.sleep(5000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
								
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				finally {
					
					try {
						br.close();
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			};
			Executor e = Executors.newSingleThreadExecutor(); 
			e.execute(r);
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
