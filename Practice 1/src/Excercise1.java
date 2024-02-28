import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			
		
		System.out.println("Enter the number upto which you want to calculate sum of divisibles of 3 or 5");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		int n= Integer.parseInt(input);
		
		System.out.println("The sum of all divisibles of 3 or 5 upto "+n+" is:"+calculateSum(n));
		
		
	}
	
	
	public static int calculateSum(int n) {
		
		int sum=0;
		for(int i=3;i<=n;i++)
			if(i%3==0||i%5==0)
				sum+=i;
		
				return sum;
		
	}

}
