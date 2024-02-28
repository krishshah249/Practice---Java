import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise3 {

	public static void main(String[] args) {
	
		String user=null;
		String pass=null;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User and Password");
		try {
			user=br.readLine();
			pass=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lambda3 l=(userid,password)->{
			
			if(userid.equals("HR")&&password.equals("HR"))
				return true;
			else
				return false;
		};
		
		if(l.userPass(user, pass))
			System.out.println("Authentication Successfull");
		else
			System.out.println("Authentication UnSuccessfull");
		
	}
}

interface lambda3{
	public boolean userPass(String user,String Pass);
	}