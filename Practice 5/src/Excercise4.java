import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Excercise4 {

	public static void main(String[] args) throws IOException,InvalidFullName {
		// TODO Auto-generated method stub
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Full Name:");
		String fullname=br.readLine();
		fullname=fullname.trim();
		//System.out.println(fullname.length());
		//fullname=fullname.replaceAll(" +", " ").trim();
		if(Validator.check(fullname)) {
		//String s[]= fullname.split(" ");
		//System.out.println(s.length);
		StringTokenizer token= new StringTokenizer(fullname," ");
		while(token.hasMoreTokens()) {
			token.nextToken();
			i++;
		}
			
		if(i==0)
			throw new InvalidFullName("No Full and Last Name Entered");
		else if(i==1)
			throw new InvalidFullName("No Last Name Entered");
		else if(i>2)
			throw new InvalidFullName("Enter Only First and Last Name");
	
		else
			System.out.println("Enter name is valid");
		}
		else
			throw new InvalidFullName("Name cannot have number in it");
	}
}

class InvalidFullName extends Exception{
	
	InvalidFullName(){
		
	}
	
	InvalidFullName(String msg){
	
		super(msg);
	}
	
	public String toString() {
		
	
		return "InvalidFullName:"+super.getMessage();
	}
	
}

interface Validator{
	
	String name="([^0-9])*";
	
	public static boolean check(String s) {
		
		return s.matches(name);
	}
	
}
