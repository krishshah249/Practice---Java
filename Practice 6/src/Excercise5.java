import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string to check if it is positive string or not");
		try {
			input=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(check(input))
			System.out.println("Entered String is Positive String");
		else
			System.out.println("Entered String is Not Positive String");
	}

	public static boolean check(String s) {
		
		s=s.trim().toLowerCase();
		char current= s.charAt(0);
		int i=1;
		while(i<s.length()) {
			
			if(current<s.charAt(i)) {
				current=s.charAt(i);
				i++;
		}
			else
				break;
		}
		if(i==s.length())
			return true;
		else
			return false;
	}
	
}
