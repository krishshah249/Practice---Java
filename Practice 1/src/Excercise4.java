import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the number to check whether it is power of 2 or not:");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int n= Integer.parseInt(input);
		if(checkNumber(n))
		System.out.println("Entered number is power of 2");
		else
			System.out.println("Entered number is not power of 2");	
		
		
	}

	public static boolean checkNumber(int n) {
		
		int i=0;
		while(Math.pow(2,i)<n) {
			
			i++;
		}
		
		if(Math.pow(2,i)==n)
			return true;
		else
			return false;
	}
}
