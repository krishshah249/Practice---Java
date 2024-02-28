import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise5 {

	public static void main(String[] args) throws IOException, InvalidAge {
		// TODO Auto-generated method stub
		int i=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Age:");
		String age=br.readLine();
		if(Validate.ageCheck(age)) {
			
			i= Integer.parseInt(age);
			if(i<15)
				throw new InvalidAge("Age should be greater than 15");
			else
				System.out.println("Correct Age!");
		}
		else
			throw new InvalidAge("Enter Only Numbers");
	}
	
	
	interface Validate{
		
		String age="(\\d)+";
		public static boolean ageCheck(String a) {
			
			return a.matches(age);
			
		}
		
	}
}
	class InvalidAge extends Exception{
		
		InvalidAge(){
			
		}
		
		InvalidAge(String msg){
		
			super(msg);
		}
		
		public String toString() {
			
		
			return "InvalidAge:"+super.getMessage();
		}
		
	}



