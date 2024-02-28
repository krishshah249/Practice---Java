import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excercise1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int n;
		int i=0;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to find sum of the cube of the digit in a number");
		String input= br.readLine();
		n= Integer.parseInt(input);
		if(n>=0)
		System.out.println("The sum of the cubes of the digits is:"+sumOfCubes(n));
		else
			System.out.println("Enter a positive number");
	}
	
	public static int sumOfCubes(int n) {
		
		int sum=0;
		while(n>0) {
			
			sum+=(n%10)*(n%10)*(n%10);
			n=n/10;
		}
		
		return sum;
		
	}

}
