import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your username:");
		try {
			name= br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		name= name.substring(0,name.length()-4)+name.substring(name.length()-4, name.length()).toLowerCase();
		if(validateName(name))
			System.out.println("Entered detail is correct");
		else
			System.out.println("Entered detail is incorrect");
	}
	
	public static boolean validateName(String name) {
		
		String namepattern="[a-zA-Z]{8}([a-zA-Z])*_job";
		
		return name.matches(namepattern);
	}

}
