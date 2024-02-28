import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the number upto which you want to get difference of sum of the square and square of the sum");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		int n= Integer.parseInt(input);
		
		System.out.println("The difference of sum of the square and square of the sum "+n+" is:"+calculateDifference(n));
		
	}
	
	
	public static int calculateDifference(int n) {
		
		int i=1;
		int sum1=0;
		int sum2=0;
		while(i<=n) {
			
			sum1+=i*i;
			sum2+=i;
			i++;
		}
		
		return sum1-(sum2*sum2);
	}

}
