import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class Excercise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1.RED");
		System.out.println("2.YELLOw");
		System.out.println("3.GREEN");
		System.out.println("Choose one");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice= br.readLine();
		//int c= Integer.parseInt(choice);
		switch(choice) {
		
			case "1": System.out.println("STOP"); 
					  break;
			case "2": System.out.println("READY"); 
					  break;
			case "3": System.out.println("GO"); 
			  		  break;
			  		  
			default: System.out.println("Invalid Option");
		}
		
	}

}
