import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		System.out.println("Enter the number to check whether it is increasing or not:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int n= Integer.parseInt(input);
		if(checkNumber(n))
		System.out.println("Entered number is increasing");
		else
			System.out.println("Entered number is not increasing");	
		
		
	}
	
	public static boolean checkNumber(int n) {
		
		int current;
		int min=n%10;
		while(n>0) {
			
			current=n%10;
			if(current<=min)
				min=current;
			else
				return false;
			n=n/10;
	}
		
		return true;
	}

	
	
}
