package excercise1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CopyDataThread extends Thread{

	private File source=null;
	private File target=null;
	
	public CopyDataThread() {
		
	}
	
	public CopyDataThread(File source, File target) {
		
		this.source=source;
		this.target=target;
	}
	
	
	public void run() {
		
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
							sleep(5000);
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
		
		
	}
	
}
